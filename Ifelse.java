
package ifelse;

import javax.swing.JOptionPane;

public class Ifelse {

    public static void main(String[] args) {
        
        int n1,n2;
        String sn1,sn2;
        
        sn1 = JOptionPane.showInputDialog("Digite o primeiro número: ");
        n1 = Integer.parseInt(sn1);
        
        sn2 = JOptionPane.showInputDialog("Digite o segundo número: ");
        n2 = Integer.parseInt(sn2);
        
        if (n1 >= n2){
            JOptionPane.showMessageDialog(null,n1+" é maior ou igual que "+n2);
        }else{
            JOptionPane.showMessageDialog(null,n1+" é menor que "+n2 );
        }
        
                
    }
    
}
