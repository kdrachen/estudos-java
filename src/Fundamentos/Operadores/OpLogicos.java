package Fundamentos.Operadores;

public class OpLogicos {

    public static void main(String[] args) {
        /*
        *
        ** E && - 1 falso torna a operação falsa
        * Tenho que ir para o shopping se tiver dinheiro e tiver sol
        * Dinheiro = true && Sol = false - Operação falsa
        * Dinheiro = true && Sol = true - Operação verdadeira
        * E && - 1 falso torna a operação falsa
        *
        *
        ** OU || - 2 false para tornar a operação falsa
        * Ter uma expressão true para dar true
        *
        * Tenho que ir para o shopping se tiver dinheiro e tiver sol
        * Dinheiro = true || Sol = false - Operação true
        * Dinheiro = true || Sol = true - Operação true
        * Dinheiro = false || Sol = false - Operação false
        *
        *
        ** Xor ^ (Ou exclusivo) - 2 true ou 2 false retorna false
        * Comprar carro1 ou carro2
        * Comprar os 2? - Retorna false
        * Comprar o carro1 e o carro2 não? - Retorna true
        * Comprar o carro2 e o carro1 não? - Retorna true
        * Não comprar os 2? - Retorna false
        *
        *
        ** Not ! - Inverte o boolean
        * !true -> retorna False
        * !false -> retorna True
        * !!true -> retorna True
        * !!false -> retorna False
        **/

        boolean condicao1 = true;
        boolean condicao2 = 3 > 7; // false

        System.out.println(condicao1 && condicao2);
        System.out.println(condicao1 || condicao2);
        System.out.println(condicao1 ^ condicao2);
        System.out.println(!condicao1);
        System.out.println(!condicao2);

        // Preciso ir ao mercado se
        // dinheiro = true;
        // sol = true;

        boolean dinheiro = true;
        boolean sol = true;
        System.out.println(" - ");
        System.out.println(dinheiro && sol);
        System.out.println(!dinheiro || sol);
        System.out.println(!dinheiro || !sol);
        System.out.println(dinheiro ^ sol);
        System.out.println(!dinheiro ^ sol);
    }
}
