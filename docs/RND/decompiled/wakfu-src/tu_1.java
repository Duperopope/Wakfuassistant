/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from tU
 */
public class tu_1
implements gs_0 {
    public byte abS = 0;
    public byte abT = 0;
    public static final int abU = 2;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.put(this.abS);
        byteBuffer.put(this.abT);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.abS = byteBuffer.get();
        this.abT = byteBuffer.get();
        return true;
    }

    @Override
    public void clear() {
        this.abS = 0;
        this.abT = 0;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.bJ(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void bJ(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("groupType=").append(this.abS).append('\n');
        stringBuilder.append(string).append("rights=").append(this.abT).append('\n');
    }
}

