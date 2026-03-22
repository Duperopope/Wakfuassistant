/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from qi
 */
public class qi_1
extends go_0
implements gs_0 {
    public long Uo = 0L;
    private final fi_1 Up = new qj_2(this);
    public static final int Uq = 8;

    @Override
    public fi_1 DM() {
        return this.Up;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.Uo);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.Uo = byteBuffer.getLong();
        return true;
    }

    @Override
    public void clear() {
        this.Uo = 0L;
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
        this.N(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void N(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("id=").append(this.Uo).append('\n');
    }
}

