/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from pd
 */
public class pd_2
extends go_0
implements gs_0 {
    public boolean Sj = false;
    private final fi_1 Sk = new pe_1(this);
    public static final int Sl = 1;

    @Override
    public fi_1 DM() {
        return this.Sk;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.put(this.Sj ? (byte)1 : 0);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.Sj = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public void clear() {
        this.Sj = false;
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
        this.o(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void o(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("controlledByAI=").append(this.Sj).append('\n');
    }
}

