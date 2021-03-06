package waq.hbwl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import waq.hbwl.po.User;
import waq.hbwl.po.UserVo;

import java.util.List;

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

    /*
     * 向用户注册页面跳转
     * */
    @RequestMapping(value = "/toRegister")
    public String toRegist() {
        return "regist";
    }

    /*
     * 接受用户信息
     * */
    @RequestMapping(value = "/registUser")
    public String registUser(User user) {

        System.out.println(user);
        return "success";

    }

    /*
     * 向用户列表页面跳转
     * */
    @RequestMapping(value = "/toUser")
    public String toUser() {
        return "user";
    }

    /*
     * 接受删除用户的方法
     * */
    @RequestMapping(value = "/deleteUser")
    public String deleteUser(Integer[] ids) {

        if (ids != null) {

            for (int id : ids) {
                System.out.println("delete id : " + id);
            }

        } else {
            System.out.println("id is null !!!");
        }
        return "success";

    }

    /*
     * 向用户批量修改页面跳转
     * */
    @RequestMapping(value = "/toUserEdit")
    public String toUserEdit() {
        return "edit";
    }

    /*
     * 接受批量修改用户的方法
     * */
    @RequestMapping(value = "/editUser")
    public String editUser(UserVo userVo) {

        List<User> users = userVo.getUsers();
        for (User user : users) {
            if (user.getId() != null) {
                System.out.println("edit id : " + user.getUsername());
            }
        }
        return "success";

    }

}
