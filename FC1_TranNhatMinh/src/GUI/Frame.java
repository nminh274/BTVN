package GUI;

import java.io.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

public class Frame {

    public static void main(String[] args) {
        JFrame f = new JFrame(); // Create Frame
        f.setSize(750, 600);     // Set frame size
        f.setTitle("Student Management");    // Set title
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);

        // Tạo JPanel và gán làm content pane
        JPanel jp = new JPanel();
        jp.setLayout(null);      // Dùng layout tự do
        f.setContentPane(jp);    // Gán jp làm nội dung chính

        // Tạo các nút chức năng
        JButton addB = new JButton("Add");
        JButton searchB = new JButton("Search");
        JButton delB = new JButton("Delete");
        JButton disB = new JButton("Display");
        JButton expB = new JButton("Export");
        JButton[] bt = {addB, searchB, delB, disB, expB};

        for (int i = 0; i < bt.length; i++) {
            bt[i].setFocusable(true);
            bt[i].setForeground(new Color(255, 150, 160));
            bt[i].setBackground(Color.WHITE);
            bt[i].setFont(new Font("Arial", Font.BOLD, 13));
            bt[i].setBounds(10 + i * 125, 220, 120, 25);
            jp.add(bt[i]);
        }

        // Tạo các label và textfield
        JLabel[] lb = {
            new JLabel("ID: "), new JLabel("Name: "),
            new JLabel("DOB(dd/mm/yyyy)"), new JLabel("Address: "), new JLabel("Email: ")
        };
        JTextField[] tf = new JTextField[5];
        for (int i = 0; i < lb.length; i++) {
            lb[i].setBounds(10, 20 + i * 38, 150, 25);
            jp.add(lb[i]);
        }
        for (int i = 0; i < tf.length; i++) {
            tf[i] = new JTextField();
            tf[i].setBounds(170, 20 + i * 40, 200, 23);
            jp.add(tf[i]);
        }
        f.setVisible(true); // Hiển thị frame sau khi đã thêm mọi thành phần
        String[] cl = {"ID", "Name", "DOB", "Address", "Email"};
        DefaultTableModel DTM = new DefaultTableModel(cl, 0);
        JTable JT = new JTable(DTM);
        JScrollPane SP = new JScrollPane(JT);
        SP.setBounds(10, 280, 720, 250);
        jp.add(SP);
        ArrayList<Student> list = new ArrayList<>();
        //add
        addB.addActionListener(e -> {
            String ID = tf[0].getText().trim();
            String name = tf[1].getText().trim();
            String dob = tf[2].getText().trim();
            String email = tf[3].getText().trim();
            String address = tf[4].getText().trim();
            if (!ID.isEmpty() && !name.isEmpty()) {
                list.add(new Student(ID, name, dob, email, address));
                JOptionPane.showMessageDialog(f, "Added student: " + name);
            } else {
                JOptionPane.showMessageDialog(f, "ID and Name are required.");
            }
        });

        //searchID
        searchB.addActionListener(e -> {
            String ID = tf[0].getText().trim();
            for (Student s : list) {
                if (s.getID().equalsIgnoreCase(ID)) {
                    JOptionPane.showMessageDialog(f, "Found:\n" + s);
                    return;
                }
            }
            JOptionPane.showMessageDialog(f, "Student not found.");
        });
        /*searchB.addActionListener(e -> {
            String ID = tf[0].getText().trim();
            boolean found = false;
            for (Student s : list) {
                if ((s.getID().equalsIgnoreCase(ID))) {
                    JOptionPane.showMessageDialog(f, "Found:\n " + s);
                    found = true;
                    break;

                }
                if (!found) {
                    JOptionPane.showMessageDialog(f, "ID not found!");
                }
            }
        });*/
        //delete
        delB.addActionListener(e -> {
            String id = tf[0].getText().trim();
            boolean removed = list.removeIf(s -> s.getID().equalsIgnoreCase(id));
            JOptionPane.showMessageDialog(f, removed ? "Deleted student with ID: " + id : "Student not found.");
        });
        //display
        disB.addActionListener(e -> {
            DTM.setRowCount(0); // clear table
            for (Student s : list) {
                Object[] row = {s.getID(), s.getName(), s.getDob(), s.getAddress(), s.getEmail()};
                DTM.addRow(row);
            }
        });
        //export
        expB.addActionListener(e -> {
            try (PrintWriter writer = new PrintWriter(new FileWriter("students.csv"))) {
                writer.println("ID,Name,DOB,Address,Email");
                for (Student s : list) {
                    writer.printf("%s,%s,%s,%s,%s%n",
                            s.getID(), s.getName(), s.getDob(), s.getAddress(), s.getEmail());
                }
                JOptionPane.showMessageDialog(f, "Exported to students.csv");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(f, "Error exporting file.");
            }
        });
    }

}

