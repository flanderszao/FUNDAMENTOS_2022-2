
/**
 * É uma respota à primeira ativadade do trabalho de nota E da classe
 * de fundamentos de programação.
 * Eu tenho que admitir que eu não lembro exatamente quais os dados que era pra eu comparar.
 * Mas creio também que isso seja facilmente ajustado eventualmente.
 * 
 * @author (Vitor Rafael) 
 * @version (08-09-22)
 */
import java.util.Scanner;
public class MediaTempoIdade
{
public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
    System.out.println("Esse é um programa que lhe dirá se você está dentro da média");
    System.out.println("de sua idade em tempo de uso de dispositivos, baseado em uma pesquisa existente.");
    System.out.println("Sendo voltado a pessoas de 2 a 18 anos.");
    
    System.out.println("");
    System.out.printf( "Informe sua idade: ");
    int idade = ler.nextInt();
    
    System.out.println("");
    System.out.printf("Informe quantas horas, em média, por dia você usa dispositivos: (0-23) ");
    int hora = ler.nextInt();
    hora = hora*60;
    
    System.out.println("");
    System.out.printf("Informe quantos minutos complementares, por dia você usa dispositivos: (0-59) ");
    int minutos = ler.nextInt();
    int tempo = hora+minutos;
    
    System.out.println("");
    if (idade >= 2 && idade <= 7) {
        if (tempo < 180) {
            System.out.println("Você está abaixo da média da sua idade (2-7 anos), em tempo de uso (3 horas).");}
        if (tempo == 180) {
            System.out.println("Você está na média da sua idade (2-7 anos), em tempo de uso (3 horas).");}
        if (tempo > 180) {
            System.out.println("Você está acima da média da sua idade (2-7 anos), em tempo de uso (3 horas)");}
    }
    if (idade >= 8 && idade <= 12) {
        if (tempo < 285) {
            System.out.println("Você está abaixo da média da sua idade (8-12 anos), em tempo de uso (4 horas e 45 minutos).");}
        if (tempo == 285) {
            System.out.println("Você está na média da sua idade (8-12 anos), em tempo de uso (4 horas e 45 minutos).");}
        if (tempo > 285) {
            System.out.println("Você está acima da média da sua idade (8-12 anos), em tempo de uso (4 horas e 45 minutos).");}
    }
     if (idade >= 13 && idade <= 18) {
        if (tempo < 360) {
            System.out.println("Você está abaixo da média da sua idade (13-18 anos), em tempo de uso (5 horas).");}
        if (tempo == 360) {
            System.out.println("Você está na média da sua idade (13-18 anos), em tempo de uso (6 horas).");}
        if (tempo > 360) {
            System.out.println("Você está acima da média da sua idade (13-18 anos), em tempo de uso (6 horas).");}
    }
    if (idade <= 1 && idade >=0 || 19 <= idade && idade >= 0) {
        System.out.println("Seus dados não constam na pesquisa.");
    }
    else {
        System.out.println("Seus dados estão incorretos.");
    }
    if (idade >= 0 && hora/60 <= 23 && minutos <= 59 && hora >= -0 && minutos >= 0) {
    System.out.print("Sua idade: " + idade + ". Seu tempo de uso diário: " + hora/60 + "h " + minutos + "m");}
}
}
