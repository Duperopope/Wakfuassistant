/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ayO
 */
public abstract class ayo_2 {
    protected ayn_2 duk;
    protected int asA;

    protected ayo_2() {
        this.bSG();
    }

    public void a(ayn_2 ayn_22) {
        this.duk = ayn_22;
        this.asA = ayn_22 != null ? ayn_22.d() : 0;
    }

    public final void bSG() {
        this.duk = null;
        this.asA = 0;
    }

    public boolean bSH() {
        if (this.duk == null) {
            return false;
        }
        return this.asA != 0 && this.duk.d() == this.asA;
    }

    public ayn_2 bSI() {
        return this.duk;
    }

    public int azv() {
        return this.asA;
    }
}

