/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from eRp
 */
class erp_0
extends fi_1 {
    private vy_1 rhB;
    final /* synthetic */ eRo rhN;

    erp_0(eRo eRo2) {
        this.rhN = eRo2;
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        byteBuffer.putFloat(this.rhN.rhI);
        byteBuffer.putFloat(this.rhN.rhJ);
        this.rhB.aF(byteBuffer);
        if (eRo.a(this.rhN) instanceof ezi_0) {
            byteBuffer.put(((ezi_0)((Object)eRo.b(this.rhN))).dob().fmR());
        } else {
            byteBuffer.put((byte)0);
        }
        byteBuffer.put((byte)this.rhN.hvK.bhn().ordinal());
        byteBuffer.putLong(this.rhN.hvK.bhp());
        byteBuffer.putInt(this.rhN.hvK.bho());
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        this.rhN.rhI = byteBuffer.getFloat();
        this.rhN.rhJ = byteBuffer.getFloat();
        this.rhB = new vy_1();
        this.rhB.aG(byteBuffer);
        this.rhN.rhK = byteBuffer.get();
        this.rhN.rhr = new ezw();
        this.rhN.rhr.b(this.rhB);
        this.rhN.hvK = new tw_0();
        this.rhN.hvK.a(Tx.px(byteBuffer.get()));
        this.rhN.hvK.el(byteBuffer.getLong());
        this.rhN.hvK.pv(byteBuffer.getInt());
    }

    @Override
    public int zt() {
        this.rhB = new vy_1();
        this.rhN.rhr.a(this.rhB);
        return 8 + this.rhB.DN() + 1 + 8 + 4 + 1;
    }
}

