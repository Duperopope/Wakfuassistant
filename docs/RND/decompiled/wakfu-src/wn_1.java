/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from wN
 */
final class wn_1 {
    private int aiw = 0;
    private int aix = 0;
    private int aiy = 0;
    final /* synthetic */ wm_2 aiA;

    wn_1(wm_2 wm_22) {
        this.aiA = wm_22;
    }

    public void avW() {
        this.aiA.aiw = this.aiw;
        this.aiA.aix = this.aix;
        this.aiA.aiy = this.aiy;
    }

    private boolean cx(ByteBuffer byteBuffer) {
        this.aiw = byteBuffer.getInt();
        this.aix = byteBuffer.getInt();
        return true;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 313) {
            boolean bl = this.cx(byteBuffer);
            return bl;
        }
        return false;
    }
}

