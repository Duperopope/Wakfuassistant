/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from yb
 */
public class yb_1
implements gs_0 {
    public int aac = 0;
    public short akW = 0;
    public byte akX = 0;
    public static final int akY = 7;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.aac);
        byteBuffer.putShort(this.akW);
        byteBuffer.put(this.akX);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.aac = byteBuffer.getInt();
        this.akW = byteBuffer.getShort();
        this.akX = byteBuffer.get();
        return true;
    }

    @Override
    public void clear() {
        this.aac = 0;
        this.akW = 0;
        this.akX = 0;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 7;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.eu(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void eu(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("scenarioId=").append(this.aac).append('\n');
        stringBuilder.append(string).append("executionCount=").append(this.akW).append('\n');
        stringBuilder.append(string).append("status=").append(this.akX).append('\n');
    }
}

