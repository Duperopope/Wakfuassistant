/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.Comparator;

/*
 * Renamed from aBN
 */
public class abn_1 {
    private final long dzP;
    private final boolean dzQ;
    private final abq_1[] dzR;
    private double dzS = 0.0;
    private long dzT;
    private int dzU = 0;
    private static final Comparator<abq_1> dzV = new abo_1();
    private static final Comparator<abq_1> dzW = new abp_1();

    private abn_1(long l, double[] dArray, long[] lArray) {
        if (l < 0L || l >= 0x1000000000000L) {
            throw new IllegalArgumentException("capital must lie bewteen 0 and 2^48-1");
        }
        this.dzP = l;
        if (dArray == null) {
            throw new IllegalArgumentException("weights must not be null.");
        }
        if (dArray.length == 0) {
            throw new IllegalArgumentException("weights must be non-empty.");
        }
        this.dzQ = lArray != null;
        this.dzR = new abq_1[dArray.length];
        for (int i = 0; i < dArray.length; ++i) {
            this.dzR[i] = this.a(dArray[i], i, this.dzQ ? lArray[i] : Long.MAX_VALUE);
        }
        if (Double.compare(this.dzS, 0.0) != 1) {
            throw new IllegalArgumentException("The elements of weights must not be all 0.");
        }
    }

    private abq_1 a(double d2, int n, long l) {
        if (Double.compare(d2, 0.0) == -1) {
            throw new IllegalArgumentException("All elements of weights must be positive or 0.");
        }
        this.dzS += d2;
        return new abq_1(d2, n, l);
    }

    private long bWe() {
        return this.dzP - this.dzT;
    }

    private long[] bWf() {
        this.bWg();
        this.bWh();
        return this.bWk();
    }

    private void bWg() {
        if (!this.dzQ) {
            return;
        }
        Arrays.sort(this.dzR, dzV);
        for (abq_1 abq_12 : this.dzR) {
            double d2 = (double)this.bWe() / this.dzS;
            if (abq_12.bWl() >= d2) break;
            abq_12.bWm();
            this.dzT += abq_12.apJ();
            this.dzS -= abq_12.bWn();
            ++this.dzU;
        }
    }

    private void bWh() {
        if (this.dzU == this.dzR.length) {
            return;
        }
        this.bWi();
        if (this.dzT == this.dzP) {
            return;
        }
        this.bWj();
    }

    private void bWi() {
        long l = this.bWe();
        for (int i = this.dzU; i < this.dzR.length; ++i) {
            abq_1 abq_12 = this.dzR[i];
            abq_12.J((double)l * (abq_12.bWn() / this.dzS));
            this.dzT += abq_12.apJ();
        }
    }

    private void bWj() {
        if (this.bWe() < 0L || this.bWe() >= (long)(this.dzR.length - this.dzU)) {
            throw new IllegalStateException("Unrecoverable state");
        }
        Arrays.sort(this.dzR, this.dzU, this.dzR.length, dzW);
        int n = 0;
        while ((long)n < this.bWe()) {
            this.dzR[this.dzU + n % (this.dzR.length - this.dzU)].bWo();
            ++n;
        }
    }

    private long[] bWk() {
        long[] lArray = new long[this.dzR.length];
        for (abq_1 abq_12 : this.dzR) {
            lArray[abq_12.wp()] = abq_12.apJ();
        }
        return lArray;
    }

    public static long[] a(long l, double[] dArray, long[] lArray) {
        if (lArray == null) {
            throw new IllegalArgumentException("capacities must not be null.");
        }
        if (dArray.length != lArray.length) {
            throw new IllegalArgumentException("weights and capacities must have identical length.");
        }
        return new abn_1(l, dArray, lArray).bWf();
    }

    public static long[] a(long l, double[] dArray) {
        return new abn_1(l, dArray, null).bWf();
    }
}

