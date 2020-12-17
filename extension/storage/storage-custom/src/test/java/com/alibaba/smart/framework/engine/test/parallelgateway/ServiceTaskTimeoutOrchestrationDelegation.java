package com.alibaba.smart.framework.engine.test.parallelgateway;

import com.alibaba.smart.framework.engine.context.ExecutionContext;
import com.alibaba.smart.framework.engine.delegation.JavaDelegation;
import com.alibaba.smart.framework.engine.exception.EngineException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public abstract class ServiceTaskTimeoutOrchestrationDelegation implements JavaDelegation {

    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceTaskDelegation.class);


    @Override
    public void execute(ExecutionContext executionContext) {

        Map<String, Object> response = executionContext.getResponse();
        try {
            long id = Thread.currentThread().getId();
            // mock business logic
            if (waitTime() > 0) {
                Thread.sleep(waitTime());
                response.put(taskId(), new ThreadExecutionResult(id, waitTime()));
            }
        } catch (InterruptedException e) {
            throw new EngineException(e);
        }

    }

    protected abstract int waitTime();

    protected abstract String taskId();
}
