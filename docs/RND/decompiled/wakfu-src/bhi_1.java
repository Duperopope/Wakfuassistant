/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bHI
 */
public abstract class bhi_1
implements aeh_2 {
    private static final String kcC = "filterDisplayedText";
    private final Runnable kcD;

    protected bhi_1(Runnable runnable) {
        this.kcD = runnable;
    }

    public abstract bhh_1 dWS();

    public abstract void b(fiu_0 var1);

    protected abstract void c(fiu_0 var1);

    public abstract boolean isValid();

    public abstract String dDG();

    public void remove() {
        this.kcD.run();
    }

    public void d(fiu_0 fiu_02) {
        this.c(fiu_02);
        this.kcD.run();
    }

    public int dWT() {
        return 0;
    }

    @Override
    public Object eu(String string) {
        if (kcC.equals(string)) {
            return this.dDG();
        }
        return null;
    }

    @Override
    public String[] bxk() {
        return new String[]{kcC};
    }

    public String toString() {
        return String.valueOf((Object)this.dWS()) + "-filter=" + this.dDG();
    }
}

