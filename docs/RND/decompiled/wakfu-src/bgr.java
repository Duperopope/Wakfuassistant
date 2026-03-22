/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class bgr
extends eIu
implements bld_0 {
    private static final Logger iaj = Logger.getLogger(bgr.class);
    private final fdl iak;
    private final blh_0 ial;

    public bgr(eIy eIy2) {
        super(eIy2);
        int n = eIy2.dNx().clU();
        this.iak = (fdl)fda_0.rWI.a(fdv_0.rZb, n);
        this.ial = new blh_0(this.iak);
    }

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        switch (rw_02) {
            case bkV: {
                try {
                    bke_1 bke_12 = new bke_1(this, new bgs(this));
                    if (!bke_12.dsn()) {
                        iaj.error((Object)"[IE] Impossible de d\u00e9marrer le browsing");
                        return false;
                    }
                    bke_12.bIH();
                    this.c(rw_02);
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    iaj.error((Object)"[IE] Impossible de d\u00e9marrer le browsing", (Throwable)unsupportedOperationException);
                    return false;
                }
                return true;
            }
            case bkW: {
                aue_0.cVJ().b(ble_0.itc);
                this.c(rw_02);
                aue_0.cVJ().cVK().dnY();
                return true;
            }
        }
        iaj.error((Object)("Action non trait\u00e9e sur une Collector : " + String.valueOf(rw_02)));
        return false;
    }

    @Override
    public rw_0 bdZ() {
        return rw_0.bkV;
    }

    @Override
    public fdl djh() {
        return this.iak;
    }

    @Override
    public bCA dji() {
        return (bCA)((Object)this.qwA);
    }

    @Override
    public eJy djj() {
        return this.ial;
    }

    @Override
    public int djk() {
        throw new UnsupportedOperationException("Aucune serialisation dans le client");
    }

    @Override
    public byte[] djl() {
        throw new UnsupportedOperationException("Aucune serialisation dans le client");
    }

    @Override
    public void dT(byte[] byArray) {
        this.ial.cg(byArray);
    }

    @Override
    public rw_0[] bea() {
        return new rw_0[]{rw_0.bkV, rw_0.bkW};
    }

    public cpm_1[] chR() {
        fqy_0 fqy_02 = fqz_0.giz().YY(this.iak.clf());
        cqf_1 cqf_12 = (cqf_1)cps_1.niQ.eLI();
        cqf_12.CV(fqy_02.giv());
        cqf_12.qb("desc.mru." + fqy_02.giw());
        return new cpm_1[]{cqf_12};
    }

    @Override
    public void bt(short s) {
        super.bt(s);
    }

    @Override
    public void c(rw_0 rw_02) {
        ((rx_0)((Object)this.qwA)).c(rw_02);
    }

    public String toString() {
        return "ChaosInteractiveElementHandler{m_collectorParam=" + String.valueOf(this.iak) + ", m_collectorInventory=" + String.valueOf(this.ial) + "}";
    }
}

