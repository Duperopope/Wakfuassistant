/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bZA
 */
final class bza_1
extends abW {
    bza_1() {
        super(aIz.cgO() + "proximityThunder.cgfx", "test");
    }

    @Override
    public void qF(int n) {
        super.qF(n);
    }

    @NotNull
    private static asl_1 eqd() {
        asl_1 asl_12 = new asl_1(new ase_1("gStrength", asf_1.cZr), new ase_1("camera", asf_1.cZt));
        aag_0 aag_02 = aie_0.cfn().bmC().bqL();
        asl_12.c("gStrength", 0.0f);
        asl_12.a("camera", aag_02.bsh() / 1024.0f, aag_02.bsi() / 1024.0f, aag_02.getZoomFactor());
        return asl_12;
    }
}

