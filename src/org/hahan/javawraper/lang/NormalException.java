package org.hahan.javawraper.lang;

/**
 * NormalException主要关注异常信息投递给谁
 * 主要面向：用户，后台日志
 * @author 345480567@qq.com
 */
public class NormalException extends RuntimeException {
	private static final long serialVersionUID = -6099938141153555115L;

	private boolean open2User = false;
	private boolean open2Log = true;
	private String msg = "";
	private Exception cause = null;
	private Object causeObject = null;

	public NormalException(String msg, Object causeObject) {
		this(msg, null, causeObject);
	}

	public NormalException(Exception t) {
		this(null, t, null);
	}
	
	public NormalException(String msg, Exception t, Object causeObject) {
		this.msg = msg;
		this.cause = t;
		this.causeObject = causeObject;
	}

	public boolean isOpen2User() {
		return open2User;
	}

	public void setOpen2User(boolean open2User) {
		this.open2User = open2User;
	}

	public boolean isOpen2Log() {
		return open2Log;
	}

	public void setOpen2Log(boolean open2Log) {
		this.open2Log = open2Log;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Throwable getCause() {
		return cause;
	}

	public void setCause(Exception cause) {
		this.cause = cause;
	}
	
}
