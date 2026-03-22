/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from qF
 */
final class qf_2 {
    private int Vd = 0;
    private long Ve = 0L;
    private long Vf = 0L;
    private int Vg = 0;
    private long Vh = 0L;
    final /* synthetic */ qe_2 Vj;

    qf_2(qe_2 qe_22) {
        this.Vj = qe_22;
    }

    public void avW() {
        this.Vj.Vd = this.Vd;
        this.Vj.Ve = this.Ve;
        this.Vj.Vf = this.Vf;
        this.Vj.Vg = this.Vg;
        this.Vj.Vh = this.Vh;
    }

    private boolean dB(ByteBuffer byteBuffer) {
        this.Vd = byteBuffer.getInt();
        this.Ve = byteBuffer.getLong();
        this.Vf = byteBuffer.getLong();
        return true;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10021) {
            return false;
        }
        if (n < 10028001) {
            boolean bl = this.dB(byteBuffer);
            return bl;
        }
        return false;
    }
}

