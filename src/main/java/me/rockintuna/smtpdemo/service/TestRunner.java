package me.rockintuna.smtpdemo.service;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import me.rockintuna.smtpdemo.dto.MailDto;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TestRunner {
    private final MailService mailService;

    @PostConstruct
    public void test() {
        MailDto mailDto = new MailDto("test@domain.com", "테스트 메일입니다.", "테스트 메일입니다.");
        mailService.sendMail(mailDto);
    }
}
