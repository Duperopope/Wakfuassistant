/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bDT
 */
class bdt_0
extends fmz_1 {
    final /* synthetic */ Runnable jLI;

    bdt_0(Runnable runnable) {
        this.jLI = runnable;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        this.jLI.run();
        fyw_0.gqw().tl("recyclingConfirmationDialog");
        return false;
    }
}

