/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from aef
 */
public class aef_0
implements aed_0 {
    protected static final Logger cmJ = Logger.getLogger(aef_0.class);
    private static final aef_0 cmK = new aef_0();
    private final aeq_0 cmL = new aer_0(0.0f, 0.5f, 0.5f, 1.0f);
    private final aeq_0 cmM = new aet_0(0.0f, 0.5f, 0.5f, 1.0f);

    public static aef_0 bwm() {
        return cmK;
    }

    protected aef_0() {
    }

    @Override
    public final int a(adx_0 adx_02) {
        return adx_02.bvQ();
    }

    @Override
    public aeq_0 bwh() {
        return this.cmL;
    }

    @Override
    public aeq_0 bwi() {
        return this.cmM;
    }

    @Override
    public void b(adx_0 adx_02) {
        String string = adx_02.bkI();
        if (string.equals("AnimSaut-Marche") || string.equals("AnimSaut-Marche") || string.equals("AnimSaut-Marche") || string.equals("AnimSaut-Marche")) {
            adx_02.dT(adx_02.bpT());
        } else {
            adx_02.dT(adx_02.bvL());
        }
    }

    @Override
    public void a(adx_0 adx_02, abi_1 abi_12) {
    }

    @Override
    public int bwj() {
        return -1;
    }

    @Override
    public void c(adx_0 adx_02) {
        adx_02.ch(true);
        if (!adx_02.bcB().bVO()) {
            return;
        }
        adx_02.dT("AnimRelique-Saut");
    }

    @Override
    public void d(adx_0 adx_02) {
        adx_02.ci(true);
        if (!adx_02.bcB().bVO()) {
            return;
        }
        adx_02.dT("AnimArtefact-Papatte");
    }

    @Override
    public void e(adx_0 adx_02) {
        adx_02.cj(true);
        adx_02.a(aeC.bwx());
        adx_02.dT("AnimArtefact-Nager-Debut");
    }

    @Override
    public void f(adx_0 adx_02) {
        String string = adx_02.bkI();
        adx_02.dT("AnimArtefact-Nager-Fin");
    }

    @Override
    public void a(adx_0 adx_02, int n, aev_0 aev_02, boolean bl, boolean bl2) {
        adx_02.ch(false);
        adx_02.ci(false);
        adx_02.cj(false);
        String string = adx_02.bkI();
        aen_0.a(adx_02, aev_02, bl, bl2);
        adx_02.bwd();
    }

    @Override
    public void a(adx_0 adx_02, int n) {
        adx_02.ch(false);
        adx_02.ci(false);
        adx_02.cj(false);
        String string = adx_02.bkI();
        if (string.contains("AnimCourse") && string.contains("-Fin") || !string.startsWith("AnimCourse")) {
            adx_02.dT(adx_02.dZ(adx_02.bpU()) ? adx_02.bpU() : "AnimMarche");
        }
        adx_02.bwd();
    }

    @Override
    public void b(adx_0 adx_02, abi_1 abi_12) {
        if (adx_02.bvT() && abi_12.bVO()) {
            adx_02.dT("AnimRelique-Saut");
        }
        if (adx_02.bvU() && abi_12.bVO()) {
            adx_02.dT("AnimArtefact-Papatte");
        }
        adx_02.a(abi_12);
    }

    @Override
    public boolean g(adx_0 adx_02) {
        return false;
    }

    @Override
    public boolean b(adx_0 adx_02, int n) {
        return Math.abs(n) > 2;
    }

    @Override
    public boolean bwk() {
        return false;
    }

    @Override
    public aea_0 bwe() {
        return aea_0.cmo;
    }
}

