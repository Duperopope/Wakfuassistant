/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vW
 */
final class vw_2 {
    private int Vd = 0;
    private long Ve = 0L;
    private int Vg = 0;
    private long agu = 0L;
    final /* synthetic */ vv_1 agw;

    vw_2(vv_1 vv_12) {
        this.agw = vv_12;
    }

    public void avW() {
        this.agw.Vd = this.Vd;
        this.agw.Ve = this.Ve;
        this.agw.Vg = this.Vg;
        this.agw.agu = this.agu;
    }

    private boolean cF(ByteBuffer byteBuffer) {
        this.Vd = byteBuffer.getInt();
        this.Ve = byteBuffer.getLong();
        return true;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 0) {
            return false;
        }
        if (n < 10028001) {
            boolean bl = this.cF(byteBuffer);
            return bl;
        }
        return false;
    }
}

