import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.Buffer;

public class MainSettings extends JFrame {

	private JPanel panel;
	private JButton connectButton;
	private JPanel cameraField;
	private JLabel Approach;

	static BufferedImage bufferedImage;

	public MainSettings(String title) {
		super(title);

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setContentPane(panel);
		this.pack();

		cameraField = new JPanel((LayoutManager) new ImageIcon(bufferedImage));
		connectButton.addActionListener(new ActionListener() {
			/**
			 * Invoked when an action occurs.
			 *
			 * @param e the event to be processed
			 */
			@Override
			public void actionPerformed(ActionEvent e) {
				Approach.setForeground(Color.RED);
			}
		});
	}






	public static void main(String[] args) {

		File file = new File("D:\\untitled7\\src\\main\\resources\\image\\new_year.jpg");
		try {
			bufferedImage = ImageIO.read(file);
		} catch(IOException e) {
			e.printStackTrace();
		}

		JFrame jf = new MainSettings("캔위성 발사 프로그램");
		jf.setVisible(true);
	}
}
