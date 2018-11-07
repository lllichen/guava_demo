package ink.lichen.collection.new_;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lichen@daojia.com on 2018-11-7.
 */
public class NewCollection {

    @Test
    public void testJDKMultiset(){
        List<String> words = new ArrayList<String>();
        Map<String, Integer> counts = new HashMap<String, Integer>();
        for (String word : words) {
            Integer count = counts.get(word);
            if (count == null) {
                counts.put(word, 1);
            } else {
                counts.put(word, count + 1);
            }
        }
    }

    @Test
    public void testGuavaMutiset(){
        Multiset<String> multiset = HashMultiset.create();
        multiset.add("1");
        multiset.add("1");
        multiset.add("1");
        multiset.add("1");
        System.out.println(multiset.count("1"));
        System.out.println(multiset.count("0"));
    }


    @Test
    public void testGuavaMulitimap(){
        //SetMultimap
        ListMultimap<Integer,Integer> listMultimap = ArrayListMultimap.create();
        listMultimap.put(1,1);
        listMultimap.put(1,2);
        listMultimap.put(1,3);
        List<Integer> list = listMultimap.get(1);
        System.out.println(list);
        List<Integer> nullList = listMultimap.get(2);
        System.out.println(nullList);

        Map map = listMultimap.asMap();
    }


}