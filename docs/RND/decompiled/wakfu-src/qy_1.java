/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from qY
 */
final class qy_1 {
    private long VT = 0L;
    private long VU = 0L;
    private byte VV = 0;
    private byte VK = 0;
    private long VL = 0L;
    private byte VF = 0;
    private long VG = 0L;
    private long VM = 0L;
    private long VN = 0L;
    final /* synthetic */ qw_2 VZ;

    qy_1(qw_2 qw_22) {
        this.VZ = qw_22;
    }

    public void avW() {
        this.VZ.VT = this.VT;
        this.VZ.VU = this.VU;
        this.VZ.VV = this.VV;
        this.VZ.VF = this.VF;
        this.VZ.VG = this.VG;
    }

    private boolean cx(ByteBuffer byteBuffer) {
        this.VT = byteBuffer.getLong();
        this.VU = byteBuffer.getLong();
        this.VV = byteBuffer.get();
        return true;
    }

    private boolean dD(ByteBuffer byteBuffer) {
        this.VT = byteBuffer.getLong();
        this.VU = byteBuffer.getLong();
        this.VV = byteBuffer.get();
        this.VK = byteBuffer.get();
        this.VL = byteBuffer.getLong();
        return true;
    }

    private boolean dE(ByteBuffer byteBuffer) {
        this.VT = byteBuffer.getLong();
        this.VU = byteBuffer.getLong();
        this.VV = byteBuffer.get();
        this.VK = byteBuffer.get();
        this.VL = byteBuffer.getLong();
        this.VF = byteBuffer.get();
        return true;
    }

    private boolean dH(ByteBuffer byteBuffer) {
        this.VT = byteBuffer.getLong();
        this.VU = byteBuffer.getLong();
        this.VV = byteBuffer.get();
        this.VK = byteBuffer.get();
        this.VL = byteBuffer.getLong();
        this.VF = byteBuffer.get();
        this.VG = byteBuffer.getLong();
        return true;
    }

    private boolean dG(ByteBuffer byteBuffer) {
        this.VT = byteBuffer.getLong();
        this.VU = byteBuffer.getLong();
        this.VV = byteBuffer.get();
        this.VK = byteBuffer.get();
        this.VL = byteBuffer.getLong();
        this.VF = byteBuffer.get();
        this.VG = byteBuffer.getLong();
        this.VM = byteBuffer.getLong();
        this.VN = byteBuffer.getLong();
        return true;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10036007) {
            boolean bl = this.cx(byteBuffer);
            return bl;
        }
        if (n < 0x992329) {
            boolean bl = this.dD(byteBuffer);
            return bl;
        }
        if (n < 10036012) {
            boolean bl = this.dE(byteBuffer);
            return bl;
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

