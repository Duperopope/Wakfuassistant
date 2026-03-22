/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from rb
 */
final class rb_1 {
    private long Wa = 0L;
    private long VT = 0L;
    private long VU = 0L;
    private byte VV = 0;
    private boolean Wb = false;
    private byte VK = 0;
    private long VL = 0L;
    private byte VF = 0;
    final /* synthetic */ qz_2 Wf;

    rb_1(qz_2 qz_22) {
        this.Wf = qz_22;
    }

    public void avW() {
        this.Wf.Wa = this.Wa;
        this.Wf.VT = this.VT;
        this.Wf.VU = this.VU;
        this.Wf.VV = this.VV;
        this.Wf.Wb = this.Wb;
        this.Wf.VF = this.VF;
    }

    private boolean cx(ByteBuffer byteBuffer) {
        this.Wa = byteBuffer.getLong();
        this.VT = byteBuffer.getLong();
        this.VU = byteBuffer.getLong();
        this.VV = byteBuffer.get();
        this.Wb = byteBuffer.get() == 1;
        return true;
    }

    private boolean dD(ByteBuffer byteBuffer) {
        this.Wa = byteBuffer.getLong();
        this.VT = byteBuffer.getLong();
        this.VU = byteBuffer.getLong();
        this.VV = byteBuffer.get();
        this.Wb = byteBuffer.get() == 1;
        this.VK = byteBuffer.get();
        this.VL = byteBuffer.getLong();
        return true;
    }

    private boolean dE(ByteBuffer byteBuffer) {
        this.Wa = byteBuffer.getLong();
        this.VT = byteBuffer.getLong();
        this.VU = byteBuffer.getLong();
        this.VV = byteBuffer.get();
        this.Wb = byteBuffer.get() == 1;
        this.VK = byteBuffer.get();
        this.VL = byteBuffer.getLong();
        this.VF = byteBuffer.get();
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
        if (n < 10057000) {
            boolean bl = this.dE(byteBuffer);
            return bl;
        }
        return false;
    }
}

