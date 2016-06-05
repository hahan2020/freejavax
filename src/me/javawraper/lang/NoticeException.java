package me.javawraper.lang;

/**
 * NoticeException用于业务流程终极跳转，
 * 因为只有异常才能跨调用返回。
 * 并且这些信息要让最终用户能够看到。
 *
 * @author 345480567@qq.com
 */
public class NoticeException extends RuntimeException {

	private static final long serialVersionUID = -217837283464008491L;

	private String msg = "";
	
	public NoticeException(String msg) {
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
