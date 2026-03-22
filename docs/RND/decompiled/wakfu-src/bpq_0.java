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
 * Renamed from bpQ
 */
public class bpq_0
implements bug_0<bpb_1> {
    @NotNull
    private final EnumSet<ffS> iYa;

    public bpq_0(@NotNull EnumSet<ffS> enumSet) {
        this.iYa = enumSet;
    }

    @NotNull
    public EnumSet<ffS> dDI() {
        return this.iYa;
    }

    public boolean a(bpb_1 bpb_12) {
        if (!(bpb_12 instanceof bpe_1)) {
            return false;
        }
        bpe_1 bpe_12 = (bpe_1)bpb_12;
        for (ffS ffS2 : bpe_12.duo().dGh().fZq()) {
            if (!this.iYa.contains(ffS2)) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean isValid() {
        return !this.iYa.isEmpty();
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
        if (!(object instanceof bpq_0)) {
            return false;
        }
        bpq_0 bpq_02 = (bpq_0)object;
        if (!bpq_02.C(this)) {
            return false;
        }
        EnumSet<ffS> enumSet = this.dDI();
        EnumSet<ffS> enumSet2 = bpq_02.dDI();
        return !(enumSet == null ? enumSet2 != null : !((Object)enumSet).equals(enumSet2));
    }

    @Generated
    protected boolean C(Object object) {
        return object instanceof bpq_0;
    }

    @Generated
    public int hashCode() {
        int n = 59;
        int n2 = 1;
        EnumSet<ffS> enumSet = this.dDI();
        n2 = n2 * 59 + (enumSet == null ? 43 : ((Object)enumSet).hashCode());
        return n2;
    }

    @Override
    public /* synthetic */ boolean ah(Object object) {
        return this.a((bpb_1)object);
    }
}

