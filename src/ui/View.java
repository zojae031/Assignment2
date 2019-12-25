package ui;

import java.awt.event.ActionListener;

public interface View {
    void attachActionListener(ActionListener lister);

    void setMessage(String text);

    int getProductPrice();

    String getManufacturer();

    String getProductName();

    int getComboBoxIndex();
}
