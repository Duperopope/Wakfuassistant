/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fTj
 */
public abstract class ftj_2<T extends fhv_1> {
    protected final T vfF;

    public ftj_2(T t) {
        this.vfF = t;
        this.gGF();
    }

    public void gAH() {
        fhs_2 fhs_22 = ((fhv_1)this.vfF).getElementMap();
        if (fhs_22 == null) {
            return;
        }
        String string = fhs_22.getId();
        String string2 = ((fhv_1)this.vfF).getId();
        if (string == null) {
            return;
        }
        this.aY(string, string2);
    }

    public void gAI() {
        fhs_2 fhs_22 = ((fhv_1)this.vfF).getElementMap();
        if (fhs_22 == null) {
            return;
        }
        String string = fhs_22.getId();
        String string2 = ((fhv_1)this.vfF).getId();
        if (string == null) {
            return;
        }
        this.aZ(string, string2);
    }

    protected abstract void aY(String var1, String var2);

    protected abstract void aZ(String var1, String var2);

    public abstract void gGE();

    public abstract void gGF();

    public final boolean gGG() {
        return this.gGH() || this.gGI();
    }

    public abstract boolean gGH();

    public abstract boolean gGI();
}

