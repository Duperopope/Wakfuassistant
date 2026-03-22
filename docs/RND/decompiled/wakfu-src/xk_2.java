/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from xK
 */
public class xk_2
implements gs_0 {
    public int aai = 0;
    public static final int aku = 4;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.aai);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.aai = byteBuffer.getInt();
        return true;
    }

    @Override
    public void clear() {
        this.aai = 0;
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
        this.ej(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void ej(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("actionGroupId=").append(this.aai).append('\n');
    }
}

