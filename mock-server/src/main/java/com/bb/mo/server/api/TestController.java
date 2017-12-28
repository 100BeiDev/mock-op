package com.bb.mo.server.api;




import com.bb.mo.server.domain.po.User;
import com.bb.mo.server.storage.mysql.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;


/**
 * Created by l_yy on 2016/12/19.
 */
@Controller
@RequestMapping("/mss/orders/")
public class TestController {


    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value="/create.do", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String test(HttpServletRequest request, HttpServletResponse response, String p) throws Exception {
        User user = new User();
        user.setUserName("lyy");
        user.setPassword("123");
        Date date = new Date();
        user.setCreateTime(date);
        user.setUpdateTime(date);
        userMapper.insert(user);
        return "success";

    }



}
