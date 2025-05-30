package me.rockintuna.smtpdemo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class MailDto {
    private String address;
    private String title;
    private String message;
}