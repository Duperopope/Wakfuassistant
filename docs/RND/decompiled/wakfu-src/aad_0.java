/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aad
 */
public class aad_0 {
    final String bXL;

    public aad_0(String string, axb_2 axb_22, awk_1 awk_12, agb_0 agb_02) {
        this.bXL = string;
        agu_0 agu_02 = awk_12 == null ? agx_0.bze().b(string, agb_02) : agx_0.bze().a(string, awk_12, agb_02);
        agu_02.setColor(axb_22);
    }

    public aad_0(String string, float[] fArray, awk_1 awk_12, agb_0 agb_02) {
        this(string, new awx_2(fArray), awk_12, agb_02);
    }

    public aad_0(String string, axb_2 axb_22) {
        this(string, axb_22, null, agb_0.cum);
    }

    public aad_0(String string, float[] fArray) {
        this(string, fArray, null, agb_0.cum);
    }

    public final void E(int n, int n2, short s) {
        this.bqB().E(n, n2, s);
    }

    private agu_0 bqB() {
        return agx_0.bze().eH(this.bXL);
    }

    public final void bqC() {
        this.bqB().clear();
    }

    public final boolean p(acd_1 acd_12) {
        return this.F(acd_12.getX(), acd_12.getY(), acd_12.bdi());
    }

    public final boolean F(int n, int n2, short s) {
        return this.bqB().d(n, n2, s);
    }

    public final void a(String string, agb_0 agb_02) {
        awk_1 awk_12 = aad_0.eb(string);
        this.bqB().a(awk_12, agb_02);
    }

    public final void setColor(axb_2 axb_22) {
        this.bqB().setColor(axb_22);
    }

    public final void q(float[] fArray) {
        this.bqB().q(fArray);
    }

    public final void G(int n, int n2, short s) {
        this.bqB().G(n, n2, s);
    }

    public static awk_1 eb(String string) {
        String string2 = fq_0.bJ(string);
        return awm_1.bPn().b((art_1)aru_2.cVG.bIv(), (long)arn_2.fX(string2), string, false);
    }

    public final void qV(int n) {
        this.bqB().ctV = n;
    }
}

