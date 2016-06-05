package me.javawraper.lang.result;

public class Result9<T1, T2, T3, T4, T5, T6, T7, T8, T9> extends Result8<T1, T2, T3, T4, T5, T6, T7, T8> {

	private T9 result9 = null;

	public Result9(){}
	
	public Result9(T1 result, T2 result2, T3 result3, T4 result4, T5 result5,
			T6 result6, T7 result7, T8 result8, T9 result9) {
		super(result, result2, result3, result4, result5, result6, result7, result8);
		this.result9 = result9;
	}

	public T9 getResult9() {
		return result9;
	}

	public void setResult9(T9 result9) {
		this.result9 = result9;
	}

}
