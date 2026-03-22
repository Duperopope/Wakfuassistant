/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bkd
 */
public class bkd_2
extends bkb_0 {
    private static final Logger iqf = Logger.getLogger(bkd_2.class);
    private final bxd_0 iqg;

    public bkd_2(bxd_0 bxd_02) {
        this.iqg = bxd_02;
    }

    @Override
    public short dsm() {
        return 31;
    }

    @Override
    public boolean dsn() {
        if (this.iqd == null || this.iqd.doP() || this.iqd.djT()) {
            iqf.warn((Object)("[Account Chest] Player " + String.valueOf(this.iqd) + " is dead or on fight so he can't use an AccountChest"));
            return false;
        }
        if (this.iqd.dps() != null) {
            iqf.warn((Object)("[Account Chest] Player " + String.valueOf(this.iqd) + " has already an occupation so he can't use an AccountChest"));
            return false;
        }
        return !aue_0.cVJ().c(csb_1.nEA);
    }

    @Override
    public void bIH() {
        if (this.iqd == null) {
            return;
        }
        this.iqd.a(this);
        if (!aue_0.cVJ().c(csb_1.nEA)) {
            aue_0.cVJ().a(csb_1.nEA);
        }
        aue_0.cVJ().a(ccm_1.lOx);
    }

    @Override
    public boolean k(boolean bl, boolean bl2) {
        if (bl2) {
            this.iqg.a(rw_0.bkW, aue_0.cVJ().cVK());
        }
        return true;
    }

    @Override
    public boolean dsd() {
        if (aue_0.cVJ().c(csb_1.nEA)) {
            aue_0.cVJ().b(csb_1.nEA);
        }
        aue_0.cVJ().b(ccm_1.lOx);
        return true;
    }

    @Override
    public boolean dsj() {
        return false;
    }
}

