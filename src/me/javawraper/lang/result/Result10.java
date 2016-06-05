package me.javawraper.lang.result;

public class Result10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> extends Result9<T1, T2, T3, T4, T5, T6, T7, T8, T9> {

	private T10 result10 = null;

	public Result10(){}
	
	public Result10(T1 result, T2 result2, T3 result3, T4 result4, T5 result5,
			T6 result6, T7 result7, T8 result8, T9 result9, T10 result10) {
		super(result, result2, result3, result4, result5, result6, result7, result8, result9);
		this.result10 = result10;
	}

	public T10 getResult10() {
		return result10;
	}

	public void setResult10(T10 result10) {
		this.result10 = result10;
	}

}
