/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aym
 */
public abstract sealed class aym_1
extends Enum<aym_1>
permits ayn_1, ayo_1, ayp_1, ayq_1, ayr_1 {
    public static final /* enum */ aym_1 dsz = new ayn_1();
    public static final /* enum */ aym_1 dsA = new ayo_1();
    public static final /* enum */ aym_1 dsB = new ayp_1();
    public static final /* enum */ aym_1 dsC = new ayq_1();
    public static final /* enum */ aym_1 dsD = new ayr_1();
    protected ayi_1 dsE;
    protected int dsF;
    protected int dsG;
    protected float dsH;
    protected float dsI;
    protected ayj_1 dsJ;
    protected ayj_1 dsK;
    protected int dsL = -1;
    protected int dsM;
    private static final /* synthetic */ aym_1[] dsN;

    public static aym_1[] values() {
        return (aym_1[])dsN.clone();
    }

    public static aym_1 valueOf(String string) {
        return Enum.valueOf(aym_1.class, string);
    }

    public ayi_1 a(int n, int n2, ayi_1 ayi_12) {
        return this.a(n, n2, ayi_12, ayj_1.dsu, ayj_1.dsu);
    }

    public abstract ayi_1 a(int var1, int var2, ayi_1 var3, ayj_1 var4, ayj_1 var5);

    protected final void b(int n, int n2, ayi_1 ayi_12, ayj_1 ayj_12, ayj_1 ayj_13) {
        this.dsL = -1;
        this.dsE = ayi_12;
        this.dsF = n;
        this.dsG = n2;
        this.dsH = (float)this.dsE.dso / (float)this.dsF;
        this.dsI = (float)this.dsE.dsp / (float)this.dsG;
        this.dsJ = ayj_12;
        this.dsK = ayj_13;
    }

    protected final boolean cx(int n, int n2) {
        if (n == this.dsL) {
            n = this.dsM;
        } else {
            this.dsL = n;
            switch (this.dsJ) {
                case dst: {
                    if (n < this.dsE.dso) break;
                    n = -1;
                    break;
                }
                case dsu: {
                    if (n < this.dsE.dso) break;
                    n %= this.dsE.dso;
                    break;
                }
                case dsv: {
                    if (n < this.dsE.dso) break;
                    if ((n /= this.dsE.dso) % 2 == 0) {
                        n %= this.dsE.dso;
                        break;
                    }
                    n %= this.dsE.dso;
                    n = this.dsE.dso - n - 1;
                    break;
                }
                case dsw: {
                    n = (int)(this.dsH * (float)n);
                }
            }
            this.dsM = n;
        }
        if (n < 0) {
            return false;
        }
        switch (this.dsK) {
            case dst: {
                if (n2 < this.dsE.dsp) break;
                n2 = -1;
                break;
            }
            case dsu: {
                if (n2 < this.dsE.dsp) break;
                n2 %= this.dsE.dsp;
                break;
            }
            case dsv: {
                if (n2 < this.dsE.dsp) break;
                if ((n2 /= this.dsE.dsp) % 2 == 0) {
                    n2 %= this.dsE.dsp;
                    break;
                }
                n2 %= this.dsE.dsp;
                n2 = this.dsE.dsp - n2 - 1;
                break;
            }
            case dsw: {
                n2 = (int)(this.dsI * (float)n2);
            }
        }
        if (n2 < 0) {
            return false;
        }
        return this.dsE.dsn[n][n2];
    }

    private static /* synthetic */ aym_1[] bSc() {
        return new aym_1[]{dsz, dsA, dsB, dsC, dsD};
    }

    static {
        dsN = aym_1.bSc();
    }
}

