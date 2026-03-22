/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from aeh
 */
public class aeh_0
implements aed_0 {
    protected static final Logger cmP = Logger.getLogger(aeh_0.class);
    private static final aeh_0 cmQ = new aeh_0();

    public static aeh_0 bwo() {
        return cmQ;
    }

    @Override
    public int a(adx_0 adx_02) {
        return adx_02.bvS();
    }

    @Override
    public aeq_0 bwh() {
        return aen_0.cmZ;
    }

    @Override
    public aeq_0 bwi() {
        return aen_0.cmZ;
    }

    @Override
    public void b(adx_0 adx_02) {
        boolean bl = adx_02.bvV();
        adx_02.cj(false);
        if (bl) {
            adx_02.dT("AnimArtefact-Nager-Statique");
        } else {
            adx_02.dT("AnimArtefact-Nager-Marche-Fin");
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
    public void a(adx_0 adx_02, int n, aev_0 aev_02, boolean bl, boolean bl2) {
    }

    @Override
    public void a(adx_0 adx_02, int n) {
        String string = adx_02.bkI();
        if (!string.startsWith("AnimArtefact-Nager-Marche")) {
            adx_02.dT("AnimArtefact-Nager-Marche");
        }
    }

    @Override
    public void c(adx_0 adx_02) {
    }

    @Override
    public void d(adx_0 adx_02) {
    }

    @Override
    public void e(adx_0 adx_02) {
        adx_02.cj(true);
        adx_02.dT("AnimArtefact-Nager-Debut");
    }

    @Override
    public void f(adx_0 adx_02) {
        adx_02.cj(false);
        adx_02.a(aeB.bww());
        adx_02.dT("AnimArtefact-Nager-Fin");
        ((ads_0)adx_02).a(new aei_0(this, adx_02));
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
        return aea_0.cmq;
    }
}

