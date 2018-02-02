package com.lh.demo.controller;

import com.lh.demo.entity.User;
import com.lh.demo.service.IUserService;
import com.lh.demo.utils.ResultUtil;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * User控制器
 */
@Controller
@RequestMapping("user")
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    IUserService userService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "用户信息", httpMethod = "GET", notes = "获取用户信息", response = ResultUtil.class)
    public ResultUtil getUserInfo(HttpServletRequest req, ModelMap map, @ApiParam(required = true, value = "user", name = "用户ID") User user) {
        String param = req.getParameter("Id");
        List<User> list = userService.getUser();
        ResultUtil res = new ResultUtil();
        res.setStatus(0);
        res.setMsg("OK");
        res.setData(list);
        return res;
    }
}
