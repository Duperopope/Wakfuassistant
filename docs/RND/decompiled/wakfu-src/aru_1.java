/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

/*
 * Renamed from aru
 */
class aru_1
extends arw_1<fc_1> {
    aru_1(String string, Color color, fc_1 fc_12) {
        super(string, color, fc_12);
    }

    @Override
    public void a(JPanel jPanel) {
        short s = ((fc_1)this.att).aKo();
        BufferedImage bufferedImage = arr_1.aC(s);
        Graphics graphics = jPanel.getGraphics();
        graphics.setColor(Color.GRAY);
        graphics.fillRect(0, 0, jPanel.getWidth(), jPanel.getHeight());
        graphics.setColor(Color.BLACK);
        if (bufferedImage == null) {
            return;
        }
        int n = Math.round((float)bufferedImage.getWidth() * ((fc_1)this.att).aKq());
        int n2 = Math.round((float)bufferedImage.getHeight() * ((fc_1)this.att).aKp());
        int n3 = Math.round((float)bufferedImage.getWidth() * ((fc_1)this.att).aKs());
        int n4 = Math.round((float)bufferedImage.getHeight() * ((fc_1)this.att).aKr());
        graphics.drawRect(0, 0, ((fc_1)this.att).aKt() + 2, ((fc_1)this.att).aKu() + 2);
        graphics.drawImage(bufferedImage, 1, 1, ((fc_1)this.att).aKt() + 1, ((fc_1)this.att).aKu() + 1, n, n4, n3, n2, null);
    }
}

