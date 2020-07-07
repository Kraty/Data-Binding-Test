package waq.hbwl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/*
* 日期控制器类
* */

@Controller
public class DataController {

    @RequestMapping(value = "/customerData")
    public String CustomerData(Date data) {

        System.out.println("data : " + data);
        return "success";

    }

}
