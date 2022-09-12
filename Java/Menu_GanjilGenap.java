/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// package javaapplication3;

/**
 *
 * @author Muiso
 */
import java.util.Scanner;
public class Menu_GanjilGenap {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int a0;
        System.out.println("==========Masukkan Pilihan Anda=========");
        System.out.println("1. Check angka ganjil/genap");
        System.out.println("2. Kalkulator Sederhana");
        System.out.print("Masukkan Pilihan [1-2] :");
        a0 = input.nextInt();
            switch (a0){
            case 1 :
        int a1;
        System.out.println("===Check Bilangan===");
        System.out.print("Masukkan Angka : ");
        a1 = input.nextInt();
        if (a1 % 2 ==0){
        System.out.println("Angka "+a1+" adalah genap");
        } else {
        System.out.println("angka "+a1+" adalah ganjil");
        }
            break;        
            case 2 :
            int a, b, c, d, e, f;
        System.out.println("===OPERASI MATEMATIKA===");
        System.out.print("Masukkkan angka pertama :");
        a = input.nextInt();
        System.out.print("Masukkan angka kedua :");
        b = input.nextInt();
        
        c = a + b;
        d = a - b;
        e = a * b;
        f = a / b;
        System.out.println("Hasil "+a+" + "+b+" = "+c);
        System.out.println("Hasil "+a+" - "+b+" = "+d);
        System.out.println("Hasil "+a+" x "+b+" = "+e);
        System.out.println("Hasil "+a+" : "+b+" = "+f);   
            break;
        }
    } 
}
