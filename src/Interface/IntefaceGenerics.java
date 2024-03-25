package Interface;

import java.util.List;

public interface IntefaceGenerics<T> {
    
    public int Adicionar(T obj) throws Exception;
    public int Atualizar(T obj) throws Exception;
    public int Excluir(T obj) throws Exception;
    public List<T> Consultar(T obj) throws Exception;

}
