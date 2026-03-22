/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cZy
 */
public class czy_1 {
    public static final Map<Integer, czz_1> obk = new HashMap<Integer, czz_1>();
    public static final int obl = 9120;
    public static final int obm = 0;
    public static final int obn = 1;
    public static final int obo = 2;

    public static czz_1 NJ(int n) {
        return obk.get(n);
    }

    @Nullable
    public static czz_1 NK(int n) {
        for (czz_1 czz_12 : obk.values()) {
            if (czz_12.obp != n) continue;
            return czz_12;
        }
        return null;
    }

    public static List<Integer> eZl() {
        return obk.values().stream().map(czz_1::eZp).toList();
    }

    public static List<Integer> eZm() {
        return obk.values().stream().map(czz_1::eZq).toList();
    }

    static {
        obk.put(5791, new czz_1(-1, 5791, 207, 90, 5578));
        obk.put(5792, new czz_1(0, 5792, 208, 26, 5579));
        obk.put(5793, new czz_1(1, 5793, 209, 137, 5580));
        obk.put(5794, new czz_1(2, 5794, 210, 186, 5581));
        obk.put(5795, new czz_1(3, 5795, 211, 145, 5582));
        obk.put(5796, new czz_1(4, 5796, 212, 49, 5583));
        obk.put(5797, new czz_1(5, 5797, 213, 5, 5584));
        obk.put(5799, new czz_1(6, 5799, 214, 9, 5585));
        obk.put(5800, new czz_1(7, 5800, 215, 148, 5586));
        obk.put(5803, new czz_1(8, 5803, 216, 72, 5587));
        obk.put(5804, new czz_1(9, 5804, 217, 144, 5588));
        obk.put(5805, new czz_1(10, 5805, 218, 155, 5589));
        obk.put(5806, new czz_1(11, 5806, 219, 131, 5590));
    }
}

