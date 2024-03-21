package com.hrd.subject.domain.handler.subject;

import com.hrd.subject.common.enums.IsDeletedFlagEnum;
import com.hrd.subject.common.enums.SubjectInfoTypeEnum;
import com.hrd.subject.domain.convert.RadioSubjectConverter;
import com.hrd.subject.domain.entity.SubjectAnswerBO;
import com.hrd.subject.domain.entity.SubjectInfoBO;
import com.hrd.subject.domain.entity.SubjectOptionBO;
import com.hrd.subject.infra.basic.entity.SubjectRadio;
import com.hrd.subject.infra.basic.service.SubjectRadioService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

/**
 * description:单选题目的策略类
 */
@Component
public class RadioTypeHandler implements SubjectTypeHandler{

    @Resource
    private SubjectRadioService subjectRadioService;

    @Override
    public SubjectInfoTypeEnum getHandlerType() {
        return SubjectInfoTypeEnum.RADIO;
    }

    @Override
    public void add(SubjectInfoBO subjectInfoBO) {
        //单选题目的插入
        List<SubjectRadio> subjectRadioList = new LinkedList<>();
        //if (subjectInfoBO.getOptionList() == null) return;
        subjectInfoBO.getOptionList().forEach(option->{
            SubjectRadio subjectRadio = RadioSubjectConverter.INSTANCE.convertBoToEntity(option);
            subjectRadio.setSubjectId(subjectInfoBO.getId());
            subjectRadio.setIsDeleted(IsDeletedFlagEnum.UN_DELETED.getCode());
            subjectRadioList.add(subjectRadio);
        });
        subjectRadioService.insertBatch(subjectRadioList);
    }

    @Override
    public SubjectOptionBO query(int subjectId) {
        SubjectRadio subjectRadio = new SubjectRadio();
        subjectRadio.setSubjectId(Long.valueOf(subjectId));
        List<SubjectRadio> result = subjectRadioService.queryByCondition(subjectRadio);
        List<SubjectAnswerBO> subjectAnswerBOList = RadioSubjectConverter.INSTANCE.convertEntityToBoList(result);
        SubjectOptionBO subjectOptionBO = new SubjectOptionBO();
        subjectOptionBO.setOptionList(subjectAnswerBOList);
        return subjectOptionBO;

    }
}
