/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.NotNull
 */
import lombok.Generated;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bpN
 */
public class bpn_0
implements bqg_0 {
    private final int iXY;
    @NotNull
    private final String iXZ;

    public bpn_0(int n, @NotNull String string) {
        this.iXY = n;
        this.iXZ = string;
    }

    public int dDF() {
        return this.iXY;
    }

    public boolean a(bpb_1 bpb_12) {
        return bpb_12.d() == this.iXY;
    }

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    @NotNull
    public String dDG() {
        return this.iXZ;
    }

    @Override
    public buh_0 dcz() {
        return buh_0.jot;
    }

    @Generated
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof bpn_0)) {
            return false;
        }
        bpn_0 bpn_02 = (bpn_0)object;
        if (!bpn_02.C(this)) {
            return false;
        }
        if (this.dDF() != bpn_02.dDF()) {
            return false;
        }
        String string = this.iXZ;
        String string2 = bpn_02.iXZ;
        return !(string == null ? string2 != null : !string.equals(string2));
    }

    @Generated
    protected boolean C(Object object) {
        return object instanceof bpn_0;
    }

    @Generated
    public int hashCode() {
        int n = 59;
        int n2 = 1;
        n2 = n2 * 59 + this.dDF();
        String string = this.iXZ;
        n2 = n2 * 59 + (string == null ? 43 : string.hashCode());
        return n2;
    }

    @Override
    public /* synthetic */ boolean ah(Object object) {
        return this.a((bpb_1)object);
    }
}

