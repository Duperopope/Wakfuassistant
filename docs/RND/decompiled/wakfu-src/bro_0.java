/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 */
import gnu.trove.set.hash.TIntHashSet;

/*
 * Renamed from bro
 */
public class bro_0
implements bru_0 {
    private static final TIntHashSet jcy = new TIntHashSet(new int[]{10, 35, 36});
    public static final aox_1 jcz = new brw_0(new brv_0("filtr\u00e9", new aou_1("Id du type de message d'erreur")));
    private final int jcA;

    public bro_0(int n) {
        this.jcA = n;
    }

    public static boolean Fk(int n) {
        return jcy.contains(n);
    }

    @Override
    public String[] dEy() {
        return new String[]{String.valueOf(this.jcA)};
    }

    @Override
    public aox_1 bEt() {
        return jcz;
    }

    @Override
    public int d() {
        return brx_0.jdU.d();
    }
}

