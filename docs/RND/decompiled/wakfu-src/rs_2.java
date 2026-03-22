/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from rS
 */
public class rs_2
implements gs_0 {
    public byte[] SY = null;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        if (this.SY != null) {
            if (this.SY.length > 65535) {
                return false;
            }
            byteBuffer.putShort((short)this.SY.length);
            byteBuffer.put(this.SY);
        } else {
            byteBuffer.putShort((short)0);
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        if (n > 0) {
            this.SY = new byte[n];
            byteBuffer.get(this.SY);
        } else {
            this.SY = null;
        }
        return true;
    }

    @Override
    public void clear() {
        this.SY = null;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += 2;
        return n += this.SY != null ? this.SY.length : 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.aA(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void aA(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("data=(").append(this.SY != null ? this.SY.length : 0).append(" bytes)\n");
    }
}

