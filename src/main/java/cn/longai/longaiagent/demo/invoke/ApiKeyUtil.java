package cn.longai.longaiagent.demo.invoke;

import cn.hutool.core.io.resource.ClassPathResource;

import java.io.IOException;
import java.util.Properties;

/**
 * @version 1.0
 * @ClassName ApplicationUtil
 * @Description: TODO
 * @Author: likunlong
 * @Date: 2025/4/27 18:41
 */
public class ApiKeyUtil {

    private static final String APPLICATION_LOACAL_YML = "application-local.yml";

    public static String getApplicationValue(String key)  {
        ClassPathResource resource = new ClassPathResource(APPLICATION_LOACAL_YML);
        Properties properties = new Properties();
        try {
            properties.load(resource.getStream());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String res = (String) properties.get(key);
        return res;
    }

    public static void main(String[] args) {
        String value = getApplicationValue("api-key");
        System.out.println(value);
    }
}
