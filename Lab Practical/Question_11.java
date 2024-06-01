import java.awt.*;
import java.awt.event.*;

public class Question_11 extends Frame {
    private Label label;
    private TextField textField;
    private Button button;

    public Question_11() {
        // Set frame properties
        setTitle("AWT Example");
        setSize(400, 200);
        setLayout(new FlowLayout());
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        // Create components
        label = new Label("Enter text:");
        textField = new TextField(20);
        button = new Button("Submit");

        // Add components to the frame
        add(label);
        add(textField);
        add(button);

        // Add action listener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                showDialog("You entered: " + text);
            }
        });

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
        dialog.setSize(300, 150);
        dialog.setVisible(true);
    }

    public static void main(String[] args) {
        new Question_11();
    }
}
