
public class Guia4 {

    public static void main(String[] args) {


        /*Cilindro cosa = new Cilindro();
        System.out.println(cosa);

        Cilindro cilindrada = new Cilindro(5.0, 6.0);
         System.out.println(cilindrada);
        System.out.println("Radio del cilindro 2=" + cilindrada.getRadio());
        System.out.println("Altura del cilindro 2=" + cilindrada.getAltura());
        System.out.println("Volumen del cilindro 2=" + cilindrada.getVolumen());
        System.out.println("Area de las bases del cilindro 2=" + cilindrada.getArea());
   
        Alumno estudiante1 = new Alumno(1997, 2500, "Psicologia", "Leonel", "Bedoya", 42111952, "leito@hotmail.com", "termas de rio hondo 540");
        Alumno estudiante2 = new Alumno(1996, 2000, "Administracion de empresa", "Braian", "Garofalo", 39540385, "braiang@hotmail.com", "3 de febreo 8450");
        Alumno estudiante3 = new Alumno(1995, 3000, "Hisotirador", "Pablo", "Hernandez", 39170518, "niggaman95@hotmail.com", "Portugal 1975");
        Alumno estudiante4 = new Alumno(1994, 5000, "Ingenieria mecanica", "Ramiro", "Cena", 367785123, "ramiroignaciocena@hotmail.com", "Pasaje housayns 2365");
        Staff Profe1 = new Staff(22000, 'M', "Andres", "Scappita", 10587321, "AS123@hotmail.com", "Santa fe 544");
        Staff Profe2 = new Staff(15800, 'T', "Julieta", "Martinez", 36578201, "JuliM1992@hotmail.com", "Illia 50");
        Staff Profe3 = new Staff(19000, 'T', "Ruben", "Gomez", 16685789, "RubenDGomez@hotmail.com", "Lucas Cordoba 769");
        Staff Profe4 = new Staff(25000, 'M', "Noelia", "Gershi", 34985412, "GershiNoe@hotmail.com", "Belgrano 6454");
       

        Persona[] person = new Persona[8];
        person[0] = estudiante1;
        person[1] = Profe1;
        person[2] = estudiante3;
        person[3] = Profe3;
        person[4] = estudiante2;
        person[5] = Profe2;
        person[6] = estudiante4;
        person[7] = Profe4;
        int a=0;
        int b=0;
        for (Persona personita : person) {
            if (person!=null) {
                if(personita instanceof Alumno )
                a++;

            }
        else
            {
                b++;
            }
        
    System.out.println("Cantidad de alumnos=" + a);
    System.out.println("Cantidad de Profesores=" + b);
        }

        double ct=0.0;
       
      for (Persona personita : person) {
            if (person!=null) {
                if(personita instanceof Alumno ){
                    ct +=((Alumno) personita).getCuota();
       
                    }
}
        
}  
      System.out.println("La suma total de las cuotas es igual a=" +ct);
         */
        Cuadrado baldoza = new Cuadrado(3, "amarillo");
        Circulito circulo = new Circulito(3, "gris");
        Rectangulo isoceles = new Rectangulo(6, 7, "negro");
        System.out.println(baldoza);
        System.out.println(circulo);
        System.out.println(isoceles);

        Figurilla[] figuritas = new Figurilla[3];
        figuritas[0] = circulo;
        figuritas[1] = baldoza;
        figuritas[2] = isoceles;

        for (Figurilla figus : figuritas) {
            if (figuritas != null) {
                System.out.println("El area de"+" " + figus.getClass().getSimpleName() +" "+"es=" + figus.Area());
                System.out.println("El perimetro de"+" "+ figus.getClass().getSimpleName() +" "+ "es=" + figus.Perimetro());

            }
        }
    }
}
