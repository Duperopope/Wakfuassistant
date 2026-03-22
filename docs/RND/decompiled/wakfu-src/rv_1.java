/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from rv
 */
final class rv_1 {
    private int WO = 0;
    private int WP = 0;
    private short WQ = 0;
    private long UB = 0L;
    private byte WR = 0;
    private rw_2 WS = null;
    final /* synthetic */ rt_2 WV;

    rv_1(rt_2 rt_22) {
        this.WV = rt_22;
    }

    public void avW() {
        this.WV.WO = this.WO;
        this.WV.WP = this.WP;
        this.WV.WQ = this.WQ;
        this.WV.UB = this.UB;
        this.WV.WR = this.WR;
        this.WV.WS = this.WS;
    }

    private boolean cF(ByteBuffer byteBuffer) {
        boolean bl;
        boolean bl2 = bl = byteBuffer.get() == 1;
        if (bl) {
            this.WS = new rw_2();
            boolean bl3 = this.WS.b(byteBuffer, 0);
            if (!bl3) {
                return false;
            }
        } else {
            this.WS = null;
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
        return false;
    }
}

