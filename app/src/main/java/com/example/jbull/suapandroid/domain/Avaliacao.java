package com.example.jbull.suapandroid.domain;

import com.orm.SugarRecord;

import java.util.Date;

/**
 * Created by Luan on 25/11/2016.
 */

public class Avaliacao extends SugarRecord {

    public String _data;
    public Disciplina disciplina;
    public float Nota;
    public Aluno aluno;

    public Avaliacao(){}

    public Avaliacao(String date, Disciplina dis, Aluno a){
        this._data = date;
        disciplina = dis;
        aluno = a;
    }

}
