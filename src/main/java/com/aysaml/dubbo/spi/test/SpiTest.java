package com.aysaml.dubbo.spi.test;

import com.aysaml.dubbo.spi.service.SpiDemoService;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * SPI测试
 *
 * @author aysaml
 * @date 2019-10-18
 */
public class SpiTest {
  public static void main(String[] args) {
      ServiceLoader<SpiDemoService> services = ServiceLoader.load(SpiDemoService.class);
      Iterator<SpiDemoService> iterator = services.iterator();
      if(null != iterator && iterator.hasNext()){
          SpiDemoService spiDemoService = iterator.next();
          spiDemoService.hello("SPI");
      }
  }
}
