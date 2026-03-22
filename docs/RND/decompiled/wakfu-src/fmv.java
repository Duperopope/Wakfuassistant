/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TLongHashSet
 */
import gnu.trove.set.hash.TLongHashSet;
import java.util.List;

public class fmv
extends flv_0<fmv_0> {
    static final flz sGI = new flz(new aop_1("Default", new aoz_1("Somme minimum", amz_1.cJy), new aoz_1("Ids des Elements interactifs", amz_1.cJA)));
    public static final fmm_0<fmv> sGJ = new fmw();
    private int sGK;
    private final TLongHashSet sGL = new TLongHashSet();

    fmv(long l, int n, int n2, boolean bl, Iterable<flw> iterable) {
        super(l, n, n2, bl, iterable);
    }

    @Override
    public void bk(List<amx_1> list) {
        amu_1 amu_12 = (amu_1)list.get(0);
        this.sGK = (int)amu_12.d(null, null, null, null);
        amq_2 amq_22 = (amq_2)list.get(1);
        this.sGL.addAll(amq_22.f(null, null, null, null).toArray());
    }

    @Override
    public flA gdh() {
        return flA.sFa;
    }

    @Override
    public boolean a(fmv_0 fmv_02) {
        return this.sGL.contains(fmv_02.evy()) && fmv_02.gdL() >= (long)this.sGK;
    }
}

