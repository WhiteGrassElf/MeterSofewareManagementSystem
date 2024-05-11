package com.example.wisdom.entity;

import lombok.Data;

@Data
public class CustomResponse {
    private int code;
    private String message;
    private Object data;

    public CustomResponse(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}