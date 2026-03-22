/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import lombok.Generated;

public class bpY
implements bug_0<bpb_1> {
    private final boolean iYD;

    public bpY(boolean bl) {
        this.iYD = bl;
    }

    public boolean a(bpb_1 bpb_12) {
        if (!this.iYD) {
            return true;
        }
        if (!(bpb_12 instanceof bpg_1)) {
            return false;
        }
        bpg_1 bpg_12 = (bpg_1)bpb_12;
        return bpg_12.b(exe_1.rDO);
    }

    @Override
    public boolean isValid() {
        return this.iYD;
    }

    @Override
    public buh_0 dcz() {
        return buh_0.joQ;
    }

    @Generated
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof bpY)) {
            return false;
        }
        bpY bpY2 = (bpY)object;
        if (!bpY2.C(this)) {
            return false;
        }
        return this.iYD == bpY2.iYD;
    }

    @Generated
    protected boolean C(Object object) {
        return object instanceof bpY;
    }

    @Generated
    public int hashCode() {
        int n = 59;
        int n2 = 1;
        n2 = n2 * 59 + (this.iYD ? 79 : 97);
        return n2;
    }

    @Override
    public /* synthetic */ boolean ah(Object object) {
        return this.a((bpb_1)object);
    }
}

