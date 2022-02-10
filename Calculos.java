/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tela;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Antonio
 */
public class Calculos {
    public static void main(String[] args) {
        Calculos c = new Calculos();
        System.out.println(">>>>>"+c.calculadora("5/5")); 
    }
    public String calculadora(String expressao){
        
        String resultado;
        List<Double> listNumeros = new ArrayList<Double>();
        List<Character> listOperadores = new ArrayList<Character>();
        
        listNumeros = obterNumeros(expressao);
        listOperadores = obterOperadores(expressao);
        
        resultado = calcularValor(listNumeros, listOperadores);
        return resultado;
    }  
    private String calcularValor(List<Double> listNumeros, 
            List<Character> listOperadores){
        String resultado = "";
        Double total = 0.0;
        int j = 0;
        for (int i = 0; i < listNumeros.size()-1; i++) {
            if (total==0.0) {
                char operador = listOperadores.get(i).charValue();
                double numero1 = listNumeros.get(i).doubleValue();
                double numero2 = listNumeros.get(i+1).doubleValue();
                total = executarOperacao(numero1,operador, numero2);
            }else if(total>0.0){
                double numero2 = listNumeros.get(i+1).doubleValue();
                char operador = listOperadores.get(i).charValue();
                total = executarOperacao(total, operador, numero2);
                j++;
            }
        }
        resultado = ""+total;
        return resultado;
    }
    private Double executarOperacao(Double numero1, char operador, 
            double numero2) 
    {
        double resultado = 0.0;
        if (operador == '+') {
            resultado = numero1 + numero2;
        }else if (operador == '-'){
            resultado = numero1 - numero2;
        }else if (operador == '÷'){
            resultado = numero1 / numero2;
        }else if (operador == 'x'){
            resultado = numero1 * numero2;
        }
        return resultado;
    }
    private List<Double> obterNumeros(String expressao){
        List<Double> listaNumeros = new ArrayList<Double>();
        
        String numeroEmString = "";
        for (int i = 0; i < expressao.length(); i++) {
            if (isOperador(expressao.charAt(i))) {
                Double numero = Double.valueOf(numeroEmString);
                listaNumeros.add(numero);
                numeroEmString = "";
            }else{
                numeroEmString = numeroEmString.concat("" + expressao.charAt(i));
            }      
        }
        if (!numeroEmString.isEmpty()){
            Double numero = Double.valueOf(numeroEmString);
            listaNumeros.add(numero);
        }
        return listaNumeros;
    }
    private List<Character> obterOperadores (String expressao){
        
        List<Character> listaOperadores = new ArrayList<Character>();
        
        for (int i = 0; i < expressao.length(); i++) {
            if (isOperador(expressao.charAt(i))) {
                listaOperadores.add(new Character(expressao.charAt(i)));
            }
        }
        return listaOperadores;
    }
    private boolean isOperador(char caracter){
        boolean isOperador = false;
        if (caracter == '-' || caracter == '+' || caracter == '÷' 
           || caracter == 'x'){
            isOperador = true;
        }
        return isOperador;
    }
    
}
        
        
        
    

