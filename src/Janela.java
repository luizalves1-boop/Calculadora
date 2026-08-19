import javax.swing.*;
import java.awt.*;

public class Janela {
    String calculo = "";

    public Janela() {
        JFrame janela = new JFrame("Calculadora");
        JTextField visor = new JTextField();
        visor.setFont(new Font("Arial", Font.PLAIN, 30));
        visor.setHorizontalAlignment(JTextField.RIGHT);
        janela.setSize(316, 389);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel painel = new JPanel();
        painel.setLayout(null);

        // Números
        JButton num1 = new JButton("1");
        JButton num2 = new JButton("2");
        JButton num3 = new JButton("3");
        JButton num4 = new JButton("4");
        JButton num5 = new JButton("5");
        JButton num6 = new JButton("6");
        JButton num7 = new JButton("7");
        JButton num8 = new JButton("8");
        JButton num9 = new JButton("9");
        JButton num0 = new JButton("0");

        // Operações
        JButton soma = new JButton("+");
        JButton subtração = new JButton("-");
        JButton multiplicação = new JButton("*");
        JButton divisão = new JButton("/");
        JButton resultado = new JButton("=");
        JButton reset = new JButton("C");

        // Adiciona ActionListeners aos botões
        num1.addActionListener(e -> {
            calculo += "1";
            visor.setText(calculo);
        });
        num2.addActionListener(e -> {
            calculo += "2";
            visor.setText(calculo);
        });
        num3.addActionListener(e -> {
            calculo += "3";
            visor.setText(calculo);
        });
        num4.addActionListener(e -> {
            calculo += "4";
            visor.setText(calculo);
        });
        num5.addActionListener(e -> {
            calculo += "5";
            visor.setText(calculo);
        });
        num6.addActionListener(e -> {
            calculo += "6";
            visor.setText(calculo);
        });
        num7.addActionListener(e -> {
            calculo += "7";
            visor.setText(calculo);
        });
        num8.addActionListener(e -> {
            calculo += "8";
            visor.setText(calculo);
        });
        num9.addActionListener(e -> {
            calculo += "9";
            visor.setText(calculo);
        });
        num0.addActionListener(e -> {
            calculo += "0";
            visor.setText(calculo);
        });

        soma.addActionListener(e -> {
            calculo += "+";
            visor.setText(calculo);
        });

        subtração.addActionListener(e -> {
            calculo += "-";
            visor.setText(calculo);
        });

        multiplicação.addActionListener(e -> {
            calculo += "*";
            visor.setText(calculo);
        });

        divisão.addActionListener(e -> {
            calculo += "/";
            visor.setText(calculo);
        });
        resultado.addActionListener(e -> {
            Calculadora calculadora = new Calculadora();
            try {
                String res = Integer.toString(calculadora.calculadora(calculo));
                visor.setText(res);
                calculo = res;
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        });
        reset.addActionListener(e -> {
            visor.setText("");
            calculo = "";
        });


        // Setar localização dos botões
        soma.setBounds(225, 250, 75, 50);
        subtração.setBounds(225, 200, 75, 50);
        multiplicação.setBounds(225, 150, 75, 50);
        divisão.setBounds(225, 100, 75, 50);
        resultado.setBounds(225, 300, 75, 50);
        reset.setBounds(0, 100, 75, 50);

        num0.setBounds(75, 300, 75, 50);
        num1.setBounds(0, 250, 75, 50);
        num2.setBounds(75, 250, 75, 50);
        num3.setBounds(150, 250, 75, 50);
        num4.setBounds(0, 200, 75, 50);
        num5.setBounds(75, 200, 75, 50);
        num6.setBounds(150, 200, 75, 50);
        num7.setBounds(0, 150, 75, 50);
        num8.setBounds(75, 150, 75, 50);
        num9.setBounds(150, 150, 75, 50);

        visor.setBounds(0, 00, 305, 100);

        // Adiciona o botão ao painel e o painel à janela
        painel.add(soma);
        painel.add(subtração);
        painel.add(multiplicação);
        painel.add(divisão);
        painel.add(resultado);
        painel.add(reset);

        painel.add(num0);
        painel.add(num1);
        painel.add(num2);
        painel.add(num3);
        painel.add(num4);
        painel.add(num5);
        painel.add(num6);
        painel.add(num7);
        painel.add(num8);
        painel.add(num9);
        painel.add(visor);
        janela.add(painel);

        // 6. Torna a janela visível
        janela.setVisible(true);
    }
}
