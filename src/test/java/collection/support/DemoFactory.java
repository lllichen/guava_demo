package collection.support;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lichen@daojia.com on 2018-11-7.
 */
public class DemoFactory {


    public static List<String> createList(){
        List<String> list = new ArrayList();
        list.add("a");
        list.add("a");
        list.add("a");
        list.add("a");
        return list;
    }
}
