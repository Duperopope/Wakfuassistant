/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Rectangle;

/*
 * Renamed from fGD
 */
public class fgd_2 {
    private fgb_2 uuk;
    private final Rectangle uul = new Rectangle();
    private int eoH = 0;

    public fgb_2 gyY() {
        return this.uuk;
    }

    public void b(fgb_2 fgb_22) {
        this.uuk = fgb_22;
    }

    public Rectangle gxR() {
        return this.uul;
    }

    public int csn() {
        return this.eoH;
    }

    public void abs(int n) {
        this.eoH = n;
    }

    public String toString() {
        return this.getClass().getSimpleName() + " bounds=" + this.uul.toString();
    }
}

