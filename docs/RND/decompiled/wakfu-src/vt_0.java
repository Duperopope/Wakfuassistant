/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Vt
 */
public class vt_0
extends aam_2 {
    private final Runnable bIf;

    public static void b(Runnable runnable) {
        aaw_1.bUq().h(new vt_0(runnable));
    }

    public vt_0(Runnable runnable) {
        this.bIf = runnable;
        this.a(vs_0.bIe);
    }

    public Runnable bkp() {
        return this.bIf;
    }

    @Override
    public int d() {
        return 323;
    }
}

