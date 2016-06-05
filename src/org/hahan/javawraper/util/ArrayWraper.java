package org.hahan.javawraper.util;

public class ArrayWraper {

	public static Byte[] wrap(byte[] buf) {
		Byte[] wrapBuf = new Byte[buf.length];
		for (int i=0; i<buf.length; i++) {
			wrapBuf[i] = buf[i]; 
		}
		return wrapBuf;
	}
	
	public static Boolean[] wrap(boolean[] buf) {
		Boolean[] wrapBuf = new Boolean[buf.length];
		for (int i=0; i<buf.length; i++) {
			wrapBuf[i] = buf[i]; 
		}
		return wrapBuf;
	}
	
	public static Integer[] wrap(int[] buf) {
		Integer[] wrapBuf = new Integer[buf.length];
		for (int i=0; i<buf.length; i++) {
			wrapBuf[i] = buf[i]; 
		}
		return wrapBuf;
	}
	
	public static Double[] wrap(double[] buf) {
		Double[] wrapBuf = new Double[buf.length];
		for (int i=0; i<buf.length; i++) {
			wrapBuf[i] = buf[i]; 
		}
		return wrapBuf;
	}
	
	public static Float[] wrap(float[] buf) {
		Float[] wrapBuf = new Float[buf.length];
		for (int i=0; i<buf.length; i++) {
			wrapBuf[i] = buf[i]; 
		}
		return wrapBuf;
	}
}
