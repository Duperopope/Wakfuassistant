/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bkz
 */
public class bkz_0
extends bkb_0 {
    private static final Logger irg = Logger.getLogger(bkz_0.class);
    private alx_2 irh;

    @Override
    public short dsm() {
        return 33;
    }

    @Override
    public boolean dsn() {
        if (this.iqd == null || this.iqd.doP() || this.iqd.djT()) {
            irg.warn((Object)("[PvpChangeState] Player " + String.valueOf(this.iqd) + " is dead or on fight so he can't use a PvpChangeState"));
            return false;
        }
        if (this.iqd.dps() != null) {
            irg.warn((Object)("[PvpChangeState] Player " + String.valueOf(this.iqd) + " has already an occupation so he can't use an PvpChangeState"));
            return false;
        }
        return true;
    }

    @Override
    public void bIH() {
        if (this.iqd == null) {
            return;
        }
        this.iqd.a(this);
        ccj_2.pd("pvpActivationDialog");
        cAY.eHc().nP(600206L);
        this.irh = string -> {
            if (!"pvpActivationDialog".equals(string)) {
                return;
            }
            this.dsd();
            fyw_0.gqw().b(this.irh);
            this.irh = null;
        };
        fyw_0.gqw().a(this.irh);
    }

    @Override
    public boolean k(boolean bl, boolean bl2) {
        this.e((byte)3, bl2);
        return true;
    }

    @Override
    public boolean dsd() {
        this.e((byte)2, true);
        return true;
    }

    private void e(byte by, boolean bl) {
        fyw_0.gqw().tl("pvpActivationDialog");
        if (!bl) {
            return;
        }
        cmo_0 cmo_02 = new cmo_0();
        cmo_02.dw(by);
        cmo_02.cD((short)33);
        aue_0.cVJ().etu().d(cmo_02);
    }
}

