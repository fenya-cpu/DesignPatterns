package structural.flyweight;
import java.util.HashMap;
import java.util.Map;

public class BeanFactory {
    private static final Map<String, CoffeeBean> beans = new HashMap<>();

    public static CoffeeBean getBean(String origin, String roastLevel) {
        String key = origin + "_" + roastLevel;
        if (!beans.containsKey(key)) {
            System.out.println("Закупка нового сорту: " + origin);
            beans.put(key, new CoffeeBean(origin, roastLevel));
        }
        return beans.get(key);
    }
}