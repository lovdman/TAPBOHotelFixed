package myinterface;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public interface ClearCheckOut {


  static void ClearCheckoutField(
      JTextField custName_fld,
      JTextField custNum_fld,
      JTextField checkInDate_fld,
      JTextField pricePerDay_fld,
      JTextField dayStay_fld,
      JTextField totalAmount_fld,
      JTextField email_fld,
      JComboBox<String> roomNum_fld,
      JTable table) {
    System.out.println("ClearCheckoutField funtion called");
    custName_fld.setText(null);
    custNum_fld.setText(null);
    checkInDate_fld.setText(null);
    pricePerDay_fld.setText(null);
    dayStay_fld.setText(null);
    totalAmount_fld.setText(null);
    email_fld.setText(null);
    roomNum_fld.setSelectedIndex(-1);

    table.setModel(
        new DefaultTableModel(
            new Object[][] {},
            new String[] {
              "Name",
              "Mobile Number",
              "Nationality",
              "Gender",
              "Email",
              "Address",
              "Check In Data",
              "Room Number",
              "Bed",
              "Room Type",
              "Price Per Day"
            }));
    System.out.println("ClearCheckoutField funtion executed successfully");
  }
}
