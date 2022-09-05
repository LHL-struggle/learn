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
        return "bbql";
    }
}
