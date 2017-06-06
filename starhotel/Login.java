/* 32555 Star Hotel Assessment
 *
 * Shruti Rane 12760878, Anzhao Wang 12737678, Troy Daniels 12957130
 */
package starhotel;

import javax.swing.*;
import java.awt.event.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;

public class Login {

    public static void main(String[] args) {

        // Create hotel instance
        Hotel starHotel = new Hotel("Star Hotel", "1 Drive Way, Sheffield");

        // Create a mock employee
        Employee tempEmployee = starHotel.createEmployee("Admin", 1, LocalDate.of(2017, Month.JANUARY, 1));
        starHotel.getEmployees().add(tempEmployee);

        JFrame f = new JFrame("Star Hotel Booking System");
        final JLabel label = new JLabel();
        label.setBounds(85, 200, 200, 50);

        JLabel l1 = new JLabel("Staff Name: ");
        l1.setBounds(20, 20, 80, 30);

        JButton b = new JButton("Login");
        b.setBounds(100, 120, 80, 30);
        JTextField text = new JTextField();
        text.setBounds(100, 20, 100, 30);
        f.add(l1);
        f.add(label);
        f.add(b);
        f.add(text);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
        ActionListener al;
        al = new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                for (Employee empl : starHotel.getEmployees()) {
                    if (text.getText().toLowerCase().contains(empl.getName().toLowerCase())) {
                        String data = "Logged in as " + text.getText();
                        label.setText(data);
                        l1.setText("Name:");
                        text.setText("");
                        b.setLocation(70, 190);
                        b.setSize(160, 30);
                        b.setText("Create Booking");
                        f.remove(text);
                        l1.setText("");
                        f.remove(b);
                        loginUser(empl, f);
                    } else {
                        String data = "User not found: " + text.getText();
                        label.setText(data);
                    }
                }
            }
        };
        b.addActionListener(al);
    }

    public static void loginUser(Employee e, JFrame f) {
        // Show user name
        JLabel user = new JLabel();
        String name = e.getName();
        user.setBounds(50, 20, 200, 100);
        user.setText("User name: " + name);
        f.add(user);
        // Show user ID
        JLabel userID = new JLabel();
        int ID = e.getID();
        userID.setBounds(50, 45, 200, 100);
        userID.setText("Staff ID: " + ID);
        f.add(userID);
        // Show user start date
        JLabel userStart = new JLabel();
        LocalDate start = e.getStartDate();
        userStart.setBounds(50, 70, 200, 100);
        userStart.setText("Start Date: " + start);
        f.add(userStart);
        // Show if manager
        JLabel userManager = new JLabel();
        boolean isManager = e.getIsManager();
        userManager.setBounds(50, 95, 200, 100);
        userManager.setText("Manager: " + isManager);
        f.add(userManager);

        JButton b = new JButton("Continue");
        b.setBounds(95, 180, 120, 30);
        f.add(b);
    }
}
