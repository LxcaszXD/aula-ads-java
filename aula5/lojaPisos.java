package aula5;

import java.util.Scanner;

public class lojaPisos {

    public static void main(String[] args) {
        float largura, comprimento, area, caixaQtde, caixaValor, valorTotal;
        final float CAIXA_METRAGEM = 2.5f;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a largura: ");
        largura = teclado.nextFloat();
        System.out.println("Informe o comprimento: ");
        comprimento = teclado.nextFloat();
        System.out.println("Informe o valor da caixa do piso: ");
        caixaValor = teclado.nextFloat();
        area = largura * comprimento;
        caixaQtde = area / CAIXA_METRAGEM;
        caixaQtde = (float) Math.ceil(caixaQtde);
        valorTotal = caixaQtde * caixaValor;
        System.out.println("Área " + area + "\nCaixas necessárias: " + caixaQtde);
        System.out.printf("Valor total: R$ %.2f", valorTotal);


    }
    
}
