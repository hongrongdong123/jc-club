package com.hrd.oss.config;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.hrd.oss.adapter.StorageAdapter;
import com.hrd.oss.adapter.ALiStorageAdapter;
import com.hrd.oss.adapter.MinioStorageAdapter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * description:
 */
@Configuration
@RefreshScope
public class StorageConfig {

    @Value("${storage.service.type}")
    //@NacosValue(value = "${storage.service.type}", autoRefreshed = true)
    private String storageType;



    @Bean
    @RefreshScope
    public StorageAdapter storageService() {
        if ("minio".equals(storageType)) {
            return new MinioStorageAdapter();
        } else if ("aliyun".equals(storageType)) {
            return new ALiStorageAdapter();
        } else {
            throw new IllegalArgumentException("未找到对应的文件存储处理器");
        }
    }
}
