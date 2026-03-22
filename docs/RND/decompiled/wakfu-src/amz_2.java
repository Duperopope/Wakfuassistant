/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from amz
 */
public class amz_2
extends ang_2 {
    public static final amz_2 cIw = new amz_2(true);
    public static final amz_2 cIx = new amz_2(false);
    private final boolean cIy;

    @Override
    public boolean bDp() {
        return true;
    }

    public amz_2(boolean bl) {
        this.cIy = bl;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if (this.cIy) {
            return 0;
        }
        return -1;
    }

    @Override
    public Enum bDq() {
        return amg_2.cIE;
    }

    public String toString() {
        return "Bool(" + this.cIy + ")";
    }
}

