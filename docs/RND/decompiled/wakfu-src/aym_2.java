/*
 * Decompiled with CFR 0.152.
 */
import java.time.Duration;
import java.util.concurrent.atomic.AtomicInteger;

/*
 * Renamed from ayM
 */
public class aym_2
implements aao_2,
ayp_2 {
    private static final long dua = Duration.ofMinutes(1L).toMillis();
    private static final int dub = 7;
    public static final int duc = 127;
    private static final int dud = 8;
    public static final int due = 255;
    private static final aym_2 duf = new aym_2();
    private final AtomicInteger dug = new AtomicInteger(0);
    private int duh = -1;
    private int dui = -1;
    private long duj;

    public static aym_2 bSD() {
        return duf;
    }

    private aym_2() {
    }

    public static void cy(int n, int n2) {
        if (n < 0) {
            throw new IllegalArgumentException("Server ID should be non-negative");
        }
        if (n2 < 0 || n2 > 255) {
            throw new IllegalArgumentException("Service ID should be in the 0 to 254 range (inclusive)");
        }
        aym_2.duf.duh = n % 128;
        aym_2.duf.dui = n2;
        aym_2.duf.dug.set(0);
        duf.bSF();
        abb_2.bUA().a(duf, dua, 0);
    }

    public static long bSE() {
        return aym_2.duf.duj + ((long)aym_2.duf.dug.incrementAndGet() & 0xFFFFFFL);
    }

    @Override
    public boolean b(aam_2 aam_22) {
        if (aam_22.d() == Integer.MIN_VALUE) {
            this.bSF();
            this.dug.set(0);
            return false;
        }
        return true;
    }

    private void bSF() {
        if (this.duh < 0 || this.duh > 127) {
            throw new IllegalArgumentException("Server ID has not been initialised with the init() method");
        }
        if (this.dui < 0 || this.dui > 255) {
            throw new IllegalArgumentException("Service ID has not been initialised with the init() method");
        }
        this.duj = (long)this.duh << 56;
        this.duj |= (long)this.dui << 48;
        this.duj |= (System.currentTimeMillis() / dua & 0xFFFFFFL) << 24;
    }

    @Override
    public long Sn() {
        return 1L;
    }

    @Override
    public void dC(long l) {
    }

    @Override
    public long baY() {
        return aym_2.bSE();
    }
}

