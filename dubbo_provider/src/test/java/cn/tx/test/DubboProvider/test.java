package cn.tx.test.DubboProvider;

import cn.tx.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/dubbo_provider.xml"})
public class test {

    @Autowired
    private HelloService helloService;

    @Test
    public void startService() throws IOException {
        System.out.println("服务启动了");
        System.in.read();


    }
}
