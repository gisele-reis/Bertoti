/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca2;

/**
 *
 * @author Gisele
 */
public class Livro {
    private String titulo;
    private Especificacao especificacao;
    
    public Livro(String titulo, Especificacao especificacao){
        this.titulo = titulo;
        this.especificacao = especificacao;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public Especificacao getEspecificacao(){
        return especificacao;
    }
    
    public void setEspecificacao(Especificacao especificacao){
        this.especificacao = especificacao;
    }
    
}
