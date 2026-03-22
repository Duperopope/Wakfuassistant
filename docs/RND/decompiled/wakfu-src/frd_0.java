/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from frD
 */
public abstract class frd_0 {
    protected long sYY;

    public void c(exP exP2, RH rH, long l) {
        fry fry2 = this.a(exP2, rH, l);
        if (fry2 != fry.sYz) {
            this.a(fry2);
            return;
        }
        this.sYY = rH.Sn();
        this.b(exP2, rH, l);
    }

    public abstract void a(RH var1, exP var2);

    public abstract void b(RH var1, exP var2);

    public abstract fry a(exP var1, RH var2, long var3);

    protected abstract void b(exP var1, RH var2, long var3);

    protected abstract void a(fry var1);

    public abstract fre_0 egC();

    public String toString() {
        return "TravelProvider{" + this.getClass().getSimpleName() + ", TravelType:" + String.valueOf(this.egC()) + "}";
    }
}

