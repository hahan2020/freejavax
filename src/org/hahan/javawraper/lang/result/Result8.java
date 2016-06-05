package org.hahan.javawraper.lang.result;

public class Result8<T1, T2, T3, T4, T5, T6, T7, T8> extends Result7<T1, T2, T3, T4, T5, T6, T7> {

	private T8 result8 = null;

	public Result8(){}
	
	public Result8(T1 result, T2 result2, T3 result3, T4 result4, T5 result5, T6 result6, T7 result7, T8 result8) {
		super(result, result2, result3, result4, result5, result6, result7);
		this.result8 = result8;
	}

	public T8 getResult8() {
		return result8;
	}

	public void setResult8(T8 result8) {
		this.result8 = result8;
	}

}
