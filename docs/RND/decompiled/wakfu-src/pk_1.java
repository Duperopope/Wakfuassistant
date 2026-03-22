/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from pk
 */
final class pk_1 {
    private pl_2 Ss = null;
    final /* synthetic */ pi_2 Sv;

    pk_1(pi_2 pi_22) {
        this.Sv = pi_22;
    }

    public void avW() {
        this.Sv.Ss = this.Ss;
    }

    private boolean cF(ByteBuffer byteBuffer) {
        return true;
    }

    private boolean cx(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.Ss = new pl_2();
            boolean bl3 = this.Ss.b(byteBuffer, 1);
            if (!bl3) {
                return false;
            }
        } else {
            this.Ss = null;
        }
        return true;
    }

    private boolean de(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.Ss = new pl_2();
            boolean bl3 = this.Ss.b(byteBuffer, 10027003);
            if (!bl3) {
                return false;
            }
        } else {
            this.Ss = null;
        }
        return true;
    }

    private boolean df(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.Ss = new pl_2();
            boolean bl3 = this.Ss.b(byteBuffer, 10031000);
            if (!bl3) {
                return false;
            }
        } else {
            this.Ss = null;
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
        if (n < 10027003) {
            boolean bl = this.cx(byteBuffer);
            return bl;
        }
        if (n < 10031000) {
            boolean bl = this.de(byteBuffer);
            return bl;
        }
        if (n < 10047003) {
            boolean bl = this.df(byteBuffer);
            return bl;
        }
        return false;
    }
}

