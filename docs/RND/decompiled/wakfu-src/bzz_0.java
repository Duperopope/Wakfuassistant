/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bzZ
 */
public class bzz_0
extends bCA {
    static final Logger jEF = Logger.getLogger(bzz_0.class);

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        switch (rw_02) {
            case bkV: {
                this.b(rw_02);
                bkf_1 bkf_12 = new bkf_1(this);
                if (!bkf_12.dsn()) {
                    jEF.error((Object)"[STORAGE_BOX] Impossible de d\u00e9marrer le browsing");
                    return false;
                }
                bkf_12.bIH();
                this.c(rw_02);
                aue_0.cVJ().a(cvm_1.eTF());
                return true;
            }
            case bkW: {
                this.b(rw_02);
                if (aue_0.cVJ().c(cvm_1.eTF())) {
                    aue_0.cVJ().b(cvm_1.eTF());
                }
                this.c(rw_02);
                aue_0.cVJ().cVK().dnY();
                return true;
            }
        }
        jEF.error((Object)("Impossible d'effectuer l'action " + String.valueOf(rw_02)), (Throwable)new IllegalArgumentException());
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
    public void aVI() {
        super.aVI();
        this.bf(true);
        this.bi(true);
        this.ht(true);
        this.hu(true);
    }

    @Override
    public void aVH() {
        super.aVH();
        this.bf(false);
        this.bi(false);
        this.ht(false);
        this.hu(false);
    }

    @Override
    public cpm_1[] dNh() {
        cqa_2 cqa_22 = (cqa_2)cps_1.njq.eLI();
        cqa_22.CV(crc_2.nmA.nnW);
        return new cpm_1[]{cqa_22};
    }

    @Override
    public String getName() {
        return aum_0.cWf().c("guild.storageBox", new Object[0]);
    }

    @Override
    public void c(ng_1 ng_12) {
    }

    @Override
    public boolean dNL() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        return evg_1.osP.a(new eve_2[]{bgt_02});
    }

    static /* synthetic */ void a(bzz_0 bzz_02, ayv_2 ayv_22) {
        bzz_02.a(ayv_22);
    }
}

