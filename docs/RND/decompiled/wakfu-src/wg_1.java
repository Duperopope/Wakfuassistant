/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from wg
 */
public class wg_1
implements gs_0 {
    public int Vu = 0;
    public byte agT = 0;
    public static final int agU = 5;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.Vu);
        byteBuffer.put(this.agT);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.Vu = byteBuffer.getInt();
        this.agT = byteBuffer.get();
        return true;
    }

    @Override
    public void clear() {
        this.Vu = 0;
        this.agT = 0;
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
        this.dg(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void dg(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("nationId=").append(this.Vu).append('\n');
        stringBuilder.append(string).append("alignment=").append(this.agT).append('\n');
    }
}

