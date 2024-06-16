package programa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener {
    
    private JTextField textfield1, textfield2;
    private JLabel label0, label1, label2, label3, label4, label5, label6, label7, label8, label9; 
    private JButton boton1, boton2, boton3;
    private JTextArea area;
    
    public Principal() {
        setLayout(null);
        setTitle("Evaluacion 2 Algoritmos y Estructuras - Gabriel Sandoval");
        textfield1 = new JTextField();
        textfield1.setBounds(340, 105, 20, 23);
        add(textfield1);
        
        textfield2 = new JTextField();
        textfield2.setBounds(340, 135, 20, 23);
        add(textfield2);
        
        label0 = new JLabel("R E C U R S I V I D A D");
        label0.setBounds(270, 10, 200, 50);
        label0.setFont(new Font("Andale Mono", 3, 15));
        add(label0);
        
        label1 = new JLabel("Introduzca un numero N del 1 al 99: ");
        label1.setBounds(110, 100, 350, 30);
        add(label1);
        
        label2 = new JLabel("Introduzca un numero M del 1 al 99: ");
        label2.setBounds(110, 130, 350, 30);
        add(label2);
        
        label3 = new JLabel("Suma numero en serie M: ");
        label3.setBounds(80, 240, 500, 30);
        add(label3);
        
        label4 = new JLabel("Secuencia Fibonacci: ");
        label4.setBounds(80, 280, 800, 30);
        add(label4);
        
        label5 = new JLabel("Potencia de N elevado a la M: ");
        label5.setBounds(80, 340, 500, 30);
        add(label5);
        
        label6 = new JLabel("Maximo comun divisor: ");
        label6.setBounds(80, 380, 500, 30);
        add(label6);
        
        label7 = new JLabel("Factorial de N: ");
        label7.setBounds(80, 420, 500, 30);
        add(label7);
        
        label8 = new JLabel("Sin errores.... ");
        label8.setBounds(110, 170, 350, 30);
        label8.setFont(new Font("Andale Mono", 3, 12));
        label8.setForeground(Color.GREEN);
        add(label8);
        
        label9 = new JLabel("");
        label9.setBounds(410, 80, 220, 50);
        add(label9);
        
        boton1 = new JButton("Calcular");
        boton1.setBounds(410, 80, 220, 40);
        add(boton1);
        boton1.addActionListener(this);
        
        boton2 = new JButton("Limpiar");
        boton2.setBounds(410, 140, 220, 40);
        add(boton2);
        boton2.addActionListener(this);
        
        boton3 = new JButton("Cerrar");
        boton3.setBounds(530, 490, 150, 40);
        add(boton3);
        boton3.addActionListener(this);
        
        area = new JTextArea();
        area.setEditable(false);
        area.setBounds(50, 220, 630, 260);
        add(area);    
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            if (getN() == n && getM() == m) {
             enSerie(getM());
             secuencia(getN());
             potencia(getN(), getM());
             Euclides(getN(), getM());
             factorial(getN());
            }
            textfield1.setEnabled(false);
            textfield2.setEnabled(false);
            boton1.setEnabled(false);
        }
        if(e.getSource() == boton2) {
            textfield1.setEnabled(true);
            textfield2.setEnabled(true);
            textfield1.setText(null);
            textfield2.setText(null);
            boton1.setEnabled(true);
            label3.setText("Suma numero en serie M: ");
            label4.setText("Secuencia de Fibonacci: ");
            label9.setText("");
            label5.setText("Potencia de N elevado a la M: ");
            label6.setText("Maximo comun divisor: ");
            label7.setText("Factorial de N: ");
            label8.setText("Sin errores....: ");
            label8.setForeground(Color.GREEN);
        }
        if (e.getSource() == boton3) {
            System.exit(0);
        }
    }
    
    private int n, m;
    private boolean validar;
    
    private int getN() {
        validar = textfield1.getText().trim().isEmpty();
        validar = textfield2.getText().trim().isEmpty();
        if (validar) {
            label8.setText("Error! campo de texto vacio");
            label8.setForeground(Color.RED);
            return 0;
        } else {
            try {
                n = Integer.parseInt(textfield1.getText().trim());
                m = Integer.parseInt(textfield2.getText().trim());
            } catch (Exception ex) {
                label8.setText("Error! Introduzca un numero entero valido");
                label8.setForeground(Color.RED);
                System.out.println("Error! caracteres introducido no valido");
                return 0;
            }
            if (n < 1 || n > 99 || m < 1 || m > 99 ) {
                label8.setText("Error! numeros fuera de rango");
                label8.setForeground(Color.RED);
                return 0;
            } else {
                return n;
            }
        }
    }
    
    private int getM() {
        validar = textfield1.getText().trim().isEmpty();
        validar = textfield2.getText().trim().isEmpty();
        if (validar) {
            label8.setText("Error! campo de texto vacio");
            label8.setForeground(Color.RED);
            return 0;
        } else {
            try {
                n = Integer.parseInt(textfield1.getText().trim());
                m = Integer.parseInt(textfield2.getText().trim());
            } catch (Exception ex) {
                label8.setText("Error! Introduzca un numero entero valido");
                label8.setForeground(Color.RED);
                System.out.println("Error! caracteres introducido no valido");
                return 0;
            }
            if (n < 1 || n > 99 || m < 1 || m > 99 ) {
                label8.setText("Error! numeros fuera de rango");
                label8.setForeground(Color.RED);
                return 0;
            } else {
                return m;
            }
        } 
    }
    
    private int enSerie(int m) {
        
        int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0, h = 0, i = 0, j = 0, k = 0, l = 0, o = 0, p = 0, q = 0, r = 0, s = 0, t = 0, u = 0, v = 0, w = 0, x = 0, y = 0, z = 0;
        int aa = 0, bb = 0, cc = 0, dd = 0, ee = 0, ff = 0, gg = 0, hh = 0, ii = 0, jj = 0, kk = 0, ll = 0, oo = 0, pp = 0, qq = 0, rr = 0, ss = 0, tt = 0, uu = 0, vv = 0, ww = 0, xx = 0, yy = 0, zz = 0;
        int aaa = 0, bbb = 0, ccc = 0, ddd = 0, eee = 0, fff = 0, ggg = 0, hhh = 0, iii = 0, jjj = 0, kkk = 0, lll = 0, ooo = 0, ppp = 0, qqq = 0, rrr = 0, sss = 0, ttt = 0, uuu = 0, vvv = 0, www = 0, xxx = 0, yyy = 0, zzz = 0;
        
        if (m > 0) {
            a = m;
            m--;
            if (m > 0){
                b = m;
                m--;
                if(m > 0){
                    c = m;
                    m--;
                    if(m > 0){
                        d = m;
                        m--;
                        if(m > 0){
                            e = m;
                            m--;
                            if(m > 0){
                                f = m;
                                m--;
                                if(m > 0){
                                    g = m;
                                    m--;
                                    if(m > 0){
                                        h = m;
                                        m--;
                                        if(m > 0){
                                            i = m;
                                            m--;
                                            if(m > 0){
                                                j = m;
                                                m--;
                                                if(m > 0){
                                                    k = m;
                                                    m--;
                                                    if(m > 0){
                                                        l = m;
                                                        m--;
                                                        if(m > 0){
                                                            o = m;
                                                            m--;
                                                            if(m > 0){
                                                                p = m;
                                                                m--;
                                                                if(m > 0){
                                                                    q = m;
                                                                    m--;
                                                                    if(m > 0){
                                                                        r = m;
                                                                        m--;
                                                                        if(m > 0){
                                                                            s = m;
                                                                            m--;
                                                                            if(m > 0){
                                                                                t = m;
                                                                                m--;
                                                                                if(m > 0){
                                                                                    u = m;
                                                                                    m--;
                                                                                    if(m > 0){
                                                                                        v = m;
                                                                                        m--;
                                                                                        if(m > 0){
                                                                                            w = m;
                                                                                            m--;
                                                                                            if(m > 0){
                                                                                                x = m;
                                                                                                m--;
                                                                                                if(m > 0){
                                                                                                    y = m;
                                                                                                    m--;
                                                                                                    if(m > 0){
                                                                                                        z = m;
                                                                                                        m--;
                                                                                                        if (m > 0) {
                                                                                                            aa = m;
                                                                                                            m--;
                                                                                                            if (m > 0){
                                                                                                                bb = m;
                                                                                                                m--;
                                                                                                                if(m > 0){
                                                                                                                    cc = m;
                                                                                                                    m--;
                                                                                                                    if(m > 0){
                                                                                                                        dd = m;
                                                                                                                        m--;
                                                                                                                        if(m > 0){
                                                                                                                            ee = m;
                                                                                                                            m--;
                                                                                                                            if(m > 0){
                                                                                                                                ff = m;
                                                                                                                                m--;
                                                                                                                                if(m > 0){
                                                                                                                                    gg = m;
                                                                                                                                    m--;
                                                                                                                                    if(m > 0){
                                                                                                                                        hh = m;
                                                                                                                                        m--;
                                                                                                                                        if(m > 0){
                                                                                                                                            ii = m;
                                                                                                                                            m--;
                                                                                                                                            if(m > 0){
                                                                                                                                                jj = m;
                                                                                                                                                m--;
                                                                                                                                                if(m > 0){
                                                                                                                                                    kk = m;
                                                                                                                                                    m--;
                                                                                                                                                    if(m > 0){
                                                                                                                                                        ll = m;
                                                                                                                                                        m--;
                                                                                                                                                        if(m > 0){
                                                                                                                                                            oo = m;
                                                                                                                                                            m--;
                                                                                                                                                            if(m > 0){
                                                                                                                                                                pp = m;
                                                                                                                                                                m--;
                                                                                                                                                                if(m > 0){
                                                                                                                                                                    qq = m;
                                                                                                                                                                    m--;
                                                                                                                                                                    if(m > 0){
                                                                                                                                                                        rr = m;
                                                                                                                                                                        m--;
                                                                                                                                                                        if(m > 0){
                                                                                                                                                                            ss = m;
                                                                                                                                                                            m--;
                                                                                                                                                                            if(m > 0){
                                                                                                                                                                                tt = m;
                                                                                                                                                                                m--;
                                                                                                                                                                                if(m > 0){
                                                                                                                                                                                    uu = m;
                                                                                                                                                                                    m--;
                                                                                                                                                                                    if(m > 0){
                                                                                                                                                                                        vv = m;
                                                                                                                                                                                        m--;
                                                                                                                                                                                        if(m > 0){
                                                                                                                                                                                            ww = m;
                                                                                                                                                                                            m--;
                                                                                                                                                                                            if(m > 0){
                                                                                                                                                                                                xx = m;
                                                                                                                                                                                                m--;
                                                                                                                                                                                                if(m > 0){
                                                                                                                                                                                                    yy = m;
                                                                                                                                                                                                    m--;
                                                                                                                                                                                                    if(m > 0){
                                                                                                                                                                                                        zz = m;
                                                                                                                                                                                                        m--;
                                                                                                                                                                                                        if (m > 0) {
                                                                                                                                                                                                            aaa = m;
                                                                                                                                                                                                            m--;
                                                                                                                                                                                                            if (m > 0){
                                                                                                                                                                                                                bbb = m;
                                                                                                                                                                                                                m--;
                                                                                                                                                                                                                if(m > 0){
                                                                                                                                                                                                                    ccc = m;
                                                                                                                                                                                                                    m--;
                                                                                                                                                                                                                    if(m > 0){
                                                                                                                                                                                                                        ddd = m;
                                                                                                                                                                                                                        m--;
                                                                                                                                                                                                                        if(m > 0){
                                                                                                                                                                                                                            eee = m;
                                                                                                                                                                                                                            m--;
                                                                                                                                                                                                                            if(m > 0){
                                                                                                                                                                                                                                fff = m;
                                                                                                                                                                                                                                m--;
                                                                                                                                                                                                                                if(m > 0){
                                                                                                                                                                                                                                    ggg = m;
                                                                                                                                                                                                                                    m--;
                                                                                                                                                                                                                                    if(m > 0){
                                                                                                                                                                                                                                        hhh = m;
                                                                                                                                                                                                                                        m--;
                                                                                                                                                                                                                                        if(m > 0){
                                                                                                                                                                                                                                            iii = m;
                                                                                                                                                                                                                                            m--;
                                                                                                                                                                                                                                            if(m > 0){
                                                                                                                                                                                                                                                jjj = m;
                                                                                                                                                                                                                                                m--;
                                                                                                                                                                                                                                                if(m > 0){
                                                                                                                                                                                                                                                    kkk = m;
                                                                                                                                                                                                                                                    m--;
                                                                                                                                                                                                                                                    if(m > 0){
                                                                                                                                                                                                                                                        lll = m;
                                                                                                                                                                                                                                                        m--;
                                                                                                                                                                                                                                                        if(m > 0){
                                                                                                                                                                                                                                                            ooo = m;
                                                                                                                                                                                                                                                            m--;
                                                                                                                                                                                                                                                            if(m > 0){
                                                                                                                                                                                                                                                                ppp = m;
                                                                                                                                                                                                                                                                m--;
                                                                                                                                                                                                                                                                if(m > 0){
                                                                                                                                                                                                                                                                    qqq = m;
                                                                                                                                                                                                                                                                    m--;
                                                                                                                                                                                                                                                                    if(m > 0){
                                                                                                                                                                                                                                                                        rrr = m;
                                                                                                                                                                                                                                                                        m--;
                                                                                                                                                                                                                                                                        if(m > 0){
                                                                                                                                                                                                                                                                            sss = m;
                                                                                                                                                                                                                                                                            m--;
                                                                                                                                                                                                                                                                            if(m > 0){
                                                                                                                                                                                                                                                                                ttt = m;
                                                                                                                                                                                                                                                                                m--;
                                                                                                                                                                                                                                                                                if(m > 0){
                                                                                                                                                                                                                                                                                    uuu = m;
                                                                                                                                                                                                                                                                                    m--;
                                                                                                                                                                                                                                                                                    if(m > 0){
                                                                                                                                                                                                                                                                                        vvv = m;
                                                                                                                                                                                                                                                                                        m--;
                                                                                                                                                                                                                                                                                        if(m > 0){
                                                                                                                                                                                                                                                                                            www = m;
                                                                                                                                                                                                                                                                                            m--;
                                                                                                                                                                                                                                                                                            if(m > 0){
                                                                                                                                                                                                                                                                                                xxx = m;
                                                                                                                                                                                                                                                                                                m--;
                                                                                                                                                                                                                                                                                                if(m > 0){
                                                                                                                                                                                                                                                                                                    yyy = m;
                                                                                                                                                                                                                                                                                                    m--;
                                                                                                                                                                                                                                                                                                    if(m > 0){
                                                                                                                                                                                                                                                                                                        zzz = m;
                                                                                                                                                                                                                                                                                                        m--;
                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        } 
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                        } 
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                            
                                                                                        
                                                                                                                                            
                                                                                                                            
                                                                                                                                                                                                    
                                                                                                                                                                                                
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } 
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        } 
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } 
                    }
                }
            }
        } 
        
        if (m == 0){
            int suma = a + b + c + d + e + f + g + h + i + j + k + l + o + p + q + r + s + t + u + v + w + x + y + z + aa + bb + cc + dd + ee + ff + gg + hh + ii + jj + kk + ll + oo + pp + qq + rr + 
                    ss + tt + uu + vv + ww + xx + yy + zz + aaa + bbb + ccc + ddd + eee + fff + ggg + hhh + iii + jjj + kkk + lll + ooo + ppp + qqq + rrr + sss + ttt + uuu + vvv + www + xxx + yyy + zzz;
            label3.setText("Suma numero en serie M: (" + a + ", " + b + ", " + c + ", " + d + "...) = " + suma);
            return suma;
        }
        
        return m;
    }
    
    
    
    private int fibonacci(int num) {
        if(num == 0 || num == 1){
            return num;
        } 
        else{
            return fibonacci(num-1) + fibonacci(num-2);
        }
    }
    
    private int secuencia(int num){
        String cad = "= ";
        for(int i = 0; i < num; i++){
            if(fibonacci(i) > num){
                break;
            }
            do {
               cad = cad + fibonacci(i) + ", ";
               label9.setText(cad);
            } while (fibonacci(i) > num);
        }
        return 0;
    }
    
    
    private double potencia(int base, int exponente) {
        double resultado = 0;
        if (exponente == 0) {
            return 1;
        } else {
            resultado = base * potencia(base, exponente - 1);
            label5.setText("Potencia de N elevado a la M: (" + base + ") ^ (" + exponente + ") = " + resultado);
            return resultado;
        }
    }
    
    private int Euclides(int m, int n) {
        if (n == 0){
            label6.setText("Maximo comun divisor: " + m );
            return m;
        }
        else if (m == 0){
            label6.setText("Maximo comun divisor: " + n );
            return n;
        }
        else{
            label6.setText("Maximo comun divisor: "  );
            return Euclides(n, m % n);
        }
        
    }

   
    private double factorial(double num) {
        double resultado = 0;
        if (num == 0) {
            return 0;
        } else if (num == 1) {
            label7.setText("Factorial de N: " + "1");
            return 1;
        } else {
            resultado = num * factorial(num - 1);
            label7.setText("Factorial de N: (" + n + ") = " + resultado);
            return resultado;
        }
    }
    
}