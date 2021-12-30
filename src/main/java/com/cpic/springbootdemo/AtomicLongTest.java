package com.cpic.springbootdemo;

import java.util.concurrent.atomic.AtomicLong;

public class AtomicLongTest {
    public static void main(String[] args) {
        //1、创建具有初始值 0 的新 AtomicLong。
        AtomicLong atomicLong = new AtomicLong();
        System.out.println("Value：" + atomicLong.get());

        //2、创建具有给定初始值的新 AtomicLong。
        AtomicLong atomicLong1 = new AtomicLong(10);
        System.out.println("Value：" + atomicLong1.get());

        //3、以原子方式将给定值添加到当前值,先加上特定的值，再获取结果
        AtomicLong atomicLong2 = new AtomicLong(3);
        atomicLong2.addAndGet(5);
        System.out.println("Value：" + atomicLong2.get());

        //4、先获取当前值再加上特定的值
        AtomicLong atomicLong5 = new AtomicLong(10);
        atomicLong5.getAndAdd(5);
        System.out.println("Value：" + atomicLong5.get());
        //5、如果当前值 == 预期值，则以原子方式将该值设置为给定的更新值。
        AtomicLong atomicLong3 = new AtomicLong(10);
        atomicLong3.compareAndSet(10,15);
        System.out.println("Value：" + atomicLong3.get());


        //6、 以原子方式将当前值减 1,先减去1再获取值
        AtomicLong atomicLong4 = new AtomicLong(10);
        atomicLong4.decrementAndGet();
        System.out.println("Value：" + atomicLong4.get());

        //7、先获取当前值再减1
        AtomicLong atomicLong6 = new AtomicLong();
        atomicLong6.getAndDecrement();
        System.out.println("Value：" + atomicLong6.get());

//8、先获取当前值再加1
        AtomicLong atomicLong7 = new AtomicLong();
        atomicLong7.getAndIncrement();
        System.out.println("Value：" + atomicLong7.get());

        //9、先加1再获取当前值
        AtomicLong atomicLong9 = new AtomicLong();
        atomicLong9.incrementAndGet();
        System.out.println("Value：" + atomicLong9.get());

        //10、先获取当前值再设置新的值
        AtomicLong atomicLong8 = new AtomicLong();
        atomicLong8.getAndSet(20);
        System.out.println("Value：" + atomicLong8.get());



    }

}
