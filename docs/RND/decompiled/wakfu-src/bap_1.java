/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bAp
 */
public class bap_1
extends bCA {
    static final Logger jET = Logger.getLogger(bap_1.class);
    private bas_0 jEU;

    @Override
    public cpm_1[] dNh() {
        cqw_1 cqw_12 = (cqw_1)cps_1.niR.eLI();
        cqw_12.CV(crc_2.nmp.nnW);
        cqw_12.setName("desc.mru.openResourcesCollector");
        cqw_12.e(rw_0.bkV);
        cpm_1[] cpm_1Array = new cpm_1[]{cqw_12};
        return cpm_1Array;
    }

    @Override
    public void aVI() {
        super.aVI();
        this.ac((short)1);
        this.bf(true);
        this.bi(true);
    }

    @Override
    public void b(acd_1 acd_12) {
        super.b(acd_12);
        this.beu().add(acd_12);
    }

    @Override
    public boolean h(acd_1 acd_12) {
        return acd_12.ac(this.aZw());
    }

    @Override
    public void c(ng_1 ng_12) {
        jET.info((Object)("[ON VIEW UPDATED] " + String.valueOf(ng_12)));
    }

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        jET.info((Object)("Action performed on interactive element : " + rw_02.toString()));
        this.b(rw_02);
        if (rw_02 == rw_0.bkV) {
            this.jEU = new bas_0(this);
            aue_0.cVJ().a(this.jEU);
            this.c(rw_02);
        }
        if (rw_02 == rw_0.bkW) {
            if (aue_0.cVJ().c(this.jEU)) {
                aue_0.cVJ().b(this.jEU);
            }
            this.c(rw_02);
            aue_0.cVJ().cVK().dnY();
        }
        return false;
    }

    @Override
    public rw_0 dNn() {
        return rw_0.bkV;
    }

    @Override
    public rw_0[] dNf() {
        return new rw_0[]{rw_0.bkV, rw_0.bkW};
    }

    @Override
    public byte bcN() {
        return 0;
    }

    public bas_0 dPj() {
        return this.jEU;
    }

    static /* synthetic */ void a(bap_1 bap_12, ayv_2 ayv_22) {
        bap_12.a(ayv_22);
    }
}

