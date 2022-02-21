package au.vervio.test;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CacheImpl<val> implements Cache{
    Map<Object,Object> cacheMap = new HashMap<Object,Object>();

    public Object get(Object key) {

      return  cacheMap.entrySet().stream().filter(item -> item.getKey().equals(key)).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
   }
    public Object put(Object key, Object value) {
        if(key == null || value == null ) {
          return null;
       }
      if(!cacheMap.containsKey(key)) {
          cacheMap.put(key,value);

      }
       return cacheMap;
    }

    public boolean exists(Object key) {
        if(key == null) {
            return  false;
                    }
        return cacheMap.containsKey(key);

    }

    public void delete(Object key) {

        if(cacheMap.containsKey(key)) {
            cacheMap.remove(key);
        }

    }
}
