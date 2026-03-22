/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from rf
 */
public class rf_2
implements gs_0 {
    public short Wk = 0;
    public byte[] Wl = null;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.Wk);
        if (this.Wl != null) {
            if (this.Wl.length > 65535) {
                return false;
            }
            byteBuffer.putShort((short)this.Wl.length);
            byteBuffer.put(this.Wl);
        } else {
            byteBuffer.putShort((short)0);
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.Wk = byteBuffer.getShort();
        int n = byteBuffer.getShort() & 0xFFFF;
        if (n > 0) {
            this.Wl = new byte[n];
            byteBuffer.get(this.Wl);
        } else {
            this.Wl = null;
        }
        return true;
    }

    @Override
    public void clear() {
        this.Wk = 0;
        this.Wl = null;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += 2;
        n += 2;
        return n += this.Wl != null ? this.Wl.length : 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.ai(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void ai(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("occupationId=").append(this.Wk).append('\n');
        stringBuilder.append(string).append("occupationData=(").append(this.Wl != null ? this.Wl.length : 0).append(" bytes)\n");
    }
}

