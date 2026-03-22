/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Ints
 */
import com.google.common.primitives.Ints;
import java.util.List;

public class flK
extends flv_0<fmK> {
    static final flz sFX = new flz(new aop_1("Nothing", new aou_1[0]), new aop_1("Team filter", new aoz_1("Team id (0 : attackers, 1 : defenders)", amz_1.cJy)));
    public static final flL sFY = new flL();
    private int sFZ;

    flK(long l, int n, int n2, boolean bl, Iterable<flw> iterable) {
        super(l, n, n2, bl, iterable);
    }

    @Override
    public void bk(List<amx_1> list) {
        if (list.size() >= 1) {
            amu_1 amu_12 = (amu_1)list.get(0);
            long l = amu_12.d(null, null, null, null);
            this.sFZ = Ints.saturatedCast((long)l);
        } else {
            this.sFZ = -1;
        }
    }

    @Override
    public flA gdh() {
        return flA.sFz;
    }

    @Override
    public boolean a(fmK fmK2) {
        if (this.sFZ < 0) {
            return true;
        }
        return this.sFZ == fmK2.gdu();
    }
}

