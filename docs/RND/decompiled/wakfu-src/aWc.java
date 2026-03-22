/*
 * Decompiled with CFR 0.152.
 */
public class aWc
extends aga_2 {
    private final bhx_0 htZ;
    private final bgy hua;
    private final long hub;

    public aWc(int n, int n2, int n3, int n4, bhx_0 bhx_02, bgy bgy2) {
        super(n, n2, n3);
        this.htZ = bhx_02;
        this.hua = bgy2;
        this.hub = -1L;
        this.f(new bvl_1(this));
        this.xV(n4);
    }

    public aWc(int n, int n2, int n3, int n4, bhx_0 bhx_02, long l) {
        super(n, n2, n3);
        this.htZ = bhx_02;
        this.hua = null;
        this.hub = l;
        this.f(new bvl_1(this));
        this.xV(n4);
    }

    public bhx_0 cXa() {
        return this.htZ;
    }

    public bgy cWO() {
        return this.hua;
    }

    public long cXc() {
        return this.hub;
    }

    @Override
    public long cbk() {
        long l = super.cbk();
        if (l != -1L || this.dKk) {
            this.caT();
            this.dKk = false;
        }
        return -1L;
    }

    @Override
    public void a(afx_1 afx_12) {
        super.a(afx_12);
        if (this.htZ != null) {
            this.htZ.a((aWc)null);
        }
        if (this.hua != null && this.hua instanceof bhx_0) {
            ((bhx_0)this.hua).a((aWc)null);
        }
    }

    public void cXd() {
        if (this.cEq != null) {
            this.cEq.caG();
        }
    }
}

