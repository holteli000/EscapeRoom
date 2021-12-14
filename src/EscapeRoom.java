import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class EscapeRoom {
    public static void main(String[] args) {


        JFrame window = new JFrame("Escape room");
        JPanel panel = new JPanel();
        JButton door = new JButton("Door");
        JButton dresser = new JButton("dresser");


        window.setSize(350, 100);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        //add button listeners
        door.addActionListener(new door());

        dresser.addActionListener(new door.dresser());




        panel.add(door);
        panel.add(dresser);


        window.add(panel);
        window.setVisible(true);



    }

private static class door implements ActionListener {

    public void actionPerformed(ActionEvent actionEvent) {


        JFrame window = new JFrame("door");
        JPanel panel = new JPanel();
        JButton keyhole = new JButton("keyhole");

        window.setSize(350, 100);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        panel.add(keyhole);

        window.add(panel);
        window.setVisible(true);


    }

    public static class dresser implements ActionListener {

        public void actionPerformed(ActionEvent actionEvent) {
            JFrame window = new JFrame("dresser");
            JPanel panel = new JPanel();
            JButton key = new JButton("key");


            window.setSize(350, 100);
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setLocationRelativeTo(null);


            panel.add(key);

            window.add(panel);
            window.setVisible(true);


           }
        }








      }
   }







/*  1. figure out escape room idea
    2. put together simple gui for now
    3. associate buttons with escape room
    4. use if statements for a condition
 */
