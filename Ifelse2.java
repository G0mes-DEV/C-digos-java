
package ifelse2;

import javax.swing.JOptionPane;

public class Ifelse2 {

    public static void main(String[] args) {
        
        int idade;
        String sn_idade;
        
        sn_idade = JOptionPane.showInputDialog("Qual a sua idade? ");
        
        idade = Integer.parseInt(sn_idade);
        
        if ((idade >= 18) && (idade <= 100)){
            JOptionPane.showMessageDialog(null,"Você é maior de idade." );
        }
        else{
            JOptionPane.showMessageDialog(null,"Você é menor" );
        }
    }
    
}
