package com.webapp.gameofrockpaperscissors.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "user_nick")
    private String userNick;

    @Column(name = "user_points")
    private Integer userPoints;

    @Column
    private String date;
}
