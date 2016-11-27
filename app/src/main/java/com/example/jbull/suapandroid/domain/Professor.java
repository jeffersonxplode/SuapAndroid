package com.example.jbull.suapandroid.domain;

import com.orm.SugarRecord;

/**
 * Created by Luan on 24/11/2016.
 */

public class Professor extends SugarRecord {

    public String nome, telefone;

    public  Professor(){}

    public Professor(String n, String t){
        nome = n;
        telefone = t;
    }

}
