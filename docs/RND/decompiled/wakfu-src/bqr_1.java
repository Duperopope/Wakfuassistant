/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bqr
 */
public class bqr_1
implements aeh_2 {
    public static final String iZH = "itemName";
    public static final String iZI = "territories";
    private final int iZJ;
    private final List<bqs_1> iZK;

    public bqr_1(int n2) {
        this.iZJ = n2;
        Map<Integer, List<Integer>> map = bjt_0.eaK().Hq(n2);
        if (map == null) {
            this.iZK = List.of();
        } else {
            this.iZK = new ArrayList<bqs_1>(map.size());
            map.forEach((n, list) -> this.iZK.add(new bqs_1((int)n, (List<Integer>)list)));
            this.iZK.sort(Comparator.comparing(bqs_12 -> BH.aT(bqs_12.iZQ)));
        }
    }

    @Override
    @Nullable
    public Object eu(String string) {
        return switch (string) {
            case iZH -> bgv_2.Dm(this.iZJ);
            case iZI -> this.iZK;
            default -> null;
        };
    }

    @Override
    public String[] bxk() {
        return new String[]{iZH, iZI};
    }
}

