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

public class bpV
implements bug_0<bpb_1> {
    @NotNull
    private final EnumSet<fgj> iYx;

    public bpV(EnumSet<fgj> enumSet) {
        this.iYx = enumSet;
    }

    @NotNull
    public EnumSet<fgj> dDQ() {
        return this.iYx;
    }

    public boolean a(bpb_1 bpb_12) {
        if (!(bpb_12 instanceof bpe_1)) {
            return false;
        }
        bpe_1 bpe_12 = (bpe_1)bpb_12;
        return this.iYx.contains(bpe_12.duo().dwg());
    }

    @Override
    public boolean isValid() {
        return !this.iYx.isEmpty();
    }

    @Override
    public buh_0 dcz() {
        return buh_0.jov;
    }

    @Generated
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof bpV)) {
            return false;
        }
        bpV bpV2 = (bpV)object;
        if (!bpV2.C(this)) {
            return false;
        }
        EnumSet<fgj> enumSet = this.dDQ();
        EnumSet<fgj> enumSet2 = bpV2.dDQ();
        return !(enumSet == null ? enumSet2 != null : !((Object)enumSet).equals(enumSet2));
    }

    @Generated
    protected boolean C(Object object) {
        return object instanceof bpV;
    }

    @Generated
    public int hashCode() {
        int n = 59;
        int n2 = 1;
        EnumSet<fgj> enumSet = this.dDQ();
        n2 = n2 * 59 + (enumSet == null ? 43 : ((Object)enumSet).hashCode());
        return n2;
    }

    @Override
    public /* synthetic */ boolean ah(Object object) {
        return this.a((bpb_1)object);
    }
}

