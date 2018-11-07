package ink.lichen.collection.immutable;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Multiset;
import ink.lichen.collection.support.Bar;

import javax.annotation.Nullable;
import java.util.EnumMap;
import java.util.List;
import java.util.Set;

/**
 * Created by lichen@daojia.com on 2018-11-1.
 */
public class ImmutableClass {

    public static final ImmutableSet<String> COLOR_NAMES = ImmutableSet.of(
            "red",
            "orange",
            "yellow",
            "green",
            "blue",
            "purple");

    public static void main(String[] args) {

        ImmutableList<String> defensiveCopy =  ImmutableList.copyOf(COLOR_NAMES);



        Multiset multiset = HashMultiset.create();
        multiset.add("a");
        multiset.add("b");
        System.out.println(multiset.count("a"));

        ListMultimap listMultimap = ArrayListMultimap.create();
        listMultimap.put("a","n");
//        Multiset multiset = ListMultimap

        EnumMap enumMap = new EnumMap(ink.lichen.collection.immutable.ImmutableClass.Foo.class);

    }
    enum Foo {

    }


}
