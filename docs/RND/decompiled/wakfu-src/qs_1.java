/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from qS
 */
final class qs_1 {
    private byte VK = 0;
    private long VL = 0L;
    private byte VF = 0;
    private long VG = 0L;
    private long VM = 0L;
    private long VN = 0L;
    final /* synthetic */ qq_1 VO;

    qs_1(qq_1 qq_12) {
        this.VO = qq_12;
    }

    public void avW() {
        this.VO.VF = this.VF;
        this.VO.VG = this.VG;
    }

    private boolean dD(ByteBuffer byteBuffer) {
        this.VK = byteBuffer.get();
        this.VL = byteBuffer.getLong();
        return true;
    }

    private boolean dE(ByteBuffer byteBuffer) {
        this.VK = byteBuffer.get();
        this.VL = byteBuffer.getLong();
        this.VF = byteBuffer.get();
        return true;
    }

    private boolean dF(ByteBuffer byteBuffer) {
        this.VK = byteBuffer.get();
        this.VL = byteBuffer.getLong();
        this.VF = byteBuffer.get();
        this.VG = byteBuffer.getLong();
        return true;
    }

    private boolean dG(ByteBuffer byteBuffer) {
        this.VK = byteBuffer.get();
        this.VL = byteBuffer.getLong();
        this.VF = byteBuffer.get();
        this.VG = byteBuffer.getLong();
        this.VM = byteBuffer.getLong();
        this.VN = byteBuffer.getLong();
        return true;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10036007) {
            return false;
        }
        if (n < 0x992329) {
            boolean bl = this.dD(byteBuffer);
            return bl;
        }
        if (n < 10036011) {
            boolean bl = this.dE(byteBuffer);
            return bl;
        }
        if (n < 10036014) {
            boolean bl = this.dF(byteBuffer);
            return bl;
        }
        if (n < 10057000) {
            boolean bl = this.dG(byteBuffer);
            return bl;
        }
        return false;
    }
}

