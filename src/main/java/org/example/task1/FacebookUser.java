package org.example.task1;

import lombok.Getter;

import java.time.LocalDateTime;
@Getter
public class FacebookUser {
    private String email;
    private String country;
    private LocalDateTime lastActiveTime;
}
