package com.hrd.subject.domain.convert;

import com.hrd.subject.domain.entity.SubjectLikedBO;
import com.hrd.subject.infra.basic.entity.SubjectLiked;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * 题目点赞表 bo转换器
 *
 * @author jingdianjichi
 * @since 2024-01-07 23:08:45
 */
@Mapper
public interface SubjectLikedBOConverter {

    SubjectLikedBOConverter INSTANCE = Mappers.getMapper(SubjectLikedBOConverter.class);

    SubjectLiked convertBOToEntity(SubjectLikedBO subjectLikedBO);

    List<SubjectLikedBO> convertListInfoToBO(List<SubjectLiked> subjectLikedList);

}
