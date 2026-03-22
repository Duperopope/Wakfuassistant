/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from yN
 */
public class yn_2
implements gs_0 {
    public int aaQ = 0;
    public short aaa = 0;
    public static final int amz = 6;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.aaQ);
        byteBuffer.putShort(this.aaa);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.aaQ = byteBuffer.getInt();
        this.aaa = byteBuffer.getShort();
        return true;
    }

    @Override
    public void clear() {
        this.aaQ = 0;
        this.aaa = 0;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 6;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.eQ(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void eQ(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("refId=").append(this.aaQ).append('\n');
        stringBuilder.append(string).append("quantity=").append(this.aaa).append('\n');
    }
}

