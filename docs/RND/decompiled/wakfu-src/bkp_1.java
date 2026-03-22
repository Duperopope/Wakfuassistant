/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bkp
 */
public final class bkp_1
extends bkb_0 {
    private static final Logger iqL = Logger.getLogger(bkp_1.class);
    private final adp_0 iqM = (ads_02, anp_22) -> this.dsd();

    @Override
    public boolean dsn() {
        if (this.iqd.dps() != null && this.iqd.dps().dsm() == 30) {
            return false;
        }
        if (this.iqd.doP() || this.iqd.djT()) {
            iqL.warn((Object)("Player " + String.valueOf(this.iqd) + " is dead of on fight so he can't use an EnchantmentMachine"));
            return false;
        }
        return true;
    }

    @Override
    public boolean k(boolean bl, boolean bl2) {
        return this.gq(bl2);
    }

    @Override
    public void bIH() {
        cui_1.eRw().km(true);
        aue_0.cVJ().cVK().ddI().a(this.iqM);
    }

    @Override
    public boolean dsd() {
        return this.gq(true);
    }

    @Override
    public boolean gq(boolean bl) {
        aue_0.cVJ().cVK().ddI().b(this.iqM);
        cui_1.eRw().km(false);
        if (cui_1.eQx()) {
            aue_0.cVJ().b(cui_1.eRw());
        }
        if (bl) {
            cmo_0 cmo_02 = new cmo_0();
            cmo_02.dw((byte)2);
            cmo_02.cD((short)30);
            aue_0.cVJ().etu().d(cmo_02);
        }
        return true;
    }

    @Override
    public short dsm() {
        return 30;
    }
}

