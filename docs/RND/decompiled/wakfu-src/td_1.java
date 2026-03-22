/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from td
 */
public class td_1
implements gs_0 {
    public byte ZR = 0;
    public short ZU = 0;
    public static final int ZV = 3;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.put(this.ZR);
        byteBuffer.putShort(this.ZU);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.ZR = byteBuffer.get();
        this.ZU = byteBuffer.getShort();
        return true;
    }

    @Override
    public void clear() {
        this.ZR = 0;
        this.ZU = 0;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.bh(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void bh(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("characId=").append(this.ZR).append('\n');
        stringBuilder.append(string).append("nbPoint=").append(this.ZU).append('\n');
    }
}

