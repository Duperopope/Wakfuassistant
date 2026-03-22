/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fTe
 */
public class fte_1
implements ftd_1 {
    public int vfr;
    public int vfs;
    public int brs;
    public int brt;
    public fhs_2 veU;

    @Override
    public int getDisplayX() {
        return this.vfr;
    }

    @Override
    public int getDisplayY() {
        return this.vfs;
    }

    @Override
    public int getWidth() {
        return this.brs;
    }

    @Override
    public int getHeight() {
        return this.brt;
    }

    @Override
    public fhs_2 getElementMap() {
        return this.veU;
    }

    public void ace(int n) {
        this.vfr = n;
    }

    public void acf(int n) {
        this.vfs = n;
    }

    public void setWidth(int n) {
        this.brs = n;
    }

    public void setHeight(int n) {
        this.brt = n;
    }

    public void l(fhs_2 fhs_22) {
        this.veU = fhs_22;
    }
}

