/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from wV
 */
public class wv_1
implements gs_0 {
    public int aiR = 0;
    public int aiS = 0;
    public int aiT = 0;
    public static final int aiU = 12;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.aiR);
        byteBuffer.putInt(this.aiS);
        byteBuffer.putInt(this.aiT);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.aiR = byteBuffer.getInt();
        this.aiS = byteBuffer.getInt();
        this.aiT = byteBuffer.getInt();
        return true;
    }

    @Override
    public void clear() {
        this.aiR = 0;
        this.aiS = 0;
        this.aiT = 0;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 12;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.dH(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void dH(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("nativeNationId=").append(this.aiR).append('\n');
        stringBuilder.append(string).append("currentNationId=").append(this.aiS).append('\n');
        stringBuilder.append(string).append("territoryId=").append(this.aiT).append('\n');
    }
}

