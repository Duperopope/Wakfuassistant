/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from pc
 */
final class pc_2 {
    private final tp_1 Sh = new tp_1();
    final /* synthetic */ pa_2 Si;

    pc_2(pa_2 pa_22) {
        this.Si = pa_22;
    }

    public void avW() {
        this.Si.Se.aau.clear();
        this.Si.Se.aau.ensureCapacity(this.Sh.aau.size());
        this.Si.Se.aau.addAll(this.Sh.aau);
    }

    private boolean cx(ByteBuffer byteBuffer) {
        boolean bl = this.Sh.b(byteBuffer, 1);
        return bl;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 0x992323) {
            boolean bl = this.cx(byteBuffer);
            return bl;
        }
        return false;
    }
}

