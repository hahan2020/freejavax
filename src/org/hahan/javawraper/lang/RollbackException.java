package org.hahan.javawraper.lang;

/**
 * 当异常发生在事务范围内时，事务需要回滚。
 * 在多级事务中需要通过多级throw来完成有效回滚
 *
 * @author 345480567@qq.com
 */
public class RollbackException extends NormalException {

	private static final long serialVersionUID = 8991065097591392379L;

	public RollbackException(Exception e) {
		super(e);
	}
	
	public RollbackException(String msg, Exception e) {
		super(msg, e);
	}
}
