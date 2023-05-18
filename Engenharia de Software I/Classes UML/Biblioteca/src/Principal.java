/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteca2;

import java.util.List;

/**
 *
 * @author Gisele
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        
        biblioteca.cadastrarLivro(new Livro("Guerra do Velho", new Especificacao("John Scalzi", "Aleph")));
        biblioteca.cadastrarLivro(new Livro("Sem Coração", new Especificacao("Marissa Meyer", "Rocco")));
        
        
        if (biblioteca.getLivros().size() == 2){
            System.out.println("true");
        } else{
            System.out.println("false");
        }
        
        Livro livroEncontrado = biblioteca.buscarLivroPorTitulo("Guerra do Velho");
        
        if (livroEncontrado.getEspecificacao().getAutor() == "John Scalzi"){
            System.out.println("true");
        } else{
            System.out.println("false");
        }
        
        List<Livro> livrosEncontrados = biblioteca.buscarLivroPorEspecificacao(new Especificacao("Marissa Meyer","Rocco"));
        
        if (livrosEncontrados.get(0).getEspecificacao().getEditora() == "Rocco"){
            System.out.println("true");
        } else{
            System.out.println("false");
        }
    }
    
}
