package com.hrd.subject.application.convert;

import com.hrd.subject.application.dto.SubjectCategoryDTO;
import com.hrd.subject.application.dto.SubjectLabelDTO;
import com.hrd.subject.domain.entity.SubjectCategoryBO;
import com.hrd.subject.domain.entity.SubjectLabelBO;
import com.hrd.subject.infra.basic.entity.SubjectLabel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface SubjectLabelDTOConverter {

    SubjectLabelDTOConverter INSTANCE = Mappers.getMapper(SubjectLabelDTOConverter.class);

    SubjectLabelBO convertDtoToLabelBO(SubjectLabelDTO SubjectLabelDTO);

    List<SubjectLabelDTO> convertBOToLabelDTOList(List<SubjectLabelBO> subjectLabelBOList);
}
