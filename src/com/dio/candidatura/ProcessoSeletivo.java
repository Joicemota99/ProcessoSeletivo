package com.dio.candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        imprimirSelecionados();

    }

        static void imprimirSelecionados (){
            String[] candidatos = {"Felipe", "Marcia", "Julia","Leandro","Sandra"};
            System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
            for(int indice=0; indice < candidatos.length; indice++){
                System.out.println("O candidato de n° " + (indice + 1) + " é " + candidatos[indice]);
            }
    }
    static void selecaoCandidatos(){

        String[] candidatos = {"Felipe", "Marcia", "Julia","Leandro","Sandra","Roberto","Ricardo","Joice","Maria"};

        int candidatosSelecionados = 0;
        int candidadosAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5){
            String candidato = candidatos[candidadosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido);
            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado ");
                candidatosSelecionados++;
            }
            candidadosAtual++;
        }
        }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if(salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("Aguardando resultado dos demais candidatos");
        }
    }
}
