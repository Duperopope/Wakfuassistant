/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bqt
 */
public class bqt_1
implements aeh_2 {
    public static final String iZS = "itemName";
    public static final String iZT = "machineViews";
    public static final String[] iZU = new String[]{"itemName", "machineViews"};
    private final int iZV;
    private final List<bqx_1> iZW;

    public bqt_1(int n2) {
        this.iZV = n2;
        this.iZW = bpm_1.dCG().EZ(n2).stream().map(n -> (fds_0)fda_0.rWI.a(fdv_0.rZi, (int)n)).filter(Objects::nonNull).map(fds_02 -> new bqx_1((fds_0)fds_02, n2)).sorted(Comparator.comparing(bqx_12 -> BH.aT(bqx_12.jah))).toList();
    }

    @Override
    @Nullable
    public Object eu(String string) {
        return switch (string) {
            case iZS -> bgv_2.Dm(this.iZV);
            case iZT -> this.iZW;
            default -> null;
        };
    }

    @Override
    public String[] bxk() {
        return iZU;
    }
}

