/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bmQ
 */
public class bmq_2
extends bmq_1 {
    private int iEA;
    private final int iEB;

    public bmq_2(int n, int n2, int n3, int n4, int n5, int n6, boolean bl, boolean bl2, int n7, float f2) {
        super(n, n2, n5, n6, bl, ejj_0.qyJ, bl2, n7, f2);
        this.iEA = n4;
        this.iEB = n3;
    }

    @Override
    public String czo() {
        return aum_0.cWf().a(38, (long)this.iEB, new Object[0]);
    }

    @Override
    public String dwd() {
        return aum_0.cWf().b(38, (long)this.iEB, new Object[0]);
    }

    @Override
    public int ccu() {
        return this.iEA;
    }

    @Override
    public void Ee(int n) {
        this.iEA = n;
    }

    @Override
    public bmr_2 dwe() {
        return bmr_2.iBk;
    }
}

