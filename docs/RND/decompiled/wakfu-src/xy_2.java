/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from xY
 */
final class xy_2 {
    private final ArrayList<xz_2> akR = new ArrayList(0);
    final /* synthetic */ xx_1 akS;

    xy_2(xx_1 xx_12) {
        this.akS = xx_12;
    }

    public void avW() {
        this.akS.akQ.clear();
        this.akS.akQ.ensureCapacity(this.akR.size());
        this.akS.akQ.addAll(this.akR);
    }

    private boolean cF(ByteBuffer byteBuffer) {
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

