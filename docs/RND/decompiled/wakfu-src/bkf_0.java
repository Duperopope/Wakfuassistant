/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bKF
 */
public class bkf_0
implements aeh_2,
bdz_0 {
    public static final String kpx = "buildingList";
    public static final String kpy = "buildingCategoryName";
    public static final String kpz = "collapsed";
    public static final String kpA = "visible";
    private static final String[] kpB = new String[]{"buildingList", "buildingCategoryName", "collapsed", "visible"};
    @NotNull
    private final List<bkh_0> kpC;
    @Nullable
    private List<bkh_0> kpD;
    @NotNull
    private final bkc_0 kpE;
    private boolean hFE;

    public bkf_0(@NotNull bkc_0 bkc_02, List<bkh_0> list) {
        this.kpE = bkc_02;
        this.kpC = new ArrayList<bkh_0>(list);
    }

    @Override
    public String[] bxk() {
        return kpB;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        String string2 = string;
        int n = 0;
        return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{kpx, kpy, kpz, kpA}, (Object)string2, n)) {
            case 0 -> {
                if (this.kpD != null) {
                    yield this.kpD;
                }
                yield this.kpC;
            }
            case 1 -> "Cat\u00e9gorie " + this.kpE.cZa();
            case 2 -> this.hFE;
            case 3 -> this.kpD == null || !this.kpD.isEmpty();
            default -> null;
        };
    }

    @Override
    public boolean dbK() {
        return this.hFE;
    }

    @Override
    public void fm(boolean bl) {
        this.hFE = bl;
        fse_1.gFu().a((aef_2)this, kpz);
    }

    public void mq(@Nullable String string) {
        if (string == null || string.isBlank()) {
            this.kpD = null;
        } else {
            this.kpD = this.kpC.stream().filter(bkh_02 -> bkh_02.dah().contains(string)).toList();
            if (!this.kpD.isEmpty()) {
                this.hFE = false;
            }
        }
        fse_1.gFu().a((aef_2)this, kpx, kpA, kpz);
    }
}

