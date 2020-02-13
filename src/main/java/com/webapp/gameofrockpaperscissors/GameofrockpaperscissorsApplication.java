package com.webapp.gameofrockpaperscissors;

import com.webapp.gameofrockpaperscissors.domain.UserDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GameofrockpaperscissorsApplication {

    public static void main(String[] args) {
       /* UserDto userDto = new UserDto((long)1, "Test nick", 5, "jakas data");


        Long id = userDto.getId();
        String userNick = userDto.getUserNick();

        System.out.println(id + " " + userNick);
*/
       SpringApplication.run(GameofrockpaperscissorsApplication.class, args);
    }

}
