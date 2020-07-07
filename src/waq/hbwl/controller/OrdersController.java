package waq.hbwl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import waq.hbwl.po.Orders;
import waq.hbwl.po.User;

@Controller
public class OrdersController {

    /*
     * 向订单查询页面跳转
     * */
    @RequestMapping(value = "/toFindOrders")
    public String toFindOrdersWithUser() {
        return "orders";
    }

    /*
     * 接受信息
     * */
    @RequestMapping(value = "/findOrders")
    public String FindOrdersWithUser(Orders orders) {

        Integer oId = orders.getoId();
        User user = orders.getUser();
        String username = user.getUsername();
        System.out.println("oId : " + oId + " name : " + username);
        return "success";

    }

}
