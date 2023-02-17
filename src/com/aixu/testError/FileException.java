package com.aixu.testError;

/**
 * @author aixu
 * @ClassName FileException
 * @Date 2023/2/16 16:53
 */
public class FileException extends RuntimeException{
    private static final long serialVersionUID = 3276773522878526880L;
    private String msg;

    public FileException(String msg){
        this.msg = msg;
    }


    public String getMessage() {
        return msg;
    }
}
