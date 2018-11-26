package test.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangxuan
 * @date 2018/11/26
 * @time 11:01
 */
@RestController
public class MainController {

    @RequestMapping("index")
    public String index() {
        return "hello SpringBoot";
    }
}
