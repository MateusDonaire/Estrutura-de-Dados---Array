package aula02exercicio01;

public class Vetor {

    private int[] vetor;
    private int numElementos;

    public Vetor(int numElementos) {
       
        vetor = new int[numElementos];

        this.numElementos = 0;
    }

    public void insert(int elemento) {
        
        this.numElementos++;
    }

    public void display() {
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("vetor[" + i + "] = " + this.vetor[i]);
        }
        System.out.println("**************************");
    }

    public void delete() {
        this.vetor[this.numElementos - 1] = 0;
        this.numElementos = this.numElementos - 1;
    }

    public void find(int elemento) {
        boolean achado = false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == elemento) {
                achado = true;
            }
        }
        if (achado == true) {
            System.out.println("Possui o elemento " + elemento);
        } else {
            System.out.println("Não possui o elemento " + elemento);
        }
    }
}
