package com.juliana;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    private final List<Task> tarefas = new ArrayList<>();

    public void adicionarTarefa(Task tarefa) {
        tarefas.add(tarefa);
    }

    public List<Task> listarTarefas() {
        return new ArrayList<>(tarefas); // retorna cópia para evitar modificações externas
    }

    public void marcarComoConcluida(String titulo) {
        for (Task tarefa : tarefas) {
            if (tarefa.getTitulo().equalsIgnoreCase(titulo)) {
                tarefa.marcarComoConcluida();
                return;
            }
        }
    }
}