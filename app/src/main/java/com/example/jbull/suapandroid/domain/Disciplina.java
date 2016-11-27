package com.example.jbull.suapandroid.domain;

import com.orm.SugarRecord;
import com.orm.dsl.Ignore;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Luan on 24/11/2016.
 */

public class Disciplina extends SugarRecord {

    public String nome;

    public String semestre;

    public Professor professor;

    @Ignore
    private ArrayList<Avaliacao> avaliacoes;

    public Disciplina(){}

    public Disciplina(String n, String s, Professor p){
        nome = n;
        semestre = s;
        professor = p;
    }

    public ArrayList<Avaliacao> getAvaliacoes(){



        return avaliacoes;
    }

}
