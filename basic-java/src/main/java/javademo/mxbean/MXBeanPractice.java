package javademo.mxbean;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;

/**
 * Created by Cherie on 2021/01/22
 **/
public class MXBeanPractice {

    public static void main(String[] args) {
        MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();
        System.out.println(memoryMXBean.getObjectName());
        System.out.println(memoryMXBean.getHeapMemoryUsage());
        System.out.println(memoryMXBean.getNonHeapMemoryUsage());
        System.out.println(memoryMXBean.getObjectPendingFinalizationCount());


    }

}
