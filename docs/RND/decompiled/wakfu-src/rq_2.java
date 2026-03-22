/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from rq
 */
final class rq_2 {
    private int WB = 0;
    private int WC = 0;
    private int WD = 0;
    private int WE = 0;
    private int WF = 0;
    private int WG = 0;
    final /* synthetic */ rp_1 WJ;

    rq_2(rp_1 rp_12) {
        this.WJ = rp_12;
    }

    public void avW() {
        this.WJ.WB = this.WB;
        this.WJ.WC = this.WC;
        this.WJ.WD = this.WD;
        this.WJ.WE = this.WE;
        this.WJ.WF = this.WF;
        this.WJ.WG = this.WG;
    }

    private boolean cx(ByteBuffer byteBuffer) {
        this.WB = byteBuffer.getInt();
        this.WC = byteBuffer.getInt();
        this.WD = byteBuffer.getInt();
        this.WE = byteBuffer.getInt();
        this.WF = byteBuffer.getInt();
        return true;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10035004) {
            boolean bl = this.cx(byteBuffer);
            return bl;
        }
        return false;
    }
}

