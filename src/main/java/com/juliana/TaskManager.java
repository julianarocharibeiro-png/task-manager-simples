package com.juliana;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    private final List<String> tarefas = new ArrayList<>();

    public void adicionar(String tarefa) {
        tarefas.add(tarefa);
    }

    public boolean remover(String tarefa) {
        return tarefas.remove(tarefa);
    }

    public List<String> listar() {
        return new ArrayList<>(tarefas); // retorna cópia
    }
}