package bitmap.transformer;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.awt.image.*;
import java.util.Random;

public class Bitmap {
    private final String input;
    private final String output;
    private int height;
    private int type;
    private int width;
    BufferedImage outImage;
    BufferedImage inImage;


    public Bitmap (String input, String output){
        this.input = input;
        this.output = output;
        setImage(input);

    }
    public void setImage(String input)
    {
        try {
            File x = new File(input);
            this.inImage = ImageIO.read(x);
            this.width = inImage.getWidth();
            this.height = inImage.getHeight();
            this.type = BufferedImage.TYPE_INT_RGB;
            this.outImage = new BufferedImage(width, height, type);
        }catch(IOException error){
            error.printStackTrace();
            System.exit(-1);
        }

    }
        public void writeOutImage () {
            try{
//                BufferedImage image = null;
//                File send = new File (input);
//                image = ImageIO.read(send);
                ImageIO.write(outImage, "bmp", new File(output));
            } catch(IOException error){
                error.printStackTrace();
                System.exit(-1);
            }
        }
    public void reset () {
        try{
            ImageIO.write(inImage, "bmp", new File(output));
        } catch(IOException error){
            error.printStackTrace();
            System.exit(-1);
        }
    }

    public void invert() {
        for (int i = 0; i < width; ++i) {
            for (int j = 0; j < height; ++j) {
                Color setUpColor = new Color(inImage.getRGB(i, j));
                int r = 255 - setUpColor.getRed();
                int g = 255 - setUpColor.getGreen();
                int b = 255 - setUpColor.getBlue();
                int rgb = (r + g + b)/3;
                Color newColor = new Color(rgb, rgb, rgb);
                outImage.setRGB(i,j,newColor.getRGB());
            }

        }
    }

        public void greyScale(){
            for(int i = 0; i < width; ++i) {
                for (int j = 0; j < height; ++j) {
                    Color setupColor = new Color(inImage.getRGB(i,j));
                    int r = setupColor.getRed();
                    int g = setupColor.getGreen();
                    int b = setupColor.getBlue();
                    int grey = (r + g + b)/3;
                    Color newColor = new Color(grey, grey, grey);
                    outImage.setRGB(i,j,newColor.getRGB());
                }
            }
        }

        public void randomizer()
        {
            Random random = new Random();
            for(int i = 0; i < width; ++i) {
                for (int j = 0; j < height; ++j) {
                    Color setupColor = new Color(inImage.getRGB(i,j));
                    int r = random.nextInt(0, 256);
                    int g = random.nextInt(0, 256);
                    int b = random.nextInt(0, 256);
                    Color newColor = new Color(r,g,b);
                    outImage.setRGB(i, j, newColor.getRGB());

                }
            }

        }

    }


