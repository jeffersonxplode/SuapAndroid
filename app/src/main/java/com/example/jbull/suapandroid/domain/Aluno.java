package com.example.jbull.suapandroid.domain;

import com.orm.SugarRecord;
import com.orm.query.Select;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Luan on 24/11/2016.
 */

public class Aluno extends SugarRecord{
    public String nome, matricula, senha;

    public Aluno(){}

    public Aluno(String n, String m, String s){
        nome = n;
        matricula = m;
        senha = s;
    }


    public ArrayList<Disciplina> getDisciplinas(){
        ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
        List<AlunoDisciplina> alunoDisciplinas = AlunoDisciplina.find(AlunoDisciplina.class, "aluno = ?", this.getId().toString());
        for (AlunoDisciplina a : alunoDisciplinas) {
            disciplinas.add(Disciplina.findById(Disciplina.class, a.disciplina.getId()));
        }
        return disciplinas;
    }


}
