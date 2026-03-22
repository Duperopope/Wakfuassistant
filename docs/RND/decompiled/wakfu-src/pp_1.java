/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from pp
 */
final class pp_1 {
    private pq_2 SC = null;
    private boolean SD = false;
    final /* synthetic */ pn_2 SG;

    pp_1(pn_2 pn_22) {
        this.SG = pn_22;
    }

    public void avW() {
        this.SG.SC = this.SC;
        this.SG.SD = this.SD;
    }

    private boolean cF(ByteBuffer byteBuffer) {
        return true;
    }

    private boolean cx(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.SC = new pq_2();
            boolean bl3 = this.SC.b(byteBuffer, 1);
            if (!bl3) {
                return false;
            }
        } else {
            this.SC = null;
        }
        return true;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 0) {
            return false;
        }
        if (n < 1) {
            boolean bl = this.cF(byteBuffer);
            return bl;
        }
        if (n < 10087000) {
            boolean bl = this.cx(byteBuffer);
            return bl;
        }
        return false;
    }
}

