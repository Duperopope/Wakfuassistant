/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JComponent;
import javax.swing.border.EmptyBorder;

/*
 * Renamed from ahI
 */
public class ahi_0
extends JComponent {
    private Image cyl;

    public ahi_0() {
        this(null);
    }

    public ahi_0(Image image) {
        this.setBorder(new EmptyBorder(0, 0, 0, 0));
        this.setOpaque(true);
        this.setDoubleBuffered(true);
        this.cyl = image;
    }

    public void a(Image image) {
        this.cyl = image;
        this.repaint();
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        if (this.cyl == null) {
            return;
        }
        graphics.drawImage(this.cyl, 0, 0, this.getWidth(), this.getHeight(), null);
    }

    @Override
    protected void paintBorder(Graphics graphics) {
    }
}

