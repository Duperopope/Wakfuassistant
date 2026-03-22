/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cRn
 */
public class crn_1
extends cpm_1 {
    private int asK;
    private int ciZ;

    @Override
    public cps_1 eLz() {
        return cps_1.njc;
    }

    @Override
    public void run() {
        cje_0 cje_02 = new cje_0();
        cje_02.lT(this.asK);
        aue_0.cVJ().etu().d(cje_02);
    }

    @Override
    public boolean bxO() {
        return true;
    }

    @Override
    public String ely() {
        return "";
    }

    @Override
    public cpm_1 eLD() {
        return new crn_1();
    }

    public void lT(int n) {
        this.asK = n;
    }

    @Override
    protected int eLB() {
        return this.ciZ;
    }

    public void CV(int n) {
        this.ciZ = n;
    }
}

