import java.net.MalformedURLException;
import java.net.URL;

public class CameraViewer {


	URL cameraURL;

	public CameraViewer() {


	try {
		cameraURL = new URL("resources/video/2023-04-07 19-05-08.mp4"); //임시 viedo
	}
	catch(MalformedURLException e) {
		e.printStackTrace();
	}
	}

	public CameraViewer(String url) {

		try {
			cameraURL = new URL(url);

		} catch(MalformedURLException e) {
			e.printStackTrace();
		}


	}
}
