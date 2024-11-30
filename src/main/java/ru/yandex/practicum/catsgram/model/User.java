package ru.yandex.practicum.catsgram.model;

import lombok.Data;

import java.time.Instant;

@Data
public class User {
    Long id; // уникальный идентификатор пользователя,
    String username; // имя пользователя,
    String email; //электронная почта пользователя,
    String password; //пароль пользователя,
    Instant registrationDate; //дата и время регистрации.
}
