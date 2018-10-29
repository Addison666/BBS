package com.ibm.coding.util;

import lombok.Data;

/**
 * @author THLiu
 */
@Data
public class JsonResponse<T> {

    private String message;
    private Integer code;
    private T data;

    public JsonResponse() {

    }

    public JsonResponse(String message, Integer code, T data) {
        this.message = message;
        this.code = code;
        this.data = data;
    }

    public JsonResponse(String message, Integer code) {
        this.message = message;
        this.code = code;
    }
}
