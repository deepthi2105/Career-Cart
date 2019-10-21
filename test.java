package Database;

import javax.swing.*;
import java.sql.*;

public class test extends javax.swing.JFrame {

    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    Statement st;
    String value;
    int count = 0;

    public test() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        buttonGroup11 = new javax.swing.ButtonGroup();
        buttonGroup12 = new javax.swing.ButtonGroup();
        buttonGroup13 = new javax.swing.ButtonGroup();
        buttonGroup14 = new javax.swing.ButtonGroup();
        buttonGroup15 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        radioc = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton16 = new javax.swing.JRadioButton();
        jRadioButton17 = new javax.swing.JRadioButton();
        jRadioButton18 = new javax.swing.JRadioButton();
        jRadioButton19 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton20 = new javax.swing.JRadioButton();
        jRadioButton21 = new javax.swing.JRadioButton();
        jRadioButton22 = new javax.swing.JRadioButton();
        jRadioButton23 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton24 = new javax.swing.JRadioButton();
        jRadioButton25 = new javax.swing.JRadioButton();
        jRadioButton26 = new javax.swing.JRadioButton();
        jRadioButton27 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jRadioButton28 = new javax.swing.JRadioButton();
        jRadioButton29 = new javax.swing.JRadioButton();
        jRadioButton30 = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jRadioButton31 = new javax.swing.JRadioButton();
        jRadioButton32 = new javax.swing.JRadioButton();
        jRadioButton33 = new javax.swing.JRadioButton();
        jRadioButton34 = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jRadioButton35 = new javax.swing.JRadioButton();
        jRadioButton36 = new javax.swing.JRadioButton();
        jRadioButton37 = new javax.swing.JRadioButton();
        jRadioButton38 = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        jRadioButton39 = new javax.swing.JRadioButton();
        jRadioButton40 = new javax.swing.JRadioButton();
        jRadioButton41 = new javax.swing.JRadioButton();
        jRadioButton42 = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        jRadioButton43 = new javax.swing.JRadioButton();
        jRadioButton44 = new javax.swing.JRadioButton();
        jRadioButton45 = new javax.swing.JRadioButton();
        jRadioButton46 = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        jRadioButton47 = new javax.swing.JRadioButton();
        jRadioButton48 = new javax.swing.JRadioButton();
        jRadioButton49 = new javax.swing.JRadioButton();
        jRadioButton50 = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        jRadioButton51 = new javax.swing.JRadioButton();
        jRadioButton52 = new javax.swing.JRadioButton();
        jRadioButton53 = new javax.swing.JRadioButton();
        jRadioButton54 = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        jRadioButton55 = new javax.swing.JRadioButton();
        jRadioButton56 = new javax.swing.JRadioButton();
        jRadioButton57 = new javax.swing.JRadioButton();
        jRadioButton58 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jRadioButton59 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("APTITUDE TEST");

