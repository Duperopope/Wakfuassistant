/*
 * Decompiled with CFR 0.152.
 */
public class aeQ {
    private static final aeQ coe = new aeQ();
    public static final float cof = 1.0f;
    public static final float cog = 1.2f;
    private static final float coh = 2.2f;
    private static final float coi = 0.5f;
    private static final float coj = 10.0f;
    private float cok = 1.0f;
    private float col = 2.2f;

    private aeQ() {
    }

    public static aeQ bwP() {
        return coe;
    }

    public float getMinZoom() {
        return this.cok;
    }

    public float getMaxZoom() {
        return this.col;
    }

    public void setMinZoom(float f2) {
        this.cok = f2;
    }

    public void setMaxZoom(float f2) {
        this.col = f2;
    }

    public void bwQ() {
        this.cok = 1.0f;
        this.col = 2.2f;
    }

    public void bwR() {
        this.cok = 0.5f;
        this.col = 10.0f;
    }
}

