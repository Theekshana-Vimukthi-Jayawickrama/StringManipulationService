package com.example.stringmanipulationservice;

import com.example.stringmanipulationservice.Service.ServiceImpl.StringManipulationServiceImpl;
import jakarta.xml.ws.Endpoint;

public class SoapPublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/StringManipulationService", new StringManipulationServiceImpl());
        System.out.println("SOAP Web Service is running at http://localhost:8080/StringManipulationService?wsdl");
    }
}
