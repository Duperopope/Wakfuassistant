/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Comparator;
import java.util.List;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bql
 */
public class bql_1
implements aeh_2 {
    public static final String iZo = "name";
    public static final String iZp = "selected";
    public static final String iZq = "isNone";
    private final int iZr;
    private boolean bWn;

    public static List<bql_1> dDZ() {
        return bpm_1.dCG().dCL().stream().sorted(Comparator.comparing(bql_1::Dn)).map(bql_1::new).toList();
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "name": {
                return this.getName();
            }
            case "selected": {
                return this.bWn;
            }
            case "isNone": {
                return false;
            }
        }
        return null;
    }

    public String getName() {
        return bql_1.Dm(this.iZr);
    }

    public static String Dm(int n) {
        return aum_0.cWf().a(66, (long)n, new Object[0]);
    }

    private static String Dn(int n) {
        return aum_0.cWf().b(66, (long)n, new Object[0]);
    }

    public void gQ(boolean bl) {
        this.bWn = bl;
        fse_1.gFu().a((aef_2)this, iZp);
    }

    @Override
    public String[] bxk() {
        return new String[]{iZo, iZp};
    }

    @Generated
    public int clk() {
        return this.iZr;
    }

    @Generated
    public boolean bqr() {
        return this.bWn;
    }

    @Generated
    public void setSelected(boolean bl) {
        this.bWn = bl;
    }

    @Generated
    public bql_1(int n) {
        this.iZr = n;
    }
}

