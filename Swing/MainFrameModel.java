import javax.swing.JFrame;

public class MainFrameModel extends JFrame{
    private String frameTitle;
    private int[] frameSize = new int[2];

    MainFrameModel(String frameTitle, int frameSize1, int frameSize2){
        this.frameTitle = frameTitle;
        this.frameSize[0] = frameSize1;
        this.frameSize[1] = frameSize2;
    }

    public JFrame createFrame(){
        JFrame frame = new JFrame();
        frame.setTitle(this.frameTitle);
        frame.setSize(this.frameSize[0], this.frameSize[1]);
        frame.setVisible(true);
        return frame;
    }
}
