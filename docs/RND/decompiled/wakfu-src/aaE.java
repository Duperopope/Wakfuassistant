/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class aaE
implements afZ<aaj_0> {
    private static final Logger cal = Logger.getLogger(aaE.class);
    public static final int cam = 300;
    static final float[][] can = new float[1][];
    private static final aaE cao;
    private static final int cap = 0;
    public static final int caq = 0;
    private boolean car = true;
    int cas = Integer.MAX_VALUE;
    private final aaF cat = new aaF(this);

    private aaE() {
    }

    public static aaE brU() {
        return cao;
    }

    public static boolean rh(int n) {
        return n == 0;
    }

    public final float[] b(@NotNull agV agV2) {
        boolean bl;
        float[] fArray;
        int n = agV2.bqh();
        try {
            fArray = this.cat.rj(n);
            if (fArray != null) {
                return fArray;
            }
        }
        catch (Exception exception) {
            cal.error((Object)"", (Throwable)exception);
            return new float[]{1.0f, 0.5f, 0.5f, 1.0f};
        }
        try {
            bl = this.bg(this.cas, n);
        }
        catch (Exception exception) {
            cal.error((Object)"", (Throwable)exception);
            return new float[]{1.0f, 1.0f, 1.0f, 1.0f};
        }
        fArray = bl ? new float[]{1.0f, 1.0f, 1.0f, 1.0f} : new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        this.cat.b(n, fArray);
        return fArray;
    }

    public final boolean bg(int n, int n2) {
        try {
            return WY.bnm().aW(n, n2);
        }
        catch (Exception exception) {
            return true;
        }
    }

    public final void b(@NotNull aaj_0 aaj_02, float f2, float f3) {
        if (this.cat.cax == can) {
            this.cat.rk(WY.bnm().bno());
            assert (this.cat.cax != can);
        }
    }

    public final void c(@NotNull aaj_0 aaj_02, int n) {
        aag_0 aag_02 = aaj_02.bqL();
        int n2 = aag_02.bqE();
        boolean bl = false;
        if (n2 != this.cas) {
            this.cat.brX();
            boolean bl2 = this.ri(n2);
            bl = this.car != bl2;
            this.car = bl2;
            this.cas = n2;
        }
        try {
            this.cat.b(n, bl);
        }
        catch (Exception exception) {
            cal.error((Object)("Probl\u00e8lme de fade de layer maskKey=" + n2));
            this.cas = n2 == 0 ? Integer.MAX_VALUE : 0;
        }
    }

    public final boolean brV() {
        return this.ri(this.cas);
    }

    public final boolean ri(int n) {
        return this.bg(n, 0);
    }

    public final void brW() {
        this.cas = Integer.MAX_VALUE;
        this.car = true;
        this.cat.clear();
    }

    @Override
    public /* synthetic */ void a(@NotNull afV afV2, float f2, float f3) {
        this.b((aaj_0)afV2, f2, f3);
    }

    @Override
    public /* synthetic */ void a(@NotNull afV afV2, int n) {
        this.c((aaj_0)afV2, n);
    }

    static {
        aaE.can[0] = new float[]{1.0f, 1.0f, 1.0f, 1.0f};
        cao = new aaE();
    }
}

