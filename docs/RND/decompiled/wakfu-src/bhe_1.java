/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from bHE
 */
public class bhe_1
implements aeh_2,
bdz_0 {
    public static final String kcf = "name";
    public static final String kcg = "characteristics";
    public static final String kch = "collapsed";
    private final bhd_1 kci;
    private final @Unmodifiable List<bhc_1> kcj;
    private boolean hFE;

    public bhe_1(bhd_1 bhd_12) {
        this.kci = bhd_12;
        this.kcj = Arrays.stream(bhd_12.dWN()).map(bhc_1::new).toList();
    }

    public static @Unmodifiable List<bhe_1> dWP() {
        return Arrays.stream(bhd_1.values()).sorted(Comparator.comparingInt(bhd_1::d)).map(bhe_1::new).toList();
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "name": {
                return this.getName();
            }
            case "characteristics": {
                return this.kcj;
            }
            case "collapsed": {
                return this.hFE;
            }
        }
        return null;
    }

    public String getName() {
        return aum_0.cWf().c("market.characteristics.group." + this.kci.d(), new Object[0]);
    }

    @Override
    public void fm(boolean bl) {
        this.hFE = bl;
        fse_1.gFu().a((aef_2)this, kch);
    }

    @Override
    public String[] bxk() {
        return new String[]{kcf, kcg};
    }

    @Generated
    public bhd_1 dWQ() {
        return this.kci;
    }

    @Generated
    public List<bhc_1> dWR() {
        return this.kcj;
    }

    @Override
    @Generated
    public boolean dbK() {
        return this.hFE;
    }
}

