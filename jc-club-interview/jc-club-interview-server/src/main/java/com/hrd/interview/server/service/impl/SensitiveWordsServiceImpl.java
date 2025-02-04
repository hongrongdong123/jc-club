package com.hrd.interview.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hrd.interview.server.entity.po.SensitiveWords;
import com.hrd.interview.server.mapper.SensitiveWordsMapper;
import com.hrd.interview.server.service.SensitiveWordsService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 敏感词表 服务实现类
 * </p>
 *
 * @author ChickenWing
 * @since 2024/05/17
 */
@Service
public class SensitiveWordsServiceImpl extends ServiceImpl<SensitiveWordsMapper, SensitiveWords> implements SensitiveWordsService {

}
