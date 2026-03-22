/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ckP
 */
public class ckp_0
extends nv_0 {
    private final long lYB;
    private final String lYC;

    public ckp_0(String string, ezb ezb2) {
        this.lYC = string;
        this.lYB = ezb2.Sn();
    }

    @Override
    public byte[] aVX() {
        String string = aum_0.cWf().c("bestRankName", new Object[0]);
        String string2 = aum_0.cWf().c("worstRankName", new Object[0]);
        byte[] byArray = BH.aP(this.lYC);
        byte[] byArray2 = BH.aP(string);
        byte[] byArray3 = BH.aP(string2);
        azg_1 azg_12 = new azg_1();
        azg_12.gK(this.lYB);
        azg_12.vC(byArray.length);
        azg_12.dH(byArray);
        azg_12.vC(byArray2.length);
        azg_12.dH(byArray2);
        azg_12.vC(byArray3.length);
        azg_12.dH(byArray3);
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 12238;
    }

    @Override
    public String toString() {
        return "CreateGuildRequestMessage{m_blazon=" + this.lYB + ", m_name='" + this.lYC + "'}";
    }
}

