/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ayQ
 */
public abstract class ayq_2
extends ayy_2 {
    private ays_2 dul;

    public static int q(Class clazz) {
        return ayq_2.gS(clazz.getName());
    }

    public static int gS(String string) {
        return GC.cy(string);
    }

    @Override
    protected void bPl() {
        super.bPl();
        if (this.dul != null) {
            this.dul.a(this);
        }
    }

    @Override
    protected final void bLe() {
        super.bLe();
        this.brs();
    }

    protected abstract void brr();

    protected abstract void brs();

    final void b(ays_2 ays_22) {
        this.dul = ays_22;
    }
}

