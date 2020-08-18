package guia6;

import java.io.*;
import java.util.Scanner;

public class Guia6 {

    public static void main(String[] args) {

        try {
            File file = new File("C:/user/agustin/desktop//Mi_archivo.txt");
            if (file.exists() && file.canWrite()) {
                Scanner scanner;

                try (BufferedWriter Fsalida = new BufferedWriter(new FileWriter(file))) {
                    scanner = new Scanner(System.in);
                    System.out.println("Ingrese frase:");
                    String linea = scanner.nextLine();

                    while (!linea.equalsIgnoreCase("fin")) {
                        Fsalida.write(linea);
                        Fsalida.newLine();
                        System.out.println("Ingrese frase:");
                        linea = scanner.nextLine();
                    }

                    Fsalida.close();
                }
                scanner.close();
            }

        } catch (IOException e) {
            System.out.println("Error en la escritura del archivo" + e.getMessage());
        }
    }
}
