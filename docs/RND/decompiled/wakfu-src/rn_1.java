/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from rn
 */
final class rn_1 {
    private rp_1 Ww = null;
    private ro_1 Wx = null;
    final /* synthetic */ rl_2 WA;

    rn_1(rl_2 rl_22) {
        this.WA = rl_22;
    }

    public void avW() {
        this.WA.Ww = this.Ww;
        this.WA.Wx = this.Wx;
    }

    private boolean cF(ByteBuffer byteBuffer) {
        return true;
    }

    private boolean cx(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.Ww = new rp_1();
            boolean bl3 = this.Ww.b(byteBuffer, 1);
            if (!bl3) {
                return false;
            }
        } else {
            this.Ww = null;
        }
        return true;
    }

    private boolean cP(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.Ww = new rp_1();
            boolean bl3 = this.Ww.b(byteBuffer, 10035004);
            if (!bl3) {
                return false;
            }
        } else {
            this.Ww = null;
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
        if (n < 10035004) {
            boolean bl = this.cx(byteBuffer);
            return bl;
        }
        if (n < 10035005) {
            boolean bl = this.cP(byteBuffer);
            return bl;
        }
        return false;
    }
}

