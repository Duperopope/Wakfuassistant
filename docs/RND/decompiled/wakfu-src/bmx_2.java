/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bmX
 */
public class bmx_2
extends bmq_1 {
    private int iFm;

    public bmx_2(int n, int n2, int n3, int n4, int n5, boolean bl, ejj_0 ejj_02, boolean bl2, int n6, float f2) {
        super(n, n2, n4, n5, bl, ejj_02, bl2, n6, f2);
        this.iFm = n3;
    }

    @Override
    public String czo() {
        return aum_0.cWf().a(12, (long)this.iFm, new Object[0]);
    }

    @Override
    public String dwd() {
        return aum_0.cWf().b(12, (long)this.iFm, new Object[0]);
    }

    @Override
    public int ccu() {
        return this.iFm;
    }

    @Override
    public void Ee(int n) {
        this.iFm = n;
    }

    @Override
    public bmr_2 dwe() {
        return bmr_2.iBj;
    }
}

