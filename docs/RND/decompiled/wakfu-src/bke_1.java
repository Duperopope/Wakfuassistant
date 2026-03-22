/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntIntHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntIntHashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from bke
 */
public class bke_1
extends bkb_0 {
    private static final Logger iqh = Logger.getLogger(bke_1.class);
    private final bld_0 iqi;
    private final blc_0 iqj;

    public bke_1(bld_0 bld_02, blc_0 blc_02) {
        this.iqi = bld_02;
        this.iqj = blc_02;
    }

    @Override
    public short dsm() {
        return 17;
    }

    @Override
    public boolean dsn() {
        return this.iqd.dps() == null;
    }

    @Override
    public void bIH() {
        iqh.info((Object)"Lancement de l'occupation BROWSE_COLLECTOR");
        this.iqd.a(this);
        aue_0.cVJ().a(ble_0.itc);
    }

    @Override
    public boolean k(boolean bl, boolean bl2) {
        iqh.info((Object)"On cancel l'occupation BROWSE_COLLECTOR");
        if (bl2) {
            this.iqi.dji().a(rw_0.bkW, aue_0.cVJ().cVK());
        }
        return this.dsd();
    }

    @Override
    public boolean dsd() {
        iqh.info((Object)"On fini l'occupation BROWSE_COLLECTOR");
        if (aue_0.cVJ().c(ctq_1.ePB())) {
            aue_0.cVJ().b(ctq_1.ePB());
        }
        aue_0.cVJ().b(ble_0.itc);
        return true;
    }

    @Override
    public boolean dsj() {
        return false;
    }

    public void dW(byte[] byArray) {
        this.iqi.dT(byArray);
        if (this.iqj != null) {
            this.iqj.djm();
        }
    }

    public void a(TIntIntHashMap tIntIntHashMap, long l) {
        cmq_0 cmq_02 = new cmq_0();
        cmq_02.a(tIntIntHashMap);
        cmq_02.ny(l);
        aue_0.cVJ().etu().d(cmq_02);
    }
}

