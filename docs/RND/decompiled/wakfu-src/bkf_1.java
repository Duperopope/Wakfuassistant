/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bkf
 */
public class bkf_1
extends bkb_0 {
    private static final Logger iqk = Logger.getLogger(bkf_1.class);
    private final bzz_0 iql;

    public bkf_1(bzz_0 bzz_02) {
        this.iql = bzz_02;
    }

    @Override
    public short dsm() {
        return 23;
    }

    @Override
    public boolean dsn() {
        bkb_0 bkb_02 = this.iqd.dps();
        return bkb_02 == null || bkb_02 == this;
    }

    @Override
    public void bIH() {
        iqk.info((Object)"[GUILD_STORAGE_BOX] Starting browse occupation");
        this.iqd.a(this);
        aue_0.cVJ().a(ccx_1.lQe);
    }

    @Override
    public boolean k(boolean bl, boolean bl2) {
        iqk.info((Object)"[GUILD_STORAGE_BOX] Cancelling browse occupation");
        if (bl2) {
            this.iql.a(rw_0.bkW, aue_0.cVJ().cVK());
        }
        if (aue_0.cVJ().c(cvm_1.eTF())) {
            aue_0.cVJ().b(cvm_1.eTF());
        }
        aue_0.cVJ().b(ccx_1.lQe);
        return true;
    }

    @Override
    public boolean dsd() {
        iqk.info((Object)"[GUILD_STORAGE_BOX] Finishing occupation");
        if (aue_0.cVJ().c(cvm_1.eTF())) {
            aue_0.cVJ().b(cvm_1.eTF());
        }
        aue_0.cVJ().b(ccx_1.lQe);
        return true;
    }

    @Override
    public boolean dsj() {
        return false;
    }

    public static fai e(kc kc2) {
        fak fak2 = fak.TL(kc2.d());
        if (fak2 == null) {
            return null;
        }
        fai fai2 = new fai(fak2);
        fai2.g(kc2);
        return fai2;
    }
}

