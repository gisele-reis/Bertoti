/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca2;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Gisele
 */
public class Biblioteca {
    private List<Livro> livros = new LinkedList<Livro>();
    
    public void cadastrarLivro(Livro livro){
        livros.add(livro);
    }
    
    public List<Livro> buscarLivroPorEspecificacao(Especificacao especificacao){
        List<Livro> livrosEncontrados = new LinkedList<Livro>();
        for(Livro livro:livros){
            if(livro.getEspecificacao().comparar(especificacao)){
                livrosEncontrados.add(livro);
            }
        }
        return livrosEncontrados;
    }
    
    public Livro buscarLivroPorTitulo(String titulo){
        for(Livro livro:livros){
            if(livro.getTitulo().equals(titulo)){
                return livro;
            }
        }
        return null;
    }
    
    public List<Livro> getLivros(){
        return this.livros;
    }
    
    public void setLivros(List<Livro> livros){
        this.livros = livros;
    }
}
