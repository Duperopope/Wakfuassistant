/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from abB
 */
public abstract class abb_0
implements ass_1 {
    protected static final float cdB = 43.0f;
    protected static final float cdC = 21.5f;
    protected static final float cdD = 10.0f;
    private static int bcK = 1;
    private final int cdE = abb_0.bte();
    private boolean cdF;
    protected agf bUu;
    private aca cdG;

    static int bte() {
        if (bcK == Integer.MAX_VALUE) {
            bcK = 0;
        }
        return bcK++;
    }

    public abb_0() {
        this.reset();
    }

    @Override
    public final int d() {
        return this.cdE;
    }

    public float bnY() {
        return this.cdG.bnY();
    }

    @Override
    public void bX(boolean bl) {
        this.cdF = bl;
    }

    @Override
    public boolean aOY() {
        return this.cdF;
    }

    public void b(agf agf2) {
        this.bUu = agf2;
    }

    @Override
    public abstract void clear();

    @Override
    public void reset() {
        this.cdG = new aca(1.0f);
    }

    @Override
    public void qF(int n) {
        if (!this.cdG.rl(n)) {
            this.bX(false);
        }
    }

    @Override
    public abstract void b(art_1 var1);

    public void a(@NotNull aca aca2) {
        this.cdG = aca2;
        this.bX(true);
    }

    @Override
    public void rz(int n) {
        this.cdG = new abY(n, this.bnY());
    }

    @Override
    public int btf() {
        return 0;
    }
}

