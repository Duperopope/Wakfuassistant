/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from yh
 */
final class yh_2 {
    private final ArrayList<yf_1> alo = new ArrayList(0);
    private final ArrayList<ye_2> alp = new ArrayList(0);
    private int ald = 0;
    private int ale = 0;
    private byte alq = 0;
    private byte alr = 0;
    private byte als = 0;
    private byte alt = 0;
    private byte alf = (byte)-1;
    final /* synthetic */ yd_2 alu;

    yh_2(yd_2 yd_22) {
        this.alu = yd_22;
    }

    public void avW() {
        this.alu.alb.clear();
        this.alu.alb.ensureCapacity(this.alo.size());
        this.alu.alb.addAll(this.alo);
        this.alu.alc.clear();
        this.alu.alc.ensureCapacity(this.alp.size());
        this.alu.alc.addAll(this.alp);
        this.alu.ald = this.ald;
        this.alu.ale = this.ale;
        this.alu.alf = this.alf;
    }

    private boolean cx(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.alo.clear();
        this.alo.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            yf_1 yf_12 = new yf_1();
            boolean bl = yf_12.b(byteBuffer, 1);
            if (!bl) {
                return false;
            }
            this.alo.add(yf_12);
        }
        return true;
    }

    private boolean cV(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.alo.clear();
        this.alo.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            yf_1 yf_12 = new yf_1();
            boolean bl = yf_12.b(byteBuffer, 10055001);
            if (!bl) {
                return false;
            }
            this.alo.add(yf_12);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        this.alp.clear();
        this.alp.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            ye_2 ye_22 = new ye_2();
            boolean bl = ye_22.b(byteBuffer, 10055001);
            if (!bl) {
                return false;
            }
            this.alp.add(ye_22);
        }
        return true;
    }

    private boolean cW(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.alo.clear();
        this.alo.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            yf_1 yf_12 = new yf_1();
            boolean bl = yf_12.b(byteBuffer, 10064001);
            if (!bl) {
                return false;
            }
            this.alo.add(yf_12);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        this.alp.clear();
        this.alp.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            ye_2 ye_22 = new ye_2();
            boolean bl = ye_22.b(byteBuffer, 10064001);
            if (!bl) {
                return false;
            }
            this.alp.add(ye_22);
        }
        this.ald = byteBuffer.getInt();
        this.ale = byteBuffer.getInt();
        this.alq = byteBuffer.get();
        this.alr = byteBuffer.get();
        this.als = byteBuffer.get();
        this.alt = byteBuffer.get();
        this.alf = byteBuffer.get();
        return true;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10055001) {
            boolean bl = this.cx(byteBuffer);
            return bl;
        }
        if (n < 10064001) {
            boolean bl = this.cV(byteBuffer);
            return bl;
        }
        if (n < 10069001) {
            boolean bl = this.cW(byteBuffer);
            return bl;
        }
        return false;
    }
}

