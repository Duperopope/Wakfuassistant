/*
 * Decompiled with CFR 0.152.
 */
class aIF
extends abW {
    final /* synthetic */ asl_1 dYP;

    aIF(String string, String string2, asl_1 asl_12, asl_1 asl_13) {
        this.dYP = asl_13;
        super(string, string2, asl_12);
    }

    @Override
    public void qF(int n) {
        super.qF(n);
        aam_0 aam_02 = aie_0.cfn().bmC();
        this.dYP.a("screen_size", aam_02.bRq(), aam_02.bRr());
        aag_0 aag_02 = aam_02.bqL();
        this.dYP.a("camera", aag_02.bsh(), aag_02.bsi(), aag_02.getZoomFactor());
    }
}

