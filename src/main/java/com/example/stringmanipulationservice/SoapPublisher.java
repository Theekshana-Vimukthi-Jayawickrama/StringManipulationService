package com.example.stringmanipulationservice;

import jakarta.xml.ws.Endpoint;

public class SoapPublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/StringManipulationService", new StringManipulationService());
        System.out.println("SOAP Web Service is running at http://localhost:8080/StringManipulationService?wsdl");
    }
}
