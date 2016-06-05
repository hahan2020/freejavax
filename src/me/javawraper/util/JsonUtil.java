package me.javawraper.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public class JsonUtil {

	public String toJsonString(Object obj){
		Json json = Json.toJson(obj);
		return json.toString();
	}

	static interface Json {
		static Json toJson(Object obj){
			if (obj instanceof Json) {
				return (Json)obj;
			}
			if (obj.getClass().isAssignableFrom(Map.class)) {
				Map<Object, Object> oMap = (Map<Object, Object>)obj;
				return new JsonMap(oMap);
			}
			if (obj.getClass().isAssignableFrom(Collection.class)) {
				Collection c = (Collection)obj;
				return new JsonArray(c);
			}
			if (obj.getClass().isArray()) {
				Object[] oArray = (Object[])obj;
				return new JsonArray(oArray);
			}
			return null;
		}
	}
	
	static class JsonObject implements Json {
		Object value = null;
		public JsonObject(Integer value) {
			this.value = value;
		}
		
		public String toString() {
			return value.toString();
		}
	}

	static class JsonArray implements Json {
		private Collection<Json> c = new ArrayList<Json>();
		public JsonArray(Object[] valueArray) {
			if (valueArray != null) {
				for(int i=0; i<valueArray.length; i++) {
					c.add(Json.toJson(valueArray[i]));
				}
			}
		}
		public JsonArray(Collection c) {
			if (c != null) {
				for (Object obj : c) {
					this.c.add(Json.toJson(obj));
				}
			}
		}
		public String toString() {
			StringBuffer sb = new StringBuffer('[');
			for (Json json : c) {
				sb.append(json.toString());
			}
			sb.append(']');
			return sb.toString();
		}
	}

	static class JsonMap implements Json {
		public JsonMap(Map<Object, Object> valueMap){
			
		}
	}
	
}
