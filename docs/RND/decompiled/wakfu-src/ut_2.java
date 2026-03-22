/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from uT
 */
final class ut_2 {
    private int acr = 0;
    private byte XQ = 0;
    private final tp_1 aeq = new tp_1();
    final /* synthetic */ us_1 aer;

    ut_2(us_1 us_12) {
        this.aer = us_12;
    }

    public void avW() {
        this.aer.acr = this.acr;
        this.aer.XQ = this.XQ;
        this.aer.aep.aau.clear();
        this.aer.aep.aau.ensureCapacity(this.aeq.aau.size());
        this.aer.aep.aau.addAll(this.aeq.aau);
    }

    private boolean cx(ByteBuffer byteBuffer) {
        this.acr = byteBuffer.getInt();
        this.XQ = byteBuffer.get();
        boolean bl = this.aeq.b(byteBuffer, 1);
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

