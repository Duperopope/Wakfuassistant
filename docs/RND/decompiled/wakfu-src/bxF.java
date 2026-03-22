/*
 * Decompiled with CFR 0.152.
 */
class bxF
extends fmz_1 {
    final /* synthetic */ String jBE;
    final /* synthetic */ bxD jBF;

    bxF(bxD bxD2, String string) {
        this.jBF = bxD2;
        this.jBE = string;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        abg_2.bUP().h(this.jBF.jBB);
        fyw_0.gqw().tl(this.jBE);
        fbj_1.getInstance().getLayeredContainer().n(this.jBF.jBv);
        this.jBF.jBB = null;
        return true;
    }
}

