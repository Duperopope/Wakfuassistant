/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bOq
 */
public class boq_2
implements aeh_2,
bdz_0 {
    public static final String kKB = "title";
    public static final String kKC = "icon";
    public static final String kKD = "guides";
    public static final String kKE = "collapsed";
    public static final String kKF = "unread";
    public static final String[] kKG = new String[]{"title", "icon", "guides", "collapsed", "unread"};
    private final bon_2 kKH;
    private final List<bor_2> kKI = new ArrayList<bor_2>();
    private boolean hFE;

    public boq_2(@NotNull bon_2 bon_22) {
        this.kKH = bon_22;
        this.hFE = true;
    }

    @Override
    public String[] bxk() {
        return kKG;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "title": {
                return aum_0.cWf().a(154, (long)this.kKH.d(), new Object[0]);
            }
            case "icon": {
                return this.kKH.bnd() > 0 ? auc_0.cVq().zR(this.kKH.bnd()) : null;
            }
            case "guides": {
                return this.kKI;
            }
            case "collapsed": {
                return this.hFE;
            }
            case "unread": {
                return this.egR();
            }
        }
        return null;
    }

    public boolean a(bor_2 bor_22) {
        return this.kKI.add(bor_22);
    }

    public int wp() {
        return this.kKH.wp();
    }

    public void egP() {
        if (this.kKI.isEmpty()) {
            return;
        }
        this.kKI.sort(Comparator.comparingInt(bor_2::wp));
    }

    public List<bor_2> egQ() {
        return Collections.unmodifiableList(this.kKI);
    }

    @Override
    public boolean dbK() {
        return this.hFE;
    }

    @Override
    public void fm(boolean bl) {
        this.hFE = bl;
        fse_1.gFu().a((aef_2)this, kKE);
    }

    private boolean egR() {
        for (bor_2 bor_22 : this.kKI) {
            if (!bor_22.egS()) continue;
            return true;
        }
        return false;
    }

    public int d() {
        return this.kKH.d();
    }
}

