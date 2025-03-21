package com.example.stringmanipulationservice.Service;

import jakarta.jws.WebMethod;

public interface StringManipulationServiceInterface {
    @WebMethod
    String reverseText(String text);

    @WebMethod
    int countCharacters(String text);
}