        jLabel2.setText("1) A train running at the speed of 60kmph crosses a pole in 9 seconds.What is the length of the train?");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("120m");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("180m");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioc);
        radioc.setText("324m");
        radioc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiocActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("150m");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jLabel3.setText("2) A sum of money at simple interest amounts to Rs.815 in 3 years and to Rs.854 in 4 years. The sum is?");

        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setText("650");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButton5);
        jRadioButton5.setText("690");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButton6);
        jRadioButton6.setText("698");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButton7);
        jRadioButton7.setText("700");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });

        jLabel4.setText("3) What least number must be added to 1056 so that its completely divisible by 23?");

        buttonGroup3.add(jRadioButton8);
        jRadioButton8.setText("2");
        jRadioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton8ActionPerformed(evt);
            }
        });

        buttonGroup3.add(jRadioButton9);
        jRadioButton9.setText("3");
        jRadioButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton9ActionPerformed(evt);
            }
        });

        buttonGroup3.add(jRadioButton10);
        jRadioButton10.setText("18");
        jRadioButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton10ActionPerformed(evt);
            }
        });

        buttonGroup3.add(jRadioButton11);
        jRadioButton11.setText("21");
        jRadioButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton11ActionPerformed(evt);
            }
        });

        jLabel5.setText("4) Pick the odd man out: 8, 27, 64, 100, 125, 216, 343");

        buttonGroup4.add(jRadioButton12);
        jRadioButton12.setText("8");
        jRadioButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton12ActionPerformed(evt);
            }
        });

        buttonGroup4.add(jRadioButton13);
        jRadioButton13.setText("100");
        jRadioButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton13ActionPerformed(evt);
            }
        });

        buttonGroup4.add(jRadioButton14);
        jRadioButton14.setText("125");
        jRadioButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton14ActionPerformed(evt);
            }
        });

        buttonGroup4.add(jRadioButton15);
        jRadioButton15.setText("343");
        jRadioButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton15ActionPerformed(evt);
            }
        });

        jLabel6.setText("5) A hall is 15 m long and 12m broad. If the sum of the areas of the floor and the ceiling is equal to the sum of the areas of the four walls. Calculate volume of the hall.");

        buttonGroup5.add(jRadioButton16);
        jRadioButton16.setText("720");
        jRadioButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton16ActionPerformed(evt);
            }
        });

        buttonGroup5.add(jRadioButton17);
        jRadioButton17.setText("900");
        jRadioButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton17ActionPerformed(evt);
            }
        });

        buttonGroup5.add(jRadioButton18);
        jRadioButton18.setText("1200");
        jRadioButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton18ActionPerformed(evt);
            }
        });

        buttonGroup5.add(jRadioButton19);
        jRadioButton19.setText("1800");
        jRadioButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton19ActionPerformed(evt);
            }
        });

        jLabel7.setText("6) A clock is started at noon.By 10 minutes past 5, the hour hand has turned through?");

        buttonGroup6.add(jRadioButton20);
        jRadioButton20.setText("145 degrees");
        jRadioButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton20ActionPerformed(evt);
            }
        });

        buttonGroup6.add(jRadioButton21);
        jRadioButton21.setText("150 degrees ");
        jRadioButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton21ActionPerformed(evt);
            }
        });

        buttonGroup6.add(jRadioButton22);
        jRadioButton22.setText("155 degrees");
        jRadioButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton22ActionPerformed(evt);
            }
        });

        buttonGroup6.add(jRadioButton23);
        jRadioButton23.setText("160 degrees");
        jRadioButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton23ActionPerformed(evt);
            }
        });

        jLabel8.setText("7) Tickets numbvered 1-20 are mixed up and then a ticket is drawn at random. What is the probability that the ticket drawn has a number which is a multiple of 3 or 5?");

        buttonGroup7.add(jRadioButton24);
        jRadioButton24.setText("1/2");
        jRadioButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton24ActionPerformed(evt);
            }
        });

        buttonGroup7.add(jRadioButton25);
        jRadioButton25.setText("2/5");
        jRadioButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton25ActionPerformed(evt);
            }
        });

        buttonGroup7.add(jRadioButton26);
        jRadioButton26.setText("8/15");
        jRadioButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton26ActionPerformed(evt);
            }
        });

        buttonGroup7.add(jRadioButton27);
        jRadioButton27.setText("9/20");
        jRadioButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton27ActionPerformed(evt);
            }
        });

        jLabel9.setText("8) A sum of ages of five children born at the intervals of 3 years each is 50 years. What is the age of the youngest child?");

        buttonGroup8.add(jRadioButton28);
        jRadioButton28.setText("4 years");
        jRadioButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton28ActionPerformed(evt);
            }
        });

        buttonGroup8.add(jRadioButton29);
        jRadioButton29.setText("10 years");
        jRadioButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton29ActionPerformed(evt);
            }
        });

        buttonGroup8.add(jRadioButton30);
        jRadioButton30.setText("None of the above");
        jRadioButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton30ActionPerformed(evt);
            }
        });

        jLabel11.setText("9) Three partners shared the profit in a business in the ratio 5:7:8.They had partnered for 14 months,8 months and 7 monmths respectively.what was the rario of their investments? ");

        buttonGroup9.add(jRadioButton31);
        jRadioButton31.setText("5:7:8");
        jRadioButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton31ActionPerformed(evt);
            }
        });

        buttonGroup9.add(jRadioButton32);
        jRadioButton32.setText("20:49:64");
        jRadioButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton32ActionPerformed(evt);
            }
        });

        buttonGroup9.add(jRadioButton33);
        jRadioButton33.setText("38:28:21");
        jRadioButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton33ActionPerformed(evt);
            }
        });

        buttonGroup9.add(jRadioButton34);
        jRadioButton34.setText("35:49:56");
        jRadioButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton34ActionPerformed(evt);
            }
        });

        jLabel12.setText("10) The banker's discount on a bill due 4  motnhs at 15% is Rs.420. The true discount is:");

        buttonGroup10.add(jRadioButton35);
        jRadioButton35.setText("Rs.400");
        jRadioButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton35ActionPerformed(evt);
            }
        });

        buttonGroup10.add(jRadioButton36);
        jRadioButton36.setText("Rs.360");
        jRadioButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton36ActionPerformed(evt);
            }
        });

        buttonGroup10.add(jRadioButton37);
        jRadioButton37.setText("Rs.480");
        jRadioButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton37ActionPerformed(evt);
            }
        });

        buttonGroup10.add(jRadioButton38);
        jRadioButton38.setText("Rs.320");
        jRadioButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton38ActionPerformed(evt);
            }
        });

        jLabel13.setText("11) What is the antonym of : EXODUS?");

        buttonGroup11.add(jRadioButton39);
        jRadioButton39.setText("Homecoming");
        jRadioButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton39ActionPerformed(evt);
            }
        });

        buttonGroup11.add(jRadioButton40);
        jRadioButton40.setText("Return");
        jRadioButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton40ActionPerformed(evt);
            }
        });

        buttonGroup11.add(jRadioButton41);
        jRadioButton41.setText("Restoration");
        jRadioButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton41ActionPerformed(evt);
            }
        });

        buttonGroup11.add(jRadioButton42);
        jRadioButton42.setText("Influx");
        jRadioButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton42ActionPerformed(evt);
            }
        });

        jLabel14.setText("12) What does the following phrase mean : \"To pick holes\" ");

        buttonGroup12.add(jRadioButton43);
        jRadioButton43.setText("To find reason to quarrel");
        jRadioButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton43ActionPerformed(evt);
            }
        });

        buttonGroup12.add(jRadioButton44);
        jRadioButton44.setText("To destroy something");
        jRadioButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton44ActionPerformed(evt);
            }
        });

        buttonGroup12.add(jRadioButton45);
        jRadioButton45.setText("To criticize someone");
        jRadioButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton45ActionPerformed(evt);
            }
        });

        buttonGroup12.add(jRadioButton46);
        jRadioButton46.setText("To cut something into pieces");
        jRadioButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton46ActionPerformed(evt);
            }
        });

        jLabel15.setText("13) The miser gazed ________  at the pile of gold coins in front of him.");

        buttonGroup13.add(jRadioButton47);
        jRadioButton47.setText("avidly");
        jRadioButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton47ActionPerformed(evt);
            }
        });

        buttonGroup13.add(jRadioButton48);
        jRadioButton48.setText("admiringly");
        jRadioButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton48ActionPerformed(evt);
            }
        });

        buttonGroup13.add(jRadioButton49);
        jRadioButton49.setText("thoughtfully");
        jRadioButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton49ActionPerformed(evt);
            }
        });

        buttonGroup13.add(jRadioButton50);
        jRadioButton50.setText("earnestly");
        jRadioButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton50ActionPerformed(evt);
            }
        });

        jLabel16.setText("14) PETAL : FLOWER");

        buttonGroup14.add(jRadioButton51);
        jRadioButton51.setText("Salt:Pepper");
        jRadioButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton51ActionPerformed(evt);
            }
        });

        buttonGroup14.add(jRadioButton52);
        jRadioButton52.setText("puppy:dog");
        jRadioButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton52ActionPerformed(evt);
            }
        });

        buttonGroup14.add(jRadioButton53);
        jRadioButton53.setText("tyre: bicycle");
        jRadioButton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton53ActionPerformed(evt);
            }
        });

        buttonGroup14.add(jRadioButton54);
        jRadioButton54.setText("bike:bicycle");
        jRadioButton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton54ActionPerformed(evt);
            }
        });

        jLabel17.setText("15) Give one word for the following phrase : A style in which a writer makes a display of his knowledge.");

        buttonGroup15.add(jRadioButton55);
        jRadioButton55.setText("Verbose");
        jRadioButton55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton55ActionPerformed(evt);
            }
        });

        buttonGroup15.add(jRadioButton56);
        jRadioButton56.setText("Pompous");
        jRadioButton56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton56ActionPerformed(evt);
            }
        });

        buttonGroup15.add(jRadioButton57);
        jRadioButton57.setText("Ornate");
        jRadioButton57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton57ActionPerformed(evt);
            }
        });

        buttonGroup15.add(jRadioButton58);
        jRadioButton58.setText("Pedantic");
        jRadioButton58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton58ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("SUBMIT TEST");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Submit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Submit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Submit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Submit");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Submit");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Submit");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Submit");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Submit");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("Submit");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("Submit");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("Submit");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("Submit");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setText("Submit");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setText("Submit");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        buttonGroup8.add(jRadioButton59);
        jRadioButton59.setText("8 years");
        jRadioButton59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton59ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(315, 315, 315)
                                                .addComponent(jLabel1))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jRadioButton4)
                                                .addGap(18, 18, 18)
                                                .addComponent(jRadioButton5)
                                                .addGap(18, 18, 18)
                                                .addComponent(jRadioButton6)
                                                .addGap(18, 18, 18)
                                                .addComponent(jRadioButton7))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jRadioButton8)
                                                .addGap(18, 18, 18)
                                                .addComponent(jRadioButton9)
                                                .addGap(16, 16, 16)
                                                .addComponent(jRadioButton10)
                                                .addGap(18, 18, 18)
                                                .addComponent(jRadioButton11)))
                                        .addGap(0, 295, Short.MAX_VALUE)))
                                .addGap(129, 129, 129))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jRadioButton24)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton25)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton26)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton27))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jRadioButton28)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButton59)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButton29)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton30))
                                    .addComponent(jLabel9)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jRadioButton31)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton32)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton33)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton34))
                                    .addComponent(jLabel11)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jRadioButton35)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton36)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton37)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton38))
                                    .addComponent(jLabel12)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jRadioButton39)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton40)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton41)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton42))
                                    .addComponent(jLabel13)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jRadioButton43)
                                        .addGap(10, 10, 10)
                                        .addComponent(jRadioButton44)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton45)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton46))
                                    .addComponent(jLabel14)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jRadioButton47)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton48)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton49)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton50))
                                    .addComponent(jLabel16)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jRadioButton55)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton56)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton57)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton58))
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jRadioButton51)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton52)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton53)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton54)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jRadioButton16)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton17)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton18)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton19))
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jRadioButton12)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton13)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton14)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton15))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jRadioButton20)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton21)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton22)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton23))
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addGap(26, 26, 26)
                                .addComponent(jRadioButton2)
                                .addGap(18, 18, 18)
                                .addComponent(radioc)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 904, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(43, 43, 43))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(radioc)
                    .addComponent(jRadioButton3)
                    .addComponent(jButton2))
                .addGap(34, 34, 34)
                .addComponent(jLabel3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton4)
                            .addComponent(jRadioButton5)
                            .addComponent(jRadioButton6)
                            .addComponent(jRadioButton7)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jButton3)))
                .addGap(28, 28, 28)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton8)
                    .addComponent(jRadioButton9)
                    .addComponent(jRadioButton10)
                    .addComponent(jRadioButton11)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton12)
                            .addComponent(jRadioButton13)
                            .addComponent(jRadioButton14)
                            .addComponent(jRadioButton15)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jButton5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton16)
                    .addComponent(jRadioButton17)
                    .addComponent(jRadioButton18)
                    .addComponent(jRadioButton19)
                    .addComponent(jButton6))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton20)
                    .addComponent(jRadioButton21)
                    .addComponent(jRadioButton22)
                    .addComponent(jRadioButton23)
                    .addComponent(jButton7))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton24)
                    .addComponent(jRadioButton25)
                    .addComponent(jRadioButton26)
                    .addComponent(jRadioButton27)
                    .addComponent(jButton8))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton28)
                    .addComponent(jRadioButton29)
                    .addComponent(jRadioButton30)
                    .addComponent(jButton9)
                    .addComponent(jRadioButton59))
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton31)
                    .addComponent(jRadioButton32)
                    .addComponent(jRadioButton33)
                    .addComponent(jRadioButton34)
                    .addComponent(jButton10))
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton35)
                    .addComponent(jRadioButton36)
                    .addComponent(jRadioButton37)
                    .addComponent(jRadioButton38)
                    .addComponent(jButton11))
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton39)
                    .addComponent(jRadioButton40)
                    .addComponent(jRadioButton41)
                    .addComponent(jRadioButton42)
                    .addComponent(jButton12))
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton43)
                    .addComponent(jRadioButton44)
                    .addComponent(jRadioButton45)
                    .addComponent(jRadioButton46)
                    .addComponent(jButton13))
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton47)
                    .addComponent(jRadioButton48)
                    .addComponent(jRadioButton49)
                    .addComponent(jRadioButton50)
                    .addComponent(jButton14))
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton51)
                    .addComponent(jRadioButton52)
                    .addComponent(jRadioButton53)
                    .addComponent(jRadioButton54)
                    .addComponent(jButton15))
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton55)
                    .addComponent(jRadioButton56)
                    .addComponent(jRadioButton57)
                    .addComponent(jRadioButton58)
                    .addComponent(jButton16))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1038, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1249, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        value = "120";
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        value = "650";
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton18ActionPerformed
        value = "1200";
    }//GEN-LAST:event_jRadioButton18ActionPerformed

    private void jRadioButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton21ActionPerformed
        value = "150 degrees";
    }//GEN-LAST:event_jRadioButton21ActionPerformed

    private void jRadioButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton27ActionPerformed
        value = "9/20";
    }//GEN-LAST:event_jRadioButton27ActionPerformed

    private void jRadioButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton29ActionPerformed
        value = "10 years";
    }//GEN-LAST:event_jRadioButton29ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/regis", "root", "15*Deeps");
            String sql = "select * from compare where value='Correct'";
            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                count++;
            }
            count = count * 5;
            JOptionPane.showMessageDialog(null, "Your score is " + count);

            String clear1 = "drop table compare";
            PreparedStatement pstm = con.prepareStatement(clear1);
            pstm.executeUpdate();
            String clear2 = "drop table submitAnswers";
            PreparedStatement pstm1 = con.prepareStatement(clear2);
            pstm1.executeUpdate();

            String create1 = "create table compare(id int not null auto_increment,value varchar(25),primary key(id))";
            PreparedStatement pst1 = con.prepareStatement(create1);
            pst1.executeUpdate();

            String create2 = "create table submitAnswers(id int not null auto_increment,ans varchar(50),primary key(id))";
            PreparedStatement pst2 = con.prepareStatement(create2);
            pst2.executeUpdate();

            con.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        value = "180";
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        try {
            String submitQuery = "INSERT INTO submitAnswers(ans) VALUES (?)";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/regis", "root", "15*Deeps");
            pst = con.prepareStatement(submitQuery);
            pst.setString(1, value);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Your answer is subitted successfully.");
            String extractQuery = "select submitAnswers.ans, answers.sa from answers inner join(select ans from submitAnswers order by id desc limit 1) submitAnswers on submitAnswers.ans = answers.sa";
            pst = con.prepareStatement(extractQuery);
            rs = pst.executeQuery();
            if (rs.next()) {

                String valueQuery = "INSERT INTO compare(value) VALUES (?)";
                pst = con.prepareStatement(valueQuery);
                pst.setString(1, "Correct");
                pst.executeUpdate();
            } else {
                String valueQuery = "INSERT INTO compare(value) VALUES (?)";
                pst = con.prepareStatement(valueQuery);
                pst.setString(1, "Incorrect");
                pst.executeUpdate();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            String submitQuery = "INSERT INTO submitAnswers(ans) VALUES (?)";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/regis", "root", "15*Deeps");
            pst = con.prepareStatement(submitQuery);
            pst.setString(1, value);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Your answer is subitted successfully.");
            String extractQuery = "select submitAnswers.ans, answers.sa from answers inner join (select ans from submitAnswers order by id desc limit 1)submitAnswers on submitAnswers.ans = answers.sa";
            pst = con.prepareStatement(extractQuery);
            rs = pst.executeQuery();
            if (rs.next()) {

                String valueQuery = "INSERT INTO compare(value) VALUES (?)";
                pst = con.prepareStatement(valueQuery);
                pst.setString(1, "Correct");
                pst.executeUpdate();
            } else {
                String valueQuery = "INSERT INTO compare(value) VALUES (?)";
                pst = con.prepareStatement(valueQuery);
                pst.setString(1, "Incorrect");
                pst.executeUpdate();
            }
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton9ActionPerformed
        value = "3";
    }//GEN-LAST:event_jRadioButton9ActionPerformed

    private void jRadioButton59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton59ActionPerformed
        value = "8 years";
    }//GEN-LAST:event_jRadioButton59ActionPerformed

    private void radiocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiocActionPerformed
        value = "324";
    }//GEN-LAST:event_radiocActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        value = "150m";        
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        value = "690";        
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        value = "698";       
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        value = "700";       
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton8ActionPerformed
        value = "2";        
    }//GEN-LAST:event_jRadioButton8ActionPerformed

    private void jRadioButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton10ActionPerformed
        value = "18";        
    }//GEN-LAST:event_jRadioButton10ActionPerformed

    private void jRadioButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton11ActionPerformed
        value = "21";        
    }//GEN-LAST:event_jRadioButton11ActionPerformed

    private void jRadioButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton12ActionPerformed
        value = "8";        
    }//GEN-LAST:event_jRadioButton12ActionPerformed

    private void jRadioButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton13ActionPerformed
        value = "100";       
    }//GEN-LAST:event_jRadioButton13ActionPerformed

    private void jRadioButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton14ActionPerformed
        value = "125";        
    }//GEN-LAST:event_jRadioButton14ActionPerformed

    private void jRadioButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton15ActionPerformed
        value = "343";        
    }//GEN-LAST:event_jRadioButton15ActionPerformed

    private void jRadioButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton16ActionPerformed
        value = "720";        
    }//GEN-LAST:event_jRadioButton16ActionPerformed

    private void jRadioButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton17ActionPerformed
        value = "900";        
    }//GEN-LAST:event_jRadioButton17ActionPerformed

    private void jRadioButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton19ActionPerformed
        value = "1800";       
    }//GEN-LAST:event_jRadioButton19ActionPerformed

    private void jRadioButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton20ActionPerformed
        value = "145 degrees";        
    }//GEN-LAST:event_jRadioButton20ActionPerformed

    private void jRadioButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton22ActionPerformed
        value = "155 degrees";        
    }//GEN-LAST:event_jRadioButton22ActionPerformed

    private void jRadioButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton23ActionPerformed
        value = "160 degrees";        
    }//GEN-LAST:event_jRadioButton23ActionPerformed

    private void jRadioButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton24ActionPerformed
        value = "1/2";       
    }//GEN-LAST:event_jRadioButton24ActionPerformed

    private void jRadioButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton25ActionPerformed
        value = "2/5";       
    }//GEN-LAST:event_jRadioButton25ActionPerformed

    private void jRadioButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton26ActionPerformed
        value = "8/15";      
    }//GEN-LAST:event_jRadioButton26ActionPerformed

    private void jRadioButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton28ActionPerformed
        value = "4 years";       
    }//GEN-LAST:event_jRadioButton28ActionPerformed

    private void jRadioButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton30ActionPerformed
        value = "None of the above";        
    }//GEN-LAST:event_jRadioButton30ActionPerformed

    private void jRadioButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton31ActionPerformed
        value = "5:7:8";        
    }//GEN-LAST:event_jRadioButton31ActionPerformed

    private void jRadioButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton32ActionPerformed
        value = "20:49:64";        
    }//GEN-LAST:event_jRadioButton32ActionPerformed

    private void jRadioButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton33ActionPerformed
        value = "38:28:21";        
    }//GEN-LAST:event_jRadioButton33ActionPerformed

    private void jRadioButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton34ActionPerformed
        value = "35:49:56";       
    }//GEN-LAST:event_jRadioButton34ActionPerformed

    private void jRadioButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton35ActionPerformed
        value = "Rs.400";        
    }//GEN-LAST:event_jRadioButton35ActionPerformed

    private void jRadioButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton36ActionPerformed
        value = "Rs.360";        
    }//GEN-LAST:event_jRadioButton36ActionPerformed

    private void jRadioButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton37ActionPerformed
        value = "Rs.480";        
    }//GEN-LAST:event_jRadioButton37ActionPerformed

    private void jRadioButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton38ActionPerformed
        value = "Rs.320";      
    }//GEN-LAST:event_jRadioButton38ActionPerformed

    private void jRadioButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton39ActionPerformed
        value = "Homecoming";        
    }//GEN-LAST:event_jRadioButton39ActionPerformed

    private void jRadioButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton40ActionPerformed
        value = "Return";        
    }//GEN-LAST:event_jRadioButton40ActionPerformed

    private void jRadioButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton41ActionPerformed
        value = "Restoration";        
    }//GEN-LAST:event_jRadioButton41ActionPerformed

    private void jRadioButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton42ActionPerformed
        value = "Influx";       
    }//GEN-LAST:event_jRadioButton42ActionPerformed

    private void jRadioButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton43ActionPerformed
        value = "To find reason to quarrel";        
    }//GEN-LAST:event_jRadioButton43ActionPerformed

    private void jRadioButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton44ActionPerformed
        value = "To destroy something";       
    }//GEN-LAST:event_jRadioButton44ActionPerformed

    private void jRadioButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton45ActionPerformed
        value = "To criticize someone";        
    }//GEN-LAST:event_jRadioButton45ActionPerformed

    private void jRadioButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton46ActionPerformed
        value = "To cut something into pieces";        
    }//GEN-LAST:event_jRadioButton46ActionPerformed

    private void jRadioButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton47ActionPerformed
        value = "avidly";       
    }//GEN-LAST:event_jRadioButton47ActionPerformed

    private void jRadioButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton48ActionPerformed
        value = "admiringly";        
    }//GEN-LAST:event_jRadioButton48ActionPerformed

    private void jRadioButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton49ActionPerformed
        value = "thoughtfully";       
    }//GEN-LAST:event_jRadioButton49ActionPerformed

    private void jRadioButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton50ActionPerformed
        value = "earnestly";        
    }//GEN-LAST:event_jRadioButton50ActionPerformed

    private void jRadioButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton51ActionPerformed
        value = "Salt:Pepper";        
    }//GEN-LAST:event_jRadioButton51ActionPerformed

    private void jRadioButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton52ActionPerformed
        value = "puppy:dog";       
    }//GEN-LAST:event_jRadioButton52ActionPerformed

    private void jRadioButton53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton53ActionPerformed
        value = "tyre:bicycle";       
    }//GEN-LAST:event_jRadioButton53ActionPerformed

    private void jRadioButton54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton54ActionPerformed
        value = "bike:bicycle";       
    }//GEN-LAST:event_jRadioButton54ActionPerformed

    private void jRadioButton55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton55ActionPerformed
        value = "Verbose";        
    }//GEN-LAST:event_jRadioButton55ActionPerformed

    private void jRadioButton56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton56ActionPerformed
        value = "Pompous";        
    }//GEN-LAST:event_jRadioButton56ActionPerformed

    private void jRadioButton57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton57ActionPerformed
        value = "Ornate";        
    }//GEN-LAST:event_jRadioButton57ActionPerformed

    private void jRadioButton58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton58ActionPerformed
        value = "Pedantic";      
    }//GEN-LAST:event_jRadioButton58ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            String submitQuery = "INSERT INTO submitAnswers(ans) VALUES (?)";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/regis", "root", "15*Deeps");
            pst = con.prepareStatement(submitQuery);
            pst.setString(1, value);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Your answer is subitted successfully.");
            String extractQuery = "select submitAnswers.ans, answers.sa from answers inner join (select ans from submitAnswers order by id desc limit 1) submitAnswers on submitAnswers.ans = answers.sa";
            pst = con.prepareStatement(extractQuery);
            rs = pst.executeQuery();
            if (rs.next()) {

                String valueQuery = "INSERT INTO compare(value) VALUES (?)";
                pst = con.prepareStatement(valueQuery);
                pst.setString(1, "Correct");
                pst.executeUpdate();
            } else {
                String valueQuery = "INSERT INTO compare(value) VALUES (?)";
                pst = con.prepareStatement(valueQuery);
                pst.setString(1, "Incorrect");
                pst.executeUpdate();
            }
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            String submitQuery = "INSERT INTO submitAnswers(ans) VALUES (?)";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/regis", "root", "15*Deeps");
            pst = con.prepareStatement(submitQuery);
            pst.setString(1, value);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Your answer is subitted successfully.");
            String extractQuery = "select submitAnswers.ans, answers.sa from answers inner join (select ans from submitAnswers order by id desc limit 1) submitAnswers on submitAnswers.ans = answers.sa";
            pst = con.prepareStatement(extractQuery);
            rs = pst.executeQuery();
            if (rs.next()) {

                String valueQuery = "INSERT INTO compare(value) VALUES (?)";
                pst = con.prepareStatement(valueQuery);
                pst.setString(1, "Correct");
                pst.executeUpdate();
            } else {
                String valueQuery = "INSERT INTO compare(value) VALUES (?)";
                pst = con.prepareStatement(valueQuery);
                pst.setString(1, "Incorrect");
                pst.executeUpdate();
            }
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            String submitQuery = "INSERT INTO submitAnswers(ans) VALUES (?)";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/regis", "root", "15*Deeps");
            pst = con.prepareStatement(submitQuery);
            pst.setString(1, value);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Your answer is subitted successfully.");
            String extractQuery = "select submitAnswers.ans, answers.sa from answers inner join (select ans from submitAnswers order by id desc limit 1) submitAnswers on submitAnswers.ans = answers.sa";
            pst = con.prepareStatement(extractQuery);
            rs = pst.executeQuery();
            if (rs.next()) {

                String valueQuery = "INSERT INTO compare(value) VALUES (?)";
                pst = con.prepareStatement(valueQuery);
                pst.setString(1, "Correct");
                pst.executeUpdate();
            } else {
                String valueQuery = "INSERT INTO compare(value) VALUES (?)";
                pst = con.prepareStatement(valueQuery);
                pst.setString(1, "Incorrect");
                pst.executeUpdate();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }       
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            String submitQuery = "INSERT INTO submitAnswers(ans) VALUES (?)";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/regis", "root", "15*Deeps");
            pst = con.prepareStatement(submitQuery);
            pst.setString(1, value);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Your answer is subitted successfully.");
            String extractQuery = "select submitAnswers.ans, answers.sa from answers inner join (select ans from submitAnswers order by id desc limit 1) submitAnswers on submitAnswers.ans = answers.sa";
            pst = con.prepareStatement(extractQuery);
            rs = pst.executeQuery();
            if (rs.next()) {

                String valueQuery = "INSERT INTO compare(value) VALUES (?)";
                pst = con.prepareStatement(valueQuery);
                pst.setString(1, "Correct");
                pst.executeUpdate();
            } else {
                String valueQuery = "INSERT INTO compare(value) VALUES (?)";
                pst = con.prepareStatement(valueQuery);
                pst.setString(1, "Incorrect");
                pst.executeUpdate();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }       
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {
            String submitQuery = "INSERT INTO submitAnswers(ans) VALUES (?)";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/regis", "root", "15*Deeps");
            pst = con.prepareStatement(submitQuery);
            pst.setString(1, value);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Your answer is subitted successfully.");
            String extractQuery = "select submitAnswers.ans, answers.sa from answers inner join (select ans from submitAnswers order by id desc limit 1) submitAnswers on submitAnswers.ans = answers.sa";
            pst = con.prepareStatement(extractQuery);
            rs = pst.executeQuery();
            if (rs.next()) {

                String valueQuery = "INSERT INTO compare(value) VALUES (?)";
                pst = con.prepareStatement(valueQuery);
                pst.setString(1, "Correct");
                pst.executeUpdate();
            } else {
                String valueQuery = "INSERT INTO compare(value) VALUES (?)";
                pst = con.prepareStatement(valueQuery);
                pst.setString(1, "Incorrect");
                pst.executeUpdate();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {
            String submitQuery = "INSERT INTO submitAnswers(ans) VALUES (?)";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/regis", "root", "15*Deeps");
            pst = con.prepareStatement(submitQuery);
            pst.setString(1, value);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Your answer is subitted successfully.");
            String extractQuery = "select submitAnswers.ans, answers.sa from answers inner join (select ans from submitAnswers order by id desc limit 1) submitAnswers on submitAnswers.ans = answers.sa";
            pst = con.prepareStatement(extractQuery);
            rs = pst.executeQuery();
            if (rs.next()) {

                String valueQuery = "INSERT INTO compare(value) VALUES (?)";
                pst = con.prepareStatement(valueQuery);
                pst.setString(1, "Correct");
                pst.executeUpdate();
            } else {
                String valueQuery = "INSERT INTO compare(value) VALUES (?)";
                pst = con.prepareStatement(valueQuery);
                pst.setString(1, "Incorrect");
                pst.executeUpdate();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }       
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        try {
            String submitQuery = "INSERT INTO submitAnswers(ans) VALUES (?)";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/regis", "root", "15*Deeps");
            pst = con.prepareStatement(submitQuery);
            pst.setString(1, value);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Your answer is subitted successfully.");
            String extractQuery = "select submitAnswers.ans, answers.sa from answers inner join (select ans from submitAnswers order by id desc limit 1) submitAnswers on submitAnswers.ans = answers.sa";
            pst = con.prepareStatement(extractQuery);
            rs = pst.executeQuery();
            if (rs.next()) {

                String valueQuery = "INSERT INTO compare(value) VALUES (?)";
                pst = con.prepareStatement(valueQuery);
                pst.setString(1, "Correct");
                pst.executeUpdate();
            } else {
                String valueQuery = "INSERT INTO compare(value) VALUES (?)";
                pst = con.prepareStatement(valueQuery);
                pst.setString(1, "Incorrect");
                pst.executeUpdate();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }       
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        try {
            String submitQuery = "INSERT INTO submitAnswers(ans) VALUES (?)";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/regis", "root", "15*Deeps");
            pst = con.prepareStatement(submitQuery);
            pst.setString(1, value);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Your answer is subitted successfully.");
            String extractQuery = "select submitAnswers.ans, answers.sa from answers inner join (select ans from submitAnswers order by id desc limit 1) submitAnswers on submitAnswers.ans = answers.sa";
            pst = con.prepareStatement(extractQuery);
            rs = pst.executeQuery();
            if (rs.next()) {

                String valueQuery = "INSERT INTO compare(value) VALUES (?)";
                pst = con.prepareStatement(valueQuery);
                pst.setString(1, "Correct");
                pst.executeUpdate();
            } else {
                String valueQuery = "INSERT INTO compare(value) VALUES (?)";
                pst = con.prepareStatement(valueQuery);
                pst.setString(1, "Incorrect");
                pst.executeUpdate();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        try {
            String submitQuery = "INSERT INTO submitAnswers(ans) VALUES (?)";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/regis", "root", "15*Deeps");
            pst = con.prepareStatement(submitQuery);
            pst.setString(1, value);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Your answer is subitted successfully.");
            String extractQuery = "select submitAnswers.ans, answers.sa from answers inner join (select ans from submitAnswers order by id desc limit 1) submitAnswers on submitAnswers.ans = answers.sa";
            pst = con.prepareStatement(extractQuery);
            rs = pst.executeQuery();
            if (rs.next()) {

                String valueQuery = "INSERT INTO compare(value) VALUES (?)";
                pst = con.prepareStatement(valueQuery);
                pst.setString(1, "Correct");
                pst.executeUpdate();
            } else {
                String valueQuery = "INSERT INTO compare(value) VALUES (?)";
                pst = con.prepareStatement(valueQuery);
                pst.setString(1, "Incorrect");
                pst.executeUpdate();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }       
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        try {
            String submitQuery = "INSERT INTO submitAnswers(ans) VALUES (?)";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/regis", "root", "15*Deeps");
            pst = con.prepareStatement(submitQuery);
            pst.setString(1, value);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Your answer is subitted successfully.");
            String extractQuery = "select submitAnswers.ans, answers.sa from answers inner join submitAnswers on submitAnswers.ans = answers.sa";
            pst = con.prepareStatement(extractQuery);
            rs = pst.executeQuery();
            if (rs.next()) {

                String valueQuery = "INSERT INTO compare(value) VALUES (?)";
                pst = con.prepareStatement(valueQuery);
                pst.setString(1, "Correct");
                pst.executeUpdate();
            } else {
                String valueQuery = "INSERT INTO compare(value) VALUES (?)";
                pst = con.prepareStatement(valueQuery);
                pst.setString(1, "Incorrect");
                pst.executeUpdate();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }       
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        try {
            String submitQuery = "INSERT INTO submitAnswers(ans) VALUES (?)";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/regis", "root", "15*Deeps");
            pst = con.prepareStatement(submitQuery);
            pst.setString(1, value);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Your answer is subitted successfully.");
            String extractQuery = "select submitAnswers.ans, answers.sa from answers inner join (select ans from submitAnswers order by id desc limit 1) submitAnswers on submitAnswers.ans = answers.sa";
            pst = con.prepareStatement(extractQuery);
            rs = pst.executeQuery();
            if (rs.next()) {

                String valueQuery = "INSERT INTO compare(value) VALUES (?)";
                pst = con.prepareStatement(valueQuery);
                pst.setString(1, "Correct");
                pst.executeUpdate();
            } else {
                String valueQuery = "INSERT INTO compare(value) VALUES (?)";
                pst = con.prepareStatement(valueQuery);
                pst.setString(1, "Incorrect");
                pst.executeUpdate();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }        
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        try {
            String submitQuery = "INSERT INTO submitAnswers(ans) VALUES (?)";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/regis", "root", "15*Deeps");
            pst = con.prepareStatement(submitQuery);
            pst.setString(1, value);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Your answer is subitted successfully.");
            String extractQuery = "select submitAnswers.ans, answers.sa from answers inner join (select ans from submitAnswers order by id desc limit 1) submitAnswers on submitAnswers.ans = answers.sa";
            pst = con.prepareStatement(extractQuery);
            rs = pst.executeQuery();
            if (rs.next()) {

                String valueQuery = "INSERT INTO compare(value) VALUES (?)";
                pst = con.prepareStatement(valueQuery);
                pst.setString(1, "Correct");
                pst.executeUpdate();
            } else {
                String valueQuery = "INSERT INTO compare(value) VALUES (?)";
                pst = con.prepareStatement(valueQuery);
                pst.setString(1, "Incorrect");
                pst.executeUpdate();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }  
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        try {
            String submitQuery = "INSERT INTO submitAnswers(ans) VALUES (?)";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/regis", "root", "15*Deeps");
            pst = con.prepareStatement(submitQuery);
            pst.setString(1, value);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Your answer is subitted successfully.");
            String extractQuery = "select submitAnswers.ans, answers.sa from answers inner join (select ans from submitAnswers order by id desc limit 1) submitAnswers on submitAnswers.ans = answers.sa";
            pst = con.prepareStatement(extractQuery);
            rs = pst.executeQuery();
            if (rs.next()) {

                String valueQuery = "INSERT INTO compare(value) VALUES (?)";
                pst = con.prepareStatement(valueQuery);
                pst.setString(1, "Correct");
                pst.executeUpdate();
            } else {
                String valueQuery = "INSERT INTO compare(value) VALUES (?)";
                pst = con.prepareStatement(valueQuery);
                pst.setString(1, "Incorrect");
                pst.executeUpdate();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }      
    }//GEN-LAST:event_jButton14ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup11;
    private javax.swing.ButtonGroup buttonGroup12;
    private javax.swing.ButtonGroup buttonGroup13;
    private javax.swing.ButtonGroup buttonGroup14;
    private javax.swing.ButtonGroup buttonGroup15;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JRadioButton jRadioButton19;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton20;
    private javax.swing.JRadioButton jRadioButton21;
    private javax.swing.JRadioButton jRadioButton22;
    private javax.swing.JRadioButton jRadioButton23;
    private javax.swing.JRadioButton jRadioButton24;
    private javax.swing.JRadioButton jRadioButton25;
    private javax.swing.JRadioButton jRadioButton26;
    private javax.swing.JRadioButton jRadioButton27;
    private javax.swing.JRadioButton jRadioButton28;
    private javax.swing.JRadioButton jRadioButton29;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton30;
    private javax.swing.JRadioButton jRadioButton31;
    private javax.swing.JRadioButton jRadioButton32;
    private javax.swing.JRadioButton jRadioButton33;
    private javax.swing.JRadioButton jRadioButton34;
    private javax.swing.JRadioButton jRadioButton35;
    private javax.swing.JRadioButton jRadioButton36;
    private javax.swing.JRadioButton jRadioButton37;
    private javax.swing.JRadioButton jRadioButton38;
    private javax.swing.JRadioButton jRadioButton39;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton40;
    private javax.swing.JRadioButton jRadioButton41;
    private javax.swing.JRadioButton jRadioButton42;
    private javax.swing.JRadioButton jRadioButton43;
    private javax.swing.JRadioButton jRadioButton44;
    private javax.swing.JRadioButton jRadioButton45;
    private javax.swing.JRadioButton jRadioButton46;
    private javax.swing.JRadioButton jRadioButton47;
    private javax.swing.JRadioButton jRadioButton48;
    private javax.swing.JRadioButton jRadioButton49;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton50;
    private javax.swing.JRadioButton jRadioButton51;
    private javax.swing.JRadioButton jRadioButton52;
    private javax.swing.JRadioButton jRadioButton53;
    private javax.swing.JRadioButton jRadioButton54;
    private javax.swing.JRadioButton jRadioButton55;
    private javax.swing.JRadioButton jRadioButton56;
    private javax.swing.JRadioButton jRadioButton57;
    private javax.swing.JRadioButton jRadioButton58;
    private javax.swing.JRadioButton jRadioButton59;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioc;
    // End of variables declaration//GEN-END:variables
}
