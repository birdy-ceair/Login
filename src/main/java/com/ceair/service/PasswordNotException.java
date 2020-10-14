package com.ceair.service;

/**
 * @author lvpeng
 * @description
 * @date 2020/10/9-15:45
 */
public class PasswordNotException extends ServiceException {
    public PasswordNotException() {
    }

    public PasswordNotException(String message) {
        super(message);
    }

    public PasswordNotException(String message, Throwable cause) {
        super(message, cause);
    }

    public PasswordNotException(Throwable cause) {
        super(cause);
    }

    public PasswordNotException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
