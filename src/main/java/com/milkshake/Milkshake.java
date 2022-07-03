package com.milkshake;

public class Milkshake {
    public static int chocolateMilkshake = 15;
    public static int caramelSauce = 6;
    public static int nuts = 3;
    public static int almonds = 5;
    public static int pistachios = 5;
// comment
    public static int chocolateMilkshakeWithAlmonds(){
        return chocolateMilkshake+almonds;
    }

    public static int chocolateMilkshakeWithNuts(){
        return chocolateMilkshake+nuts;
    }

    public static int chocolateMilkshakeWithCaramelSauce(){
        return chocolateMilkshake+caramelSauce;
    }
    public static int chocolateMilkshakeWithPistachios(){
        return chocolateMilkshake+pistachios;
    }
}
