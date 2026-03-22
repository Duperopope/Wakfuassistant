/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from qv
 */
public class qv_2
implements gs_0 {
    public byte UN = 0;
    public static final int UO = 1;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.put(this.UN);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.UN = byteBuffer.get();
        return true;
    }

    @Override
    public void clear() {
        this.UN = 0;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 1;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.T(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void T(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("landMarkId=").append(this.UN).append('\n');
    }
}

