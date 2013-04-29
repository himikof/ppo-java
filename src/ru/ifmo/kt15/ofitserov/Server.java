package ru.ifmo.kt15.ofitserov;

import javax.xml.ws.Endpoint;

import ru.ifmo.kt15.ofitserov.AddSubtractService;
import ru.ifmo.kt15.ofitserov.MultiplyDivideService;

public class Server {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/DistributedCalc/addsubtract",
            new AddSubtractService());
    }

}
