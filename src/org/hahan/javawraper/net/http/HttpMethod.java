package org.hahan.javawraper.net.http;

public enum HttpMethod {
	Get("Get"), Post("Post", true), Head("Head"), Put("Put"), Trace("Trace"), Options("Options"), Delete("Delete"),
	Lock("Lock"), Mkcol("Mkcol"), Copy("Copy"), Move("Move");

	private String method;
	private boolean hasBody = false;

	private HttpMethod(String method) {
		this.method = method.toUpperCase();
	}

	private HttpMethod(String method, boolean hasBody) {
		this.method = method.toUpperCase();
		this.hasBody = hasBody;
	}

	public String getMethod() {
		return method;
	}

	public boolean hasBody() {
		return hasBody;
	}

	public String toString() {
		return method;
	}

	public static HttpMethod getMethod(String methodName) {
		HttpMethod[] values = HttpMethod.values();
		for (HttpMethod value : values) {
			if (value.getMethod().equalsIgnoreCase(methodName)) {
				return value;
			}
		}
		return null;
	}

}