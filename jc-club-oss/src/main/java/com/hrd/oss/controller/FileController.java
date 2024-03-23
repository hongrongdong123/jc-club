package com.hrd.oss.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.hrd.oss.service.FileService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * description:
 */
@RestController
public class FileController {

    @Resource
    private FileService fileService;

    @Value("${storage.service.type}")
    private String storageType;

    @RequestMapping("/testGetAllBUcket")
    public String testGetAllBUcket() throws Exception{
        List<String> allBucket = fileService.getAllBucket();
        return allBucket.get(0);
    }

    @RequestMapping("/testNacos")
    public String testNacos() throws Exception{
        return storageType;
    }

}
