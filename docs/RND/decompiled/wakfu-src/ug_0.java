/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Comparator;
import org.apache.log4j.Logger;

/*
 * Renamed from UG
 */
public abstract class ug_0 {
    private static final Logger bwE = Logger.getLogger(ug_0.class);
    public static final Comparator<ug_0> bwF = (ug_02, ug_03) -> {
        if (ug_02 == null || ug_02.bwG == null) {
            return ug_03 != null && ug_03.bwG != null ? -1 : 0;
        }
        if (ug_03 == null || ug_03.bwG == null) {
            return 1;
        }
        return ug_02.bwG.k(ug_03.bwG);
    };
    protected final uw_0 bwG;

    protected ug_0(ux_0 ux_02) {
        this.bwG = new uw_0(ux_02);
    }

    public ux_0 bjc() {
        return this.bwG;
    }

    public abstract void a(ut_0 var1);

    public ug_0 g(int n, int n2, int n3, int n4) {
        this.bwG.d(n, n2, n3, n4);
        return this;
    }

    public ug_0 c(uk_0 uk_02) {
        this.bwG.b(uk_02.bjH(), uk_02.bjF(), uk_02.bjE(), uk_02.bjR(), uk_02.bke(), uk_02.bkd());
        return this;
    }
}

