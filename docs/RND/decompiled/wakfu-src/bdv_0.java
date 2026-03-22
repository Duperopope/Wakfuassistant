/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Comparator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bDV
 */
class bdv_0
implements aeh_2 {
    private static final String jLN = "confirmationText";
    private static final String jLO = "items";
    private static final String jLP = "questionIconUrl";
    private static final Comparator<ffV> jLQ = Comparator.comparingInt(ffV2 -> {
        if (ffV2.fVY()) {
            return 0;
        }
        if (bev_0.dSZ().GA(ffV2.acs())) {
            return 0;
        }
        if (ffV2.fVX() >= 3) {
            return 0;
        }
        return 1;
    }).thenComparing(ffV2 -> ffV2.dwg().fWK(), Comparator.reverseOrder()).thenComparing(ffV::fVX, Comparator.reverseOrder());
    private final String jLR;
    private final List<ffV> jLS;

    bdv_0(@NotNull bdu_0 bdu_02) {
        this.jLR = bdv_0.a(bdu_02);
        this.jLS = bdu_02.dRE().stream().sorted(jLQ).toList();
    }

    private static String a(bdu_0 bdu_02) {
        return aum_0.cWf().c("inventory.recycle.selection.confirmation", bdu_02.dRF(), bdu_02.dRG() ? 1 : 0, bdu_02.dRH() ? 1 : 0);
    }

    @Override
    @Nullable
    public Object eu(String string) {
        return switch (string) {
            case jLN -> this.jLR;
            case jLO -> this.jLS;
            case jLP -> ccp_2.mRE.byf();
            default -> null;
        };
    }

    @Override
    public String[] bxk() {
        return new String[]{jLN, jLO};
    }
}

