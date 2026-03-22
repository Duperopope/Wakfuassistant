/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from pH
 */
final class ph_2 {
    private byte Tg = 0;
    private int Th = 0;
    private int Ti = 0;
    final /* synthetic */ pg_1 Tk;

    ph_2(pg_1 pg_12) {
        this.Tk = pg_12;
    }

    public void avW() {
        this.Tk.Tg = this.Tg;
        this.Tk.Th = this.Th;
        this.Tk.Ti = this.Ti;
    }

    private boolean cx(ByteBuffer byteBuffer) {
        this.Tg = byteBuffer.get();
        this.Th = byteBuffer.getInt();
        return true;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10040007) {
            boolean bl = this.cx(byteBuffer);
            return bl;
        }
        return false;
    }
}

