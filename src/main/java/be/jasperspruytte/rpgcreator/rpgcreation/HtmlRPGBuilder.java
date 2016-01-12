package be.jasperspruytte.rpgcreator.rpgcreation;

import java.awt.*;
import java.io.*;

/**
 * Created by jaspe on 12/01/2016.
 */
public class HtmlRPGBuilder implements RPGBuilder {
    public void createRPG() {
        try {
            File htmlPage = new File("start.html");
            if (!htmlPage.exists())
            {
                htmlPage.createNewFile();
            }
            BufferedWriter writer = new BufferedWriter(new FileWriter(htmlPage));
            writer.write("<html>");
            writer.write("<body>");
            writer.write("<h1>This is totally an rpg.</h1>");
            writer.write("</body>");
            writer.write("</html>");
            writer.close();
            Desktop.getDesktop().browse(htmlPage.toURI());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
