package com.hrd.subject.domain.convert;

import com.hrd.subject.domain.entity.SubjectCategoryBO;
import com.hrd.subject.domain.entity.SubjectLabelBO;
import com.hrd.subject.infra.basic.entity.SubjectCategory;
import com.hrd.subject.infra.basic.entity.SubjectLabel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface SubjectLabelConverter {
    SubjectLabelConverter INSTANCE = Mappers.getMapper(SubjectLabelConverter.class);

    SubjectLabel convertBoToLabel(SubjectLabelBO subjectLabelBO);

    List<SubjectLabelBO> convertToBoLabelList(List<SubjectLabel> subjectLabelList);

    List<SubjectLabelBO> convertLabelToBoList(List<SubjectLabel> labelList);
}
