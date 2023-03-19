import javax.swing.*;

public class frame extends JFrame {

    frame(){
        // adding the panel to the frame
        this.add(new panel());
        // naming the frame window
        this.setTitle("SnakeGame");
        // for uniform game window size
        this.setResizable(false);
        // to make it visible to user
        this.setVisible(true);
        // sizes the frame so that all its contents are at or above their preferred sizes
        this.pack();
    }
}
