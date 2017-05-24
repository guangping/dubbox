package com.alibaba.dubbo.demo.consumer;

import com.alibaba.dubbo.demo.bid.BidRequest;
import com.alibaba.dubbo.demo.bid.BidResponse;
import com.alibaba.dubbo.demo.bid.BidService;
import com.alibaba.fastjson.JSONObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by IntelliJ IDEA.
 * Author Lance.
 * Date: 2017-05-24
 * Time: 17:55
 */
@ContextConfiguration({"classpath*:META-INF/spring/*.xml"})
public class DemoConsumerTest extends AbstractTestNGSpringContextTests {

    private static final Logger logger = LogManager.getLogger(DemoConsumerTest.class);

    @Autowired
    private DemoAction demoAction;

    @Autowired
    private BidService bidService;

    @BeforeMethod
    public void before() {
        logger.info("consumer start ......");
    }


    @Test
    public void start() throws Exception {
        this.demoAction.start();
    }

    @Test
    public void bid() {
        BidRequest request = new BidRequest();
        BidResponse response = this.bidService.bid(request);
        System.out.println(JSONObject.toJSONString(response));
    }
}
