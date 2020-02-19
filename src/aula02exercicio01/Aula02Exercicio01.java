package aula02exercicio01;

public class Aula02Exercicio01 {

    public static void main(String[] args) {
        Vetor meuVetor = new Vetor(5);
        System.out.println("Imprimindo o vetor vazio...");
        meuVetor.display();
        System.out.println("Inserindo o elemento 1...");
        meuVetor.insert(1);
        meuVetor.display();
        System.out.println("Inserido o elemento 2, 20 e 50...");
        meuVetor.insert(2);
        meuVetor.insert(20);
        meuVetor.insert(50);
        meuVetor.display();
        System.out.println("Deletando os dois ultimos elemento...");
        meuVetor.delete();
        meuVetor.delete();
        meuVetor.display();
        System.out.println("procurando o elemento 20...");
        meuVetor.find(2);
        System.out.println("procurando o elemento 50");
        meuVetor.find(50);
    }

}
