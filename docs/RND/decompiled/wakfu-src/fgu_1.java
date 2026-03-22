/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fGu
 */
public class fgu_1 {
    private fgv_1 ute;
    private int bap = 0;
    private int brs = 0;

    public fgv_1 gxM() {
        return this.ute;
    }

    public void a(fgv_1 fgv_12) {
        this.ute = fgv_12;
    }

    public int getX() {
        return this.bap;
    }

    public void setX(int n) {
        this.bap = n;
    }

    public int getY() {
        if (this.ute != null) {
            return this.ute.getY();
        }
        return 0;
    }

    public int getWidth() {
        return this.brs;
    }

    public void setWidth(int n) {
        this.brs = n;
    }

    public int getHeight() {
        if (this.ute != null) {
            return this.ute.getHeight();
        }
        return 0;
    }
}

