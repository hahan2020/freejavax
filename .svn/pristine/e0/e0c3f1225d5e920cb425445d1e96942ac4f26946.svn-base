package me.javawraper.lang.result;

public class Equals {

	public static boolean equals(Object o1, Object o2) {
		if (!o1.getClass().equals(o2.getClass())) {
			return false;
		}
		if (Byte.class.equals(o1)) {
			if (!equals((Byte)o1, (Byte)o2)) {
				return false;
			}
		}
		return o1.equals(o2);
	}

	public static boolean equals(Byte b1, Byte b2) {
		return b1.byteValue() == b2.byteValue();
	}

}
