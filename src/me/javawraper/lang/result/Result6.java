/**
 * 
 */
package me.javawraper.lang.result;

public class Result6<T1, T2, T3, T4, T5, T6> extends Result5<T1, T2, T3, T4, T5> {

	private T6 result6 = null;
	public Result6(){}
	
	public Result6(T1 result, T2 result2, T3 result3, T4 result4, T5 result5, T6 result6) {
		super(result, result2, result3, result4, result5);
		this.result6 = result6;
	}

	public T6 getResult6() {
		return result6;
	}

	public void setResult6(T6 result6) {
		this.result6 = result6;
	}
}
