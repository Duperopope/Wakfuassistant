/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bkv
 */
public class bkv_1
extends bkb_0 {
    private static final Logger iqZ = Logger.getLogger(bkv_1.class);
    private final bvv_0 ira = new bvv_0();
    private final crk_2 irb;

    public bkv_1(crk_2 crk_22) {
        this.irb = crk_22;
    }

    public bvv_0 dsz() {
        return this.ira;
    }

    @Override
    public short dsm() {
        return 25;
    }

    @Override
    public boolean dsn() {
        bkb_0 bkb_02 = this.iqd.dps();
        if (bkb_02 != null && bkb_02 != this) {
            return false;
        }
        bzq_2 bzq_22 = bzp_2.eqt().mA(this.iqd.aqZ());
        if (!bzq_22.dYb()) {
            return false;
        }
        long l = this.iqd.dpI().Ya();
        return l > 0L;
    }

    @Override
    public void bIH() {
        iqZ.info((Object)"[HAVEN_WORLD] Lancement de l'occupation");
        this.iqd.a(this);
        aue_0.cVJ().a(this.irb);
    }

    @Override
    public boolean k(boolean bl, boolean bl2) {
        iqZ.info((Object)"[HAVEN_WORLD] On cancel l'occupation");
        if (bl2) {
            cmo_0 cmo_02 = new cmo_0();
            cmo_02.dw((byte)3);
            cmo_02.cD(this.dsm());
            aue_0.cVJ().etu().d(cmo_02);
        }
        if (aue_0.cVJ().c(this.irb)) {
            aue_0.cVJ().b(this.irb);
        }
        cdb.lQg.a((bkv_1)null);
        return true;
    }

    @Override
    public boolean dsd() {
        iqZ.info((Object)"[HAVEN_WORLD] On fini l'occupation");
        if (aue_0.cVJ().c(this.irb)) {
            aue_0.cVJ().b(this.irb);
        }
        cmo_0 cmo_02 = new cmo_0();
        cmo_02.dw((byte)2);
        cmo_02.cD(this.dsm());
        aue_0.cVJ().etu().d(cmo_02);
        cdb.lQg.a((bkv_1)null);
        return true;
    }

    @Override
    public boolean dsj() {
        return false;
    }

    public crk_2 dsA() {
        return this.irb;
    }
}

