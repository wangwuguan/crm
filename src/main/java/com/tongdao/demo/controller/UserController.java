package com.tongdao.demo.controller;

import com.tongdao.demo.entity.dto.UserDto;
import com.tongdao.demo.entity.query.UserQuery;
import com.tongdao.demo.entity.vo.EchartsVo;
import com.tongdao.demo.entity.vo.PageResultVo;
import com.tongdao.demo.service.IUserService;
import com.tongdao.demo.util.DateUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;


/**
 * @program: crm
 * @description: 用户管理控制层
 * @author: Wang.will
 * @create: 2019-08-13
 */
@Controller
@RequestMapping("/user")
@Api(tags="用户管理")
public class UserController {

    @Autowired
    private IUserService userService;

    /**
     * 跳转到User列表展示页面
     * @param model
     * @return
     */
    @RequestMapping(value = "/toUser", method = RequestMethod.GET)
    @ApiOperation(value = "跳转到User列表展示页面")
    public String toUserList(Model model) {
        return "user/user";
    }

    /**
     * 查询全部用户
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ApiOperation(value = "查询全部用户")
    @ResponseBody
    public PageResultVo<Object> listUser(UserQuery userQuery) {
        return userService.listUser(userQuery);
    }

    /**
     * 跳转到添加用户页面
     * @param model
     * @return
     */
    @RequestMapping(value = "/toAddUser", method = RequestMethod.GET)
    @ApiOperation(value = "跳转到添加用户页面")
    public String toAddUser(Model model) {
        return "user/add_user";
    }

    /**
     * 添加新用户
     * @param user
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    @ApiOperation(value = "添加新用户")
    public String insertUser(@Valid UserDto user, BindingResult bindingResult)
    {
        if(bindingResult.hasErrors()){
            return bindingResult.getFieldError().getDefaultMessage();
        } else {
            user.setUserId(DateUtil.getNum());
            return userService.insertUser(user);
        }
    }

    /**
     * 修改用户信息
     * @param user
     * @return
     */
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ApiOperation(value = "修改用户信息")
    @ResponseBody
    public String updateUser(@Valid UserDto user)
    {
        return userService.updateUser(user);
    }

    /**
     * 删除用户(逻辑)
     * @param userDto
     * @return
     */
    @RequestMapping(value = "/del", method = RequestMethod.POST)
    @ApiOperation(value = "删除用户(逻辑)")
    @ResponseBody
    public String delUser(UserDto userDto) {
        System.out.println(userDto);
        return userService.delUser(userDto);
    }

    /**
     * 跳转到每月生日人数统计页面
     * @param model
     * @return
     */
    @RequestMapping(value = "/toStatistical", method = RequestMethod.GET)
    @ApiOperation(value = "跳转到每月生日人数统计页面")
    public String toStatistical(Model model) {
        return "statistical/birthday_month";
    }


    /**
     * 获取用户生日月份统计数据
     * @param
     * @return
     */
    @RequestMapping(value = "/birthdayMonths", method = RequestMethod.POST)
    @ApiOperation(value = "获取用户生日月份统计数据")
    @ResponseBody
    public EchartsVo dataBirthdayMonths() {
        return userService.dataBirthdayMonths();
    }
}
