/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arvore;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Arvore arvore = new Arvore(new Folha(50));
        
        arvore.inserir(new Folha(8));
        arvore.inserir(new Folha(22));
        arvore.inserir(new Folha(3));
        arvore.inserir(new Folha(41));
        
    }
    
}
