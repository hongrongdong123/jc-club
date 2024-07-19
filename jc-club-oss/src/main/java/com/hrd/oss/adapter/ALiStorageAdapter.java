package com.hrd.oss.adapter;

import com.hrd.oss.entity.FileInfo;
import com.hrd.oss.adapter.StorageAdapter;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;

/**
 * description:
 */

public class ALiStorageAdapter implements StorageAdapter {
    @Override
    public void createBucket(String bucket) {

    }

    @Override
    public void uploadFile(MultipartFile uploadFile, String bucket, String objectName) {

    }

    @Override
    public List<String> getAllBucket() {
        List<String> bucketNameList = new LinkedList<>();
        bucketNameList.add("aliyun");
        return bucketNameList;
    }

    @Override
    public List<FileInfo> getAllFile(String bucket) {
        return null;
    }

    @Override
    public InputStream downLoad(String bucket, String objectName) {
        return null;
    }

    @Override
    public void deleteBucket(String bucket) {

    }

    @Override
    public void deleteObject(String bucket, String objectName) {

    }
}
