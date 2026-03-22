/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from akT
 */
public class akt_2
implements asi_2 {
    private final String cEp;
    private final afx_1 cEq;
    private final afq_2[] cEr;
    static final /* synthetic */ boolean cEs;

    public akt_2(String string, afx_1 afx_12, afq_2[] afq_2Array) {
        if (!cEs && afx_12 == null) {
            throw new AssertionError((Object)"FadeInListener avec un script null");
        }
        if (!cEs && string == null) {
            throw new AssertionError((Object)"FadeInListener avec une fonction nulle");
        }
        this.cEp = string;
        this.cEr = afq_2Array;
        this.cEq = afx_12;
    }

    @Override
    public void buf() {
        this.cEq.a(this.cEp, this.cEr, new afp_2[0]);
        asj_2.bJt().b(this);
    }

    @Override
    public void bug() {
    }

    @Override
    public void bud() {
    }

    @Override
    public void bue() {
    }

    static {
        cEs = !aks_2.class.desiredAssertionStatus();
    }
}

