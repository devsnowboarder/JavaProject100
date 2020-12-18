import javax.swing.*;

public class SimpleFrame {
    JFrame frame;

    SimpleFrame() {
        frame = new JFrame("Welcome to HubberSpot frame");
        frame.setSize(200, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new SimpleFrame();
    }
}