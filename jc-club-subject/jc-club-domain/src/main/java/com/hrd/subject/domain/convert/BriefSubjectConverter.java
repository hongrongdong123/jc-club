package com.hrd.subject.domain.convert;

import com.hrd.subject.domain.entity.SubjectAnswerBO;
import com.hrd.subject.domain.entity.SubjectInfoBO;
import com.hrd.subject.infra.basic.entity.SubjectBrief;
import com.hrd.subject.infra.basic.entity.SubjectRadio;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BriefSubjectConverter {
    BriefSubjectConverter INSTANCE = Mappers.getMapper(BriefSubjectConverter.class);

    SubjectBrief convertBoToEntity(SubjectInfoBO subjectInfoBO);


}
