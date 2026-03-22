/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from wj
 */
public class wj_2
implements gs_0 {
    public byte agZ = 0;
    public int adL = 0;
    public static final int aha = 5;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.put(this.agZ);
        byteBuffer.putInt(this.adL);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.agZ = byteBuffer.get();
        this.adL = byteBuffer.getInt();
        return true;
    }

    @Override
    public void clear() {
        this.agZ = 0;
        this.adL = 0;
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
        this.dj(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void dj(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("taxId=").append(this.agZ).append('\n');
        stringBuilder.append(string).append("amount=").append(this.adL).append('\n');
    }
}

