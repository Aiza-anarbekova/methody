package com.compan;

import java.util.Random;

public class zadanie {
    static int[] array={
            0,
            -1,
            +1,
            -1,
            +1,
            +1,
            +1,
            +1,
            -1,
            -1,
            -1,
            0,
            +1,
            +1,
            -1,
            0
    };
    static String[] actions = {
            "мой день",
            "поднимаюсь с левой ноги",
            "поднимаюсь с правой ноги",
            "падаю с кровати",
            "пробежка по аллее",
            "физ зарядка на балконе",
            "варю крепкий кофе",
            "готовлю плотный завтрак",
            "достаю вчерашний салат",
            "спустило колесо",
            "добираюсь на работу пешком",
            "добираюсь на работу на маршрутке ",
            "добираюсь на работу на своем авто",
            "прихожу вовремя ",
            "опаздываю на работу",
            "конец "
    };
    static int s=0;
    static void num(int act){
       act-=1;
        if (act>=0 && act<actions.length) {
            System.out.println(actions[act]);

            s += array[act];
        }
        else {
            System.out.println("index out of bounds");
        }
    }
    public static void main(String[] args) {
       num(1);
        Random ran = new Random();

        int index= ran.nextInt(0, actions.length);
        int i = ran.nextInt(1,3);
        // с левой
        if (i==1){
            num(2);
            int a= ran.nextInt(1,10);
            if (a<8)
                num(4);
            else
                num(5);
            int b= ran.nextInt(1,13);
            if (b<9)
                num(7);
            else {
                num(8);
            }
        }
        // с правой
        else {
            num(3);
            int c= ran.nextInt(1,7);
            if (c<5)
                num(5);
            else {
                num(6);
            }
            int v=ran.nextInt(1,5);
            if (v==1)
                num(8);
            else {
                num(9);
            }
        }
        int n=ran.nextInt(1,6);
        if (n<3) {
            num(10);
            int m=ran.nextInt(1,9);
            if (m<3) {
                num(11);
                if(ran.nextInt(1,9) <3){
                    num(14);
                }
                else{
                num(15);
                }
            }
            else {
                num(12);
                if (ran.nextInt(1,3) ==1)
                    num(14);
                else {
                    num(15);
                }
            }
        }
        else {
            num(13);
            if (ran.nextInt(1,9) <6)
                num(14);
            else {
                num(15);
            }
        }
        num(16);

        if (s<0){
            System.out.println("неудачный день");
        }
        if (s>0){
            System.out.println("удачный день");
        }
        if (s==0){
            System.out.println("нейтральный день");
        }
    }
}



