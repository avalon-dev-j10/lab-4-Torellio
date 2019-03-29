/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs;
import java.util.Date;

/**
 *
 * @author AVeselkov
 */
public class Pers implements Person {

    private String name;
    private Date birthDate;
    
    public Pers(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public Date getBirthDate() {
        return birthDate;
    }

    @Override
    public int compareTo(Object o) {
        Pers pers = (Pers)o;
        if (this.name.compareTo(pers.name) > 0) {
            return 1;
        } else if (this.name.compareTo(pers.name) < 0) {
            return -1;
        } else if (this.birthDate.compareTo(pers.birthDate) > 0) {
            return 1;
        } else if (this.birthDate.compareTo(pers.birthDate) < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}

