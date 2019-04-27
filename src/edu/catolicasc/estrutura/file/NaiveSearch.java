package edu.catolicasc.estrutura.file;

import java.util.ArrayList;

public class NaiveSearch {

    private String n;
    private String m;
    private Integer sizeN;
    private Integer sizeM;
    private ArrayList<Integer> patterns = new ArrayList<>();

    public NaiveSearch(String n, String m) {
        this.n = n;
        this.m = m;
        this.sizeN = this.n.length();
        this.sizeM = this.m.length();
    }

    public void search() {
        for (int i = 0; i < sizeN - sizeM; i++) {

            int j; //A variável j é definida fora do primeiro for, pois há a necessidade dessa ser utilizada no segundo if

            for (j = 0; j < sizeM; j++) {
                if (n.charAt(i + j) != m.charAt(j))
                    break;
            }

            if (j == sizeM){
                this.patterns.add(i);
                System.out.println("Naive Search: Padrão encontrado em " + i + " Linha " + this.n);
            }

        }

    }


}
