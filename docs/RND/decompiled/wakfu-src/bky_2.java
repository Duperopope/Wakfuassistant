/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.procedure.TObjectProcedure;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bKy
 */
public class bky_2
implements evy_2 {
    public static final bky_2 koP = new bky_2();

    private bky_2() {
    }

    @Override
    public void a(long l, @NotNull evv_2 evv_22) {
        if (evv_22.fek() != eva_1.owx) {
            return;
        }
        fpQ fpQ2 = (fpQ)evv_22;
        fse_1.gFu().f("pvpState", fpQ2.dkC().aJr());
        cyt_1.eXX().eXY().deS();
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 == null) {
            return;
        }
        bgg_0.dlO().m((TObjectProcedure<bgy>)((TObjectProcedure)bgy2 -> {
            if (bgy2.dkC() == fpu_0.sRd) {
                return true;
            }
            bgy2.djo();
            return true;
        }));
    }
}

