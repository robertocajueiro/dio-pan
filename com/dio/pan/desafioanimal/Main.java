package com.dio.pan.desafioanimal;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);


        String AN1, AN2, AN3;

        AN1 = sc.nextLine();
        AN2 = sc.nextLine();
        AN3 = sc.nextLine();

        if(AN1.equalsIgnoreCase("vertebrado")) {
            if(AN2.equalsIgnoreCase("ave")) {
                if (AN3.equalsIgnoreCase("carnivoro")) {
                    System.out.println("aguia");
                } else {
                    System.out.println("pomba");
                }
            } else {
                if (AN3.equalsIgnoreCase("onivoro")) {
                    System.out.println("homem");
                } else {
                    System.out.println("vaca");

                }
            }
        } else {
            if(AN2.equalsIgnoreCase("inseto")) {
                if (AN3.equalsIgnoreCase("hematofago")) {
                    System.out.println("pulga");
                } else {
                    System.out.println("lagarta");
                }
                } else {
                    if(AN3.equalsIgnoreCase("hematofago")) {
                        System.out.println("sanguessuga");
                    } else {
                        System.out.println("minhoca");
                    }
                }
            }
        }

    }