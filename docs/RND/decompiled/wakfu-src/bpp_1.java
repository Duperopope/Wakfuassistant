/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bpp
 */
public class bpp_1
implements aeh_2 {
    public static final String iUZ = "resultsText";
    public static final String iVa = "pageCountText";
    public static final String iVb = "hasPreviousPage";
    public static final String iVc = "hasNextPage";
    public static final String[] iVd = new String[]{"resultsText", "pageCountText", "hasPreviousPage", "hasNextPage"};
    private final int iVe;
    private int hQx;
    private int iVf;

    public bpp_1(int n) {
        this.iVe = n;
    }

    public void Fb(int n) {
        this.hQx = 0;
        this.iVf = n;
        fse_1.gFu().a((aef_2)this, iVd);
    }

    @Override
    @Nullable
    public Object eu(String string) {
        return switch (string) {
            case iUZ -> aum_0.cWf().c("results.param", this.iVf);
            case iVa -> {
                int var4_4 = this.dCM() == 0 ? 0 : this.hQx + 1;
                yield new ahv_2().ih(new fhl_2(ett_1.opf).bQk()).yx(var4_4).ceD().c(" / " + this.dCM()).ceL();
            }
            case iVb -> this.iVf > 0 && this.hQx > 0;
            case iVc -> this.iVf > 0 && this.hQx < this.dCM() - 1;
            default -> null;
        };
    }

    private int dCM() {
        return GC.C((float)this.iVf / (float)this.iVe);
    }

    public <T> List<T> L(List<T> list) {
        int n = this.hQx * this.iVe;
        int n2 = Math.min(n + this.iVe, this.iVf);
        return list.subList(Math.max(0, n), Math.min(n2, list.size()));
    }

    public int dfz() {
        return this.hQx;
    }

    public void a(bpq_1 bpq_12) {
        int n = this.dCM();
        this.hQx = switch (bpq_12.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> 0;
            case 1 -> {
                if (this.hQx > 0) {
                    yield this.hQx - 1;
                }
                yield 0;
            }
            case 2 -> {
                if (this.hQx < n - 1) {
                    yield this.hQx + 1;
                }
                yield n - 1;
            }
            case 3 -> n - 1;
        };
        fse_1.gFu().a((aef_2)this, iVd);
    }

    public void BH(int n) {
        int n2 = this.dCM();
        this.hQx = GC.a(n, 0, n2 - 1);
        fse_1.gFu().a((aef_2)this, iVd);
    }

    public void Fc(int n) {
        this.iVf = n;
    }

    @Override
    public String[] bxk() {
        return iVd;
    }
}

