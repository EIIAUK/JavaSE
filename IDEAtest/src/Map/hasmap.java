package Map;


/*
Map 是将键映射到值的对象 Map<K:键的类型，V值的类型>
键是唯一的
键出现重复，则会被替换掉
*/

/*put(K,V) 添加元素
remove(key) 根据键删除对应元素
clear() 移除所有的键值对应的元素
containsKey(K) 判断集合是否包含指定的键
containsValue(value) 判断集合是否包含指定的值
boolean isEmpty() 判断是否为空
int size() 返回长度*/

//get(key) 根据键获取值
//Set<K> keyset() 获取所有键集合
//Collectio<v> values() 获取所有的集合

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hasmap {
    public static void main(String[] args) {
        //创建对象
        Map<String,String> map = new HashMap<>();
        //添加元素
        map.put("学生1","张三");
        map.put("学生2","李四");
        map.put("学生3","王五");
        map.put("学生4","杨六");
        System.out.println(map);
        System.out.println(  map.containsKey("学生2"));
        System.out.println(map.containsValue("张我"));
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        System.out.println(map.remove("学生2"));

//Set<K> keyset() 获取所有键集合
        System.out.println(map.get("学生2"));
        Set<String> set = map.keySet();
        System.out.println(set);
//Collectio<v> values() 获取所有的集合
        Collection<String> s = map.values();
        System.out.println(s);
    }
}
