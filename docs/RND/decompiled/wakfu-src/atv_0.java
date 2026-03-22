/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aTv
 */
public class atv_0
extends aRY {
    private final boolean eRQ;

    public atv_0(boolean bl) {
        this.eRQ = bl;
    }

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public void bGy() {
        fse_1.gFu().f("isAdmin", this.eRQ);
        atv_0.jF("Admin property set to \"" + this.eRQ + "\"");
    }
}

