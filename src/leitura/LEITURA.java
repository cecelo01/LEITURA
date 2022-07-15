/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leitura;

/**
 *
 * @author Marce
 */
public class LEITURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pessoa p[] = new Pessoa[2];
        
        p[0] = new Pessoa("Joao", "F", 12);
        p[1] = new Pessoa("Maria", "M", 55);
        
        Livro l[] = new Livro[2];
        
        l[0] = new Livro("Louoc", "Noia da quebrada", 500, p[0]);
        l[1] = new Livro("Luzes escuras", "Doria do crak", 200, p[1]);
        
        l[0].abrir();
        l[0].folear(501);

        l[0].voltaPag();
        l[0].voltaPag();
        l[0].voltaPag();
        l[0].voltaPag();

        System.out.println(l[0].detalhes());
        
    }
    
}
