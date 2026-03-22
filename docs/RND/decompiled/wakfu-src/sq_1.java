/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from sQ
 */
public class sq_1
implements gs_0 {
    public byte[] Zu = null;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        if (this.Zu != null) {
            if (this.Zu.length > 65535) {
                return false;
            }
            byteBuffer.putShort((short)this.Zu.length);
            byteBuffer.put(this.Zu);
        } else {
            byteBuffer.putShort((short)0);
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        if (n > 0) {
            this.Zu = new byte[n];
            byteBuffer.get(this.Zu);
        } else {
            this.Zu = null;
        }
        return true;
    }

    @Override
    public void clear() {
        this.Zu = null;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += 2;
        return n += this.Zu != null ? this.Zu.length : 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.aZ(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void aZ(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("serializedCharacter=(").append(this.Zu != null ? this.Zu.length : 0).append(" bytes)\n");
    }
}

