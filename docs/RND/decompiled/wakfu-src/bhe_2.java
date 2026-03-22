/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bHe
 */
public class bhe_2
implements aeh_2 {
    private static final String jXe = "instance";
    private static final String jXf = "zones";
    private long aHT;
    private final List<Integer> jXg = new ArrayList<Integer>();
    private String jXh;
    private String jXi;

    @Override
    public String[] bxk() {
        return new String[]{jXe, jXf};
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(jXe)) {
            return this.jXh;
        }
        if (string.equals(jXf)) {
            return this.jXg.stream().flatMap(n -> adf_0.buP().rW((int)n).stream()).map(bhf_2::new).toList();
        }
        return null;
    }

    bhe_2 lp(long l) {
        this.aHT = l;
        this.jXh = aum_0.cWf().a(77, this.aHT, new Object[0]);
        this.jXi = aum_0.cWf().b(77, this.aHT, new Object[0]);
        return this;
    }

    bhe_2 GJ(int n) {
        this.jXg.add(n);
        return this;
    }

    public List<Integer> dUL() {
        return this.jXg;
    }

    String dUM() {
        return this.jXi;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        bhe_2 bhe_22 = (bhe_2)object;
        return this.aHT == bhe_22.aHT;
    }
}

