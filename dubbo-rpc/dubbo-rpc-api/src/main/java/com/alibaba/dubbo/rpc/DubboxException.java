package com.alibaba.dubbo.rpc;

/**
 * Created by IntelliJ IDEA.
 * Author Lance.
 * Date: 2017-05-24
 * Time: 15:35
 */
public class DubboxException extends RuntimeException {
    public DubboxException() {
        super();
    }

    public DubboxException(String message) {
        super(message);
    }

    public DubboxException(String message, Throwable cause) {
        super(message, cause);
    }

    public DubboxException(Throwable cause) {
        super(cause);
    }

    protected DubboxException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
