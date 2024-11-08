package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_Redbull extends SuperObject {
	
	public OBJ_Redbull() {
		name = "Redbull";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/redbull.png"));
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		collision = true;
	
	}
}


