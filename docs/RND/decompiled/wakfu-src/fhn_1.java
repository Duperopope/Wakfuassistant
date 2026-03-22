/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.EnumMap;

/*
 * Renamed from fHn
 */
public class fhn_1 {
    private static final fhn_1 uwE = new fhn_1();
    private final EnumMap<fzo_0, fsl_1> uwF = new EnumMap(fzo_0.class);
    private fzo_0 uwG;
    private boolean uwH = false;

    private fhn_1() {
    }

    public static fhn_1 gzT() {
        return uwE;
    }

    public fzo_0 gzU() {
        return this.uwG;
    }

    public void a(fzo_0 fzo_02, boolean bl) {
        fsl_1 fsl_12;
        if ((!this.uwH || bl) && this.uwG != fzo_02 && (fsl_12 = this.uwF.get((Object)fzo_02)) != null) {
            this.gzV();
            fsl_12.cDD();
            this.uwG = fzo_02;
        }
        if (bl) {
            this.uwH = true;
        }
    }

    public void bYz() {
        this.uwH = false;
        if (this.uwG == fzo_0.tHq) {
            return;
        }
        this.gzV();
        this.uwG = fzo_0.tHq;
        this.uwF.get((Object)this.uwG).cDD();
    }

    private void gzV() {
        fsl_1 fsl_12 = this.uwF.get((Object)this.uwG);
        if (fsl_12 != null) {
            fsl_12.eKH();
        }
    }

    public void a(fzo_0 fzo_02) {
        this.a(fzo_02, false);
    }

    public void a(fzo_0 fzo_02, int n, int n2, BufferedImage bufferedImage) {
        if (fzo_02 == null || bufferedImage == null) {
            return;
        }
        if (!this.gzW()) {
            return;
        }
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getBestCursorSize(bufferedImage.getWidth(), bufferedImage.getHeight());
        float f2 = (float)dimension.width / (float)bufferedImage.getWidth();
        float f3 = (float)dimension.height / (float)bufferedImage.getHeight();
        n = (int)((float)n * f2);
        n2 = (int)((float)n2 * f3);
        this.uwF.put(fzo_02, new ftg_1(toolkit.createCustomCursor(bufferedImage, new Point(n, n2), null)));
        if (fzo_02 == fzo_0.tHq) {
            this.a(fzo_02);
        }
    }

    public void a(fzo_0 fzo_02, int n, int n2, int n3, ArrayList<BufferedImage> arrayList) {
        if (arrayList == null) {
            return;
        }
        if (!this.gzW()) {
            return;
        }
        int n4 = arrayList.size();
        if (fzo_02 == null || n4 == 0) {
            return;
        }
        if (n4 == 1) {
            this.a(fzo_02, n, n2, arrayList.get(0));
            return;
        }
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        BufferedImage bufferedImage = arrayList.get(0);
        Dimension dimension = toolkit.getBestCursorSize(bufferedImage.getWidth(), bufferedImage.getHeight());
        float f2 = (float)dimension.width / (float)bufferedImage.getWidth();
        float f3 = (float)dimension.height / (float)bufferedImage.getHeight();
        n = (int)((float)n * f2);
        n2 = (int)((float)n2 * f3);
        Cursor[] cursorArray = new Cursor[n4];
        for (int i = 0; i < n4; ++i) {
            cursorArray[i] = toolkit.createCustomCursor(arrayList.get(i), new Point(n, n2), null);
        }
        this.uwF.put(fzo_02, new fsj_1(cursorArray, n3));
        if (fzo_02 == fzo_0.tHq) {
            this.a(fzo_02);
        }
    }

    private boolean gzW() {
        return !GraphicsEnvironment.isHeadless();
    }
}

