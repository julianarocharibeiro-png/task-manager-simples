package com.juliana;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskManagerTest {

    @Test
    void deveAdicionarTarefa() {
        TaskManager tm = new TaskManager();
        tm.adicionar("Estudar");
        assertEquals(1, tm.listar().size());
    }

    @Test
    void deveRemoverTarefa() {
        TaskManager tm = new TaskManager();
        tm.adicionar("Tarefa 1");
        boolean removida = tm.remover("Tarefa 1");
        assertTrue(removida);
        assertTrue(tm.listar().isEmpty());
    }
}
