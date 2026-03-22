/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from qO
 */
public class qo_2
extends go_0
implements gs_0 {
    public int Vu = 0;
    private final fi_1 VC = new qp_1(this);
    public static final int VD = 4;

    @Override
    public fi_1 DM() {
        return this.VC;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.Vu);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.Vu = byteBuffer.getInt();
        return true;
    }

    @Override
    public void clear() {
        this.Vu = 0;
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
        this.ac(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void ac(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("nationId=").append(this.Vu).append('\n');
    }
}

