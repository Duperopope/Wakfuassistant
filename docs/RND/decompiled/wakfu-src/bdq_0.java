/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Contract
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bDQ
 */
public class bdq_0 {
    private static final bdq_0 jLD = new bdq_0();
    private final Set<Long> jLE = new HashSet<Long>();

    public static bdq_0 dRC() {
        return jLD;
    }

    private bdq_0() {
    }

    @Contract(pure=true)
    public boolean ab(@NotNull ffV ffV2) {
        return this.jLE.contains(ffV2.LV());
    }

    @Contract(pure=true)
    public boolean dI(long l) {
        return this.jLE.contains(l);
    }

    public void b(long l, boolean bl) {
        if (bl) {
            this.jLE.add(l);
        } else {
            this.jLE.remove(l);
        }
        ffs_0 ffs_02 = fcI.aq(bbs_2.xl(), l);
        if (ffs_02 != null) {
            ffs_02.fVb().b(l, bl);
        } else {
            this.jLE.remove(l);
        }
    }

    public void a(Collection<ffV> collection, boolean bl) {
        for (ffV ffV2 : collection) {
            this.b(ffV2.LV(), bl);
        }
    }

    public void c(ffs_0 ffs_02) {
        for (ffV ffV2 : ffs_02) {
            long l = ffV2.LV();
            if (ffs_02.fVb().dI(l)) {
                this.jLE.add(l);
                continue;
            }
            this.jLE.remove(l);
        }
    }

    public void dRD() {
        this.jLE.clear();
    }
}

