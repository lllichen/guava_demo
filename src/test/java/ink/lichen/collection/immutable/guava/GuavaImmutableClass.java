package ink.lichen.collection.immutable.guava;

import ink.lichen.collection.support.Support;
import com.google.common.collect.ImmutableList;

import java.util.List;

/**
 * Created by lichen@daojia.com on 2018-11-7.
 */
public class GuavaImmutableClass {




    public static void main(String[] args) {
        List<String> list = Support.createList();
        ImmutableList immutableList = ImmutableList.copyOf(list);
        System.out.println(immutableList.size());
        list.add("a");
        System.out.println(immutableList.size());
        immutableList.add("a");
    }
}
