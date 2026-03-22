/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class bxD
extends bxA {
    static final Logger jBu = Logger.getLogger(bxD.class);
    chj_2 jBv;
    private int jBw;
    boolean jBx;
    uw_0 jBy;
    uw_0 jBz;
    private final fi_1 jBA = new bxE(this, 15);
    Runnable jBB;

    @Override
    protected fi_1 bey() {
        return this.jBA;
    }

    @Override
    public void aVH() {
        super.aVH();
        this.jBv = null;
        this.jBy = null;
        this.jBz = null;
        if (this.jBB != null) {
            abg_2.bUP().h(this.jBB);
            this.jBB = null;
        }
    }

    @Override
    public void aVI() {
        super.aVI();
        this.jBw = 0;
        this.jBx = false;
        assert (this.jBv == null);
        assert (this.jBy == null);
        assert (this.jBz == null);
        assert (this.jBB == null);
    }

    protected void dNG() {
        String string = "interactiveBubbleDialog" + xd_0.bnv().bnw();
        this.jBv = (chj_2)fyw_0.gqw().a(string, ccj_2.pe("interactiveBubbleDialog2"), 256L);
        frp_1 frp_12 = new frp_1();
        frp_12.aVI();
        frp_12.setAlign(fzw_0.tLg);
        this.jBv.d(frp_12);
        this.jBv.setVisible(false);
        this.jBv.setForcedDisplaySpark(false);
        this.jBv.setUseTargetPositionning(false);
        this.jBv.a(fzq_0.tJU, (fis_1)new bxF(this, string), false);
        this.jBB = new bxG(this);
        abg_2.bUP().b(this.jBB, 1000L);
        this.jBv.eKG();
    }

    @Override
    public String getName() {
        return aum_0.cWf().c("ie.boatBoard.small." + this.aXv, new Object[0]);
    }

    String dNH() {
        String string;
        String string2;
        ux_0 ux_02 = ue_0.bjV().bjc();
        uz_0 uz_02 = ux_02.l(this.jBy);
        uz_0 uz_03 = ux_02.l(this.jBz);
        String string3 = aum_0.cWf().c("boatBoard.nextArrival", this.H(this.jBy), this.n(uz_02));
        String string4 = aum_0.cWf().c("boatBoard.nextDeparture", this.H(this.jBz), this.n(uz_03));
        String string5 = aum_0.cWf().c(this.jBx ? "boatBoard.boatDocked" : "boatBoard.boatLeaved", new Object[0]);
        if (this.jBx) {
            string2 = string4;
            string = string3;
        } else {
            string2 = string3;
            string = string4;
        }
        return aum_0.cWf().c("ie.boatBoard.large." + this.aXv, this.H(ux_02), string5, string2, string);
    }

    private String n(ua_0 ua_02) {
        StringBuilder stringBuilder = new StringBuilder("");
        if (ua_02.bjE() != 0) {
            stringBuilder.append(ua_02.bjE()).append("H");
        }
        if (ua_02.bjF() != 0) {
            stringBuilder.append(ua_02.bjF()).append("m");
        }
        return stringBuilder.append(ua_02.bjH()).append("s").toString();
    }

    private String H(ux_0 ux_02) {
        StringBuilder stringBuilder = new StringBuilder("");
        if (ux_02.bjE() != 0) {
            stringBuilder.append(ux_02.bjE()).append("H");
        }
        if (ux_02.bjF() != 0) {
            stringBuilder.append(ux_02.bjF()).append("m");
        }
        return stringBuilder.append(ux_02.bjH()).append("s").toString();
    }

    public int dNI() {
        return this.jBw;
    }

    @Override
    public void dNq() {
        super.dNq();
        String[] stringArray = this.baB.split(";");
        this.jBw = Integer.valueOf(stringArray[1]);
    }

    public void o(ua_0 ua_02) {
        this.jBy.a(ua_02);
    }

    public void p(ua_0 ua_02) {
        this.jBz.a(ua_02);
    }

    public ux_0 dNJ() {
        return this.jBy;
    }

    public ux_0 dNK() {
        return this.jBz;
    }

    public void hq(boolean bl) {
        this.jBx = bl;
    }

    @Override
    public boolean dNL() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        return evg_1.osQ.a(new eve_2[]{bgt_02});
    }

    static /* synthetic */ void a(bxD bxD2, ayv_2 ayv_22) {
        bxD2.a(ayv_22);
    }
}

