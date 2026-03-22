/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bkt
 */
public class bkt_1
extends bkb_0 {
    private static final Logger iqV = Logger.getLogger(bkt_1.class);
    private final byi iqW;

    public bkt_1(byi byi2) {
        this.iqW = byi2;
    }

    @Override
    public short dsm() {
        return 22;
    }

    @Override
    public boolean dsn() {
        bkb_0 bkb_02 = this.iqd.dps();
        return bkb_02 == null || bkb_02 == this;
    }

    @Override
    public void bIH() {
        iqV.info((Object)"[COIN_MACHINE] Lancement de l'occupation");
        this.iqd.a(this);
    }

    @Override
    public boolean k(boolean bl, boolean bl2) {
        iqV.info((Object)"[COIN_MACHINE] On cancel l'occupation");
        if (bl2) {
            this.iqW.a(rw_0.bkY, aue_0.cVJ().cVK());
        }
        return this.dsd();
    }

    @Override
    public boolean dsd() {
        iqV.info((Object)"[COIN_MACHINE] On fini l'occupation");
        return true;
    }
}

