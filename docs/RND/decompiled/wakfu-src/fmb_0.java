/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TLongHashSet
 */
import gnu.trove.set.hash.TLongHashSet;
import java.util.List;

/*
 * Renamed from fmB
 */
public class fmb_0
extends flv_0<fmX> {
    static final flz sGQ = new flz(new aop_1("Default", new aoz_1("Ids des Elements interactifs", amz_1.cJA)));
    public static final fmm_0<fmb_0> sGR = new fmc_0();
    private final TLongHashSet sGS = new TLongHashSet();

    fmb_0(long l, int n, int n2, boolean bl, Iterable<flw> iterable) {
        super(l, n, n2, bl, iterable);
    }

    @Override
    public void bk(List<amx_1> list) {
        amq_2 amq_22 = (amq_2)list.get(0);
        this.sGS.addAll(amq_22.f(null, null, null, null).toArray());
    }

    @Override
    public flA gdh() {
        return flA.sEZ;
    }

    @Override
    public boolean a(fmX fmX2) {
        return this.sGS.contains(fmX2.evy());
    }
}

