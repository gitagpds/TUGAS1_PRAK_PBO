/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugaspbo1_123220087;

import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author gitap
 */

class LoginPage extends JFrame {
    // KALIMAT PEMBUKA
    JLabel kal1 = new JLabel("Selamat Datang!");
    JLabel kal2 = new JLabel("Silakan masuk untuk melanjutkan.");
    
    // INPUT USERNAME DAN PASSWORD
    JLabel labelUsername = new JLabel("Username");
    JTextField inputUsername = new JTextField();
    
    JLabel labelPassword = new JLabel("Password");
    JTextField inputPassword = new JTextField();
    
    // RADIOBUTTON JENIS KELAMIN
    JLabel labelJK = new JLabel("Jenis Kelamin");
    JRadioButton pilihLaki = new JRadioButton("Laki-laki");
    JRadioButton pilihPerempuan = new JRadioButton("Perempuan");
    
    // BUTTON LOGIN
    JButton tombolLogin = new JButton("Login");
    
    LoginPage(){
        setVisible(true);
        setSize(650, 650);
 
        setTitle("Login Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        // KALIMAT PEMBUKA
        add(kal1);
        kal1.setFont(kal1.getFont().deriveFont(24.0f));
        kal1.setBounds(30, 10, 500, 50);
        
        add(kal2);
        kal2.setFont(kal2.getFont().deriveFont(16.0f));
        kal2.setBounds(30, 40, 500, 50);
        
        // INPUT USERNAME DAN PASSWORD
        add(labelUsername);
        labelUsername.setFont(labelUsername.getFont().deriveFont(16.0f));
        labelUsername.setBounds(30, 80, 100, 50);
        
        add(inputUsername);
        inputUsername.setBounds(30, 125, 570, 35);
        
        add(labelPassword);
        labelPassword.setFont(labelPassword.getFont().deriveFont(16.0f));
        labelPassword.setBounds(30, 170, 100, 50);
        
        add(inputPassword);
        inputPassword.setBounds(30, 215, 570, 35);
        
        // RADIOBUTTON JENIS KELAMIN
        add(labelJK);
        labelJK.setFont(labelJK.getFont().deriveFont(16.0f));
        labelJK.setBounds(30, 260, 500, 50);
        
        ButtonGroup pilihJenisKelamin = new ButtonGroup();
        pilihJenisKelamin.add(pilihLaki);
        pilihJenisKelamin.add(pilihPerempuan);
        
        add(pilihLaki);
        pilihLaki.setFont(pilihLaki.getFont().deriveFont(16.0f));
        pilihLaki.setBounds(28, 305, 100, 30);
        
        add(pilihPerempuan);
        pilihPerempuan.setFont(pilihPerempuan.getFont().deriveFont(16.0f));
        pilihPerempuan.setBounds(300, 305, 300, 30);
        
        // BUTTON LOGIN
        add(tombolLogin);
        tombolLogin.setFont(tombolLogin.getFont().deriveFont(16.0f));
        tombolLogin.setBounds(30, 360, 570, 35);
        tombolLogin.setBackground(Color.white);
         
    }

}

class HalUtama extends JFrame {
    // KALIMAT PEMBUKA
    JLabel kal1 = new JLabel("Welcome, [Mr./Mrs.] [username]");
    JLabel kal2 = new JLabel("Tentukan panjang, lebar, dan tinggi untuk menghitung Balok");
    
    // INPUT PANJANG, LEBAR, DAN TINGGI
    JLabel labelPanjang = new JLabel("Panjang");
    JTextField inputPanjang = new JTextField();
    
    JLabel labelLebar = new JLabel("Lebar");
    JTextField inputLebar = new JTextField();
    
    JLabel labelTinggi = new JLabel("Tinggi");
    JTextField inputTinggi = new JTextField();
    
    // BUTTON HITUNG & RESET
    JButton tombolHitung = new JButton("Hitung");
    JButton tombolReset = new JButton("Reset");
    
    // HASIL
    JLabel kal_hasil = new JLabel("Hasil");
    
    // LUAS & KELILING PERSEGI
    JLabel labelLuas = new JLabel("Luas Persegi");
    JLabel hasilLuas = new JLabel("[Hasil berupa angka]");
    JLabel labelKeliling = new JLabel("Keliling Persegi");
    JLabel hasilKeliling = new JLabel("[Hasil berupa angka]");
    
