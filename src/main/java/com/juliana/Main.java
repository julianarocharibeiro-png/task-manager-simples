package com.juliana;

public class Main {
    public static void main(String[] args) {

        TaskManager tm = new TaskManager();

        tm.adicionar("Estudar Git");
        tm.adicionar("Criar workflow no GitHub");

        System.out.println("Minhas tarefas:");
        tm.listar().forEach(System.out::println);
    }
}