/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from xq
 */
public class xq_2
implements gs_0 {
    public int Th = 0;
    public int agB = 0;
    public static final int ajL = 8;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.Th);
        byteBuffer.putInt(this.agB);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.Th = byteBuffer.getInt();
        this.agB = byteBuffer.getInt();
        return true;
    }

    @Override
    public void clear() {
        this.Th = 0;
        this.agB = 0;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 8;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.dW(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void dW(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("referenceId=").append(this.Th).append('\n');
        stringBuilder.append(string).append("price=").append(this.agB).append('\n');
    }
}

