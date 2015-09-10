package com.nkoo.core.entity;

/**
 * UserException : 用户自定义异常
 *
 * @author StarZou
 * @since 2014-09-27 18:12
 */
@SuppressWarnings("serial")
public class UserException extends RuntimeException {

	public UserException(){
        super();
    }
    public UserException(String msg){
        super(msg);
    }
    /**
     * 异常发生时间
     */
    private long date = System.currentTimeMillis();

    public long getDate() {
        return date;
    }
    
}
