/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from adZ
 */
public class adz_0
extends aem_0 {
    String bKc;
    int cmm = sm_0.bpt.bfX();

    public void setAnimation(String string) {
        this.bKc = string;
    }

    public void rY(int n) {
        this.cmm = n;
    }

    @Override
    public int a(adx_0 adx_02) {
        return this.cmm;
    }

    @Override
    public void a(adx_0 adx_02, int n) {
        adx_02.dT(this.bKc);
    }

    @Override
    public aea_0 bwe() {
        return aea_0.cmt;
    }
}

