package com.hrd.subject.domain.convert;

import com.hrd.subject.domain.entity.SubjectInfoBO;
import com.hrd.subject.domain.entity.SubjectLabelBO;
import com.hrd.subject.domain.entity.SubjectOptionBO;
import com.hrd.subject.infra.basic.entity.SubjectInfo;
import com.hrd.subject.infra.basic.entity.SubjectLabel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface SubjectInfoConverter {
    SubjectInfoConverter INSTANCE = Mappers.getMapper(SubjectInfoConverter.class);

    SubjectInfo convertBoToInfo(SubjectInfoBO subjectInfoBO);

    List<SubjectInfoBO> convertListInfoToBO(List<SubjectInfo> subjectInfoList);

    SubjectInfoBO convertOptionAndInfoToBo(SubjectOptionBO optionBO, SubjectInfo subjectInfo);
}
