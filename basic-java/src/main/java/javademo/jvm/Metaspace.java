package javademo.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * create by cherie on 03/03/2019.
 * 1. 元空间测试
 */
public class Metaspace {

    private static String base = "string";

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            String str = base + base;
            base = str;
            list.add(str.intern());
        }
        System.out.println(list.size());

    }
}
