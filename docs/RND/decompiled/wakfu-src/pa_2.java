/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from pa
 */
public class pa_2
extends go_0
implements gs_0 {
    public final tp_1 Se = new tp_1();
    private final fi_1 Sf = new pb_1(this);

    @Override
    public fi_1 DM() {
        return this.Sf;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.Se.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.Se.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.Se.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 0x992323) {
            pc_2 pc_22 = new pc_2(this);
            boolean bl = pc_22.b(byteBuffer, n);
            if (bl) {
                pc_22.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        return n += this.Se.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.n(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void n(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("characteristics=...\n");
        this.Se.br(stringBuilder, string + "  ");
    }
}

