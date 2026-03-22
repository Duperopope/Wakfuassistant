/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from eWp
 */
public class ewp_2
implements Comparator<Long> {
    private static final int rBu = 20000;
    private final ewt_2 rBv;
    private final int rBw;

    public ewp_2(ewt_2 ewt_22, int n) {
        this.rBv = ewt_22;
        this.rBw = n;
    }

    private int rf(long l) {
        return this.rBv.rh(l) + (this.rBv.ri(l) ? 20000 : 0);
    }

    private int rg(long l) {
        int n = (int)(l + (long)this.rBw + (long)this.rBv.rh(l) & 0xFFFFL);
        int n2 = n * n;
        return n2 & 0xFF ^ n2 >> 16 & 0xFF00;
    }

    public int a(Long l, Long l2) {
        int n = Integer.compare(-this.rf(l), -this.rf(l2));
        if (n != 0) {
            return n;
        }
        int n2 = Integer.compare(this.rg(l), this.rg(l2));
        if (n2 != 0) {
            return n2;
        }
        return l.compareTo(l2);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((Long)object, (Long)object2);
    }
}

