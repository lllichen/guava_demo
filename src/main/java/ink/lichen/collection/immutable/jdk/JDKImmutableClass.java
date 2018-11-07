package ink.lichen.collection.immutable.jdk;

import ink.lichen.collection.support.DemoFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by lichen@daojia.com on 2018-11-7.
 */
public class JDKImmutableClass {


    public static void main(String[] args) {
        List<String> list = DemoFactory.createList();

        List unmodifiableList = Collections.unmodifiableList(list);
        System.out.println(unmodifiableList.size());
        list.add("a");
        System.out.println(unmodifiableList.size());
        System.out.println(unmodifiableList.add("a"));

    }
}
