package View;

import javax.swing.*;
import java.awt.*;

public class AppMain extends JPanel {
    private JPanel labelPanel, inputPanel, btnPanel; // p1, p2, p3
    private JComboBox cb;
    private JLabel messageLabel; // ml
    private JLabel lb1, lb2, lb3, lb4;
    private JTextArea listPrintTextArea, inputTextArea;
    private JTextField tf1, tf2, tf3;
    private JButton bt1, bt2, bt3;
    public AppMain(){
        startUI();
    }

    private void startUI(){
        setPreferredSize(new Dimension(800,300));
        setLayout(new BorderLayout());

        // messageLabel
        messageLabel = new JLabel();
        add(messageLabel, BorderLayout.PAGE_START);
        messageLabel.setText("안녕하세요"); // ToDo : 메세지 부분


        setLabelPanel(); //p1
        setInputPanel(); //p2
        setBtnPanel();

    }

    private void setLabelPanel() {  // p1
        labelPanel = new JPanel();
        //labelPanel.setPreferredSize(new Dimension(100,250));
        labelPanel.setLayout(new GridLayout(4,1));

        lb1 = new JLabel("관리번호");
        lb2 = new JLabel("상품명");
        lb3 = new JLabel("단가");
        lb4 = new JLabel("제조사");

        labelPanel.add(lb1);
        labelPanel.add(lb2);
        labelPanel.add(lb3);
        labelPanel.add(lb4);
        labelPanel.setBorder(BorderFactory.createEmptyBorder(30,0,30,30));
        add(labelPanel, BorderLayout.WEST);

    }

    private void setInputPanel() {
        inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(4,1));
        inputPanel.setPreferredSize(new Dimension(100,490));
        cb = new JComboBox();

        tf1 = new JTextField(10);
        tf2 = new JTextField(10);
        tf3 = new JTextField(10);

        inputPanel.add(cb);


        inputPanel.add(tf1);
        inputPanel.add(tf2);
        inputPanel.add(tf3);
        inputPanel.setBorder(BorderFactory.createEmptyBorder(30,0,30,0));
        add(inputPanel, BorderLayout.CENTER);

    }

    private void setBtnPanel() {
        btnPanel = new JPanel();
        btnPanel.setLayout(new FlowLayout());

        bt1 = new JButton("등록");
        bt2 = new JButton("조회");
        bt3 = new JButton("삭제");


        btnPanel.add(bt1);
        btnPanel.add(bt2);
        btnPanel.add(bt3);

        add(btnPanel,BorderLayout.PAGE_END);
    }

    protected void actionPerformed(){

    }

    protected void refreshData(){

    }
    protected void clearField(){

    }


}
