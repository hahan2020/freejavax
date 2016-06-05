package org.hahan.javawraper.lang.result;

public class Result7<T1, T2, T3, T4, T5, T6, T7> extends Result6<T1, T2, T3, T4, T5, T6> {

	private T7 result7 = null;
	public Result7(){}
	
	public Result7(T1 result, T2 result2, T3 result3, T4 result4, T5 result5, T6 result6, T7 result7) {
		super(result, result2, result3, result4, result5, result6);
		this.result7 = result7;
	}

	public T7 getResult7() {
		return result7;
	}

	public void setResult7(T7 result7) {
		this.result7 = result7;
	}
}
