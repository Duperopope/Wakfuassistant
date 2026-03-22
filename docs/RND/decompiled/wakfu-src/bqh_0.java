/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.NotNull
 */
import java.util.List;
import java.util.Set;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bqh
 */
public class bqh_0
implements bug_0<bpb_1> {
    @NotNull
    private final Set<Integer> iZc;
    private final boolean iZd;

    public bqh_0(Set<Integer> set) {
        this.iZc = set;
        this.iZd = set.contains(-1);
    }

    @NotNull
    public Set<Integer> dDY() {
        return this.iZc;
    }

    public boolean a(bpb_1 bpb_12) {
        if (!(bpb_12 instanceof bpg_1)) {
            return false;
        }
        bpg_1 bpg_12 = (bpg_1)bpb_12;
        List<Integer> list = bpm_1.dCG().EW(bpg_12.dDw().cqy());
        for (Integer n : list) {
            if (!this.iZc.contains(n)) continue;
            return true;
        }
        if (this.iZd) {
            return list.isEmpty();
        }
        return false;
    }

    @Override
    public boolean isValid() {
        return !this.iZc.isEmpty();
    }

    @Override
    public buh_0 dcz() {
        return buh_0.joR;
    }

    @Generated
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof bqh_0)) {
            return false;
        }
        bqh_0 bqh_02 = (bqh_0)object;
        if (!bqh_02.C(this)) {
            return false;
        }
        if (this.iZd != bqh_02.iZd) {
            return false;
        }
        Set<Integer> set = this.dDY();
        Set<Integer> set2 = bqh_02.dDY();
        return !(set == null ? set2 != null : !((Object)set).equals(set2));
    }

    @Generated
    protected boolean C(Object object) {
        return object instanceof bqh_0;
    }

    @Generated
    public int hashCode() {
        int n = 59;
        int n2 = 1;
        n2 = n2 * 59 + (this.iZd ? 79 : 97);
        Set<Integer> set = this.dDY();
        n2 = n2 * 59 + (set == null ? 43 : ((Object)set).hashCode());
        return n2;
    }

    @Override
    public /* synthetic */ boolean ah(Object object) {
        return this.a((bpb_1)object);
    }
}

