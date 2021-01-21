package cn.kevinproject.service;

import com.google.common.base.Throwables;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.CountDownLatch;

/**
 * @author Kevin Liu
 */
@SpringBootApplication
@Slf4j
public class DemoServiceApplication {

    public static void main(String[] args) throws InterruptedException {
        try {
            SpringApplication.run(DemoServiceApplication.class, args);
            new CountDownLatch(1).await();
        } catch (Exception e) {
            log.error("facade start failed, cause:{}", Throwables.getStackTraceAsString(e));
            throw e;
        }
    }
}
