package com.alibaba.dubbo.rpc;

/**
 * Created by IntelliJ IDEA.
 * Author Lance.
 * Date: 2017-05-24
 * Time: 15:35
 */
public class DubboException extends RuntimeException {
    public DubboException() {
        super();
    }

    public DubboException(String message) {
        super(message);
    }

    public DubboException(String message, Throwable cause) {
        super(message, cause);
    }

    public DubboException(Throwable cause) {
        super(cause);
    }

    protected DubboException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
