/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bkT
 */
public final class bkt_0
extends eyj_0 {
    private final pf_1 isi;
    private final bhJ isj;

    public bkt_0(pf_1 pf_12, bhJ bhJ2) {
        this.isi = pf_12;
        this.isj = bhJ2;
        this.isi.DM().a(this);
    }

    @Override
    public void zl() {
        throw new UnsupportedOperationException("Client can not send this part");
    }

    @Override
    public void zm() {
        tv_1 tv_12 = this.isi.Sn.aaE;
        if (tv_12 == null) {
            return;
        }
        this.isj.dkp();
        bjh_1.V(this.isj);
        this.isj.CW(tv_12.aaF);
        this.isj.gg(tv_12.aaG);
        this.isj.CY(tv_12.aaH);
        this.isj.z(tv_12.aaK);
        this.isj.CZ(tv_12.aaI);
        this.isj.bz(tv_12.aaJ);
        bjh_1.W(this.isj);
        this.isj.dkq();
    }
}

