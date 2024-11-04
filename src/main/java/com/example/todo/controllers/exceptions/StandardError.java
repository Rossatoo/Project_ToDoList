package com.example.todo.controllers.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StandardError implements Serializable {

    private Long timestamp;
    private Integer status;
    private String message;
}
