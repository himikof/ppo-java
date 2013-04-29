package ru.ifmo.kt15.ofitserov;

import javax.jws.WebService;

@WebService
public class AddSubtractService {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }
}
