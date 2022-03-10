package utils;

import java.awt.*;

public class Style {

    public static final Font LABEL_FONT = new Font("Dialog", Font.BOLD, 15);
    public static final Font LABEL_FONT_TITLE = new Font("Dialog", Font.BOLD, 13);
    public static final int BUTTON_STANDART_WIDTH = 188;
    public static final int BUTTON_STANDART_HEIGHT = 32;
    public static final Color BUTTON_STANDART_COLOR = new Color(245, 245, 245);
    public static final Color BACKGROUND_STANDART_COLOR = new Color(245, 245, 245);
    public static final Color BUTTON_STANDART_COLOR_HIGHTLIGHT = SystemColor.controlHighlight;

    public static final int MEDIUM_WIDTH = 750;
    public static final int MEDIUM_HEIGHT= 400;

    public static Style BUTTON_STYLE = new Style(BUTTON_STANDART_WIDTH,BUTTON_STANDART_HEIGHT,BUTTON_STANDART_COLOR);
    public static Style BUTTON_STYLE_HIGHTLIGHT = new Style(BUTTON_STANDART_WIDTH,BUTTON_STANDART_HEIGHT,
            BUTTON_STANDART_COLOR_HIGHTLIGHT);

    private int width;
    private int height;
    private int textSize;
    private Font font;
    private Color color;
    private Color hoverColor;
    private Color notAvailableColor;

    public Style(int width,int height,Color color) {
        this.width=width;
        this.height=height;
        this.color=color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    public Color getColor() {
        return color;
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
}
