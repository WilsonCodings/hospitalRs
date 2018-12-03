package com.hospital.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.registration.service.UserService;

import io.swagger.annotations.ApiResponse;

/**
 * UserController.
 * 
 * @author WangPeng
 *
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * getAllUsers.
     * 
     */
    @ResponseBody
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public ApiResponse getAllUsers(BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return null;
        }
        return null;
    }

}
