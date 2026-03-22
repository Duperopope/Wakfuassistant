/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from xi
 */
public class xi_2
implements gs_0 {
    public byte ajt = 0;
    public int ajr = 0;
    public static final int aju = 5;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.put(this.ajt);
        byteBuffer.putInt(this.ajr);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.ajt = byteBuffer.get();
        this.ajr = byteBuffer.getInt();
        return true;
    }

    @Override
    public void clear() {
        this.ajt = 0;
        this.ajr = 0;
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
        this.dQ(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void dQ(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("contextId=").append(this.ajt).append('\n');
        stringBuilder.append(string).append("cashAmount=").append(this.ajr).append('\n');
    }
}

