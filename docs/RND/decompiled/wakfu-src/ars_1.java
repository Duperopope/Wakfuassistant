/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

/*
 * Renamed from ars
 */
class ars_1
extends arw_1<BufferedImage> {
    ars_1(String string, Color color, BufferedImage bufferedImage) {
        super(string, color, bufferedImage);
    }

    @Override
    public void a(JPanel jPanel) {
        BufferedImage bufferedImage = (BufferedImage)this.att;
        Graphics graphics = jPanel.getGraphics();
        graphics.setColor(Color.GRAY);
        graphics.fillRect(0, 0, jPanel.getWidth(), jPanel.getHeight());
        graphics.setColor(Color.BLACK);
        if (bufferedImage == null) {
            return;
        }
        graphics.drawRect(0, 0, bufferedImage.getWidth() + 2, bufferedImage.getHeight() + 2);
        graphics.drawImage(bufferedImage, 1, 1 + bufferedImage.getHeight(), bufferedImage.getWidth(), -bufferedImage.getHeight(), null);
    }
}

