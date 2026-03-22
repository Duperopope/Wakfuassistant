/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ud
 */
@Deprecated
public class ud_2
implements gs_0 {
    public byte[] acp = null;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        if (this.acp != null) {
            if (this.acp.length > 65535) {
                return false;
            }
            byteBuffer.putShort((short)this.acp.length);
            byteBuffer.put(this.acp);
        } else {
            byteBuffer.putShort((short)0);
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        if (n > 0) {
            this.acp = new byte[n];
            byteBuffer.get(this.acp);
        } else {
            this.acp = null;
        }
        return true;
    }

    @Override
    public void clear() {
        this.acp = null;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += 2;
        return n += this.acp != null ? this.acp.length : 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.bQ(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void bQ(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("rawStorageBox=(").append(this.acp != null ? this.acp.length : 0).append(" bytes)\n");
    }
}

