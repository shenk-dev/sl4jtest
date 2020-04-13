package cn.tzinfo.log4j.util;

import com.google.gson.Gson;

/**
 * @Author:shenk
 * @Date: 2020/4/13
 * @Description:
 */
public class JSONUtil {

    static final Gson gson = new Gson();

    public static String toJsonStr(Object obj) {
        return gson.toJson(obj);
    }

    public static  <T> T fromJsonStr(String jsonStr, Class<T> clz) {
        return gson.fromJson(jsonStr, clz);
    }
}
