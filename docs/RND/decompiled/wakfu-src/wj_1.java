/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from wJ
 */
public class wj_1
implements gs_0 {
    public byte Ri = 0;
    public byte aid = 0;
    public static final int aie = 2;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.put(this.Ri);
        byteBuffer.put(this.aid);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.Ri = byteBuffer.get();
        this.aid = byteBuffer.get();
        return true;
    }

    @Override
    public void clear() {
        this.Ri = 0;
        this.aid = 0;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.dx(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void dx(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("id=").append(this.Ri).append('\n');
        stringBuilder.append(string).append("count=").append(this.aid).append('\n');
    }
}

