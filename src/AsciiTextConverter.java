import java.awt.*;
import java.awt.image.BufferedImage;

public class AsciiTextConverter {

    String textSource;

    public AsciiTextConverter(String textSource) {
        this.textSource = textSource;
    }

    public void displayAsciiArt() {
        BufferedImage bufferedImage = new BufferedImage(100, 50, BufferedImage.TYPE_INT_RGB);
        Graphics graphics = bufferedImage.getGraphics();
        Graphics2D graphics2D = (Graphics2D) graphics;
        setGraphics(graphics2D);
        createAscii(bufferedImage);
    }

    private void createAscii(BufferedImage bufferedImage) {
        for (int y = 0; y < 50; y++) {
            StringBuilder stringBuilder = new StringBuilder();


            for (int x = 0; x < 100; x++) {
                stringBuilder.append(bufferedImage.getRGB(x, y) == -16777216 ? " " : "*");
            }

            if (stringBuilder.toString().trim().isEmpty()) {
                continue;
            }
            System.out.println(stringBuilder);
        }
    }

    private void setGraphics(Graphics2D graphics2D) {
        graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        graphics2D.drawString(this.textSource, 16, 17);
        graphics2D.drawOval(10, 1, 80, 23);
    }
}

