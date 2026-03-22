/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 */
import com.google.common.base.Charsets;
import java.nio.ByteBuffer;

/*
 * Renamed from rM
 */
final class rm_1 {
    private long TL = 0L;
    private long Xq = 0L;
    private short Xr = 0;
    private String Ud = null;
    private int Vu = 0;
    final /* synthetic */ rk_1 Xu;

    rm_1(rk_1 rk_12) {
        this.Xu = rk_12;
    }

    public void avW() {
        this.Xu.TL = this.TL;
        this.Xu.Xq = this.Xq;
        this.Xu.Xr = this.Xr;
        this.Xu.Ud = this.Ud;
    }

    private boolean cx(ByteBuffer byteBuffer) {
        this.TL = byteBuffer.getLong();
        this.Xq = byteBuffer.getLong();
        this.Xr = byteBuffer.getShort();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.Ud = new String(byArray, Charsets.UTF_8);
        return true;
    }

    private boolean dL(ByteBuffer byteBuffer) {
        this.TL = byteBuffer.getLong();
        this.Xq = byteBuffer.getLong();
        this.Xr = byteBuffer.getShort();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.Ud = new String(byArray, Charsets.UTF_8);
        this.Vu = byteBuffer.getInt();
        return true;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10036013) {
            boolean bl = this.cx(byteBuffer);
            return bl;
        }
        if (n < 10058000) {
            boolean bl = this.dL(byteBuffer);
            return bl;
        }
        return false;
    }
}

