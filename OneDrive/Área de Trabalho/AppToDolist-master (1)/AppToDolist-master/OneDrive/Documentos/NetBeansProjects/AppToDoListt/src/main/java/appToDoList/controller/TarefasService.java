
package appToDoList.controller;

import appToDoList.model.Tarefa;
import java.util.ArrayList;
import java.util.List;

public class TarefasService {
    private List<Tarefa> tarefas = new ArrayList<>();
    private Long contadorId = 1L;
    
    public Tarefa criarTarefas(String titulo,String descricao){
    Tarefa tarefa = new Tarefa(contadorId++,titulo,descricao,false);
    tarefas.add(tarefa);
    return tarefa;
    }
    
    
    
}
