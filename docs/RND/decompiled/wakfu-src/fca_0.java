/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fca
 */
public class fca_0
extends fbz_0 {
    public static final int rTc = 250000;
    public static final float rTd = 1.05f;
    private final int rTe;

    public fca_0(int n) {
        super((short)-1, -1, (short)-1);
        this.rTe = n;
    }

    @Override
    public int cmP() {
        return this.rTe;
    }
}

