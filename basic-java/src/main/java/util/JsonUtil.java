package util;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class JsonUtil {

    private static final ObjectMapper DEFAULT_OBJECT_MAPPER = new ObjectMapper();

    static {
        DEFAULT_OBJECT_MAPPER.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
        DEFAULT_OBJECT_MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    public static ObjectMapper getObjectMapper() {
        return DEFAULT_OBJECT_MAPPER;
    }

    @SuppressWarnings("unchecked")
    public static Map<String, Object> getMap(String json) {
        try {
            return DEFAULT_OBJECT_MAPPER.readValue(json, Map.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 反序列化POJO或简单Collection如List<String>,List<Map<String,Object>>
     */
    public static <T> T fromJson(String content, Class<T> toValueType) {
        try {
            return DEFAULT_OBJECT_MAPPER.readValue(content, toValueType);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String build(Object obj) {
        try {
            return DEFAULT_OBJECT_MAPPER.writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 反序列化POJO或简单Collection如List<String>,List<Map<String,Object>>
     */
    public static <T> T getObject(String content, Class<T> clazz) {
        if (StringUtils.isEmpty(content)) {
            return null;
        }
        try {
            return DEFAULT_OBJECT_MAPPER.readValue(content, clazz);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> List<T> json2ListObj(String json, Class<T> obj) {
        try {
            CollectionType typeReference = TypeFactory.defaultInstance().constructCollectionType(List.class, obj);
            return DEFAULT_OBJECT_MAPPER.readValue(json, typeReference);
        } catch (Exception e) {
            throw new RuntimeException("json to list map error");
        }
    }

}
