package ui;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionListener;

public class AppMain extends JFrame implements View {

    private JPanel labelPanel, inputPanel, btnPanel; // p1, p2, p3
    private JComboBox cb;


    private JLabel lblMessage; // ml
    private JLabel lblManageNumber, lblProductName, lblPrice, lblManufacturer;
    private JTextArea listPrintArea;
    private JTextField tfProductName, tfPrice, tfManufacturer;
    private JButton btnAddInfo, btnPrint, btnDelete;
    private JPanel startPanel;

    public AppMain() {
        startPanel = new JPanel();
        startPanel.setLayout(new BorderLayout());
        startUI();
        add(startPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 300);
        setVisible(true);

    }

    private void startUI() {
        setMessageLabel(); //ml
        setLabelPanel(); //p1
        setInputPanel(); //p2
        setBtnPanel(); //p3
        setListPrintPanel();
    }

    private void setMessageLabel() {

        lblMessage = new JLabel();
        startPanel.add(lblMessage, BorderLayout.PAGE_START);
        lblMessage.setText("##메시지: 프로그램이 시작되었습니다.!!"); // TODO : 메세지 부분
    }

    private void setLabelPanel() {  // p1
        labelPanel = new JPanel();
        labelPanel.setLayout(new GridLayout(4, 1));

        lblManageNumber = new JLabel("관리번호");
        lblProductName = new JLabel("상품명");
        lblPrice = new JLabel("단가");
        lblManufacturer = new JLabel("제조사");

        labelPanel.add(lblManageNumber);
        labelPanel.add(lblProductName);
        labelPanel.add(lblPrice);
        labelPanel.add(lblManufacturer);
        labelPanel.setBorder(BorderFactory.createEmptyBorder(30, 0, 30, 30));
        startPanel.add(labelPanel, BorderLayout.WEST);

    }

    private void setInputPanel() {
        inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(4, 1));
        inputPanel.setPreferredSize(new Dimension(100, 490));
        String[] num = {"전체", "1", "2", "3"};

        cb = new JComboBox(num);

        tfProductName = new JTextField(10);
        tfPrice = new JTextField(10);
        tfManufacturer = new JTextField(10);

        inputPanel.add(cb);


        inputPanel.add(tfProductName);
        inputPanel.add(tfPrice);
        inputPanel.add(tfManufacturer);
        inputPanel.setBorder(BorderFactory.createEmptyBorder(30, 0, 30, 0));
        startPanel.add(inputPanel, BorderLayout.CENTER);

    }

    private void setBtnPanel() {
        btnPanel = new JPanel();
        btnPanel.setLayout(new FlowLayout());

        btnAddInfo = new JButton("등록");
        btnPrint = new JButton("조회");
        btnDelete = new JButton("삭제");


        btnPanel.add(btnAddInfo);
        btnPanel.add(btnPrint);
        btnPanel.add(btnDelete);

        startPanel.add(btnPanel, BorderLayout.PAGE_END);
    }

    private void setListPrintPanel() {

        Border border = BorderFactory.createLineBorder(Color.BLACK); // TODO
        listPrintArea = new JTextArea(10, 50);
        listPrintArea.setBorder(border);
        listPrintArea.append("관리번호\t상품명\t\t단가\t제조사\n");

        JScrollPane scroll = new JScrollPane(listPrintArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        scroll.setBorder(BorderFactory.createEmptyBorder(30, 20, 30, 0));
        startPanel.add(scroll, BorderLayout.EAST);

    }


    // TODO
    @Override
    public void refreshData() {
        /*listPrintArea.setText("");
        clearField();
        editmode = false; // 현재 상태가 데이터 조회 후 상태인지, 새로운 데이터를 입력하기 위한 상태인지 설정하는 변수

        listPrintArea.append("관리번호\t상품명\t\t단가\t제조사\n");
        datas = dao.getAll();

        // 데이터를 변경하면 콤보박스 데이터 갱신
        cb.setModel(new DefaultComboBoxModel(dao.getItems())); //togo

        if(datas != null) {
            for(Product p : datas){
                StringBuffer sb = new StringBuffer();
                sb.append(p.getPrcode() + "\t");
                sb.append(p.getPrname() + "\t\t");
                sb.append(p.getPrice() + "\t");
                sb.append(p.getMenufacture() + "\n");
                listPrintArea.append(sb.toString());

            }
        }

        else {
            listPrintArea.append("등록된 상품이 없습니다. !!\n상품을 등록해 주세요 !!");
        }*/
    }

    // TODO
    protected void clearField() {

    }

    //=============Getter And Setter===================
    public String getComboBoxManageItem() {
        return cb.getSelectedItem().toString();
    }

    @Override
    public String getProductName() {
        return tfProductName.getText();
    }

    @Override
    public void setProductName(String text) {

    }

    @Override
    public int getProductPrice() {
        if (!tfPrice.getText().equals("")) {
            return 0;
        } else return Integer.parseInt(tfPrice.getText());

    }

    @Override
    public void setProductPrice(String text) {

    }

    @Override
    public String getManufacturer() {
        return tfManufacturer.getText();
    }

    @Override
    public void setManufacture(String text) {

    }

    @Override
    public JButton getBtnAddInfo() {
        return btnAddInfo;
    }

    @Override
    public JButton getBtnPrint() {
        return btnPrint;
    }

    @Override
    public JButton getBtnDelete() {
        return btnDelete;
    }
    //=============Getter And Setter===================

    @Override
    public void attachActionListener(ActionListener listener) {
        btnAddInfo.addActionListener(listener);
        btnPrint.addActionListener(listener);
        btnDelete.addActionListener(listener);
    }

    @Override
    public void setMessage(String text) {
        lblMessage.setText(text);
    }

    @Override
    public int getComboBoxIndex() {
        return cb.getSelectedIndex();
    }
}
