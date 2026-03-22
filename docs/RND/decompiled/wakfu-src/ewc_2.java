/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eWc
 */
public final class ewc_2 {
    private boolean dmn;
    private final ewb_2 rAP = new ewb_2();
    private final Set<QQ> rAQ = new HashSet<QQ>();
    private final Map<QQ, Set<fqH>> rAR = new HashMap<QQ, Set<fqH>>();

    public void fNE() {
        if (this.dmn) {
            return;
        }
        this.dmn = true;
        this.rAP.bot();
        this.rAP.a(this.rAQ, this.rAR);
    }

    public boolean fNF() {
        Set<QQ> set = this.rAQ;
        return !set.isEmpty();
    }

    public boolean fNG() {
        for (Set<fqH> set : this.rAR.values()) {
            if (set.contains((Object)fqH.sUX)) continue;
            return true;
        }
        return false;
    }

    public boolean fNH() {
        for (Set<fqH> set : this.rAR.values()) {
            if (set.contains((Object)fqH.sVj) || set.contains((Object)fqH.sUX)) continue;
            return true;
        }
        return false;
    }

    public boolean fNI() {
        for (Set<fqH> set : this.rAR.values()) {
            if (!set.isEmpty()) continue;
            return true;
        }
        return false;
    }

    @Nullable
    public QQ cWA() {
        for (Map.Entry<QQ, Set<fqH>> entry : this.rAR.entrySet()) {
            if (!entry.getValue().isEmpty()) continue;
            return entry.getKey();
        }
        return null;
    }

    @Nullable
    public QQ cWz() {
        Set<QQ> set = this.rAQ;
        if (set.isEmpty()) {
            return null;
        }
        return set.iterator().next();
    }

    public void a(eub_0 eub_02, exP exP2, fqE fqE2, int n, int n2, acd_1 acd_12) {
        this.rAP.a(eub_02, exP2, fqE2, n, n2, acd_12);
        this.dmn = false;
    }

    private void fND() {
        this.rAP.fND();
        this.dmn = false;
    }

    public void clear() {
        this.fND();
        this.rAR.clear();
        this.rAQ.clear();
    }
}

