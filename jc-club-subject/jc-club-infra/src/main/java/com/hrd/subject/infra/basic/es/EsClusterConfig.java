package com.hrd.subject.infra.basic.es;

import lombok.Data;

/**
 * description:es集群类
 */
@Data
public class EsClusterConfig {

    /**
     * 集群名称
     */
    private String name;

    /**
     * 集群节点
     */
    private String nodes;
}
