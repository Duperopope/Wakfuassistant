/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from boa
 */
public class boa_0
implements Comparator<bny_0> {
    public static final boa_0 iMr = new boa_0();

    public int a(bny_0 bny_02, bny_0 bny_03) {
        int n = bny_02.aVf() - bny_03.aVf();
        if (n != 0) {
            return n;
        }
        return Long.compare(bny_02.aqZ(), bny_03.aqZ());
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bny_0)object, (bny_0)object2);
    }
}

