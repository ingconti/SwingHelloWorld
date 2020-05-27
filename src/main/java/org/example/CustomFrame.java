package org.example;



import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

public class CustomFrame extends JFrame {

    public void paint(Graphics g) {
        g.drawString("Hello", 200, 50);
        int x = 30;
        int y = 100;
        int rectwidth = 50;
        int rectheight = 100;


        Color red = Color.red;
        g.setColor(red);
        x=100;

        g.drawRect(x, y, rectwidth, rectheight);
        // myDrawImage(g);
        //myDrawImagePNG(g);
        drawCards(g);
    }



    private void drawCards(Graphics g) {
        ClassLoader cl = this.getClass().getClassLoader();

        String[] cardNames = new String[]{
                "full_0000s_0000_god_and_hero_cards_0056_scylla",
        "full_0000s_0000_god_and_hero_cards_0057_Human"};


        int x = 10;
        int y = 30;
        for (String item : cardNames) {

            InputStream url = cl.getResourceAsStream(item+".png");
            BufferedImage img = null;
            try {
                img = ImageIO.read(url);
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }

            int W = img.getWidth();
            int H = img.getHeight();

            g.drawImage(img, x, y, W/2, H/2, null);
            x+=W/2+10;
        }
}


    private void myDrawImagePNG(Graphics g){
        ClassLoader cl = this.getClass().getClassLoader();
        InputStream url = cl.getResourceAsStream(   "logo-Politecnico_di_Milano.png");

                BufferedImage img= null;
        try {
            img = ImageIO.read(url);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        g.drawImage(img, 10,20, 150,150, null);
    }

    private void myDrawImage(Graphics g){

        ClassLoader cl = this.getClass().getClassLoader();
        InputStream url = cl.getResourceAsStream("Logo-pol.jpg");
        BufferedImage img= null;
        try {
            img = ImageIO.read(url);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        g.drawImage(img, 10,20, 50,50, null);

    }


}
