package com.alibaba.smart.framework.engine.bpmn.assembly.artifacts;

import com.alibaba.smart.framework.engine.bpmn.constant.BpmnNameSpaceConstant;
import com.alibaba.smart.framework.engine.model.assembly.NoneIdBasedElement;
import lombok.Data;

import javax.xml.namespace.QName;

/**
 * @author guoxing 2020年12月14日13:47:49
 */
@Data
public class Group implements NoneIdBasedElement {

    public final static QName qtype = new QName(BpmnNameSpaceConstant.NAME_SPACE,
            "group");
    private static final long serialVersionUID = 6357539757300185621L;

}
