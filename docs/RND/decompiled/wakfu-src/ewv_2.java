/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;
import java.util.Objects;

/*
 * Renamed from eWv
 */
final class ewv_2
implements Comparator<exP> {
    private final int rBH;
    private final ewt_2 rBI;

    ewv_2(int n, ewt_2 ewt_22) {
        this.rBH = n;
        this.rBI = ewt_22;
    }

    public int f(exP exP2, exP exP3) {
        int n;
        if (Objects.equals(exP2, exP3)) {
            return 0;
        }
        if (this.rBI.rh(exP2.Sn()) > this.rBI.rh(exP3.Sn())) {
            return -1;
        }
        if (this.rBI.rh(exP2.Sn()) < this.rBI.rh(exP3.Sn())) {
            return 1;
        }
        int n2 = this.bI(exP2);
        if (n2 > (n = this.bI(exP3))) {
            return -1;
        }
        if (n2 < n) {
            return 1;
        }
        int n3 = Integer.compare(this.rg(exP2.Sn()), this.rg(exP3.Sn()));
        if (n3 != 0) {
            return n3;
        }
        return Long.compare(exP2.Sn(), exP3.Sn());
    }

    private int bI(exP exP2) {
        short s = exP2.dnE();
        return s > 0 ? s : exP2.dnG();
    }

    private int rg(long l) {
        int n = (int)(l + (long)this.rBH + (long)this.rBI.rh(l) & 0xFFFFL);
        int n2 = n * n;
        return n2 & 0xFF ^ n2 >> 16 & 0xFF00;
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.f((exP)object, (exP)object2);
    }
}

