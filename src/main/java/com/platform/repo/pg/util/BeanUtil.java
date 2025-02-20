package com.platform.repo.pg.util;

import com.platform.common.util.JsonAdaptor;
import com.platform.repo.pg.model.base.BasePlpgsqlModel;

import java.io.IOException;
import java.text.SimpleDateFormat;

/**
 * @author Advance
 * @date 2022年07月18日 16:26
 * @since V1.0.0
 */
public class BeanUtil {
    private static JsonAdaptor jsonAdaptor = getJsonAdaptor();

    private static JsonAdaptor getJsonAdaptor() {
        JsonAdaptor jsonAdaptor = new JsonAdaptor();
        jsonAdaptor.setDateFormat(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss"));
        return jsonAdaptor;
    }
    public static <T> T basePlpgsqlModel2Clz(BasePlpgsqlModel basePlpgsqlModel, Class<T> clz) {
        if (0 <= basePlpgsqlModel.getRetcode()) {
            String jsonstr = basePlpgsqlModel.getRetvalue();
            if (null != jsonstr) {
                T t = null;
                try {
                    t = jsonAdaptor.readValue(jsonstr, clz);
                } catch (IOException e) {
                    e.printStackTrace();
                    throw new RuntimeException("数据库结果JSON转换实体类错误");
                }
                return t;
            }
        }
        return null;
    }
}
