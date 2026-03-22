/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import lombok.Generated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bqa
 */
public class bqa_0
implements bqd_0,
bqg_0 {
    @Nullable
    private final String iYG;
    @Nullable
    private final Integer iYH;

    public bqa_0(@NotNull String string) {
        this.iYG = string;
        this.iYH = null;
    }

    public bqa_0(int n) {
        this.iYG = null;
        this.iYH = n;
    }

    public boolean a(bpb_1 bpb_12) {
        if (this.iYG == null && this.iYH == null) {
            return true;
        }
        if (!(bpb_12 instanceof bpg_1)) {
            return false;
        }
        bpg_1 bpg_12 = (bpg_1)bpb_12;
        if (this.iYH != null) {
            return bpg_12.dDw().cqy() == this.iYH.intValue();
        }
        return bpg_12.dDw().drF().contains(this.iYG);
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
        if (this.iYG == null && this.iYH == null) {
            return "";
        }
        if (this.iYG != null) {
            return this.iYG;
        }
        return bjz_1.Ds(this.iYH);
    }

    @Override
    @NotNull
    public bqc_0 dDH() {
        return bqc_0.iYM;
    }

    @Generated
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof bqa_0)) {
            return false;
        }
        bqa_0 bqa_02 = (bqa_0)object;
        if (!bqa_02.C(this)) {
            return false;
        }
        Integer n = this.iYH;
        Integer n2 = bqa_02.iYH;
        if (n == null ? n2 != null : !((Object)n).equals(n2)) {
            return false;
        }
        String string = this.iYG;
        String string2 = bqa_02.iYG;
        return !(string == null ? string2 != null : !string.equals(string2));
    }

    @Generated
    protected boolean C(Object object) {
        return object instanceof bqa_0;
    }

    @Generated
    public int hashCode() {
        int n = 59;
        int n2 = 1;
        Integer n3 = this.iYH;
        n2 = n2 * 59 + (n3 == null ? 43 : ((Object)n3).hashCode());
        String string = this.iYG;
        n2 = n2 * 59 + (string == null ? 43 : string.hashCode());
        return n2;
    }

    @Override
    public /* synthetic */ boolean ah(Object object) {
        return this.a((bpb_1)object);
    }
}

