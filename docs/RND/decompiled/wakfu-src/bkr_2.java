/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bkr
 */
public final class bkr_2
extends bkb_0 {
    private static final Logger iqP = Logger.getLogger(bkr_2.class);
    private final bap_1 iqQ;

    public bkr_2(bap_1 bap_12) {
        this.iqQ = bap_12;
    }

    @Override
    public boolean dsn() {
        if (this.iqd.dps() != null && this.iqd.dps().dsm() == 32) {
            return false;
        }
        if (this.iqd.doP() || this.iqd.djT()) {
            iqP.warn((Object)("Player " + String.valueOf(this.iqd) + " is dead or on fight so he can't use an haven world resources collector"));
            return false;
        }
        return true;
    }

    @Override
    public boolean k(boolean bl, boolean bl2) {
        if (bl2) {
            this.iqQ.a(rw_0.bkW, aue_0.cVJ().cVK());
        }
        return this.dsd();
    }

    @Override
    public void bIH() {
        this.iqd.a(this);
    }

    @Override
    public boolean dsd() {
        return true;
    }

    @Override
    public short dsm() {
        return 32;
    }

    @Override
    public boolean dsj() {
        return false;
    }
}

