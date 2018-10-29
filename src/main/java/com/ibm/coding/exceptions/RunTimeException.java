package com.ibm.coding.exceptions;

import lombok.Data;

@Data
public class RunTimeException extends RuntimeException {

    private static final long serialVersionUID = 5279574402010612442L;
    private Integer status;
    private Integer code;
    private String message;

    public RunTimeException(String message) {
        this.message = message;
    }

    public RunTimeException(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public RunTimeException(Integer status, Integer code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }


}
