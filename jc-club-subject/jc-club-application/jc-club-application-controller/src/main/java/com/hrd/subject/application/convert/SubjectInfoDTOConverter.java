package com.hrd.subject.application.convert;

import com.hrd.subject.application.dto.SubjectInfoDTO;
import com.hrd.subject.application.dto.SubjectLabelDTO;
import com.hrd.subject.domain.entity.SubjectInfoBO;
import com.hrd.subject.domain.entity.SubjectLabelBO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface SubjectInfoDTOConverter {

    SubjectInfoDTOConverter INSTANCE = Mappers.getMapper(SubjectInfoDTOConverter.class);

    SubjectInfoBO convertDTOToBO(SubjectInfoDTO SubjectInfoDTO);

    SubjectInfoDTO convertBOToDTO(SubjectInfoBO SubjectInfoBO);

    List<SubjectInfoDTO> convertBOToDTOList(List<SubjectInfoBO> subjectInfoBOList);
}

