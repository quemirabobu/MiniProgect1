package com.example.junk.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class ResponseDTO<T> {
    private List<T> items;
    private T item;
    private String errorMessage;
    private int statusCode;
}
