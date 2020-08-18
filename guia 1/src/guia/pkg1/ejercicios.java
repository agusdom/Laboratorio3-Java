package guia.pkg1;

public class ejercicios {

    public void Ej1(int N, double A, char C) {
        double resultado;
        double resultado2;
        resultado = N + A;
        resultado2 = N - A;
        System.out.println("N es =" + N);
        System.out.println("A es =" + A);
        System.out.println("C es =" + C);
        System.out.println("El resultado de la suma es=" + resultado);
        System.out.println("El resultado de la resta es=" + resultado2);

    }

    public void Ej2(int N, int M, double X, double Y) {
        double resultado;
        double resultado2;
        double resultado3;
        double resultado4;
        resultado = N + M;
        resultado2 = X - Y;
        resultado3 = N * X;
        resultado4 = Y / M;
        System.out.println("N es =" + N);
        System.out.println("M es =" + M);
        System.out.println("X es =" + X);
        System.out.println("Y es =" + Y);
        System.out.println("El resultado de la suma es=" + resultado);
        System.out.println("El resultado de la resta es=" + resultado2);
        System.out.println("El resultado de la multimplicacion es=" + resultado3);
        System.out.println("El resultado de la division es=" + resultado4);

    }

    public void Ej3(int N) {
        int resultado;
        int resultado2;
        int resultado3;
        resultado = N + 77;
        resultado2 = resultado - 3;
        resultado3 = resultado2 * 2;

        System.out.println("N es =" + N);
        System.out.println("El resultado total es=" + resultado3);

    }

    public void Ej4(int A, int B, int C, int D) {
        D = B;
        B = C;
        C = A;
        A = D;

        System.out.println("A es =" + A);
        System.out.println("B es =" + B);
        System.out.println("C es =" + C);
        System.out.println("D es =" + D);

    }

    public void Ej5(int A) {

        if (A % 2 == 0) {
            System.out.println("A es par");
        } else {
            System.out.println("A es impar");
        }

    }

    public void Ej6(int B) {

        if (B > 0) {
            System.out.println("B es positivo");
        } else {
            System.out.println("B es negativo");
        }
    }

    public void Ej7(int C) {

        if (C > 0) {
            System.out.println("C es positivo");
        } else {
            System.out.println("C es negativo");
        }
        if (C % 2 == 0) {
            System.out.println("C es par");
        } else {
            System.out.println("C es impar");
        }
        if (C % 5 == 0) {
            System.out.println("C es multiplo de 5");
        } else {
            System.out.println("C no es multiplo de 5");
        }
        if (C % 10 == 0) {
            System.out.println("C es multiplo de 10");
        } else {
            System.out.println("C no es multiplo de 10");
        }
    }

    public void Ej8(String nombre) {

        System.out.println("Buen dia," + nombre);

    }

    public void Ej9(int X) {
        int resultado;
        int resultado2;
        resultado = X * X;
        resultado2 = X * X * X;
        System.out.println("El doble de X es=" + resultado);
        System.out.println("el triple de X es=" + resultado2);

    }

    public void Ej10(int F) {
        int resultado;
        float resultado2;
        resultado = F - 32;
        resultado2 = (float) (resultado / 1.8);
        System.out.println("el resultado de la convertibilidad de grados es=" + resultado2);

    }

    public void Ej11(int F) {
        float resultadolong;
        float resultadoradio;
        resultadoradio = (float) (F * F * Math.PI);
        resultadolong = (float) (2 * Math.PI * F);
        System.out.println("el resultado del area es=" + resultadoradio);
        System.out.println("el resultado de la longitud es=" + resultadolong);

    }

    public void Ej12(int K) {
        int resultado;
        float resultado2;
        resultado = K * 1000;
        resultado2 = (float) (resultado / 3600);
        System.out.println("el resultado de la convertibilidad de velocidad es=" + resultado2);

    }

    public void Ej13(int p1, int p2) {
        int resultado;
        float resultado2;
        resultado = p1 + p2;
        resultado2 = (float) Math.sqrt(resultado);
        System.out.println("el resultado de la hipotenusa es=" + resultado2);
    }

    public void Ej14(int E) {
        float resultado;

        resultado = (float) (3 / 4 * Math.PI * (E * E * E));

        System.out.println("el resultado del volumen de la esfera es=" + resultado);

    }

    public void Ej15(int B, int A) {
        float resultado;

        resultado = (B * A) / 2;

        System.out.println("el resultado del area del triangulo es=" + resultado);

    }

    public void Ej16(int N) {
        int P;
        int S;
        int T;
        P = N % 10;
        N = N / 10;
        S = N % 10;
        N = N / 10;
        T = N % 10;
        System.out.printf("%d  %d  %d  \n", T, S, P);
    }

    public void Ej17(int M) {
        int P;
        int S;
        int T;
        int C;
        int Q;
        P = M % 10;
        M = M / 10;
        S = M % 10;
        M = M / 10;
        T = M % 10;
        M = M / 10;
        C = M % 10;
        M = M / 10;
        Q = M % 10;
        System.out.printf("%d  %d  %d  \n", Q, T, P);
    }

    public void Ej18(int H, int M, int S) {
        if(H>=0 && H<24 && M>=0 && M<60 && S>=0 && S<60)
        {
          System.out.println("La hora es valida");
        }
        else
        {
            System.out.println("La hora no es valida");
        }

    }
}