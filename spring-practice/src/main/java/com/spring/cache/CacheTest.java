package com.spring.cache;

import com.google.common.collect.Lists;
import org.junit.Test;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

/**
 * Created by Cherie on 2020/11/04
 **/
@CacheConfig(cacheNames = "cache")
public class CacheTest {

    @Cacheable
    public List<String> getCacheData() {
        return Lists.newArrayList("a", "b", "c");
    }

    @CacheEvict
    public void reloadCache() {

    }

    @Test
    public void test() {
        System.out.println(this.getCacheData());
    }
}
