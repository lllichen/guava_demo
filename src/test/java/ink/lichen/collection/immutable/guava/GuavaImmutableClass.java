package ink.lichen.collection.immutable.guava;

import ink.lichen.collection.support.Support;
import com.google.common.collect.ImmutableList;
import org.junit.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by lichen@daojia.com on 2018-11-7.
 */
public class GuavaImmutableClass {

    @Test
    public void testAdd(){
        List<String> list = Support.createList();
        ImmutableList immutableList = ImmutableList.copyOf(list);
        System.out.println(immutableList.size());
        list.add("a");
        System.out.println(immutableList.size());
        immutableList.add("a");

    }

    @Test
    public void testSmart(){
        Set<String> set = new HashSet<>();
        set.add("a");
        ImmutableList list = ImmutableList.copyOf(set);
    }

}
