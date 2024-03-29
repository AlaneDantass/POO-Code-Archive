/*Deseja-se fazer um programa Java que manipule datas para um sistema de calendário. Para isso, você deverá fazer uma classe chamada Calendario que terá os seguintes atributos: int dia, int mes, int ano.

Esta classe deverá ter os seguintes métodos:
- método construtor 
- método String nomeMes (int m) que retorne o nome do mês correspondente, ou seja, m = 1 é mês de “janeiro”, m = 2 é mês de “fevereiro” e assim por diante. (DICA: use switch);
- método void mostrarData( ) que mostra a data no formato “dia de nome do mês de ano”. Para imprimir o nome do mês, você pode utilizar o método anterior nomeMes ( );
- método void anoBissexto( ) que verifica se o ano é bissexto. Todo ano bissexto é divisível por 4. Se o ano for bissexto, esse método imprime na tela o ano com a mensagem que é bissexto. Caso contrário, informe que o ano não é bissexto.


Crie uma classe Principal e nela, o método main para execução do programa. Crie dois objetos Calendario, e em cada instanciação informe nos parâmetros do construtor um dia, mês e um ano. 
Para cada objeto, utilize os seus métodos para:
 
a. Mostrar a data;
b. Imprimir na tela se o objeto tem um ano bissexto
 */

public class Calendario {
    private int dia;
    private int mes;
    private int ano;

    public Calendario(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    //A estrutura do switch é usada para avaliar o valor de m e retornar uma 

    public String nome_Mes(int m){
        switch (m) {                                        //O Switch é uma estrutura de controle
            case 1: return "Janeiro";                       //Deve ser escrito com letras minúsculas
            case 2: return "Fevereiso";                     
            case 3: return "Março";
            case 4: return "abril";
            case 5: return "Maio";
            case 6: return "Junho";
            case 7: return "Julho";
            case 8: return "Agosto";
            case 9: return "Setembro";
            case 10:return "Outubro";
            case 11:return "Novembro";
            case 12:return "Dezembro";
            default: return "";
        }
    }

    public void mostrarData( ){
        System.out.println("Dia"+dia+" de "+ nome_Mes(mes)+" de "+ano);   
     }

    public void anoBissexto( ){
       if (ano%4==0){
        System.out.println("O ano é bissexto!");
       }else{
        System.out.println("O ano não é bissexto!");
       }

    }

}


