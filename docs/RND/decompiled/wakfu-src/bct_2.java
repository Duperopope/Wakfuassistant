/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.EnumMap;
import java.util.Map;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bct
 */
public class bct_2
implements aeh_2 {
    public static final String hEu = "name";
    private static final Map<bcs_2, bct_2> hEv = new EnumMap<bcs_2, bct_2>(bcs_2.class);
    private final bcs_2 hEw;

    public static bct_2 a(bcs_2 bcs_22) {
        return hEv.get((Object)bcs_22);
    }

    private bct_2(bcs_2 bcs_22) {
        this.hEw = bcs_22;
    }

    public bcs_2 dbg() {
        return this.hEw;
    }

    @Override
    public String[] bxk() {
        return dGM;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(hEu)) {
            return aum_0.cWf().c("mercenary.filter." + this.hEw.ordinal(), new Object[0]);
        }
        return null;
    }

    public String toString() {
        return "MercenaryFilterView{m_filter=" + String.valueOf((Object)this.hEw) + "}";
    }

    static {
        for (bcs_2 bcs_22 : bcs_2.values()) {
            hEv.put(bcs_22, new bct_2(bcs_22));
        }
    }
}

