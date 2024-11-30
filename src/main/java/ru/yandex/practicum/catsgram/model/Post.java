package ru.yandex.practicum.catsgram.model;

import lombok.Data;

import java.time.Instant;

@Data
public class Post {
    Long id; // уникальный идентификатор сообщения,
    long authorId; // пользователь, который создал сообщение,
    String description; // текстовое описание сообщения,
    Instant postDate; // дата и время создания сообщения.
}
