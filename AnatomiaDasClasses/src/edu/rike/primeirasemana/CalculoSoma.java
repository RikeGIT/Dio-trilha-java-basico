package edu.rike.primeirasemana;
public class CalculoSoma {
    public static void main (String [] args) {
        int num1 = 5;
        int num2 = 3;
        int soma = soma (num1, num2);

        System.out.print(soma);
    }
    public static int soma (int num1, int num2){
        return num1 + num2;
    }
}