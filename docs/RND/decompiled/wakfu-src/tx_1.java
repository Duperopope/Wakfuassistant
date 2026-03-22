/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from tx
 */
final class tx_1 {
    private tv_1 aaE = null;
    final /* synthetic */ tu_2 aaN;

    tx_1(tu_2 tu_22) {
        this.aaN = tu_22;
    }

    public void avW() {
        this.aaN.aaE = this.aaE;
    }

    private boolean cF(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.aaE = new tv_1();
            boolean bl3 = this.aaE.b(byteBuffer, 0);
            if (!bl3) {
                return false;
            }
        } else {
            this.aaE = null;
        }
        return true;
    }

    private boolean db(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.aaE = new tv_1();
            boolean bl3 = this.aaE.b(byteBuffer, 10075002);
            if (!bl3) {
                return false;
            }
        } else {
            this.aaE = null;
        }
        return true;
    }

    private boolean dc(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.aaE = new tv_1();
            boolean bl3 = this.aaE.b(byteBuffer, 10076001);
            if (!bl3) {
                return false;
            }
        } else {
            this.aaE = null;
        }
        return true;
    }

    private boolean dd(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.aaE = new tv_1();
            boolean bl3 = this.aaE.b(byteBuffer, 10079000);
            if (!bl3) {
                return false;
            }
        } else {
            this.aaE = null;
        }
        return true;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 0) {
            return false;
        }
        if (n < 10075002) {
            boolean bl = this.cF(byteBuffer);
            return bl;
        }
        if (n < 10076001) {
            boolean bl = this.db(byteBuffer);
            return bl;
        }
        if (n < 10079000) {
            boolean bl = this.dc(byteBuffer);
            return bl;
        }
        if (n < 10084000) {
            boolean bl = this.dd(byteBuffer);
            return bl;
        }
        return false;
    }
}

