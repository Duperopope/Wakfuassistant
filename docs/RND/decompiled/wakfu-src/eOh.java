/*
 * Decompiled with CFR 0.152.
 */
class eOh
implements eNY {
    private int ray;
    private final exf_2 raE;
    private final exf_2 raF;
    final /* synthetic */ eOg raG;

    eOh(eOg eOg2, exf_2 exf_22, exf_2 exf_23) {
        this.raG = eOg2;
        this.raE = exf_22;
        this.raF = exf_23;
    }

    @Override
    public void a(pr_0 pr_02) {
        this.raE.oq(this.ray);
        int n = pr_02.aYB() / this.raG.raD;
        int n2 = this.raG.raw > 0 ? Math.min(this.raG.raw, n) : n;
        if (this.raG.rax > Integer.MIN_VALUE) {
            n2 = Math.max(this.raG.rax, n2);
        }
        this.ray = this.raE.nt(n2);
    }

    @Override
    public void cancel() {
        this.raE.oq(this.ray);
    }

    @Override
    public void bLt() {
        this.raF.b(this);
    }

    public String toString() {
        return "AddValueListener{m_lastValue=" + this.ray + ", m_destCharac=" + String.valueOf(this.raE) + "}";
    }
}

