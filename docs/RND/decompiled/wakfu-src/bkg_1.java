/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bkg
 */
public class bkg_1
extends bkb_0 {
    private final bbl_2 iqm;

    public bkg_1(bbl_2 bbl_22) {
        this.iqm = bbl_22;
    }

    @Override
    public short dsm() {
        return 34;
    }

    @Override
    public boolean dsn() {
        return this.iqd != null && this.iqd.dps() == null;
    }

    @Override
    public void bIH() {
        if (this.iqd != null) {
            this.iqd.a(this);
        }
    }

    @Override
    public boolean k(boolean bl, boolean bl2) {
        if (bl2) {
            this.iqm.a(rw_0.bkW, aue_0.cVJ().cVK());
        }
        return this.dsd();
    }

    @Override
    public boolean dsd() {
        if (aue_0.cVJ().c(cyr_1.eXT())) {
            aue_0.cVJ().b(cyr_1.eXT());
        }
        return true;
    }

    public bbl_2 dso() {
        return this.iqm;
    }

    @Override
    public boolean dsj() {
        return false;
    }
}

