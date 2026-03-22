/*
 * Decompiled with CFR 0.152.
 */
public class ewd {
    public final int oxT;
    public final int oxU;
    public final short oxV;
    public final abi_1 oxW;

    public ewd(int n, int n2, short s, abi_1 abi_12) {
        this.oxT = n;
        this.oxU = n2;
        this.oxV = s;
        this.oxW = abi_12;
    }

    ewd(apl_1 apl_12) {
        this.oxT = apl_12.aIA();
        this.oxU = apl_12.aIA();
        this.oxV = apl_12.aIz();
        this.oxW = abi_1.wG(apl_12.aIy());
    }

    void b(fs_0 fs_02) {
        fs_02.mz(this.oxT);
        fs_02.mz(this.oxU);
        fs_02.k(this.oxV);
        fs_02.g((byte)this.oxW.dzy);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof ewd)) {
            return false;
        }
        ewd ewd2 = (ewd)object;
        if (this.oxT != ewd2.oxT) {
            return false;
        }
        if (this.oxU != ewd2.oxU) {
            return false;
        }
        if (this.oxV != ewd2.oxV) {
            return false;
        }
        return this.oxW == ewd2.oxW;
    }

    public int hashCode() {
        int n = this.oxT;
        n = 31 * n + this.oxU;
        n = 31 * n + this.oxV;
        n = 31 * n + (this.oxW != null ? this.oxW.hashCode() : 0);
        return n;
    }
}

