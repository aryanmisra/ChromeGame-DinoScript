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

        int scaledm5x;
        int scaledm5y;

        int scaled6x;
        int scaled6y;

        int scaled7x;
        int scaled7y;

        int scaled8x;
        int scaled8y;

        int lowcacx;
        int lowcacy;

        int timex;
        int timey;


        Rectangle area = new Rectangle(mx, my, width, height);


        while(1==1)
        {
            scaledm5x = (int) (width*0.245*timeco);
            scaledm5y = (int) (height*0.502962963);

            scaled6x = (int) (width * 0.245*timeco);
            scaled6y = (int) (height*0.578703);

            scaled7x = (int) (width * 0.146*timeco);
            scaled7y = (int) (height * 0.578703);

            scaled8x = (int) (width*0.136*timeco);
            scaled8y = (int) (height*0.502962963);

            lowcacx = (int) (width*0.23145*timeco);
            lowcacy = (int) (height*0.587963);

            timex = (int) (width*0.39*timeco);
            timey = (int) (height*0.8333);

            timev += 1;
            timeco = (timev / 8000 ) + 1;
            BufferedImage bufferedImage = r.createScreenCapture(area);

            int bird = bufferedImage.getRGB(scaledm5x,scaledm5y);
            Color birdc = new Color(bird);
            int birdbrightness = birdc.getRed();

            int smol = bufferedImage.getRGB(scaled6x,scaled6y);
            Color smolc = new Color(smol);
            int smolbrightness = smolc.getRed();

            int close = bufferedImage.getRGB(scaled7x,scaled7y);
            Color closec = new Color(close);
            int closebrightness = closec.getRed();

            int closebird = bufferedImage.getRGB(scaled8x,scaled8y);
            Color closebirdc = new Color(closebird);
            int closebirdbrightness = closebirdc.getRed();

            int cac = bufferedImage.getRGB(lowcacx,lowcacy);
            Color cacc = new Color(cac);
            int cacbrightness = cacc.getRed();

            int time = bufferedImage.getRGB(timex,timey);
            Color timec = new Color(time);
            int timebrightness = timec.getRed();

            if(timebrightness<160) {

                if (birdbrightness > 160) {
                    r.keyPress(KeyEvent.VK_DOWN);
                    r.delay(350);
                    r.keyRelease(KeyEvent.VK_DOWN);
                }
                if (smolbrightness > 160) {
                    r.keyPress(KeyEvent.VK_UP);
                    r.delay(90);
                    r.keyRelease(KeyEvent.VK_UP);
                }
                if (cacbrightness > 160) {
                    r.keyPress(KeyEvent.VK_UP);
                    r.delay(90);
                    r.keyRelease(KeyEvent.VK_UP);
                }
                else if (closebrightness > 160) {
                    r.keyPress(KeyEvent.VK_UP);
                    r.delay(90);
                    r.keyRelease(KeyEvent.VK_UP);
                }
                else if (closebirdbrightness > 160) {
                    r.keyPress(KeyEvent.VK_DOWN);
                    r.delay(350);
                    r.keyRelease(KeyEvent.VK_DOWN);
                }

            }
            if(timebrightness>160) {

                if (birdbrightness < 160) {
                    r.keyPress(KeyEvent.VK_DOWN);
                    r.delay(350);
                    r.keyRelease(KeyEvent.VK_DOWN);
                }
                if (smolbrightness < 160) {
                    r.keyPress(KeyEvent.VK_UP);
                    r.delay(90);
                    r.keyRelease(KeyEvent.VK_UP);
                }
                if (cacbrightness < 160) {
                    r.keyPress(KeyEvent.VK_UP);
                    r.delay(90);
                    r.keyRelease(KeyEvent.VK_UP);
                }
                else if (closebrightness < 160) {
                    r.keyPress(KeyEvent.VK_UP);
                    r.delay(90);
                    r.keyRelease(KeyEvent.VK_UP);
                }
                else if (closebirdbrightness < 160) {
                    r.keyPress(KeyEvent.VK_DOWN);
                    r.delay(350);
                    r.keyRelease(KeyEvent.VK_DOWN);
                }
            }

        }
    }
}
