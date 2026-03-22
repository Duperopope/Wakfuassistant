/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cHL
 */
public class chl_2
extends fys_0 {
    public static final String TAG = "InteractiveBubbleAppearance";
    private fkw_2 naF = null;

    @Override
    public void d(fhv_1 fhv_12) {
        super.d(fhv_12);
        if (fhv_12 instanceof fkw_2) {
            this.naF = (fkw_2)fhv_12;
        }
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public fkw_2 getBubbleBorder() {
        return this.naF;
    }

    @Override
    public void aVH() {
        super.aVH();
        this.naF = null;
    }
}

