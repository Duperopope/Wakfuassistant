/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from qw
 */
public class qw_1
extends go_0
implements gs_0 {
    public byte[] UP = null;
    public float UQ = 0.0f;
    private final fi_1 UR = new qx_1(this);

    @Override
    public fi_1 DM() {
        return this.UR;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        if (this.UP != null) {
            if (this.UP.length > 65535) {
                return false;
            }
            byteBuffer.putShort((short)this.UP.length);
            byteBuffer.put(this.UP);
        } else {
            byteBuffer.putShort((short)0);
        }
        byteBuffer.putFloat(this.UQ);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        if (n > 0) {
            this.UP = new byte[n];
            byteBuffer.get(this.UP);
        } else {
            this.UP = null;
        }
        this.UQ = byteBuffer.getFloat();
        return true;
    }

    @Override
    public void clear() {
        this.UP = null;
        this.UQ = 0.0f;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += 2;
        n += this.UP != null ? this.UP.length : 0;
        return n += 4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.U(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void U(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("guild=(").append(this.UP != null ? this.UP.length : 0).append(" bytes)\n");
        stringBuilder.append(string).append("moderationBonusLearningFactor=").append(this.UQ).append('\n');
    }
}

