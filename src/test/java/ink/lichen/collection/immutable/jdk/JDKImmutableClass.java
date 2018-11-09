package ink.lichen.collection.immutable.jdk;

import ink.lichen.collection.support.Support;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

/**
 * Created by lichen@daojia.com on 2018-11-7.
 * 创建对象的不可变拷贝是一项很好的防御性编程技巧
 * 1.当对象被不可信的库调用时，不可变形式是安全的
 * 2.不可变对象被多个线程调用时，不存在竞态条件问题
 * 3.不可变集合不需要考虑变化，因此可以节省时间和空间。所有不可变的集合都比它们的可变形式有更好的内存利用率
 * 4.不可变对象因为有固定不变，可以作为常量来安全使用
 *
 *
 * jdk 劣势
 * 1.笨重而且累赘：不能舒适地用在所有想做防御性拷贝的场景
 * 2.不安全：要保证没人通过原集合的引用进行修改，返回的集合才是事实上不可变的
 * 3.低效：包装过的集合仍然保有可变集合的开销，比如并发修改的检查、散列表的额外空间，等等
 *
 */
public class JDKImmutableClass {

    @Test
    public void testAdd(){
        List<String> list = Support.createList();

        List unmodifiableList = Collections.unmodifiableList(list);
        System.out.println(unmodifiableList.size());
        list.add("a");
        System.out.println(unmodifiableList.size());
        System.out.println(unmodifiableList.add("a"));
    }



}
