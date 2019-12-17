package cn.tx.test;

import cn.tx.service.HelloService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/dubbo_consumer.xml"})

public class DubboConsumer {

//    @Autowired
    @Reference
    private HelloService helloService;

    @Test
    public void invoke() throws IOException {
        String result = helloService.helloService("zcw");
        System.out.println(result);

    }
}