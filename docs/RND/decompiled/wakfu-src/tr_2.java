/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from tr
 */
final class tr_2 {
    private byte Rv = 0;
    private int aav = 0;
    private int aaw = 0;
    private int aax = 0;
    private int aay = 0;
    final /* synthetic */ tq_2 aaA;

    tr_2(tq_2 tq_22) {
        this.aaA = tq_22;
    }

    public void avW() {
        this.aaA.Rv = this.Rv;
        this.aaA.aav = this.aav;
        this.aaA.aaw = this.aaw;
        this.aaA.aax = this.aax;
        this.aaA.aay = this.aay;
    }

    private boolean cx(ByteBuffer byteBuffer) {
        this.Rv = byteBuffer.get();
        this.aav = byteBuffer.getInt();
        this.aaw = byteBuffer.getInt();
        this.aax = byteBuffer.getInt();
        return true;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 0x992323) {
            boolean bl = this.cx(byteBuffer);
            return bl;
        }
        return false;
    }
}

