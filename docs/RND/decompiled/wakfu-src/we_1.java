/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from we
 */
public class we_1
implements gs_0 {
    public int aeb = 0;
    public byte[] agQ = null;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.aeb);
        if (this.agQ != null) {
            if (this.agQ.length > 65535) {
                return false;
            }
            byteBuffer.putShort((short)this.agQ.length);
            byteBuffer.put(this.agQ);
        } else {
            byteBuffer.putShort((short)0);
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.aeb = byteBuffer.getInt();
        int n = byteBuffer.getShort() & 0xFFFF;
        if (n > 0) {
            this.agQ = new byte[n];
            byteBuffer.get(this.agQ);
        } else {
            this.agQ = null;
        }
        return true;
    }

    @Override
    public void clear() {
        this.aeb = 0;
        this.agQ = null;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += 4;
        n += 2;
        return n += this.agQ != null ? this.agQ.length : 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.de(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void de(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("version=").append(this.aeb).append('\n');
        stringBuilder.append(string).append("items=(").append(this.agQ != null ? this.agQ.length : 0).append(" bytes)\n");
    }
}

