package myclasses;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Payment extends JFrame implements ActionListener {

  final JLabel payment_lbl;
  final JButton next_btn;
  final ButtonGroup GpaySpay_grp;
  final JRadioButton Gpay_btn;
  final JRadioButton bkash_btn;

  public Payment() {
    System.out.println("Currently in Payment class");
    this.setResizable(false);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setBounds(100, 100, 903, 554);
    this.setLocationRelativeTo(null);
    this.setResizable(false);
    ImageIcon img = new ImageIcon("./images/PaymentPage.png");
    Image i = img.getImage();
    Image new_img = i.getScaledInstance(854, 480, Image.SCALE_SMOOTH);
    img = new ImageIcon(new_img);
    payment_lbl = new JLabel("", img, JLabel.CENTER);
    payment_lbl.setBounds(0, 0, 889, 517);
    getContentPane().setLayout(null);

    Gpay_btn = new JRadioButton("");
    Gpay_btn.setBounds(201, 315, 30, 20);
    Gpay_btn.setBackground(Color.WHITE);
    Gpay_btn.setFont(new Font("Arial", Font.BOLD, 33));
    getContentPane().add(Gpay_btn);
    bkash_btn = new JRadioButton("");
    bkash_btn.setBounds(602, 315, 30, 20);
    bkash_btn.setFont(new Font("Arial", Font.BOLD, 33));
    bkash_btn.setBackground(Color.WHITE);
    getContentPane().add(bkash_btn);

    GpaySpay_grp = new ButtonGroup();
    GpaySpay_grp.add(Gpay_btn);
    GpaySpay_grp.add(bkash_btn);

    next_btn = new JButton("Next");
    next_btn.setFont(new Font("Abadi", Font.BOLD, 15));
    next_btn.setBackground(Color.BLACK);
    next_btn.setForeground(Color.white);
    next_btn.setBounds(620, 390, 80, 25);
    next_btn.addActionListener(this);
    getContentPane().add(next_btn);
    getContentPane().add(payment_lbl);

    setVisible(true);
  }

  public void actionPerformed(ActionEvent ae) {

    if (ae.getSource() == next_btn) {
      if (bkash_btn.isSelected()) {
        new AdaPayment();
        setVisible(false);
        System.out.println("Exited from Payment class");
      } else if (Gpay_btn.isSelected()) {
        new ShopeePayment();
        setVisible(false);
        System.out.println("Exited from Payment class");
      } else {
        JOptionPane.showMessageDialog(
            null,
            "You forgot to select your payment method.",
            "Warning!",
            JOptionPane.WARNING_MESSAGE);
      }
    }
  }
}
