import java.awt.*;
import java.awt.event.*;

public class Question_12 extends Frame {
    private Button button;

    public Question_12() {
        // Set frame properties
        setTitle("Button Click Example");
        setSize(300, 200);
        setLayout(new FlowLayout());
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        // Create a button
        button = new Button("Click Me");

        // Add action listener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showDialog("Button was clicked!");
            }
        });

        // Add button to the frame
        add(button);

        // Make the frame visible
        setVisible(true);
    }

    private void showDialog(String message) {
        Dialog dialog = new Dialog(this, "Message", true);
        dialog.setLayout(new FlowLayout());
        Label messageLabel = new Label(message);
        Button okButton = new Button("OK");
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dialog.setVisible(false);
                dialog.dispose();
            }
        });
        dialog.add(messageLabel);
        dialog.add(okButton);
        dialog.setSize(250, 150);
        dialog.setVisible(true);
    }

    public static void main(String[] args) {
        new Question_12();
    }
}
