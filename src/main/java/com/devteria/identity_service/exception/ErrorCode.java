package com.devteria.identity_service.exception;

public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(999,"Uncategorized exception"),
    USER_EXISTED(1002, "User exists");
    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
