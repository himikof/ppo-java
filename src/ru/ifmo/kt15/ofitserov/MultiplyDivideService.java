package ru.ifmo.kt15.ofitserov;

import javax.jws.WebService;

@WebService
public class MultiplyDivideService {

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        return a / b;
    }
}

