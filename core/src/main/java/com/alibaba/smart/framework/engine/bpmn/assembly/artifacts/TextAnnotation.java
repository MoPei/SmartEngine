package com.alibaba.smart.framework.engine.bpmn.assembly.artifacts;

import javax.xml.namespace.QName;

import com.alibaba.smart.framework.engine.bpmn.constant.BpmnNameSpaceConstant;
import com.alibaba.smart.framework.engine.model.assembly.NoneIdBasedElement;

import lombok.Data;

/**
 * @author guoxing 2020年11月24日14:07:14
 */
@Data
public class TextAnnotation implements NoneIdBasedElement {

    public final static QName qtype = new QName(BpmnNameSpaceConstant.NAME_SPACE,
            "textAnnotation");
    private static final long serialVersionUID = -143532614365524757L;
}
