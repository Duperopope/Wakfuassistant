/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fSR
 */
public class fsr_1
implements xn_0 {
    private final fes_2 veY;

    public fsr_1(fes_2 fes_22) {
        this.veY = fes_22;
    }

    @Override
    public int getScreenX() {
        return this.veY.getScreenX() - fbj_1.getInstance().getWidth() / 2;
    }

    @Override
    public int getScreenY() {
        return this.veY.getScreenY() - fbj_1.getInstance().getHeight() / 2;
    }

    @Override
    public int getWidth() {
        return this.veY.getWidth();
    }

    @Override
    public int getHeight() {
        return this.veY.getHeight();
    }
}

