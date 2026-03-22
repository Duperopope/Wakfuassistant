/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bzO
 */
public class bzo_0
extends bCA {
    protected static final Logger jEv = Logger.getLogger(bzo_0.class);
    int ciZ;
    int jBV;
    int jBW;
    private final fi_1 jEw = new bzP(this, 22);

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        jEv.info((Object)("Action performed on interactive element : " + rw_02.toString()));
        this.c(rw_02);
        this.b(rw_02);
        return true;
    }

    @Override
    public rw_0 dNn() {
        return rw_0.blf;
    }

    @Override
    public rw_0[] dNf() {
        return new rw_0[]{rw_0.blf};
    }

    @Override
    public cpm_1[] dNh() {
        if (this.jBW == -1) {
            return cpm_1.nip;
        }
        cpm_1[] cpm_1Array = new cpm_1[1];
        cqw_1 cqw_12 = (cqw_1)cps_1.niR.eLI();
        cqw_12.CV(this.jBW);
        cqw_12.setName("ie.scenario.mru." + this.jBV);
        cqw_12.e(rw_0.blf);
        cpm_1Array[0] = cqw_12;
        return cpm_1Array;
    }

    @Override
    public short chU() {
        return (short)((float)this.bcN() * 10.0f);
    }

    @Override
    public void aVI() {
        super.aVI();
        this.bf(true);
        this.bi(true);
        this.ht(true);
        this.ciZ = 0;
        this.jBV = -1;
        this.jBW = -1;
    }

    @Override
    protected fi_1 bey() {
        return this.jEw;
    }

    @Override
    public String getName() {
        return aum_0.cWf().c("ie.scenario.name." + this.jBV, new Object[0]);
    }

    void aPg() {
        if (this.ciZ != -1) {
            if (this.aVG().isEmpty()) {
                bCu bCu2 = new bCu();
                ng_1 ng_12 = (ng_1)bCu2.baw();
                ng_12.nT(1);
                ng_12.nU(0);
                ng_12.B((byte)4);
                this.a(ng_12);
            }
            for (ng_1 ng_12 : this.aVG()) {
                if (!(ng_12 instanceof bcs_0)) continue;
                ng_12.nU(this.ciZ);
            }
        }
    }

    @Override
    public void dNq() {
        super.dNq();
        String[] stringArray = this.baB.split(";");
        if (stringArray.length != 1 && stringArray.length != 2) {
            jEv.error((Object)"[LevelDesign] Un \u00e9l\u00e9ment de sc\u00e9nario g\u00e9n\u00e9rique doit avoir 1 ou 2 param\u00e8tres : id dans le translator et id du gfx du MRU (-1 si cet \u00e9l\u00e9ment ne doit pas avoir de MRU");
            return;
        }
        this.jBV = Integer.valueOf(stringArray[0].trim());
        this.a(abi_1.dzm);
    }

    @Override
    public void aVS() {
        super.aVS();
    }

    @Override
    public void c(ng_1 ng_12) {
    }

    @Override
    public abi_1 bcB() {
        return abi_1.dzm;
    }

    @Override
    public boolean dNL() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        return evg_1.osQ.a(new eve_2[]{bgt_02});
    }

    static /* synthetic */ acd_1 a(bzo_0 bzo_02) {
        return bzo_02.bmd;
    }

    static /* synthetic */ void a(bzo_0 bzo_02, ayv_2 ayv_22) {
        bzo_02.a(ayv_22);
    }
}

