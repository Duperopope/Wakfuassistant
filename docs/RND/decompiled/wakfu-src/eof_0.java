/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eOf
 */
class eof_0
implements eNY {
    private int ray;
    private final exf_2 raz;
    private final exf_2 raA;
    final /* synthetic */ eoe_0 raB;

    eof_0(eoe_0 eoe_02, exf_2 exf_22, exf_2 exf_23) {
        this.raB = eoe_02;
        this.raz = exf_22;
        this.raA = exf_23;
    }

    @Override
    public void a(pr_0 pr_02) {
        this.raz.oq(this.ray);
        int n = pr_02.aYB() * this.raB.rav / 100;
        int n2 = this.raB.raw > 0 ? Math.min(this.raB.raw, n) : n;
        if (this.raB.rax > Integer.MIN_VALUE) {
            n2 = Math.max(this.raB.rax, n2);
        }
        this.ray = this.raz.nt(n2);
    }

    @Override
    public void cancel() {
        this.raz.oq(this.ray);
    }

    @Override
    public void bLt() {
        this.raA.b(this);
    }

    public String toString() {
        return "AddValueListener{m_lastValue=" + this.ray + ", m_destCharac=" + String.valueOf(this.raz) + ", m_srcCharac=" + String.valueOf(this.raA) + "}";
    }
}