    // VOLUME & LUAS PERMUKAAN BALOK
    JLabel labelVolume = new JLabel("Volume Balok");
    JLabel hasilVolume = new JLabel("[Hasil berupa angka]");
    JLabel labelLuasPermukaan = new JLabel("Luas Permukaan Balok");
    JLabel hasilLuasPermukaan = new JLabel("[Hasil berupa angka]");
    
    HalUtama(){
        setVisible(true);
        setSize(650, 650);
        setTitle("Halaman Utama");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        // KALIMAT PEMBUKA
        add(kal1);
        kal1.setFont(kal1.getFont().deriveFont(24.0f));
        kal1.setBounds(30, 10, 500, 50);
        
        add(kal2);
        kal2.setFont(kal2.getFont().deriveFont(16.0f));
        kal2.setBounds(30, 40, 500, 50);
        
        // INPUT PANJANG
        add(labelPanjang);
        labelPanjang.setFont(labelPanjang.getFont().deriveFont(16.0f));
        labelPanjang.setBounds(30, 90, 100, 50);
        
        add(inputPanjang);
        inputPanjang.setBounds(190, 100, 390, 35);
        
        // INPUT LEBAR
        add(labelLebar);
        labelLebar.setFont(labelLebar.getFont().deriveFont(16.0f));
        labelLebar.setBounds(30, 140, 100, 50);
        
        add(inputLebar);
        inputLebar.setBounds(190, 150, 390, 35);
        
        // INPUT TINGGI
        add(labelTinggi);
        labelTinggi.setFont(labelTinggi.getFont().deriveFont(16.0f));
        labelTinggi.setBounds(30, 190, 100, 50);
        
        add(inputTinggi);
        inputTinggi.setBounds(190, 200, 390, 35);
        
        // BUTTON HITUNG
        add(tombolHitung);
        tombolHitung.setFont(tombolHitung.getFont().deriveFont(16.0f));
        tombolHitung.setBounds(30, 260, 550, 40);
        tombolHitung.setBackground(Color.white);
        
        // BUTTON RESET
        add(tombolReset);
        tombolReset.setFont(tombolReset.getFont().deriveFont(16.0f));
        tombolReset.setBounds(30, 320, 550, 40);
        tombolReset.setBackground(Color.white);
        
        // TULISAN HASIL
        add(kal_hasil);
        kal_hasil.setFont(kal_hasil.getFont().deriveFont(16.0f));
        kal_hasil.setHorizontalAlignment(SwingConstants.CENTER);
        kal_hasil.setBounds(55, 370, 500, 35);
        
        // LUAS PERSEGI
        add(labelLuas);
        labelLuas.setFont(labelLuas.getFont().deriveFont(16.0f));
        labelLuas.setBounds(30, 400, 200, 50);
        
        add(hasilLuas);
        hasilLuas.setFont(hasilLuas.getFont().deriveFont(16.0f));
        hasilLuas.setBounds(250, 400, 200, 50);
        
        // KELILING PERSEGI
        add(labelKeliling);
        labelKeliling.setFont(labelKeliling.getFont().deriveFont(16.0f));
        labelKeliling.setBounds(30, 440, 200, 50);
        
        add(hasilKeliling);
        hasilKeliling.setFont(hasilKeliling.getFont().deriveFont(16.0f));
        hasilKeliling.setBounds(250, 440, 200, 50);
        
        // VOLUME BALOK
        add(labelVolume);
        labelVolume.setFont(labelVolume.getFont().deriveFont(16.0f));
        labelVolume.setBounds(30, 480, 200, 50);
        
        add(hasilVolume);
        hasilVolume.setFont(hasilVolume.getFont().deriveFont(16.0f));
        hasilVolume.setBounds(250, 480, 200, 50);
        
        // LUAS PERMUKAAN BALOK
        add(labelLuasPermukaan);
        labelLuasPermukaan.setFont(labelLuasPermukaan.getFont().deriveFont(16.0f));
        labelLuasPermukaan.setBounds(30, 520, 200, 50);
        
        add(hasilLuasPermukaan);
        hasilLuasPermukaan.setFont(hasilLuasPermukaan.getFont().deriveFont(16.0f));
        hasilLuasPermukaan.setBounds(250, 520, 200, 50);
          
    }

}

public class TugasPBO1_123220087 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LoginPage loginpage = new LoginPage();
        HalUtama halutama = new HalUtama();
    }
    
}
