package com.hrd.oss.service;

import com.hrd.oss.adapter.StorageAdapter;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * description:
 */
@Service
public class FileService {

    private final StorageAdapter storageAdapter;

    public FileService(StorageAdapter storageAdapter) {
        this.storageAdapter = storageAdapter;
    }


    public List<String> getAllBucket() {
        return  storageAdapter.getAllBucket();
    }
}
