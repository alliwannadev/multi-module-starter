package me.alliwannadev.coreapi.controller;

import lombok.RequiredArgsConstructor;
import me.alliwannadev.coredomain.model.User;
import me.alliwannadev.coredomain.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class SampleController {

    private final UserService userService;

    @GetMapping("/sample")
    public String hello() {
        userService.save(
                User.builder()
                        .name("Alice")
                        .build()
        );
        return "sample";
    }
}
