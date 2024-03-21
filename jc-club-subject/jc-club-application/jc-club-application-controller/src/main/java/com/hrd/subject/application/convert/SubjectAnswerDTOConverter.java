package com.hrd.subject.application.convert;

import com.hrd.subject.application.dto.SubjectAnswerDTO;
import com.hrd.subject.application.dto.SubjectInfoDTO;
import com.hrd.subject.domain.entity.SubjectAnswerBO;
import com.hrd.subject.domain.entity.SubjectInfoBO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface SubjectAnswerDTOConverter {

    SubjectAnswerDTOConverter INSTANCE = Mappers.getMapper(SubjectAnswerDTOConverter.class);

    SubjectAnswerBO convertDtoToAnswerBO(SubjectAnswerDTO SubjectAnswerDTO);

    List<SubjectAnswerDTO> convertBOToAnswerDTOList(List<SubjectAnswerBO> subjectAnswerBOList);

    List<SubjectAnswerBO> convertListDTOToBO(List<SubjectAnswerDTO> subjectAnswerDTOList);
}

