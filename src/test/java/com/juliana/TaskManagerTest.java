package com.juliana;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskManagerTest {

    @Test
    void deveAdicionarTarefa() {
        TaskManager manager = new TaskManager();
        Task t = new Task("Estudar GitHub");

        manager.adicionarTarefa(t);

        assertEquals(1, manager.listarTarefas().size());
    }

    @Test
    void deveMarcarTarefaComoConcluida() {
        TaskManager manager = new TaskManager();
        Task t = new Task("Praticar Java");

        manager.adicionarTarefa(t);
        manager.marcarComoConcluida("Praticar Java");

        assertTrue(manager.listarTarefas().get(0).isConcluida());
    }
}