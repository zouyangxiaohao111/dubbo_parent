package cn.tx.service.impl;

import cn.tx.service.HelloService;
import com.alibaba.dubbo.config.annotation.Service;

@Service
public class HelloServiceImpl implements HelloService {
    public String helloService(String name) {
        System.out.println("远程被调用"+name);
        return "hello"+name;
    }
}

