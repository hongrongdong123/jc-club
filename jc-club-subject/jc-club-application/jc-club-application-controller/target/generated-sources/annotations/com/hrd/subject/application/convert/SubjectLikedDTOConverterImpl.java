package com.hrd.subject.application.convert;

import com.hrd.subject.application.dto.SubjectLikedDTO;
import com.hrd.subject.domain.entity.SubjectLikedBO;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-16T15:49:23+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.4.1 (Oracle Corporation)"
)
public class SubjectLikedDTOConverterImpl implements SubjectLikedDTOConverter {

    @Override
    public SubjectLikedBO convertDTOToBO(SubjectLikedDTO subjectLikedDTO) {
        if ( subjectLikedDTO == null ) {
            return null;
        }

        SubjectLikedBO subjectLikedBO = new SubjectLikedBO();

        subjectLikedBO.setPageNo( subjectLikedDTO.getPageNo() );
        subjectLikedBO.setPageSize( subjectLikedDTO.getPageSize() );
        subjectLikedBO.setId( subjectLikedDTO.getId() );
        subjectLikedBO.setSubjectId( subjectLikedDTO.getSubjectId() );
        subjectLikedBO.setSubjectName( subjectLikedDTO.getSubjectName() );
        subjectLikedBO.setLikeUserId( subjectLikedDTO.getLikeUserId() );
        subjectLikedBO.setStatus( subjectLikedDTO.getStatus() );
        subjectLikedBO.setCreatedBy( subjectLikedDTO.getCreatedBy() );
        subjectLikedBO.setCreatedTime( subjectLikedDTO.getCreatedTime() );
        subjectLikedBO.setUpdateBy( subjectLikedDTO.getUpdateBy() );
        subjectLikedBO.setUpdateTime( subjectLikedDTO.getUpdateTime() );
        subjectLikedBO.setIsDeleted( subjectLikedDTO.getIsDeleted() );

        return subjectLikedBO;
    }
}
