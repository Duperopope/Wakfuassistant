/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Set;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class bpZ
implements bqd_0,
bqg_0 {
    @Nullable
    private final String iYE;
    @Nullable
    private final Integer iYF;

    public bpZ(@NotNull String string) {
        this.iYE = string;
        this.iYF = null;
    }

    public bpZ(int n) {
        this.iYE = null;
        this.iYF = n;
    }

    public boolean a(bpb_1 bpb_12) {
        if (this.iYE == null && this.iYF == null) {
            return true;
        }
        if (!(bpb_12 instanceof bpg_1)) {
            return false;
        }
        bpg_1 bpg_12 = (bpg_1)bpb_12;
        Set<Integer> set = bpm_1.dCG().EX(bpg_12.d());
        if (this.iYF != null) {
            return set.contains(this.iYF);
        }
        if (this.iYE.isEmpty()) {
            return true;
        }
        for (Integer n : set) {
            if (!bny_0.e(n, this.iYE)) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public buh_0 dcz() {
        return buh_0.jot;
    }

    @Override
    @NotNull
    public String dDG() {
        if (this.iYE == null && this.iYF == null) {
            return "";
        }
        if (this.iYE != null) {
            return this.iYE;
        }
        return bny_0.Dm(this.iYF);
    }

    @Override
    @NotNull
    public bqc_0 dDH() {
        return bqc_0.iYN;
    }

    @Generated
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof bpZ)) {
            return false;
        }
        bpZ bpZ2 = (bpZ)object;
        if (!bpZ2.C(this)) {
            return false;
        }
        Integer n = this.iYF;
        Integer n2 = bpZ2.iYF;
        if (n == null ? n2 != null : !((Object)n).equals(n2)) {
            return false;
        }
        String string = this.iYE;
        String string2 = bpZ2.iYE;
        return !(string == null ? string2 != null : !string.equals(string2));
    }

    @Generated
    protected boolean C(Object object) {
        return object instanceof bpZ;
    }

    @Generated
    public int hashCode() {
        int n = 59;
        int n2 = 1;
        Integer n3 = this.iYF;
        n2 = n2 * 59 + (n3 == null ? 43 : ((Object)n3).hashCode());
        String string = this.iYE;
        n2 = n2 * 59 + (string == null ? 43 : string.hashCode());
        return n2;
    }

    @Override
    public /* synthetic */ boolean ah(Object object) {
        return this.a((bpb_1)object);
    }
}

