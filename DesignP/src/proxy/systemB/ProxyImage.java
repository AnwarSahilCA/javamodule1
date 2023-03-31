package proxy.systemB;

import proxy.systemA.RealImage;
import proxy.iface.image;

public class ProxyImage implements image {
	private final String filename;
	private RealImage image;

	public ProxyImage(String filename) {
		this.filename = filename;
	}

	public void showImage() {
		
		if (image == null) {
			image = new RealImage(filename);
		}
		image.showImage();
	}

}
