package waq.hbwl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

//    @RequestMapping(value = "/selectUser")
//    public String selectUser(HttpServletRequest request) {
//
//        String id = request.getParameter("id");
//        System.out.println("id = " + id);
//        return "success";
//
//    }

    // 简单数据类型绑定
    @RequestMapping(value = "/selectUser")
    public String selectUser(@RequestParam(value = "user_id") Integer id) {

        System.out.println("id = " + id);
        return "success";

    }

}
