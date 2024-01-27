import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class View extends JFrame{
    private JTable marks;
    private JPanel mar;
    private DefaultTableModel tableModel;

    public View(){
        setVisible(true);
        setSize(600,600);
        setLocation(600,100);
        setContentPane(mar);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        creatable();
    }
    private void creatable(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/oop","root","1234");
            String sql = "SELECT * FROM student";
            PreparedStatement pr= connection.prepareStatement(sql);
            ResultSet rs = pr.executeQuery();
            tableModel = new DefaultTableModel();
            marks.setModel(tableModel);

            tableModel.setColumnIdentifiers(new String[]{"Student ID", "Student Name", "Theory", "Practical", "CA", "Total", "Average"});
            while (rs.next()) {
                int theory = rs.getInt("th");
                int practical = rs.getInt("pr");
                int ca = rs.getInt("ca");
                int total = theory + practical + ca;
                int average = total / 3;
                Object[] row = {
                        rs.getInt("Id"),
                        rs.getString("name"),
                        theory,
                        practical,
                        ca,
                        total,
                        average
                };
                tableModel.addRow(row);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
