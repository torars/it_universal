import javax.swing.JFrame;
import javax.swing.JLabel;

public class CreateFrameModel extends MainFrameModel{
    CreateFrameModel(String frameTitle, int frameSize1, int frameSize2){
        super(frameTitle, frameSize1, frameSize2);
    }

    public void startFrame1(){
        JFrame frame = super.createFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void labelview(){
        JLabel label = new JLabel();
        label.setText("Dor do you even code?");
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.CENTER);

        JFrame frame = super.createFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.add(label);
    }
}
