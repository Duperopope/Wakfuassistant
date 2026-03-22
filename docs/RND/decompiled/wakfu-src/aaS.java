/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;
import java.util.Arrays;

class aaS {
    final float[] ccp;
    final byte ccq;

    aaS(ScreenElement screenElement) {
        this.ccp = screenElement.ayR;
        this.ccq = screenElement.asf;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof aaS)) {
            return false;
        }
        aaS aaS2 = (aaS)object;
        if (this.ccq != aaS2.ccq) {
            return false;
        }
        return Arrays.equals(this.ccp, aaS2.ccp);
    }

    public int hashCode() {
        int n = Arrays.hashCode(this.ccp);
        n = 31 * n + this.ccq;
        return n;
    }

    public void a(fs_0 fs_02) {
        fs_02.g(this.ccq);
        for (int i = 0; i < this.ccp.length; ++i) {
            fs_02.g((byte)this.ccp[i]);
        }
    }
}

