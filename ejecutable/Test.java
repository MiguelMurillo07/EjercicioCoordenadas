package ejecutable;

import modelo.Coordenadas;

public class Test
{
    public static void main(String[] args) {
        
        Coordenadas c1 = new Coordenadas(2, 10);
        Coordenadas c2 = new Coordenadas(3, 5);
        Coordenadas c3 = new Coordenadas(4, 8);
        Coordenadas c4 = new Coordenadas(5, 4);

        System.out.println(c1.getX());
        System.out.println(c1.getY());
        System.out.println(c1.tosString());

        System.out.println(c2.getX());
        System.out.println(c2.getY());
        System.out.println(c2.tosString());

        System.out.println(c1.equals(c2)? "Son iguales" : "Son diferentes");

        //Método para calcular la distancia entre las coordenadas c1 y c2
        


    }
}