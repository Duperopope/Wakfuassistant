/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.NotNull
 */
import java.util.EnumSet;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bpS
 */
public class bps_1
implements bug_0<bpb_1> {
    @NotNull
    private final EnumSet<bpr_0> iYq;

    public bps_1(EnumSet<bpr_0> enumSet) {
        this.iYq = enumSet;
    }

    @NotNull
    public EnumSet<bpr_0> dDM() {
        return this.iYq;
    }

    public boolean a(bpb_1 bpb_12) {
        if (!(bpb_12 instanceof bpe_1)) {
            return false;
        }
        bpe_1 bpe_12 = (bpe_1)bpb_12;
        for (bpr_0 bpr_02 : this.iYq) {
            if (!bpe_12.b(bpr_02)) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean isValid() {
        return !this.iYq.isEmpty();
    }

    @Override
    public buh_0 dcz() {
        return buh_0.joI;
    }

    @Generated
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof bps_1)) {
            return false;
        }
        bps_1 bps_12 = (bps_1)object;
        if (!bps_12.C(this)) {
            return false;
        }
        EnumSet<bpr_0> enumSet = this.dDM();
        EnumSet<bpr_0> enumSet2 = bps_12.dDM();
        return !(enumSet == null ? enumSet2 != null : !((Object)enumSet).equals(enumSet2));
    }

    @Generated
    protected boolean C(Object object) {
        return object instanceof bps_1;
    }

    @Generated
    public int hashCode() {
        int n = 59;
        int n2 = 1;
        EnumSet<bpr_0> enumSet = this.dDM();
        n2 = n2 * 59 + (enumSet == null ? 43 : ((Object)enumSet).hashCode());
        return n2;
    }

    @Override
    public /* synthetic */ boolean ah(Object object) {
        return this.a((bpb_1)object);
    }
}

