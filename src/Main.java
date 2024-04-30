import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello world");
        System.out.println("Pelicula Matrix");

        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Matrix";
        String sinopsis = """
                LA MEJOR PELICULA DEL FIN DE MILENIO
                """;
        double mediaEvaluacionUsuario = 0;

        System.out.println("Pelicula: "+nombre);
        System.out.println("sinopsis de la pelicula: "+sinopsis);
        System.out.println("Fecha de lanzamiento: "+fechaDeLanzamiento);
        System.out.println("Evaluacion de la pelicula: "+evaluacion);
        System.out.println(incluidoEnElPlanBasico);

        double mediaEvaluacion = (4.5 + 4.8 + 3)/3;
        System.out.println("Evaluacion de la pelicula "+ nombre +" :"+ mediaEvaluacion);


        if (fechaDeLanzamiento >= 2023){
            System.out.println("Pelicula popular en el momento");
        } else {
            System.out.println("Pelicula retro que vale la pena ver");
        }

        //Ciclo de repeticion fori
        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la nota que le darias a Matrix: ");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
        }
        System.out.println("La media de la pelicula " +
                " matriz calculada por el usuario es: "
                + mediaEvaluacionUsuario/3);

    }
}
