package ui;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.Vector;

public interface View {
    void attachActionListener(ActionListener lister);

    void setMessage(String text);

    JButton getBtnAddInfo();

    JButton getBtnPrint();

    JButton getBtnDelete();

    int getProductPrice();

    void setProductPrice(String text);

    String getManufacturer();

    void setManufacture(String text);

    String getProductName();

    void setProductName(String text);

    int getComboBoxIndex();


    void refreshData(Vector<String> comboBoxItems);
}
