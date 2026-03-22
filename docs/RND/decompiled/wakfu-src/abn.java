/*
 * Decompiled with CFR 0.152.
 */
public abstract sealed class abn
extends Enum<abn>
permits abo, abp, abq, abr, abs {
    public static final /* enum */ abn cdp = new abo();
    public static final /* enum */ abn cdq = new abp();
    public static final /* enum */ abn cdr = new abq();
    public static final /* enum */ abn cds = new abr();
    public static final /* enum */ abn cdt = new abs();
    private static final /* synthetic */ abn[] cdu;

    public static abn[] values() {
        return (abn[])cdu.clone();
    }

    public static abn valueOf(String string) {
        return Enum.valueOf(abn.class, string);
    }

    protected abstract double z(double var1);

    public final double a(double d2, double d3, double d4, double d5, double d6) {
        if (d4 <= d5) {
            return d2;
        }
        if (d4 >= d6) {
            return d3;
        }
        double d7 = (d4 - d5) / (d6 - d5);
        return d2 + (d3 - d2) * this.z(d7);
    }

    public final double a(double d2, double d3, double d4, double d5) {
        return this.a(d2, d3, d4, 0.0, d5);
    }

    public final double d(double d2, double d3, double d4) {
        return this.a(d2, d3, d4, 0.0, 1.0);
    }

    public final double A(double d2) {
        return this.a(0.0, 1.0, d2, 0.0, 1.0);
    }

    public final float b(float f2, float f3, float f4, float f5, float f6) {
        return (float)this.a(f2, f3, f4, f5, f6);
    }

    public final float h(float f2, float f3, float f4, float f5) {
        return this.b(f2, f3, f4, 0.0f, f5);
    }

    public final float h(float f2, float f3, float f4) {
        return this.b(f2, f3, f4, 0.0f, 1.0f);
    }

    public final float bY(float f2) {
        return this.b(0.0f, 1.0f, f2, 0.0f, 1.0f);
    }

    private static /* synthetic */ abn[] bsY() {
        return new abn[]{cdp, cdq, cdr, cds, cdt};
    }

    static {
        cdu = abn.bsY();
    }
}

