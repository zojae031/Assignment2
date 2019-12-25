package data;

import data.dao.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class ProductDAOImpl implements ProductDAO {
    private static ProductDAO INSTANCE = null;
    private static final String jdbcUrl = "jdbc:mysql://localhost/javadb?serverTimezone=UTC";
    private static Connection conn;
    private static PreparedStatement pstmt;
    private static ResultSet rs;
    private Vector<String> items = null;
    private static String sql;
    private static String jdbcDriver = "com.mysql.cj.jdbc.Driver";

    public ProductDAOImpl(){
        String ID,Password;
        Scanner scan = new Scanner(System.in);
        System.out.println("ID를 입력하세요");
        ID = scan.nextLine();
        System.out.println("PassWord를 입력하세요");
        Password = scan.nextLine();

        connectDB(ID,Password);
    }

    public ArrayList<Product> getAll() {
        sql = "select * from product";

        ArrayList<Product> datas = new ArrayList<>();
        items = new Vector<String>();
        items.add("전체");

        try {
            pstmt = conn.prepareStatement(sql);
            while (rs.next()) {
                Product p = new Product();
                p.setPrcode(rs.getInt("prcode"));
                p.setPrname(rs.getString("prname"));
                p.setPrice(rs.getInt("price"));
                p.setManufacture(rs.getString("manufacture"));
                datas.add(p);
                items.add(String.valueOf(rs.getInt("prcode")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return datas;
    }

    @Override
    public Product getProduct(int prcode) {
        sql = "select * from product where prcode = ?";
        Product p = null;
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, prcode);
            rs = pstmt.executeQuery();
            rs.next();
            p = new Product();
            p.setPrcode(rs.getInt("prcode"));
            p.setPrname(rs.getString("prname"));
            p.setPrice(rs.getInt("price"));
            p.setManufacture(rs.getString("manufacture"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return p;
    }

    @Override
    public boolean updateProduct(Product product) {
        sql = "update product set prname = ?, price = ?, manufacture = ?, where recode = ?";
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, product.getPrcode());
            pstmt.setString(2, product.getPrname());
            pstmt.setInt(3, product.getPrice());
            pstmt.setString(4, product.getManufacture());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean newProduct(Product product) {

        if(product.getPrcode() == 0){
            System.out.println("Prcode 는 0이 될 수 없습니다");
            return false;
        }
        sql = "insert into product values(?,?,?,?)";
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, product.getPrcode());
            pstmt.setString(2, product.getPrname());
            pstmt.setInt(3, product.getPrice());
            pstmt.setString(4, product.getManufacture());
            pstmt.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delProduct(int prcode) {
        sql = "delete from product where prcode = ?";
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, prcode);
            pstmt.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    private void connectDB(String ID,String Password) {
        try {
            conn = DriverManager.getConnection(jdbcUrl, ID, Password);
            System.out.println("서버와 연결이 되었습니다.");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void closeDB() {
        try {
            pstmt.close();
            rs.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ProductDAO getInstance() {
        if (INSTANCE == null)
            INSTANCE = new ProductDAOImpl();
        return INSTANCE;
    }
}
