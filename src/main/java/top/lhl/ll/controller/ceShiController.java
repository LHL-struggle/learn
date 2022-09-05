package top.lhl.ll.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author: LHL
 * Date  : 2022/9/6 0:22
 */
@RestController
public class ceShiController {

    @RequestMapping("ceshi")
    public String ceshi(){
        System.out.println("今天天气不错");
        return "你好世界";
    }
}
