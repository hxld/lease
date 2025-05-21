package com.atguigu.lease.common.mybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: hxld
 * @Date: 2025/5/21 19:50
 * @Description:
 **/
@Configuration
@MapperScan("com.atguigu.lease.web.*.mapper")
public class MybatisPlusConfiguration {
}
