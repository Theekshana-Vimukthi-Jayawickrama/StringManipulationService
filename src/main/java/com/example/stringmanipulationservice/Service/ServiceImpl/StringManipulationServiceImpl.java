package com.example.stringmanipulationservice.Service.ServiceImpl;

import com.example.stringmanipulationservice.Service.StringManipulationServiceInterface;
import jakarta.jws.WebService;

@WebService
public class StringManipulationServiceImpl implements StringManipulationServiceInterface {

    @Override
    public String reverseText(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    @Override
    public int countCharacters(String text) {
        return text.length();
    }
}
