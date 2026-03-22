/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ye
 */
public class ye_2
implements gs_0 {
    public byte alg = 0;
    public int alh = 0;
    public static final int ali = 5;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.put(this.alg);
        byteBuffer.putInt(this.alh);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.alg = byteBuffer.get();
        this.alh = byteBuffer.getInt();
        return true;
    }

    @Override
    public void clear() {
        this.alg = 0;
        this.alh = 0;
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
        this.ew(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void ew(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("propertyId=").append(this.alg).append('\n');
        stringBuilder.append(string).append("gemRefId=").append(this.alh).append('\n');
    }
}

