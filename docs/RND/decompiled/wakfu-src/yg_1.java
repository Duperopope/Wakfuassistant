/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from yg
 */
final class yg_1 {
    private byte Tg = 0;
    private int alj = 0;
    private byte alk = 0;
    private int all = 0;
    final /* synthetic */ yf_1 aln;

    yg_1(yf_1 yf_12) {
        this.aln = yf_12;
    }

    public void avW() {
        this.aln.Tg = this.Tg;
        this.aln.alj = this.alj;
        this.aln.alk = this.alk;
        this.aln.all = this.all;
    }

    private boolean cx(ByteBuffer byteBuffer) {
        this.Tg = byteBuffer.get();
        this.alj = byteBuffer.getInt();
        return true;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10064001) {
            boolean bl = this.cx(byteBuffer);
            return bl;
        }
        return false;
    }
}

