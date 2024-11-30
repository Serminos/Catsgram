package ru.yandex.practicum.catsgram.model;

import lombok.Data;

@Data
public class Image {
    Long id; //  уникальный идентификатор изображения,
    long postId; //  уникальный идентификатор поста, к которому прикреплено изображение,
    String originalFileName; //  имя файла, который содержит изображение,
    String filePath; //  путь, по которому изображение было сохранено
}
