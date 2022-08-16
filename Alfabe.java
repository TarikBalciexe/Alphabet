/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.alfabe;

/**
 *
 * @author Tarık BALCI
 */
import java.util.Scanner;

public class Alfabe {
	
	private static Scanner sc;
	
	public static void main(String[] args) {
		
		char ch;
		sc= new Scanner(System.in);

		System.out.print("Lütfen bir karakter giriniz =  ");
		ch = sc.next().charAt(0);
		
		if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			System.out.println(ch + " Alfabe içindedir ");
		}
		else {
			System.out.println(ch + " Alfabe içinde değildir");
		}
		
        }
}

    

