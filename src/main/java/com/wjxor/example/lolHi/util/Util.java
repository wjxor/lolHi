package com.wjxor.example.lolHi.util;

import java.math.BigInteger;

public class Util {

	public static int getAsInt(Object object) {

		return getAsInt(object, -1);
	}

	public static int getAsInt(Object object, int defaultvalue) {

		if (object instanceof BigInteger) {
			return ((BigInteger) object).intValue();
		}

		else if (object instanceof String) {

			return Integer.parseInt((String) object);
		}

		else if (object instanceof Long) {
			return (int) ((long) object);
		}

		else if (object instanceof Integer) {
			return (int) object;
		}

		return defaultvalue;
	}

}
