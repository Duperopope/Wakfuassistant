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
 * Renamed from bqb
 */
public class bqb_0
implements bqd_0,
bqg_0 {
    @Nullable
    private final String iYI;
    @Nullable
    private final Integer iYJ;

    public bqb_0(@NotNull String string) {
        this.iYI = string;
        this.iYJ = null;
    }

    public bqb_0(int n) {
        this.iYI = null;
        this.iYJ = n;
    }

    public boolean a(bpb_1 bpb_12) {
        if (this.iYI == null && this.iYJ == null) {
            return true;
        }
        if (!(bpb_12 instanceof bpg_1)) {
            return false;
        }
        bpg_1 bpg_12 = (bpg_1)bpb_12;
        if (this.iYJ != null) {
            return bpg_12.P(this.iYJ);
        }
        return bpg_12.dDA().contains(this.iYI);
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
        if (this.iYI == null && this.iYJ == null) {
            return "";
        }
        return this.iYI != null ? this.iYI : bgv_2.Dm(this.iYJ);
    }

    @Override
    @NotNull
    public bqc_0 dDH() {
        return bqc_0.iYL;
    }

    @Generated
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof bqb_0)) {
            return false;
        }
        bqb_0 bqb_02 = (bqb_0)object;
        if (!bqb_02.C(this)) {
            return false;
        }
        Integer n = this.iYJ;
        Integer n2 = bqb_02.iYJ;
        if (n == null ? n2 != null : !((Object)n).equals(n2)) {
            return false;
        }
        String string = this.iYI;
        String string2 = bqb_02.iYI;
        return !(string == null ? string2 != null : !string.equals(string2));
    }

    @Generated
    protected boolean C(Object object) {
        return object instanceof bqb_0;
    }

    @Generated
    public int hashCode() {
        int n = 59;
        int n2 = 1;
        Integer n3 = this.iYJ;
        n2 = n2 * 59 + (n3 == null ? 43 : ((Object)n3).hashCode());
        String string = this.iYI;
        n2 = n2 * 59 + (string == null ? 43 : string.hashCode());
        return n2;
    }

    @Override
    public /* synthetic */ boolean ah(Object object) {
        return this.a((bpb_1)object);
    }
}

