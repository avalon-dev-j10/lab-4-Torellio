/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs;
import java.util.Random;

/**
 *
 * @author AVeselkov
 */
public class RandomStringFactory {
    
    private String CHAR_LIST = "abcdefghijklmnopqrstuvwxyz";
    
    public String getString() {
        
        int stringLenght = new Random().nextInt(10) + 5;
        
        StringBuffer randStr = new StringBuffer();
        for (int i=0; i < stringLenght; i++){
            int number = new Random().nextInt(CHAR_LIST.length());
            char ch = CHAR_LIST.charAt(number);
            randStr.append(ch);
        }
        
        return randStr.toString();
    }
    
}
