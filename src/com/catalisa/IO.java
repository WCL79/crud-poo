package com.catalisa;

import java.util.Scanner;

public class IO {

    public static Scanner lerDados(){
        return new Scanner(System.in);
    }
    public static void exibirDados(String texto){
        System.out.println(texto);
    }
}
