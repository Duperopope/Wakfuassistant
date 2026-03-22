/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from aem
 */
public class aem_0
implements aed_0 {
    protected static final Logger cmV = Logger.getLogger(aem_0.class);
    private static final aem_0 cmW = new aem_0();
    private final aeq_0 cmX = new aer_0(0.0f, 0.5f, 0.5f, 1.0f);
    private final aeq_0 cmY = new aet_0(0.0f, 0.5f, 0.5f, 1.0f);

    public static aem_0 bwq() {
        return cmW;
    }

    protected aem_0() {
    }

    @Override
    public int a(adx_0 adx_02) {
        return adx_02.bvS();
    }

    @Override
    public aeq_0 bwh() {
        return this.cmX;
    }

    @Override
    public aeq_0 bwi() {
        return this.cmY;
    }

    @Override
    public void b(adx_0 adx_02) {
        adx_02.ch(false);
        adx_02.ci(false);
        adx_02.dT(adx_02.bpT());
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
        adx_02.a(aeC.bwx());
        adx_02.dT("AnimArtefact-Nager-Debut");
    }

    @Override
    public void f(adx_0 adx_02) {
        adx_02.dT("AnimArtefact-Nager-Fin");
    }

    @Override
    public void a(adx_0 adx_02, int n, aev_0 aev_02, boolean bl, boolean bl2) {
        adx_02.ch(false);
        aen_0.a(adx_02, aev_02, bl, bl2);
    }

    @Override
    public void a(adx_0 adx_02, int n) {
        adx_02.ch(false);
        adx_02.ci(false);
        String string = adx_02.bkI();
        if (!string.startsWith("AnimMarche")) {
            adx_02.dT("AnimMarche");
        }
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
        return aea_0.cmn;
    }
}

