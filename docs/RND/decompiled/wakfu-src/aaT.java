/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;

class aaT {
    final int ccr;
    final short ccs;
    final int cct;

    aaT(ScreenElement screenElement) {
        this.ccr = screenElement.cbR;
        this.ccs = screenElement.bZd;
        this.cct = screenElement.bXO;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof aaT)) {
            return false;
        }
        aaT aaT2 = (aaT)object;
        if (this.cct != aaT2.cct) {
            return false;
        }
        if (this.ccr != aaT2.ccr) {
            return false;
        }
        return this.ccs == aaT2.ccs;
    }

    public int hashCode() {
        int n = this.ccr;
        n = 31 * n + this.ccs;
        n = 31 * n + this.cct;
        return n;
    }

    public void a(fs_0 fs_02) {
        fs_02.mz(this.ccr);
        fs_02.g((byte)this.ccs);
        fs_02.mz(this.cct);
    }
}

