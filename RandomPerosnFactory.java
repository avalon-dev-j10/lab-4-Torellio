/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author AVeselkov
 */
public class RandomPerosnFactory {
    
    private String[] names = new String[] {"Alex", "Petr", "Ivan", "Nikola", "Sveta", "Anastasia", "Maria", "Ira"};
    
    public Pers getPerson() {
        
        Date randomDate = new Date(System.currentTimeMillis() - System.currentTimeMillis()/(new Random().nextInt(10)+1));
        String randomName = names[new Random().nextInt(names.length)];        
        return new Pers(randomName, randomDate);
    }
    
}
