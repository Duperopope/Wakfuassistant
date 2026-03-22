/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fDe
 */
public class fde_1
extends fes_2 {
    public static final String TAG = "spacer";

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public boolean isAppearanceCompatible(fys_0 fys_02) {
        return true;
    }

    @Override
    public void aVI() {
        super.aVI();
        fys_0 fys_02 = fys_0.checkOut();
        fys_02.setWidget(this);
        this.d(fys_02);
    }
}

