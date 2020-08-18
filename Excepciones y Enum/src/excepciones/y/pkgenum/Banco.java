
package excepciones.y.pkgenum;
import excepciones.y.pkgenum.Exception.ClienteNoExisteException;
import java.util.*;
public class Banco {
    
    HashMap<String,Cliente>clientela=new HashMap<>();

    public Banco() {
    }
    
    
    public Cliente getClientela(String nombre) throws ClienteNoExisteException{
        if(clientela.containsKey(nombre))
        {
            return clientela.get(nombre);
        }
        throw new ClienteNoExisteException();
        
    }
    
    public void add(String nombre,Cliente cliente)
    {
        clientela.put(nombre, cliente);
    }
}
