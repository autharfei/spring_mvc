package com.qf.mvc.controller;

import com.qf.mvc.dto.UserDto;
import com.qf.mvc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BaseParamsController {
    @GetMapping("/test")
    @ResponseBody
public String test(int id,String username){
        System.out.println(id);
        System.out.println(username);
        return username;
    }

//   三个属性 映射路径、请求方式、指定ContestType格式
    @GetMapping ("/test2")
    @ResponseBody
    public String test2(User user){
        System.out.println(user);
        return user.getName();
    }

    //son数据 复杂的对象(嵌套对象建议使用json格式的数据上传)
    @GetMapping ("/test3")
    @ResponseBody
    public String test3(UserDto userDto){
        System.out.println(userDto);
        System.out.println(userDto.getAddress().getCity());

        return "";
    }

}
