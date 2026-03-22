/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from xt
 */
public class xt_1
implements gs_0 {
    public int Th = 0;
    public static final int ajP = 4;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.Th);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.Th = byteBuffer.getInt();
        return true;
    }

    @Override
    public void clear() {
        this.Th = 0;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.dZ(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void dZ(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("referenceId=").append(this.Th).append('\n');
    }
}

