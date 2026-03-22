/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from blq
 */
public final class blq_1 {
    private blq_1() {
    }

    @NotNull
    public static bhx_0 i(eJS eJS2) {
        short s = eJW.A(eJS2);
        bhx_0 bhx_02 = bhx_0.doA();
        bhx_02.fR(false);
        bhx_02.bw(s);
        bhx_02.c(bja_1.drJ().bC(eJS2.aWP()));
        bhx_02.pi(eJS2.Xi());
        bhx_02.a((byte)5);
        bhx_02.jI(eJS2.Sn());
        bhx_02.setName(eJS2.getName());
        return bhx_02;
    }

    public static String j(eJS eJS2) {
        String string = eJS2.getName();
        if (string != null && !string.isBlank()) {
            return string;
        }
        return aum_0.cWf().a(7, (long)eJS2.aWP(), new Object[0]);
    }

    public static void q(TObjectProcedure<ffV> tObjectProcedure) {
        eyp_1 eyp_12 = aue_0.cVJ().cVK().dnQ().dKL();
        if (eyp_12 == null) {
            return;
        }
        List<exz_1> list = eyp_12.pP(bbs_2.xl());
        for (exz_1 exz_12 : list) {
            eJS eJS2 = eJN.qAF.T(bbs_2.xl(), exz_12.aWP());
            if (eJS2 == null) {
                return;
            }
            if (eJS2.dme().a(tObjectProcedure)) continue;
            break;
        }
    }

    @Nullable
    public static ffV jZ(long l) {
        ffV[] ffVArray = new ffV[1];
        blq_1.q((TObjectProcedure<ffV>)((TObjectProcedure)ffV2 -> {
            if (ffV2.LV() == l) {
                ffVArray[0] = ffV2;
                return false;
            }
            return true;
        }));
        return ffVArray[0];
    }
}

