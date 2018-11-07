package ink.lichen.collection.new_;

import com.google.common.collect.*;
import org.junit.Test;
import sun.security.provider.certpath.Vertex;

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


    @Test
    public void testJDKBiMap(){
        Map<String, Integer> nameToId = Maps.newHashMap();
        Map<Integer, String> idToName = Maps.newHashMap();

        nameToId.put("Bob", 42);
        idToName.put(42, "Bob");
    }

    @Test
    public void testGuavaBiMap(){
        BiMap<String, Integer> userId = HashBiMap.create();
        userId.put("Bob",42);
        String userForId = userId.inverse().get(42);
    }

    @Test
    public void testJDKTable(){
//        Map<FirstName, Map<LastName, Person>>
        Map<Integer, Map<Integer, Integer>> map = new HashMap<>();
    }

    @Test
    public void testTable(){
        Table<String,String,Integer> table = HashBasedTable.create();
        table.put("li","san",20);
        table.put("li","si",20);
        table.put("li","wu",20);
        table.put("zhang","san",20);
        table.put("zhang","si",20);
        table.put("zhang","wu",20);
        Map map =  table.row("li");
        System.out.println(map);

        Map columnMap = table.column("san");
        System.out.println(columnMap);
    }

    @Test
    public void testClassToInstanceMap(){
        ClassToInstanceMap<Number> numberDefaults=MutableClassToInstanceMap.create();
        numberDefaults.putInstance(Integer.class, Integer.valueOf(2));
        numberDefaults.putInstance(Long.class,100L);
        System.out.println( numberDefaults.getInstance(Integer.class));
    }



    @Test
    public void testRangeSet(){
        RangeSet<Integer> rangeSet = TreeRangeSet.create();
        rangeSet.add(Range.closed(1, 10)); // {[1,10]}
        rangeSet.add(Range.closedOpen(11, 15));//不相连区间:{[1,10], [11,15)}
        rangeSet.add(Range.closedOpen(15, 20)); //相连区间; {[1,10], [11,20)}
        rangeSet.add(Range.openClosed(0, 0)); //空区间; {[1,10], [11,20)}
        rangeSet.remove(Range.open(5, 10)); //分割[1, 10]; {[1,5], [10,10], [11,20)}

        rangeSet.contains(9);
        rangeSet.rangeContaining(9);
    }

    @Test
    public void testRangeMap(){
        RangeMap<Integer, String> rangeMap = TreeRangeMap.create();
        rangeMap.put(Range.closed(1, 10), "foo"); //{[1,10] => "foo"}
        rangeMap.put(Range.open(3, 6), "bar"); //{[1,3] => "foo", (3,6) => "bar", [6,10] => "foo"}
        rangeMap.put(Range.open(10, 20), "foo"); //{[1,3] => "foo", (3,6) => "bar", [6,10] => "foo", (10,20) => "foo"}
        rangeMap.remove(Range.closed(5, 11)); //{[1,3] => "foo", (3,5) => "bar", (11,20) => "foo"}
    }
}
