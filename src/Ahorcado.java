import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {


        Scanner entrada = new Scanner(System.in);

        String palabrasecreta = "luis";
        int intentosmaximo = 10;
        int intentosinicial = 0;
        boolean palabraAdivinada = false; 


        //Arreglo
        char[] letrasadivinadas = new char[palabrasecreta.length()];

        //Estructura de control Iterativa
        for (int i = 0; i < letrasadivinadas.length; i++) {
            letrasadivinadas[i] = '_';
        }

        
        while(!palabraAdivinada && intentosinicial < intentosmaximo){
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasadivinadas)+" ("+ palabrasecreta.length() + " palabras)");
            System.out.print("Ingrese una letra: ");

            char letra = Character.toLowerCase(entrada.next().charAt(0));// Esperaremos solo la primera letra de entrada
            

            boolean letraCorrecta = false;

            for (int i = 0; i < palabrasecreta.length(); i++) {
                //Estructura de control
                if(palabrasecreta.charAt(i) == letra){
                    letrasadivinadas[i] = letra;
                    letraCorrecta = true; 
                }
                
            }


            if(!letraCorrecta){
                intentosinicial++; // Si el intento es incorrecto aumentara los intentos iniciales sucesivamente
                System.out.println("Intento incorrecto, te quedan "+ (intentosmaximo - intentosinicial) + " intentos");
            }

            if(String.valueOf(letrasadivinadas).equals(palabrasecreta)){
                palabraAdivinada = true;
                System.out.println("Felicidades adivinaste la palabra secreta: " +  palabrasecreta);
            }

        }
        
        if(!palabraAdivinada){
            System.out.println("Que mal no adinivaste la palabra secreta: " + palabrasecreta);

        }

    }
}
