/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.NotNull
 */
import java.util.EnumSet;
import java.util.Set;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bqf
 */
public class bqf_0
implements bug_0<bpb_1> {
    @NotNull
    private final EnumSet<bqe_0> iZb;

    public bqf_0(EnumSet<bqe_0> enumSet) {
        this.iZb = enumSet;
    }

    @NotNull
    public EnumSet<bqe_0> dDX() {
        return this.iZb;
    }

    public boolean a(bpb_1 bpb_12) {
        if (!(bpb_12 instanceof bpg_1)) {
            return false;
        }
        bpg_1 bpg_12 = (bpg_1)bpb_12;
        Set<ezj_0> set = bpg_12.dDx();
        for (bqe_0 bqe_02 : this.iZb) {
            ezj_0 ezj_02 = bqe_02.dDU();
            if (ezj_02 == null && !bqe_0.u(set)) {
                return true;
            }
            if (ezj_02 == null || !set.contains(ezj_02)) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean isValid() {
        return !this.iZb.isEmpty();
    }

    @Override
    public buh_0 dcz() {
        return buh_0.jow;
    }

    @Generated
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof bqf_0)) {
            return false;
        }
        bqf_0 bqf_02 = (bqf_0)object;
        if (!bqf_02.C(this)) {
            return false;
        }
        EnumSet<bqe_0> enumSet = this.dDX();
        EnumSet<bqe_0> enumSet2 = bqf_02.dDX();
        return !(enumSet == null ? enumSet2 != null : !((Object)enumSet).equals(enumSet2));
    }

    @Generated
    protected boolean C(Object object) {
        return object instanceof bqf_0;
    }

    @Generated
    public int hashCode() {
        int n = 59;
        int n2 = 1;
        EnumSet<bqe_0> enumSet = this.dDX();
        n2 = n2 * 59 + (enumSet == null ? 43 : ((Object)enumSet).hashCode());
        return n2;
    }

    @Override
    public /* synthetic */ boolean ah(Object object) {
        return this.a((bpb_1)object);
    }
}

