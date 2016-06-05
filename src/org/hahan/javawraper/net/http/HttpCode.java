package org.hahan.javawraper.net.http;

public enum HttpCode {
	CODE100(100),
	CODE101(101),

	CODE200(200),
	CODE201(201),
	CODE202(202),
	CODE203(203),
	CODE204(204),
	CODE205(205),
	CODE206(206),

	CODE300(300),
	CODE301(301),
	CODE302(302),
	CODE303(303),
	CODE304(304),
	CODE305(305),
	CODE306(306),
	CODE307(307),

	CODE400(400),
	CODE401(401),
	CODE402(402),
	CODE403(403),
	CODE404(404),
	CODE405(405),
	CODE406(406),
	CODE407(407),
	CODE408(408),
	CODE409(409),
	CODE410(410),
	CODE411(411),
	CODE412(412),
	CODE413(413),
	CODE414(414),
	CODE415(415),
	CODE416(416),
	CODE417(417),

	CODE500(500),
	CODE501(501),
	CODE502(502),
	CODE503(503),
	CODE504(504),
	CODE505(505),
	;

	private int code;
	
	HttpCode(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}
	public boolean isSuccess() {
		return code >=200 && code < 300;
	}
}
