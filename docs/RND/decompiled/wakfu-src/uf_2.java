/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from uf
 */
public class uf_2
implements gs_0 {
    public byte Tg = 0;
    public int aaQ = 0;
    public static final int acw = 5;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.put(this.Tg);
        byteBuffer.putInt(this.aaQ);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.Tg = byteBuffer.get();
        this.aaQ = byteBuffer.getInt();
        return true;
    }

    @Override
    public void clear() {
        this.Tg = 0;
        this.aaQ = 0;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 5;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.bS(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void bS(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("position=").append(this.Tg).append('\n');
        stringBuilder.append(string).append("refId=").append(this.aaQ).append('\n');
    }
}

