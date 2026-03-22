/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from oA
 */
public class oa_1
implements gs_0 {
    public byte Ri = 0;
    public long Rj = 0L;
    public static final int Rk = 9;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.put(this.Ri);
        byteBuffer.putLong(this.Rj);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.Ri = byteBuffer.get();
        this.Rj = byteBuffer.getLong();
        return true;
    }

    @Override
    public void clear() {
        this.Ri = 0;
        this.Rj = 0L;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 9;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.c(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void c(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("id=").append(this.Ri).append('\n');
        stringBuilder.append(string).append("value=").append(this.Rj).append('\n');
    }
}

