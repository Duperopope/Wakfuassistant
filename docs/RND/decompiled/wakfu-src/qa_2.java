/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from qA
 */
final class qa_2 {
    private final vu_2 UW = new vu_2();
    final /* synthetic */ qy_2 UX;

    qa_2(qy_2 qy_22) {
        this.UX = qy_22;
    }

    public void avW() {
        this.UX.UT.agt.clear();
        this.UX.UT.agt.ensureCapacity(this.UW.agt.size());
        this.UX.UT.agt.addAll(this.UW.agt);
    }

    private boolean cF(ByteBuffer byteBuffer) {
        return true;
    }

    private boolean dB(ByteBuffer byteBuffer) {
        boolean bl = this.UW.b(byteBuffer, 10021);
        return bl;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 0) {
            return false;
        }
        if (n < 10021) {
            boolean bl = this.cF(byteBuffer);
            return bl;
        }
        if (n < 10028001) {
            boolean bl = this.dB(byteBuffer);
            return bl;
        }
        return false;
    }
}

