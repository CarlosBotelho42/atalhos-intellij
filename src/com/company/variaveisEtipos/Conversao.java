package com.company.variaveisEtipos;

//Casting
public class Conversao {

    public static void main(String[] args) {

        //DownCast vai precisar ser explicita, já que vai faltar espaço os dados alocados
        //eles podem trunkar os valores(tirar as virgulas)
        byte b1;
        short s1 = 1000;
        b1 = (byte) s1;

        //UpCast pode ser implícita já que vai sobrar espaço dos dados alocados
        long l1;
        int i1 =10;
        l1 = 11;

        int i2;
        long l2 = 1000000000000000L;
        i2 = (int) l2;

        int i3;
        long l3 = 10000L;
        i3 = (int) l3;

        double d1;
        float f1 = 10.5f;
        d1 = f1;

        float f2;
        float f3;
        double d2 = 10000.58d;
        f2 = (float) d2;
        double d3 = 10000.5888888888888888888888888888888888888888888888888888888888888888888888888888d;
        f3 = (float) d3;

        int i4;
        float f4 = 11.8697f;
        i4 = (int) f4;

        System.out.println("b1 " + b1);
        System.out.println("l1 " + l1);
        System.out.println("i2 " + i2);
        System.out.println("i3 " + i3);
        System.out.println("d1 " + d1);
        System.out.println("f2 " + f2);
        System.out.println("f3 " + f3);
        System.out.println("i4 " + i4);




    }

}
