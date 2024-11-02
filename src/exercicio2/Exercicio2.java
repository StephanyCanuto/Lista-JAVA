/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio2;
import javax.swing.JOptionPane;
/**
 *
 * @author steph
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double n1, n2, sum;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));
        sum = n1 + n2;
        
        if(sum < 10000){
            JOptionPane.showMessageDialog(null,  "A soma dos números "+ n1 + " + " + n2 + " = " + sum + " é menor que 10.000");
        }else if(sum == 10000){
            JOptionPane.showMessageDialog(null, "A soma dos números "+ n1 + " + " + n2 + " = " + sum + " é igual a 10.000");
        }else{
            JOptionPane.showMessageDialog(null,  "A soma dos números "+ n1 + " + " + n2 + " = " + sum + " é maior que 10.000");
            }
    
  
                
    }
}    
    

