package com.yql.guli.gulithirdparty;

import com.aliyun.oss.OSSClient;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

@SpringBootTest
class GuliThirdPartyApplicationTests {
    @Resource
    OSSClient ossClient;
    @Test
    void contextLoads() throws FileNotFoundException {
        FileInputStream inputStream = new FileInputStream("A:\\File\\Google  Files\\AccessKey.csv");
        // 参数1位bucket  参数2位最终名字
        ossClient.putObject("guli-yql", "AccessKey.csv", inputStream);
        ossClient.shutdown();

        }


}
