/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from pq
 */
public class pq_2
implements gs_0 {
    public byte[] SH = null;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        if (this.SH != null) {
            if (this.SH.length > 255) {
                return false;
            }
            byteBuffer.put((byte)this.SH.length);
            byteBuffer.put(this.SH);
        } else {
            byteBuffer.put((byte)0);
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n = byteBuffer.get() & 0xFF;
        if (n > 0) {
            this.SH = new byte[n];
            byteBuffer.get(this.SH);
        } else {
            this.SH = null;
        }
        return true;
    }

    @Override
    public void clear() {
        this.SH = null;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        ++n;
        return n += this.SH != null ? this.SH.length : 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.t(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void t(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("encodedPath=(").append(this.SH != null ? this.SH.length : 0).append(" bytes)\n");
    }
}

