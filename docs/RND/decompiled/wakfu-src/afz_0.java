/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;

/*
 * Renamed from afz
 */
public class afz_0
extends JPanel {
    private Graphics cqC;
    private Image cqD;

    public afz_0(int n, int n2) {
        Dimension dimension = new Dimension(n, n2);
        this.setSize(dimension);
        this.setPreferredSize(dimension);
        this.setMaximumSize(dimension);
        this.setMinimumSize(dimension);
        this.bxN();
    }

    private boolean bxN() {
        this.cqD = this.createImage(this.getWidth(), this.getHeight());
        if (this.cqD == null) {
            return false;
        }
        this.cqC = this.cqD.getGraphics();
        this.cqC.clearRect(0, 0, this.getWidth(), this.getHeight());
        this.cqC.setColor(Color.GRAY);
        this.cqC.drawLine(this.getWidth() / 2, 0, this.getWidth() / 2, this.getHeight());
        return true;
    }

    @Override
    public void paint(Graphics graphics) {
        if (!this.bxN()) {
            super.paint(graphics);
        }
        graphics.drawImage(this.cqD, 0, 0, null);
    }

    @Override
    public void update(Graphics graphics) {
        this.paint(graphics);
    }
}

