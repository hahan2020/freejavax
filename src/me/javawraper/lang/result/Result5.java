package me.javawraper.lang.result;

public class Result5<T1, T2, T3, T4, T5> extends Result4<T1, T2, T3, T4> {

	private T5 result5 = null;
	public Result5(){}
	
	public Result5(T1 result, T2 result2, T3 result3, T4 result4, T5 result5) {
		super(result, result2, result3, result4);
		this.result5 = result5;
	}

	public T5 getResult5() {
		return result5;
	}

	public void setResult5(T5 result5) {
		this.result5 = result5;
	}
}
