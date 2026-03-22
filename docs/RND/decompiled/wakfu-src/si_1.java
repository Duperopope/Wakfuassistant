/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from sI
 */
public class si_1
implements gs_0 {
    public int Zg = 0;
    public static final int Zh = 4;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.Zg);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.Zg = byteBuffer.getInt();
        return true;
    }

    @Override
    public void clear() {
        this.Zg = 0;
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
        this.aU(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void aU(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("collectId=").append(this.Zg).append('\n');
    }
}

