/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from qe
 */
public class qe_1
extends go_0
implements gs_0 {
    public boolean Ug = false;
    private final fi_1 Uh = new qf_1(this);
    public static final int Ui = 1;

    @Override
    public fi_1 DM() {
        return this.Uh;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.put(this.Ug ? (byte)1 : 0);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.Ug = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public void clear() {
        this.Ug = false;
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
        this.L(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void L(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("isHero=").append(this.Ug).append('\n');
    }
}

