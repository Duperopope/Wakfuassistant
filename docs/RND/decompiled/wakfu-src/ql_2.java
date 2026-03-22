/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from qL
 */
public class ql_2
implements gs_0 {
    public int Vu = -1;
    public int Vv = -1;
    public static final int Vw = 8;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.Vu);
        byteBuffer.putInt(this.Vv);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.Vu = byteBuffer.getInt();
        this.Vv = byteBuffer.getInt();
        return true;
    }

    @Override
    public void clear() {
        this.Vu = -1;
        this.Vv = -1;
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
        this.aa(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void aa(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("nationId=").append(this.Vu).append('\n');
        stringBuilder.append(string).append("citizenScore=").append(this.Vv).append('\n');
    }
}

