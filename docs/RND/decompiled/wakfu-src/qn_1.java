/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from qN
 */
final class qn_1 {
    private int Vx = -1;
    private int Vy = -1;
    private long Vz = -1L;
    final /* synthetic */ qm_1 VB;

    qn_1(qm_1 qm_12) {
        this.VB = qm_12;
    }

    public void avW() {
        this.VB.Vx = this.Vx;
        this.VB.Vy = this.Vy;
        this.VB.Vz = this.Vz;
    }

    private boolean cx(ByteBuffer byteBuffer) {
        this.Vx = byteBuffer.getInt();
        return true;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10053002) {
            boolean bl = this.cx(byteBuffer);
            return bl;
        }
        return false;
    }
}

