package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        /**
         * Sua irmã está com o computador muito lento e pediu para você formata-lo.
         * Mas ela gostaria muito de que todas as músicas dela fossem salvas e não
         * deletadas com o resto dos arquivos durante a formatação. Todas as músicas
         * estão no formato .mp3
         * Crie um programa que cada arquivo com esse formato não seja deletado.
         */
       /* Scanner leitor = new Scanner(System.in);
        String arquivoDoPc = leitor.next();

        if(arquivoDoPc.contains(".mp3")){

            System.out.println("Salvar");
        }else{
            System.out.println("Deletar");
        }*/


        /**
         * A prefeitura da cidade B, inspirada por uma cidade A, decidiu implementar um sistema de câmeras que iria
         * verificar se os carros estão acima de 80km/h. Porém, eles queriam também anotar a placa dos carros no banco
         * de dados para que, a partir de 3 multas, os motoristas perdessem pontos diretamente na carteira de
         * habilitação. Para isso, contrataram você para realizar esse programa, logo que você fez um trabalho tão bom
         * para a cidade A.
         *
         * Lembrando que toda vez que um carro é pego pela câmera e está acima da velocidade permitida automaticamente
         * já é contabilizado uma multa para ele.
         *
         * Entrada
         * A entrada será a velocidade que o veículo está e quantas multas ele já recebeu. Se ele estiver acima da
         * velocidade, deve ser somado mais uma multa.
         *
         * Saida
         * A saída deverá ser quantas multas o motorista já tem e se ele irá receber pontuação na carteira de
         * habilitação.
         */
       /* Scanner leitor = new Scanner(System.in);
        int velocidade = leitor.nextInt();
        int multas = leitor.nextInt();


       if (velocidade > 80){

            multas++;
            if (multas<3){

            System.out.println(multas + " multas. Nao levou pontos na carteira");}

                if (multas==3){
                    System.out.println(multas + " multas. Levou pontos na carteira");


            }
        }
        if (velocidade <= 80) {
            System.out.println(multas + " multas. Nao levou pontos na carteira");


        }*/

        /**
         * Receber uma frase com barras e transformar um array e inserir dentro de uma frase
         */

       /* Scanner leitor = new Scanner(System.in);
        String frase = leitor.next();
        String array[] = new String[3];

        array = frase.split("/");

        String local = array[0];
        String preco = array[1];
        String vago = array[2];


        System.out.println("Imovel: "+local+" R$"+preco + " "+vago);*/

/**
 * Você levou sua namorada na incrível rede de lanchonetes Dc Monalds e ficou maravilhado como aquele lanche era
 * gostoso. Porém, ficou horrorizado como algumas coisas no aplicativo do cardápio estavam erradas. Então, você se
 * ofereceu para ajudá-los com seus conhecimentos de programação. Ao conversar com o gerente, ele te explicou que a
 * vontade da lanchonete era criar um menu com os nomes dos ingredientes formando o lanche, como no exemplo abaixo:
 *
 * Pao
 * Presunto
 * Carne
 * Pao
 */


        /*Scanner leitor = new Scanner(System.in);
        String ingredientes = leitor.next();
        String listaIngredientes[] = new String[3];

        listaIngredientes = ingredientes.split(";");

        for (int i=0; i<listaIngredientes.length;i++){

            System.out.println(listaIngredientes[i]);
        }*/

        /**
         * escolheu todas as pessoas que estavam na posição impar da fila para entrarem no camarote. Ele fez isso em
         * diversos shows e as pessoas foram a loucura para competirem por essas posições. Você resolveu criar um
         * programa para saber, de acordo com o número de pessoas na fila, quantas entrariam no camarote.
         */

        Scanner leitor = new Scanner(System.in);
        int tamanhoDaFila = leitor.nextInt();
        int pessoasNoCamarote = 0;

        if(tamanhoDaFila%2==0){
            int camarote = tamanhoDaFila/2;

            System.out.println(camarote + " pessoas no camarote");
        }else {
            int camarote = ((tamanhoDaFila-1)/2)+1;
            System.out.println(camarote + " pessoas no camarote");

        }


    }



}