package ru.netology.springboot_authorities.exception;

import org.springframework.context.annotation.Bean;

public class UnauthorizedUser extends RuntimeException {
    public UnauthorizedUser(String msg) {
        super(msg);
    }
}
