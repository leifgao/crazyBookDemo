package me.leifgao.crazy.p643;

/**
 * Created by leif on 2017/8/27
 */
public class Fruit {

    public void info() {
        System.out.println("i am a father info function");
    }

    class Apple extends Fruit {
        public void info() {
            System.out.println("i am a apple info function");
        }
    }

    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        fruit.info();
        Fruit apple = fruit.new Apple();
        apple.info();

//        Apple apple = new Fruit().Apple();
    }

}
