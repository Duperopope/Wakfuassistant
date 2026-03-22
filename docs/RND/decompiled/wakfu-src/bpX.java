/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Set;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;

public class bpX
implements bug_0<bpb_1> {
    @NotNull
    private final Set<Short> iYA;
    private final boolean iYB;
    @NotNull
    private final bpa_1 iYC;

    public bpX(Set<Short> set, @NotNull bpa_1 bpa_12) {
        this.iYA = set;
        this.iYB = set.contains((short)-1);
        this.iYC = bpa_12;
    }

    @NotNull
    public Set<Short> dDS() {
        return this.iYA;
    }

    public boolean a(bpb_1 bpb_12) {
        fhy_0 fhy_02;
        if (!(bpb_12 instanceof bpe_1)) {
            return false;
        }
        bpe_1 bpe_12 = (bpe_1)bpb_12;
        fhy_0 fhy_03 = fhy_02 = bpe_12.duo().dGh();
        while (true) {
            if (this.iYA.contains(fhy_03.aIi())) {
                return true;
            }
            if (fhy_03.fZm() == null) break;
            fhy_03 = fhy_03.fZm();
        }
        if (this.iYB) {
            return this.iYC.a(fhy_02);
        }
        return false;
    }

    @Override
    public boolean isValid() {
        return !this.iYA.isEmpty();
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
        if (!(object instanceof bpX)) {
            return false;
        }
        bpX bpX2 = (bpX)object;
        if (!bpX2.C(this)) {
            return false;
        }
        if (this.iYB != bpX2.iYB) {
            return false;
        }
        Set<Short> set = this.dDS();
        Set<Short> set2 = bpX2.dDS();
        if (set == null ? set2 != null : !((Object)set).equals(set2)) {
            return false;
        }
        bpa_1 bpa_12 = this.iYC;
        bpa_1 bpa_13 = bpX2.iYC;
        return !(bpa_12 == null ? bpa_13 != null : !bpa_12.equals(bpa_13));
    }

    @Generated
    protected boolean C(Object object) {
        return object instanceof bpX;
    }

    @Generated
    public int hashCode() {
        int n = 59;
        int n2 = 1;
        n2 = n2 * 59 + (this.iYB ? 79 : 97);
        Set<Short> set = this.dDS();
        n2 = n2 * 59 + (set == null ? 43 : ((Object)set).hashCode());
        bpa_1 bpa_12 = this.iYC;
        n2 = n2 * 59 + (bpa_12 == null ? 43 : bpa_12.hashCode());
        return n2;
    }

    @Override
    public /* synthetic */ boolean ah(Object object) {
        return this.a((bpb_1)object);
    }
}

