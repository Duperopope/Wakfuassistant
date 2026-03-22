/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bCk
 */
public class bck_0
extends bCA {
    static final Logger jHf = Logger.getLogger(bck_0.class);
    private int asA;
    private String ezc = "";
    private int jHg;
    private uz_0 jHh;
    boolean bmT;
    private final fi_1 jHi = new bcl_0(this, 1);

    @Override
    public void c(ng_1 ng_12) {
    }

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        this.b(rw_02);
        if (rw_02 == rw_0.bkJ) {
            this.aVQ();
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            ffV ffV2 = bgt_02.dno().UK(this.asA);
            if (ffV2 == null) {
                aPd.e("inventory.error.lackItem", new Object[0]);
                return false;
            }
            if (this.bmT) {
                aPd.e("boat.cantTravel", new Object[0]);
                return false;
            }
            this.c(rw_02);
        }
        return true;
    }

    @Override
    protected fi_1 bey() {
        return this.jHi;
    }

    public int azv() {
        return this.asA;
    }

    @Override
    public rw_0 dNn() {
        return rw_0.bkJ;
    }

    @Override
    public rw_0[] dNf() {
        return new rw_0[]{rw_0.bkJ};
    }

    @Override
    public cpm_1[] dNh() {
        cpm_1[] cpm_1Array = new cpm_1[1];
        cqf_1 cqf_12 = (cqf_1)cps_1.niQ.eLI();
        cqf_12.CV(this.jHg);
        cpm_1Array[0] = cqf_12;
        return cpm_1Array;
    }

    @Override
    public short chU() {
        return 60;
    }

    @Override
    public String getName() {
        return aum_0.cWf().c(this.ezc, new Object[0]);
    }

    @Override
    public void dNq() {
        super.dNq();
        String[] stringArray = this.baB.split(";");
        if (stringArray.length != 9) {
            jHf.error((Object)("[LevelDesign] La controlleuse de ticket " + this.aXv + " doit avoir 3 param\u00e8tres : itemId, id translator, et id mruGfx"));
            return;
        }
        this.asA = Integer.valueOf(stringArray[0]);
        this.ezc = stringArray[1];
        this.jHg = Integer.valueOf(stringArray[2]);
        short s = Short.valueOf(stringArray[3]);
        this.jHh = new uz_0(0, Integer.valueOf(stringArray[4]), 0, 0);
        uz_0 uz_02 = new uz_0(0, Integer.valueOf(stringArray[5]), 0, 0);
        int n = Integer.valueOf(stringArray[6]);
        short s2 = Short.valueOf(stringArray[7]);
        int n2 = Integer.valueOf(stringArray[8]);
    }

    @Override
    public void aVH() {
        super.aVH();
        this.jHh = null;
    }

    @Override
    public void aVI() {
        super.aVI();
        this.bmf = 1;
        this.setVisible(true);
        this.bf(false);
        this.bi(true);
        this.jHu = true;
        this.jHv = true;
        this.asA = 0;
        this.ezc = "";
        this.jHg = 0;
        assert (this.jHh == null);
        this.bmT = false;
    }

    public ua_0 dQf() {
        return this.jHh;
    }

    public void bl(boolean bl) {
        this.bmT = bl;
    }

    static /* synthetic */ void a(bck_0 bck_02, ayv_2 ayv_22) {
        bck_02.a(ayv_22);
    }
}

