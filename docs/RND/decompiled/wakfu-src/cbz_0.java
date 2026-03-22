/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cBZ
 */
public class cbz_0
implements cbs_0 {
    @Override
    public ub_0 bjn() {
        return boh_1.ehH().ehM().bjn();
    }

    @Override
    public float blu() {
        bof_1 bof_12 = boh_1.ehH().ehM().ehG();
        return bof_12 == null ? 0.0f : bof_12.blu();
    }

    @Override
    public float eJc() {
        return boa_2.ehn().ehr();
    }

    @Override
    public float eJa() {
        if (!ue_0.bjV().bjY()) {
            return -1.0f;
        }
        float f2 = ue_0.bjV().bjX() / 2.0f;
        return (f2 + (float)(ue_0.bjV().bjr() ? 0 : 50)) / 100.0f;
    }

    @Override
    public int eJb() {
        adc_0 adc_02 = bzl_2.eqr().eqs();
        if (adc_02 != null) {
            return adc_02.ciw;
        }
        return -1;
    }

    @Override
    public int eJd() {
        return bgg_0.dlO().dlP();
    }

    @Override
    public int eJe() {
        float f2 = bzp_2.eqt().mA((long)((long)((short)((int)wa_0.bhh())))).lEG;
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        return bgt_02 != null ? (int)(bgt_02.getAltitude() - f2) : 0;
    }
}

