/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from aJk
 */
public class ajk_0
implements aed_0 {
    protected static final Logger eak = Logger.getLogger(ajk_0.class);
    private static final ajk_0 eal = new ajk_0();
    private final aeq_0 eam = new aer_0(0.0f, 0.5f, 0.5f, 1.0f);
    private final aeq_0 ean = new aet_0(0.0f, 0.5f, 0.5f, 1.0f);

    public static ajk_0 chs() {
        return eal;
    }

    protected ajk_0() {
    }

    @Override
    public final int a(adx_0 adx_02) {
        return sm_0.bps.bfX() / 2;
    }

    @Override
    public aeq_0 bwh() {
        return this.eam;
    }

    @Override
    public aeq_0 bwi() {
        return this.ean;
    }

    @Override
    public void b(adx_0 adx_02) {
        String string = adx_02.bkI();
        adx_02.dT("AnimRail-Fin");
    }

    @Override
    public void a(adx_0 adx_02, abi_1 abi_12) {
        adx_02.a(abi_12);
    }

    @Override
    public int bwj() {
        return 560;
    }

    @Override
    public void c(adx_0 adx_02) {
    }

    @Override
    public void d(adx_0 adx_02) {
    }

    @Override
    public void e(adx_0 adx_02) {
    }

    @Override
    public void f(adx_0 adx_02) {
    }

    @Override
    public void a(adx_0 adx_02, int n, aev_0 aev_02, boolean bl, boolean bl2) {
    }

    @Override
    public void a(adx_0 adx_02, int n) {
        String string = adx_02.bkI();
        if (!string.startsWith("AnimRail")) {
            adx_02.dT("AnimRail-Debut");
        }
    }

    @Override
    public void b(adx_0 adx_02, abi_1 abi_12) {
        adx_02.a(abi_12);
    }

    @Override
    public boolean g(adx_0 adx_02) {
        return false;
    }

    @Override
    public boolean b(adx_0 adx_02, int n) {
        return false;
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

