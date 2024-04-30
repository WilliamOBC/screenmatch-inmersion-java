Descripción
Este proyecto Java en IntelliJ IDEA proporciona información sobre la película "Matrix" y permite a los usuarios ingresar evaluaciones para calcular la media de la película.

Contenido del Proyecto
El proyecto contiene un solo archivo fuente Main.java, que es el punto de entrada del programa. Aquí hay una descripción de las principales funcionalidades del código:

1. Muestra información básica sobre la película "Matrix", como su título, sinopsis, fecha de lanzamiento, evaluación y si está incluida en el plan básico.
2. Calcula la media de las evaluaciones dadas por los usuarios para la película "Matrix".
3. Utiliza una estructura condicional (if) para determinar si la película es popular en el momento o si es considerada retro.
4. Utiliza un ciclo for para permitir a los usuarios ingresar tres evaluaciones para la película y luego calcula su media.

Requisitos
IntelliJ IDEA instalado en tu sistema.
Un entorno de desarrollo Java configurado en IntelliJ IDEA.
JDK 20.0.01


Reto 1 es canbiar el ciclo for por un while. (Esta es mi aporte)

        int i = 0;
        double mediaEvaluacionUsuario = 0;

        while (i < 3) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la nota que le darías a Matrix: ");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
            i++; // Aumenta el contador para evitar un bucle infinito
        }

        System.out.println("La media de la película Matrix calculada por el usuario es: " + mediaEvaluacionUsuario / 3);
    }
