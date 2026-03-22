/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eOo
 */
class eoo_0
implements pu_0 {
    int raV = 0;
    int raW = 0;
    int raX = 0;
    qu_0 bgF;

    eoo_0() {
    }

    @Override
    public void a(pr_0 pr_02) {
        int n = pr_02.aYD();
        int n2 = pr_02.aYB();
        int n3 = n - this.raV;
        int n4 = n2 - this.raW;
        this.raX += n3;
        this.raV = n;
        this.raW = n2;
        pr_0 pr_03 = this.bgF.b(exx_2.rGk);
        pr_03.op(pr_03.aYB() + n4);
        pr_03.ot(pr_03.aYE() + n3);
    }
}

