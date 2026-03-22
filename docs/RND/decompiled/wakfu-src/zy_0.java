/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.util.texture.TextureCoords
 */
import com.jogamp.opengl.util.texture.TextureCoords;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/*
 * Renamed from ZY
 */
public final class zy_0 {
    public static final zy_0 bXr = new zy_0();
    private boolean bXs;
    JFrame bXt;
    private float aPY;
    private float aPZ;
    private aco_1 bXu;
    private aco_1 bXv;
    private acr_1 bXw;
    private awk_1 bXx;
    private TextureCoords bXy;
    private int bXz;
    private int bXA;
    private boolean bXB;
    private BufferedImage bXC;
    private final ArrayList<acr_1[]> bXD = new ArrayList();
    private final ArrayList<aaa> bXE = new ArrayList();

    private zy_0() {
    }

    public void aPg() {
        SwingUtilities.invokeLater(new zz_0(this));
        this.bXs = true;
    }

    public void a(float f2, float f3, aco_1 aco_12, aco_1 aco_13, acr_1 acr_12) {
        this.aPY = f2;
        this.aPZ = f3;
        this.bXu = aco_12;
        this.bXv = aco_13;
        this.bXw = acr_12;
    }

    private void a(Graphics graphics, acr_1[] acr_1Array, int n, int n2) {
        graphics.drawLine((int)((float)n + acr_1Array[0].bVA()), (int)((float)n2 - acr_1Array[0].bVB()), (int)((float)n + acr_1Array[1].bVA()), (int)((float)n2 - acr_1Array[1].bVB()));
        graphics.drawLine((int)((float)n + acr_1Array[1].bVA()), (int)((float)n2 - acr_1Array[1].bVB()), (int)((float)n + acr_1Array[2].bVA()), (int)((float)n2 - acr_1Array[2].bVB()));
        graphics.drawLine((int)((float)n + acr_1Array[2].bVA()), (int)((float)n2 - acr_1Array[2].bVB()), (int)((float)n + acr_1Array[3].bVA()), (int)((float)n2 - acr_1Array[3].bVB()));
        graphics.drawLine((int)((float)n + acr_1Array[3].bVA()), (int)((float)n2 - acr_1Array[3].bVB()), (int)((float)n + acr_1Array[0].bVA()), (int)((float)n2 - acr_1Array[0].bVB()));
    }

    public void aPc() {
        if (!this.bXs) {
            return;
        }
        if (this.bXt == null) {
            return;
        }
        Container container = this.bXt.getContentPane();
        Graphics graphics = container.getGraphics();
        int n = container.getWidth() / 2;
        int n2 = container.getHeight() / 2;
        graphics.clearRect(0, 0, container.getWidth(), container.getHeight());
        graphics.setColor(Color.GRAY);
        for (acr_1[] acr_1Array : this.bXD) {
            this.a(graphics, acr_1Array, n, n2);
        }
        int n3 = (int)((float)n + this.aPY);
        int n4 = (int)((float)n2 - this.aPZ);
        for (aaa aaa2 : this.bXE) {
            aaa2.a(graphics, n3, n4);
        }
        if (this.bXC != null) {
            graphics.drawImage(this.bXC, 0, 0, null);
            if (this.bXB) {
                graphics.setColor(Color.YELLOW);
            } else {
                graphics.setColor(new Color(64, 64, 64));
            }
            graphics.drawOval(this.bXz, this.bXA, 1, 1);
        }
        if (this.bXu != null) {
            graphics.setColor(Color.RED);
            graphics.drawLine(n3, n4, (int)((float)n3 + this.bXu.aSc()), (int)((float)n4 - this.bXu.aSd()));
        }
        if (this.bXv != null) {
            graphics.setColor(Color.PINK);
            graphics.drawLine(n3, n4, (int)((float)n3 + this.bXv.aSc()), (int)((float)n4 - this.bXv.aSd()));
        }
        graphics.setColor(Color.BLUE);
        if (this.bXw != null) {
            graphics.drawLine(n3, n4, (int)((float)n3 + this.bXw.bVA()), (int)((float)n4 - this.bXw.bVB()));
        }
    }

    public void a(aaa aaa2) {
        this.bXE.add(aaa2);
    }

    public void a(acr_1[] acr_1Array) {
        this.bXD.add(acr_1Array);
    }

    public void a(awk_1 awk_12, TextureCoords textureCoords) {
        if (this.bXx == awk_12 && zy_0.a(textureCoords, this.bXy)) {
            return;
        }
        this.bXx = awk_12;
        this.bXy = textureCoords;
        axj_2 axj_22 = this.bXx.ve(0);
        int n = axj_22.getWidth();
        int n2 = axj_22.getHeight();
        this.bXC = new BufferedImage(n, n2, 2);
        awu_2 awu_22 = axj_22.bQL();
        int n3 = new Color(128, 20, 128).getRGB();
        int n4 = new Color(192, 192, 192).getRGB();
        try {
            for (int i = 0; i < n2; ++i) {
                for (int j = 0; j < n; ++j) {
                    this.bXC.setRGB(j, i, awu_22.ci(j, i) ? n3 : n4);
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private static boolean a(TextureCoords textureCoords, TextureCoords textureCoords2) {
        if (textureCoords == null || textureCoords2 == null) {
            return true;
        }
        return textureCoords.left() == textureCoords2.left() && textureCoords.bottom() == textureCoords2.bottom() && textureCoords.right() == textureCoords2.right() && textureCoords.top() == textureCoords2.left();
    }

    public void e(int n, int n2, boolean bl) {
        this.bXz = n;
        this.bXA = n2;
        this.bXB = bl;
    }

    public void clear() {
        this.bXD.clear();
        this.bXE.clear();
    }

    static {
        if (!zy_0.bXr.bXs) {
            bXr.aPg();
        }
    }
}

