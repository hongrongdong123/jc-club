package com.hrd.subject.domain.convert;

import com.hrd.subject.domain.entity.SubjectCategoryBO;
import com.hrd.subject.infra.basic.entity.SubjectCategory;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface SubjectCategoryConverter {

    SubjectCategoryConverter INSTANCE = Mappers.getMapper(SubjectCategoryConverter.class);

    SubjectCategory convertBoToCategory(SubjectCategoryBO subjectCategoryBO);

    List<SubjectCategoryBO> convertToBoCategoryList(List<SubjectCategory> subjectCategoryList);


}
