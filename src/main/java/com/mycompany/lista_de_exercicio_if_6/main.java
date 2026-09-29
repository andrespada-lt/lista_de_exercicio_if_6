package com.mycompany.lista_de_exercicio_if_6;
import javax.swing.JOptionPane;
public class main {

    public static void main(String[] args) {
        double salariobruto, valordaprestasao, prestasaopretendida;
        salariobruto = Double.parseDouble(JOptionPane.showInputDialog("insira o salario bruto: "));
        valordaprestasao = Double.parseDouble(JOptionPane.showInputDialog("insira o valo da prestação: "));
        prestasaopretendida = salariobruto * 0.3;
        if(valordaprestasao <= prestasaopretendida){
            JOptionPane.showMessageDialog(null,"emrestimo concedido!");
        }else {
            JOptionPane.showMessageDialog(null,"emrestimo negado!");
        }
    }
}
