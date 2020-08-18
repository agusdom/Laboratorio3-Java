package guia.pkg5;

import guia.pkg5.exception.NoexistePersona ;
import java.util.HashMap;
import java.util.Map;

public class Premiacion {

    private Map<String, Cliente> winner = new HashMap<>();

    public Premiacion() {
    }

    public Cliente getWinner(String nombre) throws NoexistePersona {
        if (winner.containsKey(nombre)) {
            return winner.get(nombre);
        }

        throw new NoexistePersona();
    }

    public void addCliente(String nombre,Cliente cliente)
    {
        winner.put(cliente.getNombre(), cliente);
    }
}
