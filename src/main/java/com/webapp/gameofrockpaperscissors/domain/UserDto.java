package com.webapp.gameofrockpaperscissors.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Getter
public class UserDto {
    private Long id;
    private String userNick;
    private Integer userPoints;
    private String date;
}
