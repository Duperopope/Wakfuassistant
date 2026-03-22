/*
 * Decompiled with CFR 0.152.
 */
public final class cjA
extends nv_0 {
    private final long lWC;
    private final String lWD;

    public cjA(long l, String string) {
        this.lWC = l;
        this.lWD = string;
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1();
        azg_12.gK(this.lWC);
        byte[] byArray = BH.aP(this.lWD);
        azg_12.aF((byte)byArray.length);
        azg_12.dH(byArray);
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 12358;
    }

    @Override
    public String toString() {
        return "RenameCompanionRequestMessage{m_companionId=" + this.lWC + ", m_name='" + this.lWD + "'}";
    }
}

