package cn.kevinproject.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kevin Liu
 */
@RestController
public class DemoController {

    @GetMapping("demo/web")
    public String demo(){
       return "demo web start success";
    }
}
