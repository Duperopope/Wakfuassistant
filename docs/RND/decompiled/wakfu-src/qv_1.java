/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from qV
 */
final class qv_1 {
    private long VG = 0L;
    private long VM = 0L;
    final /* synthetic */ qt_1 VS;

    qv_1(qt_1 qt_12) {
        this.VS = qt_12;
    }

    public void avW() {
        this.VS.VG = this.VG;
    }

    private boolean dH(ByteBuffer byteBuffer) {
        this.VG = byteBuffer.getLong();
        return true;
    }

    private boolean dG(ByteBuffer byteBuffer) {
        this.VG = byteBuffer.getLong();
        this.VM = byteBuffer.getLong();
        return true;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10036012) {
            return false;
        }
        if (n < 10036014) {
            boolean bl = this.dH(byteBuffer);
            return bl;
        }
        if (n < 10057000) {
            boolean bl = this.dG(byteBuffer);
            return bl;
        }
        return false;
    }
}

