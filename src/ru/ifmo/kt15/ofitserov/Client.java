package ru.ifmo.kt15.ofitserov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.rmi.RemoteException;

public class Client {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s;
            while (!(s = br.readLine()).equals("exit")) {
                //try {
                    System.out.println(s);
                //} catch (RemoteException e) {
                //    System.out.println(e.getLocalizedMessage());
                //}
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
};
