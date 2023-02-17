package com.aixu.testError;

/**
 * @author aixu
 * @ClassName TestError
 * @Date 2023/2/13 19:55
 */
public class TestError extends RuntimeException{
    private static final long serialVersionUID = -8289930393795102315L;
    private String msg;

    public TestError(String s) {
        this.msg = s;
    }

    @Override
    public String getMessage() {
        System.out.println("自定义异常");
        return msg;
    }
}
