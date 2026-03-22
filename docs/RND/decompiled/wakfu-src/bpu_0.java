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
 * Renamed from bpU
 */
public class bpu_0
implements bug_0<bpb_1> {
    @NotNull
    private final EnumSet<bpT> iYw;

    public bpu_0(EnumSet<bpT> enumSet) {
        this.iYw = enumSet;
    }

    @NotNull
    public EnumSet<bpT> dDP() {
        return this.iYw;
    }

    public boolean a(bpb_1 bpb_12) {
        if (!(bpb_12 instanceof bpe_1)) {
            return false;
        }
        bpe_1 bpe_12 = (bpe_1)bpb_12;
        for (bpT bpT2 : this.iYw) {
            if (!bpT2.dDN().contains(bpe_12.duo().fVc())) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean isValid() {
        return !this.iYw.isEmpty();
    }

    @Override
    public buh_0 dcz() {
        return buh_0.joJ;
    }

    @Generated
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof bpu_0)) {
            return false;
        }
        bpu_0 bpu_02 = (bpu_0)object;
        if (!bpu_02.C(this)) {
            return false;
        }
        EnumSet<bpT> enumSet = this.iYw;
        EnumSet<bpT> enumSet2 = bpu_02.iYw;
        return !(enumSet == null ? enumSet2 != null : !((Object)enumSet).equals(enumSet2));
    }

    @Generated
    protected boolean C(Object object) {
        return object instanceof bpu_0;
    }

    @Generated
    public int hashCode() {
        int n = 59;
        int n2 = 1;
        EnumSet<bpT> enumSet = this.iYw;
        n2 = n2 * 59 + (enumSet == null ? 43 : ((Object)enumSet).hashCode());
        return n2;
    }

    @Override
    public /* synthetic */ boolean ah(Object object) {
        return this.a((bpb_1)object);
    }
}

