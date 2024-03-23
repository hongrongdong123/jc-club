package com.hrd.oss.adapter;

import com.hrd.oss.entity.FileInfo;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.List;

/**
 * 文件存储适配器
 */
public interface StorageAdapter {
    /**
     * 创建Bucket桶
     */
     void createBucket(String bucket);

    /**
     * 上传文件
     */
     void uploadFile(MultipartFile uploadFile, String bucket, String objectName) ;

    /**
     * 列出所有桶
     */
     List<String> getAllBucket();

    /**
     * 列出所当前桶及文件
     */
     List<FileInfo> getAllFile(String bucket);

    /**
     * 下载文件
     * @param bucket
     * @param objectName
     * @return
     */
     InputStream downLoad(String bucket, String objectName);

    /**
     * 删除桶
     * @param bucket
     * @throws Exception
     */
     void deleteBucket(String bucket);

    /**
     * 删除文件
     * @param bucket
     * @param objectName
     * @throws Exception
     */
     void deleteObject(String bucket, String objectName);
}
