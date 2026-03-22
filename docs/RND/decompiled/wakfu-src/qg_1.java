/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from qg
 */
public class qg_1
extends go_0
implements gs_0 {
    public int Uk = 0;
    private final fi_1 Ul = new qh_2(this);
    public static final int Um = 4;

    @Override
    public fi_1 DM() {
        return this.Ul;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.Uk);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.Uk = byteBuffer.getInt();
        return true;
    }

    @Override
    public void clear() {
        this.Uk = 0;
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
        this.M(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void M(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("hp=").append(this.Uk).append('\n');
    }
}

