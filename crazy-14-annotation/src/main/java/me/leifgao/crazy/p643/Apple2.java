package me.leifgao.crazy.p643;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leif on 2017/8/27
 */
public class Apple2 extends Fruit{

    @Override
    @Deprecated
    public void info() {
        System.out.println();
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        new Apple2().info();
        List<String> myList = new ArrayList();
    }
}
