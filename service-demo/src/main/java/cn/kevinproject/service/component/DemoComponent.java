package cn.kevinproject.service.component;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author Kevin Liu
 */
@Component
@Slf4j
public class DemoComponent {


    @PostConstruct
    public void init(){
        log.info("spring demo project start success");
    }
}
