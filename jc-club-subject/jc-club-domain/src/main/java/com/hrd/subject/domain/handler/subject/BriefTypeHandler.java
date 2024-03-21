package com.hrd.subject.domain.handler.subject;

import com.hrd.subject.common.enums.IsDeletedFlagEnum;
import com.hrd.subject.common.enums.SubjectInfoTypeEnum;
import com.hrd.subject.domain.convert.BriefSubjectConverter;
import com.hrd.subject.domain.entity.SubjectInfoBO;
import com.hrd.subject.domain.entity.SubjectOptionBO;
import com.hrd.subject.infra.basic.entity.SubjectBrief;
import com.hrd.subject.infra.basic.service.SubjectBriefService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

/**
 * description:简答题目的策略类
 */
@Component
public class BriefTypeHandler implements SubjectTypeHandler{

    @Resource
    private SubjectBriefService subjectBriefService;

    @Override
    public SubjectInfoTypeEnum getHandlerType() {
        return SubjectInfoTypeEnum.BRIEF;
    }

    @Override
    public void add(SubjectInfoBO subjectInfoBO) {
        //简答题目的插入
        SubjectBrief subjectBrief = BriefSubjectConverter.INSTANCE.convertBoToEntity(subjectInfoBO);
        subjectBrief.setSubjectId(subjectInfoBO.getId().intValue());
        subjectBrief.setIsDeleted(IsDeletedFlagEnum.UN_DELETED.getCode());
        subjectBriefService.insert(subjectBrief);

    }

    @Override
    public SubjectOptionBO query(int subjectId) {
        SubjectBrief subjectBrief = new SubjectBrief();
        subjectBrief.setSubjectId(subjectId);
        SubjectBrief result = subjectBriefService.queryByCondition(subjectBrief);
        SubjectOptionBO subjectOptionBO = new SubjectOptionBO();
        subjectOptionBO.setSubjectAnswer(result.getSubjectAnswer());
        return subjectOptionBO;
    }
}
