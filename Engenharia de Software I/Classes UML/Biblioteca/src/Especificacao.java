/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gisele
 */
public class Especificacao {
    
    private String autor;
    private String editora;

    public Especificacao(String autor, String editora) {
        this.autor = autor;
        this.editora = editora;
    }
    

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
    
    public boolean comparar(Especificacao especificacao){
        if(autor.equals(especificacao.autor) && editora.equals(especificacao.editora)){
            return true;
        } else {
            return false;
        }
    } 
}
