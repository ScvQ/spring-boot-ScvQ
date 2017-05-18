package cn.spiderpig.demo.util;

import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class GsonUtil {

	public static Map<String, String> getMapFromJson(String jsonStr) {
		GsonBuilder gb = new GsonBuilder();
		Gson g = gb.create();
		Map<String, String> map = g.fromJson(jsonStr, new TypeToken<Map<String, String>>() {
		}.getType());
		return map;
	}

}
