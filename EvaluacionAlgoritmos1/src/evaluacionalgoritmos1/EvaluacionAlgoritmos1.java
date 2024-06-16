package evaluacionalgoritmos1;

//import GabrielSandoval.SandovalGabriel;
import java.util.Scanner;
import javax.swing.*;
import java.awt.event.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class EvaluacionAlgoritmos1 extends JFrame implements ActionListener{
    private JTextField textfield1, textfield2;
    private JLabel label0, label1, label2, label3, label4, label5, label6, label7, label8;
    private JButton boton1, boton2;
    private JTextArea areaResult1;
    
    public EvaluacionAlgoritmos1(){
        setLayout(null);
        label0 = new JLabel("Ingrese numeros del 1 al 9 para hacer una matriz");
        label0.setBounds(5, 5, 350, 30);
        add(label0);
        
        label1 = new JLabel("ingrese el numero de filas");
        label1.setBounds(5, 35, 300, 30);
        add(label1);
        
        label2 = new JLabel("ingrese el numero de columnas");
        label2.setBounds(5, 65, 300, 30);
        add(label2);
        
        label3 = new JLabel("Tamano Matriz: ");
        label3.setBounds(180, 100, 400, 30);
        add(label3);
        
        label4 = new JLabel("Sin errores.");
        label4.setBounds(10, 150, 300, 30);
        add(label4);
        
        label5 = new JLabel("En espera para determinar si el menor valor positivo en la matriz es numero primo. ");
        label5.setBounds(5, 360, 650, 30);
        add(label5);
        
        label6 = new JLabel("En espera para determinar la division del mayor valor entre el numero menor valor. ");
        label6.setBounds(5, 380, 650, 30);
        add(label6);
        
        label7 = new JLabel("En espera para determinar la potencia del elemento mayor elevado a la 10. ");
        label7.setBounds(5, 400, 650, 30);
        add(label7);
        
        label8 = new JLabel("En espera para determinar el resultado de la diagonal principal. ");
        label8.setBounds(5, 420, 650, 30);
        add(label8);
        
        textfield1 = new JTextField();
        textfield1.setBounds(200, 40, 24, 20);
        add(textfield1);
        
        textfield2 = new JTextField();
        textfield2.setBounds(200, 70, 24, 20);
        add(textfield2);
        
        boton1 = new JButton("Calcular Matriz. ");
        boton1.setBounds(5, 100, 150, 30);
        add(boton1);
        
        boton2 = new JButton("Limpiar. ");
        boton2.setBounds(300, 100, 150, 30);
        add(boton2);
        
        areaResult1 = new JTextArea("Matriz. ");
        areaResult1.setBounds(10, 200, 750, 160);
        add(areaResult1);
        
        boton1.addActionListener(this);
        boton2.addActionListener(this);
        
    }
    
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource() == boton1){
            printMatriz(getFilas(), getColumnas());
            textfield1.setEnabled(false);
            textfield2.setEnabled(false);
            boton1.setEnabled(false);
            
        }
        
        if (e.getSource() == boton2){
            textfield1.setText(null);
            textfield2.setText(null);
            areaResult1.setText("Matriz. ");
            label3.setText("Tamano Matriz: ");
            label5.setText("En espera para determinar si el menor valor positivo en la matriz es numero primo.");
            label6.setText("En espera para determinar la division del mayor valor entre el numero menor valor.");
            label7.setText("En espera para determinar la potencia del elemento mayor elevado a la 10.");
            label8.setText("En espera para determinar el resultado de la diagonal principal.");
            textfield1.setEnabled(true);
            textfield2.setEnabled(true);
            boton1.setEnabled(true);
            
        }
    }   
    
    
    private void printMatriz(int valor1, int valor2){
        if(valor1 == 0 || valor2 == 0) {
            return;
        }
        Random random = new Random();
        
        boolean numeroPrimo = true;
        int matrizSize = 0;
        int matriz[][] = new int[valor1][valor2];
        String result = "";
        for(int i = 0; i < valor1; i++){
            for(int j = 0; j < valor2; j++){
                matriz[i][j] = matrizSize;
                matrizSize++;
                matriz[i][j] = random.nextInt(999-(-999)+1) - 999;
            }
        }
        
        
        for(int i = 0; i < valor1; i++) {
            for(int j = 0; j < valor2; j++){
                for(int x = 0; x < valor1; x++){
                    for(int y = 0; y < valor2; y++){
                        if(matriz[i][j] > matriz[x][y]){
                            int t = matriz[i][j];
                            matriz[i][j] = matriz[x][y];
                            matriz[x][y] = t;
                        }
                    }
                }
            }
        }
        
        
        for(int i = 0; i < valor1; i++){
            for(int j = 0; j < valor2; j++){
                result = result.concat("[" + matriz[i][j] + "]" + "\t");
            }
            result = result.concat("\n");
        }
        
        
        long multiplicacion = 1;
        if(valor1 == valor2){
            ArrayList<Integer> x = new ArrayList<>(valor1);
            for(int i = 0; i < valor1; i++){
                for(int j = 0; j < valor2; j++){
                    if(i == j){
                        x.add(matriz[i][j]);
                    }
                }
            }
            for(int i = 0; i < x.size(); i++){
                multiplicacion = multiplicacion * x.get(i).longValue();
            }
            label8.setText("Resultado de la multiplicacion: " + multiplicacion);
        }
        
        
        
        int menorPositivo = 999;
        numeroPrimo = true;
        
        for(int i = 0; i < valor1; i++){
            for(int j = 0; j < valor2; j++){
                if(matriz[i][j] > 0 && matriz[i][j] <= menorPositivo){
                    menorPositivo = matriz[i][j];
                }
            }
        }
        
        for(int i = 2; i <= menorPositivo / 2; i++){
            if(menorPositivo % i == 0){
                numeroPrimo = false;
                break;
            }
        }
        
        String textPrimo = "";
        if(numeroPrimo){
            textPrimo = "El menor valor positivo en la matriz[" + menorPositivo + "] es un numero primo";
        } else{
            textPrimo = "El menor valor positivo en la matriz [" + menorPositivo + "] no es un numero primo";
        }
        
        Integer numeroMayor = matriz[0][0];
        Integer numeroMenor = matriz[0][0];
        
        
        Double division = 0d;
        for(int i = 0; i < valor1; i++){
            for(int j = 0; j < valor2; j++){
                if(matriz[i][j] > numeroMayor){
                    numeroMayor = matriz[i][j];
                }
                if(matriz[i][j] < numeroMenor){
                    numeroMenor = matriz[i][j];
                }
            }
        }
        
        division = numeroMayor.doubleValue() / numeroMenor.doubleValue();
        System.out.println("division" + division);
        
        label6.setText("La division del mayor valor [" + numeroMayor + "] entre el menor valor "
                + "[" + numeroMenor + "] en la matriz es: " + division);
        
        label7.setText("La potencia a la 10 del numero mayor en la matriz es: " + Math.pow(numeroMayor, 10));
        
        label5.setText(textPrimo);
        
        label3.setText("Tamano matriz: " + matrizSize);
        areaResult1.setText(result);
        System.out.println("matriz[i][j]\n" + result);
        
        
    }
    
    private int getFilas(){
        int result = 0;
        try {
            result = Integer.parseInt(textfield1.getText());
        } catch (Exception ex) {
            System.out.println("El valor fila introducido no es un numero" + ex);
            manageError("El valor fila introducido no es un numero");
        }
        
        if(result > 9 || result < 1) {
            manageError("Por favor introduzca un numero de filas valido.");
            return 0;
        }
        manageError("sin errores.");
        return result;
    }
    
    private int getColumnas(){
        int result = 0;
        try {
            result = Integer.parseInt(textfield2.getText());
        } catch (Exception ex) {
            System.out.println("El valor columna introducido no es un numero" + ex);
            manageError("El valor columna introducido no es un numero");
        }
        
        if(result > 9 || result < 1) {
            manageError("Por favor introduzca un numero de columnas valido.");
            return 0;
        }
        manageError("sin errores.");
        return result;
    }
    
    private void manageError(String text){
        System.out.println("manageError");
        String previousMsg = label4.getText();
        if(previousMsg == "Sin errores."){
            label4.setText(text);
        }
    }
    
    public static void main(String[] args) {
        
        EvaluacionAlgoritmos1 formulario1 = new EvaluacionAlgoritmos1();
        formulario1.setBounds(10, 0, 800, 600);
        formulario1.setVisible(true);
        formulario1.setResizable(false);
        formulario1.setLocationRelativeTo(null);
    }
}
