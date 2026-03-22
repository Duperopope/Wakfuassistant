/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bpI
 */
public class bpi_1
implements aeh_2 {
    public static final String iXO = "translations";
    private static bpk_1 iXP = null;
    private final List<bpj_1> iXQ = new ArrayList<bpj_1>(Mv.aVB - 1);

    public bpi_1(@NotNull bpb_1 bpb_12) {
        for (Mv mv : Mv.aVA) {
            if (bpi_1.q(mv) || !ewo_0.z(mv)) continue;
            this.iXQ.add(new bpj_1(bpb_12.a(iXP, mv), mv));
        }
    }

    private static boolean q(@NotNull Mv mv) {
        return mv == aum_0.cWf().aUXX();
    }

    public static boolean isEnabled() {
        if (iXP == null) {
            bpi_1.dDD();
        }
        return iXP != null && !iXP.aUG().isEmpty();
    }

    private static void dDD() {
        try {
            iXP = new bpk_1();
            iXP.aL(false);
            iXP.cL(auc_0.cVq().bS("i18nPath"));
            iXP.a(Mv.aVA.stream().filter(mv -> !bpi_1.q(mv)).toList());
        }
        catch (fu_0 fu_02) {
            // empty catch block
        }
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (iXO.equals(string)) {
            return this.iXQ;
        }
        return null;
    }

    @Override
    public String[] bxk() {
        return new String[]{iXO};
    }
}

