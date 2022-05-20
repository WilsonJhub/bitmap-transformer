package bitmap.transformer;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.awt.image.*;
public class Bitmap {
    private final String input;
    private final String output;
//    private final int height;
//    private final int type;
//    private final int width;
//    BufferedImage outImage;
//    BufferedImage inImage;


    public Bitmap (String input, String output){
        this.input = input;
        this.output = output;
//        this.inImage = inImage;
//        this.width = inImage.getWidth();
//        this.height = inImage.getHeight();
//        this.type = BufferedImage.TYPE_INT_RGB;
//        this.outImage = new BufferedImage(width, height, type);
    }
        public void writeOutImage () {
            try{
                BufferedImage image = null;
                File send = new File (input);
                image = ImageIO.read(send);
                ImageIO.write(image, "bmp", new File(output));
            } catch(IOException error){
                error.printStackTrace();
                System.exit(-1);
            }
        }

    }


