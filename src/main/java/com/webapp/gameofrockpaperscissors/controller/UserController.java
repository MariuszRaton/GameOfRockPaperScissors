package com.webapp.gameofrockpaperscissors.controller;

import com.webapp.gameofrockpaperscissors.domain.UserDto;
import com.webapp.gameofrockpaperscissors.mapper.UserMapper;
import com.webapp.gameofrockpaperscissors.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1/user")
public class UserController {
    @Autowired
    private DbService service;
    @Autowired
   private UserMapper userMapper;

    @RequestMapping(method = RequestMethod.GET, value = "getUsers")
   public List<UserDto> getUsers() {
       return userMapper.mapToUserDtoList(service.getAllUsers());
   }

    @RequestMapping(method = RequestMethod.GET, value = "getUser")
    public UserDto getUser(@RequestParam Long userId) throws UserNotFoundException {
        return userMapper.mapToUserDto(service.getUserById(userId));
   }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteUser")
   public void deleteUser (@RequestParam Long userId) throws UserNotFoundException {
        service.deleteUser(userId);
   }

    @RequestMapping(method = RequestMethod.POST, value = "createUser", consumes = APPLICATION_JSON_VALUE)
   public void createUser(@RequestBody UserDto userDto) {
        service.saveUser(userMapper.mapToUser(userDto));
   }
}
