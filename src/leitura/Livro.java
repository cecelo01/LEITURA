/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leitura;

/**
 *
 * @author Marce
 */
public class Livro  implements Publicacao {
    
    private String titulo, autor;
    private int totPaginas, pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }


    public String detalhes() {
        return "Livro " + "titulo=" + titulo + ", autor=" + autor + ",\n "
                + "totPaginas=" + totPaginas + ", pagAtual=" + pagAtual + ",\n "
                + "aberto=" + aberto + ", leitor=" + leitor.getNome() + " idade: "+leitor.getIdade();
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    @Override
    public void abrir() {
        if (!this.getAberto()){
        this.setAberto(true);}
        else{
            System.out.println("Nao é possivel abrir um livro ja aberto.");
        }
    }

    @Override
    public void fechar() {
        if(this.getAberto()){
        this.setAberto(false);
        }else{
            System.out.println("Nao e possivel fechar um livo ja fechado.");
        }
    }
    
    @Override
    public void folear(int p) {
        if(p >= 0 && p <= this.getTotPaginas()){
            this.setPagAtual(p);
        }
        
    }

    @Override
    public void avancaPag() {
        if((this.getPagAtual() >= 0) && (this.getTotPaginas() > this.getPagAtual())){
        this.setPagAtual(this.getPagAtual()+1);
        }else{
            System.out.println("Impossivel o livro ja acabou.");
        }
    }

    @Override
    public void voltaPag() {
        if((this.getPagAtual() > 0) && (this.getPagAtual() <= this.getTotPaginas())){
        this.setPagAtual(this.getPagAtual()-1);
        }else{
            System.out.println("Impossivel ");
        }
    }

}
