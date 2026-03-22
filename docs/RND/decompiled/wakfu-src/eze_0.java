/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from ezE
 */
public class eze_0
extends ezw {
    private static eze_0 psc;
    private static final Logger psd;
    protected final exh_1 pse = new exh_1();
    protected byte aZm;
    protected int ciZ;

    public static eze_0 fmL() {
        return psc;
    }

    public static void a(eze_0 eze_02) {
        if (psc == null) {
            psc = eze_02;
        }
    }

    public eze_0 b(short s, String string, int n, short s2, exP exP2, fqP<fqE> fqP2) {
        return new eze_0(s, string, n, s2, exP2, fqP2);
    }

    public eze_0 edU() {
        return new eze_0();
    }

    public eze_0 d(short s, RW<fqE, ym_1> rW, RU<fqE> rU, boolean bl, boolean bl2, boolean bl3) {
        return new eze_0(s, rW, rU, bl, bl2, bl3);
    }

    public eze_0() {
    }

    protected eze_0(short s, RW<fqE, ym_1> rW, RU<fqE> rU, boolean bl, boolean bl2, boolean bl3) {
    }

    protected eze_0(short s, String string, int n, short s2, exP exP2, fqP<fqE> fqP2) {
        super(s, string, n, (short)Math.min(s2, exP2.cmL()));
        this.setName(exP2.getName());
        exa_1<exf_2> exa_12 = exP2.fgM();
        for (exx_2 exx_22 : exx_2.values()) {
            if (!exa_12.g(exx_22) || !this.pse.g(exx_22)) continue;
            this.pse.e(exx_22).f(exa_12.b(exx_22));
        }
    }

    @Override
    public void a(exP exP2, exP exP3) {
        super.a(exP2, exP3);
        this.ag(exP2);
        this.ah(exP2);
        exP2.f(exe_1.rFi);
    }

    private void ag(exP exP2) {
        exP2.fgM().a(this.pse);
    }

    private void ah(exP exP2) {
    }

    @Override
    public byte aWO() {
        return this.aZm;
    }

    @Override
    public boolean a(vy_1 vy_12) {
        vy_12.clear();
        super.a(vy_12);
        vy_12.afD = new vb_2();
        vy_12.afD.afK.XQ = this.aZm;
        vy_12.afD.afK.acr = this.ciZ;
        this.pse.a(vy_12.afD.afK.aep);
        return true;
    }

    @Override
    public boolean b(vy_1 vy_12) {
        boolean bl = super.b(vy_12);
        this.aZm = vy_12.afD.afK.XQ;
        this.ciZ = vy_12.afD.afK.acr;
        this.pse.b(vy_12.afD.afK.aep);
        return bl;
    }

    static {
        psd = Logger.getLogger(eze_0.class);
    }
}

