package com.example.jbull.suapandroid.domain;

import com.orm.SugarRecord;

/**
 * Created by Luan on 24/11/2016.
 */

public class AlunoDisciplina extends SugarRecord {

    public Aluno aluno;
    public Disciplina disciplina;
    public int faltas;

    public AlunoDisciplina(){}

    public AlunoDisciplina(Aluno a, Disciplina d){
        aluno = a;
        disciplina = d;
    }



}
