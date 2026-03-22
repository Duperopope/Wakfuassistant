/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ayR
 */
public abstract class ayr_2<T extends ayq_2> {
    private final int dum;
    private final Class dun;
    private ays_2 dul;

    public ayr_2(Class clazz) {
        this.dum = ayq_2.q(clazz);
        this.dun = clazz;
    }

    public final T bSJ() {
        T t = this.bru();
        ((ayq_2)t).brr();
        return t;
    }

    public final T bSK() {
        if (this.dul == null) {
            this.dul = ayu_2.bST().a(this.dum, this.dun);
        }
        return (T)this.dul.bSM();
    }

    public abstract T bru();

    public final Class bSL() {
        return this.dun;
    }
}

