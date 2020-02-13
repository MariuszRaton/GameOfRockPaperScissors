package com.webapp.gameofrockpaperscissors.mapper;

import com.webapp.gameofrockpaperscissors.domain.User;
import com.webapp.gameofrockpaperscissors.domain.UserDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserMapper {
    public User mapToUser(final UserDto userDto) {
        return new User(
                userDto.getId(),
                userDto.getUserNick(),
                userDto.getNumberOfPoints(),
                userDto.getDate());
    }

    public UserDto mapToUserDto(final User user) {
        return new UserDto(
                user.getId(),
                user.getUserNick(),
                user.getNumberOfPoints(),
                user.getDate());
    }

    public List<UserDto> mapToUserDtoList(final List<User> userList) {
        return userList.stream()
                .map(u -> new UserDto(u.getId(), u.getUserNick(), u.getNumberOfPoints(), u.getDate()))
                .collect(Collectors.toList());
    }

}
