/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bpF
 */
public class bpf_1
implements aeh_2,
bek_0 {
    public static final String iXa = "hasCriteria";
    public static final String iXb = "lootRateText";
    public static final String iXc = "lootCriteriaText";
    public static final String[] iXd = new String[]{"hasCriteria", "lootRateText", "lootCriteriaText"};
    @NotNull
    private final bjt_2 iXe;
    @NotNull
    private final bgv_2 iXf;

    public bpf_1(@NotNull bjt_2 bjt_22, @NotNull bgv_2 bgv_22) {
        this.iXe = bjt_22;
        this.iXf = bgv_22;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        return switch (string) {
            case iXa -> this.iXe.css() || !this.iXe.drq().isEmpty();
            case iXb -> this.dDu();
            case iXc -> this.dDv();
            default -> this.iXf.eu(string);
        };
    }

    @NotNull
    private String dDu() {
        double d2 = this.iXe.cmK();
        double d3 = bpu.X(d2);
        return bpu.h(d2, d3);
    }

    @NotNull
    private String dDv() {
        if (this.iXe.css()) {
            return aum_0.cWf().c("loot.client.criterion.complex", new Object[0]);
        }
        if (this.iXe.drq().isEmpty()) {
            return aum_0.cWf().c("loot.client.criterion.none", new Object[0]);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(aum_0.cWf().c("loot.client.criterion.label", new Object[0]));
        stringBuilder.append('\n');
        this.iXe.drq().forEach(bjs_22 -> stringBuilder.append(" - ").append(bjs_22.drp()).append('\n'));
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        return stringBuilder.toString();
    }

    public double cmK() {
        return this.iXe.cmK();
    }

    @Override
    @NotNull
    public bgv_2 duo() {
        return this.iXf;
    }

    @Override
    public String[] bxk() {
        return new String[]{iXb, iXa};
    }
}

