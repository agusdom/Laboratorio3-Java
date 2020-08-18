package banco;

import banco.exception.ClienteNoExisteException;

public class Main {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente(1L, "Lennard Lenny", "29873442");
        Cliente cliente2 = new Cliente(2L, "Carlson Carl", "30723765");

        Banco banco = new Banco();
        banco.addCliente(cliente1.getNombre(), cliente1);
        banco.addCliente(cliente2.getNombre(), cliente1);

        try {
            banco.getCliente("Perez Juan");
        } catch (ClienteNoExisteException e) {
            System.out.println("No existe el cliente");
        }

    }
}
