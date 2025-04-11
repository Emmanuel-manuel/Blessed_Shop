/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package default_package;

import java.awt.*;

/**
 *
 * @author user
 */
public class ScreenUtils {
    public static Dimension getScaledDimension(double widthPercent, double heightPercent) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) (screenSize.getWidth() * widthPercent);
        int height = (int) (screenSize.getHeight() * heightPercent);
        return new Dimension(width, height);
    }
}
