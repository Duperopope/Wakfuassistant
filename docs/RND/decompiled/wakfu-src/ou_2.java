/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from oU
 */
final class ou_2 {
    private ov_2 RS = null;
    final /* synthetic */ os_2 RV;

    ou_2(os_2 os_22) {
        this.RV = os_22;
    }

    public void avW() {
        this.RV.RS = this.RS;
    }

    private boolean cF(ByteBuffer byteBuffer) {
        return true;
    }

    private boolean cx(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.RS = new ov_2();
            boolean bl3 = this.RS.b(byteBuffer, 1);
            if (!bl3) {
                return false;
            }
        } else {
            this.RS = null;
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
        if (n < 10013) {
            boolean bl = this.cx(byteBuffer);
            return bl;
        }
        return false;
    }
}

