package ejecutable;

import modelo.Coordenadas;

public class Test
{
    public static void main(String[] args) {
        
        Coordenadas c1 = new Coordenadas(0, 0);
        Coordenadas c2 = new Coordenadas(1.3, 5.3);
    

        System.out.println(c1.getX());
        System.out.println(c1.getY());
        System.out.println(c1.tosString());

        System.out.println(c2.getX());
        System.out.println(c2.getY());
        System.out.println(c2.tosString());

        System.out.println(c1.equals(c2)? "Los puntos son iguales" : "Los puntos son diferentes");

        //Método para calcular la distancia entre las coordenadas c1 y c2
        System.out.println("La distancia entre el punto ("+c1.getX()+" y el punto "+c2.toString()+ " es: "+c1.calcularDistancia(c2));


    }
}