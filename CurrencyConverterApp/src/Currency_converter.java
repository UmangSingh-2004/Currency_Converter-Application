import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Currency_converter {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        ImageIcon logo = new ImageIcon("src/res/swapApp.PNG");
        JTextField Text = new JTextField(12);
        Text.setFont(new Font("Cambria Math", Font.BOLD, 20));
        JTextField Text1 = new JTextField(10);
        Text1.setFont(new Font("Cambria Math", Font.BOLD, 20));
        ImageIcon logo1 = new ImageIcon("src/res/swap.PNG");
        JButton swap = new JButton(logo1);
        ImageIcon logo2 = new ImageIcon("src/res/usd.PNG");
        JButton usd = new JButton(logo2);
        ImageIcon logo3 = new ImageIcon("src/res/eur.PNG");
        JButton eud = new JButton(logo3);
        ImageIcon logo4 = new ImageIcon("src/res/cny.PNG");
        JButton cny = new JButton(logo4);
        ImageIcon logo5 = new ImageIcon("src/res/pkr.PNG");
        JButton pkr = new JButton(logo5);
        ImageIcon logo6 = new ImageIcon("src/res/jpy.PNG");
        JButton jpy = new JButton(logo6);
        ImageIcon logo7 = new ImageIcon("src/res/cad.PNG");
        JButton cad = new JButton(logo7);
        ImageIcon logo8 = new ImageIcon("src/res/aed.PNG");
        JButton aed = new JButton(logo8);
        ImageIcon logo9 = new ImageIcon("src/res/aus.PNG");
        JButton aus = new JButton(logo9);
        ImageIcon logo10 = new ImageIcon("src/res/sar.PNG");
        JButton sar = new JButton(logo10);

        Text.setBounds(4, 20, 200, 50);
        swap.setBounds(206, 20, 100, 49);
        Text1.setBounds(308, 20, 200, 50);
        usd.setBounds(4, 100, 166, 50);
        eud.setBounds(170, 100, 165, 50);
        cny.setBounds(335,100, 170, 50);
        pkr.setBounds(4, 151, 166, 50);
        jpy.setBounds(170, 151, 165, 50);
        cad.setBounds(335, 151, 170, 50);
        aed.setBounds(4, 201, 166, 50);
        aus.setBounds(170, 201, 165, 50);
        sar.setBounds(335, 201, 170, 50);

        swap.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp = Text.getText();
                Text.setText(Text1.getText().replaceAll("[^0-9.]", "")+"INR");
                Text1.setText(temp);
            }
        });
        usd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double usd = 83.87;
                String intext = Text.getText();
                double money = Double.parseDouble(intext)*usd;
                Text1.setText(String.valueOf(money+" INR"));
            }
        });
        eud.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double eud = 92.20;
                String intext = Text.getText();
                double money = Double.parseDouble(intext)*eud;
                Text1.setText(String.valueOf(money+" INR"));
            }
        });
        cny.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double cny = 11.7966;
                String intext = Text.getText();
                double money = Double.parseDouble(intext)*cny;
                Text1.setText(String.valueOf(money+" INR"));
            }
        });
        pkr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double pkr = 0.3009;
                String intext = Text.getText();
                double money = Double.parseDouble(intext)*pkr;
                Text1.setText(String.valueOf(money+" INR"));
            }
        });
        jpy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double jpy = 0.5796;
                String intext = Text.getText();
                double money = Double.parseDouble(intext)*jpy;
                Text1.setText(String.valueOf(money+" INR"));
            }
        });
        cad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double cad = 62.32;
                String intext = Text.getText();
                double money = Double.parseDouble(intext)*cad;
                Text1.setText(String.valueOf(money+" INR"));
            }
        });
        aed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double aed = 57.16;
                String intext = Text.getText();
                double money = Double.parseDouble(intext)*aed;
                Text1.setText(String.valueOf(money+" INR"));
            }
        });
        aus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double aus = 4.74;
                String intext = Text.getText();
                double money = Double.parseDouble(intext)*aus;
                Text1.setText(String.valueOf(money+" INR"));
            }
        });
        sar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double sar = 22.83;
                String intext = Text.getText();
                double money = Double.parseDouble(intext)*sar;
                Text1.setText(String.valueOf(money+" INR"));
            }
        });

        f.add(Text);
        f.add(Text1);
        f.add(swap);
        f.add(usd);
        f.add(eud);
        f.add(cny);
        f.add(pkr);
        f.add(jpy);
        f.add(cad);
        f.add(aed);
        f.add(aus);
        f.add(sar);
        f.getContentPane().setBackground(Color.darkGray);
        f.setIconImage(logo.getImage());
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        f.setTitle("Currency Converter");
        f.setSize(525, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

}

