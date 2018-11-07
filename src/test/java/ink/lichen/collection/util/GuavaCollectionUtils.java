package ink.lichen.collection.util;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by lichen@daojia.com on 2018-11-7.
 */
public class GuavaCollectionUtils {



    @Test
    public void newCollection(){
        //before jdk7
        List<String> list = new ArrayList<String>();

        //guava
        List<String> guavaList = Lists.newArrayList();
        Map<String,String> map = Maps.newHashMap();
        List<String> theseElements = Lists.newArrayList("alpha", "beta", "gamma");


        List<String> exactly100 = Lists.newArrayListWithCapacity(100);
        List<String> approx100 =  Lists.newArrayListWithExpectedSize(100);
        Set<String> approx100Set = Sets.newHashSetWithExpectedSize(100);
    }
}
