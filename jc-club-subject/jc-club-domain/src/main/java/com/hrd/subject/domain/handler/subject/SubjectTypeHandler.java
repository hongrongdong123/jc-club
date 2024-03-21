package com.hrd.subject.domain.handler.subject;

import com.hrd.subject.common.enums.SubjectInfoTypeEnum;
import com.hrd.subject.domain.entity.SubjectInfoBO;
import com.hrd.subject.domain.entity.SubjectOptionBO;

public interface SubjectTypeHandler {

    /**
     * 枚举身份的识别
     * @return
     */
    SubjectInfoTypeEnum getHandlerType();

    /**
     * 实际题目的插入
     * @param subjectInfoBO
     */
    void add(SubjectInfoBO subjectInfoBO);

    /**
     * 题目的查询
     * @param subjectId
     * @return
     */
    SubjectOptionBO query(int subjectId);
}
