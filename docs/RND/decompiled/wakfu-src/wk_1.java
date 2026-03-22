/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from wk
 */
public class wk_1
implements gs_0 {
    public byte ahb = 0;
    public int adL = 0;
    public static final int ahc = 5;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.put(this.ahb);
        byteBuffer.putInt(this.adL);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.ahb = byteBuffer.get();
        this.adL = byteBuffer.getInt();
        return true;
    }

    @Override
    public void clear() {
        this.ahb = 0;
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
        this.dk(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void dk(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("itemTypeId=").append(this.ahb).append('\n');
        stringBuilder.append(string).append("amount=").append(this.adL).append('\n');
    }
}

