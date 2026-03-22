/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from rk
 */
final class rk_2 {
    private int[] Wq = null;
    private int[] Wr = null;
    private int[] Ws = null;
    final /* synthetic */ ri_1 Wv;

    rk_2(ri_1 ri_12) {
        this.Wv = ri_12;
    }

    public void avW() {
        this.Wv.Wq = this.Wq;
        this.Wv.Wr = this.Wr;
        this.Wv.Ws = this.Ws;
    }

    private boolean cx(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        if (n2 > 0) {
            this.Wq = new int[n2];
            for (n = 0; n < n2; ++n) {
                this.Wq[n] = byteBuffer.getInt();
            }
        } else {
            this.Wq = null;
        }
        if ((n = byteBuffer.getShort() & 0xFFFF) > 0) {
            this.Wr = new int[n];
            for (int i = 0; i < n; ++i) {
                this.Wr[i] = byteBuffer.getInt();
            }
        } else {
            this.Wr = null;
        }
        return true;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10026000) {
            boolean bl = this.cx(byteBuffer);
            return bl;
        }
        return false;
    }
}

