package ejecutable;

import modelo.Coordenadas;

public class Test
{
    public static void main(String[] args) {
        
        Coordenadas c1 = new Coordenadas(0, 0);
        Coordenadas c2 = new Coordenadas(1.3, 5.3);
    

        System.out.println("Coordenada 1:\n");
        System.out.println(" x = "+c1.getX());
        System.out.println(" y = "+c1.getY());
        System.out.println(c1.toString());


        System.out.println("\nCoordenada 2:\n");
        System.out.println(" x = "+c2.getX());
        System.out.println(" y = "+c2.getY());
        System.out.println(c2.toString());

        System.out.println(c1.equals(c2)? "\n\nLos puntos son iguales" : "Los puntos son diferentes\n\n");

        //Método para calcular la distancia entre las coordenadas c1 y c2
        System.out.println("La distancia entre el punto SsS"+c1.toString()+" y el punto "+c2.toString()+ " es: "+c1.calcularDistancia(c2));



    }
}