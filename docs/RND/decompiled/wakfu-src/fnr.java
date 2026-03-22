/*
 * Decompiled with CFR 0.152.
 */
public class fnr {
    private final short sIS;
    private final float sIT;
    private final float sIU;
    private final float sIV;

    public fnr(short s, float f2, float f3, float f4) {
        this.sIS = s;
        this.sIT = f2;
        this.sIU = f3;
        this.sIV = f4;
    }

    public short geq() {
        return this.sIS;
    }

    public float coi() {
        return this.sIT;
    }

    public float getZoom() {
        return this.sIU;
    }

    public float coh() {
        return this.sIV;
    }
}

