/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from akV
 */
public class akv_2
implements asi_2 {
    private final String cEt;
    private final afx_1 cEu;
    private final afq_2[] cEv;
    static final /* synthetic */ boolean cEw;

    public akv_2(String string, afx_1 afx_12, afq_2[] afq_2Array) {
        if (!cEw && afx_12 == null) {
            throw new AssertionError((Object)"FadeOutListener avec un script null");
        }
        if (!cEw && string == null) {
            throw new AssertionError((Object)"FadeOutListener avec une fonction nulle");
        }
        this.cEt = string;
        this.cEv = afq_2Array;
        this.cEu = afx_12;
    }

    @Override
    public void buf() {
    }

    @Override
    public void bug() {
        this.cEu.a(this.cEt, this.cEv, new afp_2[0]);
        asj_2.bJt().b(this);
    }

    @Override
    public void bud() {
    }

    @Override
    public void bue() {
    }

    static {
        cEw = !aku_2.class.desiredAssertionStatus();
    }
}

