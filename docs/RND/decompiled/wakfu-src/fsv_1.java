/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fSV
 */
public class fsv_1 {
    private final awg_1 vfc;
    private final int vfd;
    private final int vfe;

    public fsv_1(awg_1 awg_12, int n, int n2) {
        this.vfc = awg_12;
        this.vfd = n;
        this.vfe = n2;
    }

    public awg_1 getPixmap() {
        return this.vfc;
    }

    public int getX() {
        return this.vfd;
    }

    public int getY() {
        return this.vfe;
    }

    public int getWidth() {
        return this.vfc.getWidth();
    }

    public int getHeight() {
        return this.vfc.getHeight();
    }
}

