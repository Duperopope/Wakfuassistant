/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.TimeUnit;

/*
 * Renamed from bNv
 */
public final class bnv_1 {
    private static final int kCr = 7;
    private static final int kCs = 42;
    private boolean kCt;
    public static final bnv_1 kCu = new bnv_1();
    private final GE kCv = new GE(7, TimeUnit.SECONDS);

    private bnv_1() {
    }

    public boolean egb() {
        return !this.kCt || this.kCv.aNS() <= 0;
    }

    public boolean egc() {
        this.kCt = this.kCv.aNQ() > 42;
        return this.kCt;
    }
}

