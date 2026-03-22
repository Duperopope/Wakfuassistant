/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from yK
 */
public class yk_1
implements gs_0 {
    public byte amn = 0;
    public float amo = 0.0f;
    public static final int amp = 5;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.put(this.amn);
        byteBuffer.putFloat(this.amo);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.amn = byteBuffer.get();
        this.amo = byteBuffer.getFloat();
        return true;
    }

    @Override
    public void clear() {
        this.amn = 0;
        this.amo = 0.0f;
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
        this.eN(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void eN(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("taxContext=").append(this.amn).append('\n');
        stringBuilder.append(string).append("taxValue=").append(this.amo).append('\n');
    }
}

