/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bJf
 */
class bjf_0
implements Runnable {
    private final anp_2 kkt;
    private final bdf_1 kku;

    bjf_0(anp_2 anp_22, bdf_1 bdf_12) {
        this.kkt = anp_22;
        this.kku = bdf_12;
    }

    @Override
    public void run() {
        this.kku.a(this.kkt, false);
    }

    public String toString() {
        return "PetPathRunnable{m_petPath=" + String.valueOf(this.kkt) + "}";
    }
}

