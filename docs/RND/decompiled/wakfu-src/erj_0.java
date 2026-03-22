/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from eRj
 */
class erj_0
extends fi_1 {
    private vy_1 rhv;
    private wi_1 Xf;
    final /* synthetic */ eri_0 rhw;

    erj_0(eri_0 eri_02) {
        this.rhw = eri_02;
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        byteBuffer.put(this.rhw.rht ? (byte)1 : 0);
        this.rhv.aF(byteBuffer);
        this.Xf.aF(byteBuffer);
        byteBuffer.put((byte)this.rhw.hvK.bhn().ordinal());
        byteBuffer.putLong(this.rhw.hvK.bhp());
        byteBuffer.putInt(this.rhw.hvK.bho());
        byteBuffer.put(this.rhw.ebP);
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        this.rhw.rht = byteBuffer.get() == 1;
        this.rhv = new vy_1();
        this.rhv.aG(byteBuffer);
        this.Xf = new wi_1();
        this.Xf.aG(byteBuffer);
        this.rhw.rhr = new ezw();
        this.rhw.rhr.b(this.rhv);
        this.rhw.rhs = new ezg_0();
        this.rhw.rhs.b(this.Xf);
        this.rhw.hvK = new tw_0();
        this.rhw.hvK.a(Tx.px(byteBuffer.get()));
        this.rhw.hvK.el(byteBuffer.getLong());
        this.rhw.hvK.pv(byteBuffer.getInt());
        this.rhw.rhr.az(byteBuffer.get());
    }

    @Override
    public int zt() {
        this.rhv = new vy_1();
        this.rhw.rhr.a(this.rhv);
        this.Xf = new wi_1();
        this.rhw.rhs.a(this.Xf);
        return 1 + this.rhv.DN() + this.Xf.DN() + 1 + 8 + 4 + 1;
    }
}

