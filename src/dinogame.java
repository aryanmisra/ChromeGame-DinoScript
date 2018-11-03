import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

public class dinogame {
    public static void main(String[] argv) throws Exception {
        Robot r = new Robot();
        int mx = 0;
        int my = 0;

        int width = 1920;
        int height = 1080;

        float timev = 0;
        timev = timev + 1;
        float timeco = (timev/10)+1;


        Rectangle area = new Rectangle(mx, my, width, height);


        while(true)
        {
            int pixelvalues[] = new int[]{(int) (width*0.245*timeco),(int) (height*0.502962963),(int) (width * 0.245*timeco),(int) (height*0.578703),(int) (width * 0.146*timeco),
                    (int) (height * 0.578703),(int) (width*0.166*timeco),(int) (height*0.502962963),(int) (width*0.24145*timeco),(int) (height*0.587963),(int) (width*0.39*timeco),
                    (int) (height*0.8333),(int) (width*0.15*timeco),(int) (height*0.58333333),(int) (width*0.19),(int) (height*0.58333333)};

            timev += 1;
            timeco = (timev / 8000 ) + 1;
            BufferedImage bufferedImage = r.createScreenCapture(area);
            int pixelcolors[] = new int[] {bufferedImage.getRGB(pixelvalues[0],pixelvalues[1]),bufferedImage.getRGB(pixelvalues[2],pixelvalues[3]),bufferedImage.getRGB(pixelvalues[4],pixelvalues[5]),
                    bufferedImage.getRGB(pixelvalues[6],pixelvalues[7]),bufferedImage.getRGB(pixelvalues[8],pixelvalues[9]),bufferedImage.getRGB(pixelvalues[10],pixelvalues[11]),
                    bufferedImage.getRGB(pixelvalues[12],pixelvalues[13]),bufferedImage.getRGB(pixelvalues[14],pixelvalues[15])};
            Color birdc = new Color(pixelcolors[0]);
            Color smolc = new Color(pixelcolors[1]);
            Color closec = new Color(pixelcolors[2]);
            Color closebirdc = new Color(pixelcolors[3]);
            Color cacc = new Color(pixelcolors[4]);
            Color timec = new Color(pixelcolors[5]);
            Color closelow = new Color(pixelcolors[6]);
            Color closelownoscale = new Color(pixelcolors[7]);
            int brightness[] = new int[] {birdc.getRed(),smolc.getRed(),closec.getRed(),closebirdc.getRed(),cacc.getRed(),closelow.getRed(),closelownoscale.getRed(),timec.getRed()};

            if (brightness[0] != brightness[7]) {
                r.keyPress(KeyEvent.VK_DOWN);
                r.delay(350);
                r.keyRelease(KeyEvent.VK_DOWN);
            }
            if (brightness[1] != brightness[7]) {
                r.keyPress(KeyEvent.VK_UP);
                r.delay(80);
                r.keyRelease(KeyEvent.VK_UP);
            }
            if (brightness[2] != brightness[7]) {
                r.keyPress(KeyEvent.VK_UP);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_UP);
            }
            if (brightness[3] != brightness[7]) {
                r.keyPress(KeyEvent.VK_DOWN);
                r.delay(350);
                r.keyRelease(KeyEvent.VK_DOWN);
            }
            if (brightness[4] != brightness[7]) {
                r.keyPress(KeyEvent.VK_UP);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_UP);
            }
            if (brightness[5] != brightness[7]) {
                r.keyPress(KeyEvent.VK_UP);
                r.delay(80);
                r.keyRelease(KeyEvent.VK_UP);
            }
            if (brightness[6] != brightness[7]) {
                r.keyPress(KeyEvent.VK_UP);
                r.delay(100);
                r.keyRelease(KeyEvent.VK_UP);
            }
        }
    }
}