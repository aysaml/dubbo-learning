package com.aysaml.dubbo.spi.service.impl;

import com.aysaml.dubbo.spi.service.SpiDemoService;

/**
 * SPI示例服务实现
 *
 * @author aysaml
 * @date 2019-10-18
 */
public class SpiDemoServiceImpl implements SpiDemoService {

  @Override
  public String hello(String name) {
    System.out.println("hello " + name);
    return "hello " + name;
  }
}
