/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from xb
 */
public class xb_2
implements gs_0 {
    public byte ajh = 0;
    public static final int aji = 1;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.put(this.ajh);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.ajh = byteBuffer.get();
        return true;
    }

    @Override
    public void clear() {
        this.ajh = 0;
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
        this.dL(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void dL(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("satisfactionLevel=").append(this.ajh).append('\n');
    }
}

