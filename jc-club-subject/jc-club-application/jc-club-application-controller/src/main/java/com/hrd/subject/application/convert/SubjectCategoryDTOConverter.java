package com.hrd.subject.application.convert;

import com.hrd.subject.application.dto.SubjectCategoryDTO;
import com.hrd.subject.domain.entity.SubjectCategoryBO;
import com.hrd.subject.infra.basic.entity.SubjectCategory;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface SubjectCategoryDTOConverter {

    SubjectCategoryDTOConverter INSTANCE = Mappers.getMapper(SubjectCategoryDTOConverter.class);

    SubjectCategoryBO convertDtoToBoCategory(SubjectCategoryDTO subjectCategoryDTO);

    SubjectCategoryDTO convertBoToCategoryDTO(SubjectCategoryBO subjectCategoryBO);

    List<SubjectCategoryDTO> convertBoToDtoCategoryList(List<SubjectCategoryBO> subjectCategoryBOList);
}
