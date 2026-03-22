/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from rR
 */
final class rr_2 {
    private rs_2 Xy = null;
    private rt_1 Xz = null;
    final /* synthetic */ rp_2 XC;

    rr_2(rp_2 rp_22) {
        this.XC = rp_22;
    }

    public void avW() {
        this.XC.Xy = this.Xy;
        this.XC.Xz = this.Xz;
    }

    private boolean cF(ByteBuffer byteBuffer) {
        return true;
    }

    private boolean cx(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2;
        boolean bl3 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            this.Xy = new rs_2();
            bl = this.Xy.b(byteBuffer, 1);
            if (!bl) {
                return false;
            }
        } else {
            this.Xy = null;
        }
        boolean bl4 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.Xz = new rt_1();
            boolean bl5 = this.Xz.b(byteBuffer, 1);
            if (!bl5) {
                return false;
            }
        } else {
            this.Xz = null;
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
        if (n < 10034001) {
            boolean bl = this.cx(byteBuffer);
            return bl;
        }
        return false;
    }
}

