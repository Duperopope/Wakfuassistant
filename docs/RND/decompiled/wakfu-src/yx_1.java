/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from yx
 */
final class yx_1 {
    private long adP = 0L;
    private short alQ = 0;
    private short Xr = 0;
    private int alR = 0;
    private long ajC = 0L;
    final /* synthetic */ yw_1 alT;

    yx_1(yw_1 yw_12) {
        this.alT = yw_12;
    }

    public void avW() {
        this.alT.adP = this.adP;
        this.alT.alQ = this.alQ;
        this.alT.Xr = this.Xr;
        this.alT.alR = this.alR;
        this.alT.ajC = this.ajC;
    }

    private boolean cx(ByteBuffer byteBuffer) {
        this.adP = byteBuffer.getLong();
        this.alQ = byteBuffer.getShort();
        this.Xr = byteBuffer.getShort();
        this.alR = byteBuffer.getInt();
        return true;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10034001) {
            boolean bl = this.cx(byteBuffer);
            return bl;
        }
        return false;
    }
}

