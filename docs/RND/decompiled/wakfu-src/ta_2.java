/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from tA
 */
final class ta_2 {
    private int aaQ = 0;
    private byte aaR = 0;
    final /* synthetic */ tz_2 aaT;

    ta_2(tz_2 tz_22) {
        this.aaT = tz_22;
    }

    public void avW() {
        this.aaT.aaQ = this.aaQ;
        this.aaT.aaR = this.aaR;
    }

    private boolean cF(ByteBuffer byteBuffer) {
        this.aaQ = byteBuffer.getInt();
        return true;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 0) {
            return false;
        }
        if (n < 10045002) {
            boolean bl = this.cF(byteBuffer);
            return bl;
        }
        return false;
    }
}

