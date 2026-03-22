/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from flo
 */
public abstract class flo_0
extends fkl_0 {
    protected ux_0 sDZ;
    protected ua_0 sEa;
    protected ua_0 sEb;
    protected boolean sEc;
    final /* synthetic */ fld_0 sEd;

    public flo_0(fld_0 fld_02) {
        this.sEd = fld_02;
    }

    protected abstract void zm();

    @Override
    public void as(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.sEd.sDt != null ? this.sEd.sDt.bjS() : uz_0.bwa.bjS());
        byteBuffer.putLong(this.sEd.sDu != null ? this.sEd.sDu.bjS() : uz_0.bwa.bjS());
        byteBuffer.putLong(this.sEd.sDr != null ? this.sEd.sDr.bjB() : 0L);
        byteBuffer.put(this.sEd.sDq ? (byte)1 : 0);
    }

    @Override
    public void g(ByteBuffer byteBuffer, int n) {
        try {
            this.sEa = uz_0.fo(byteBuffer.getLong());
            this.sEb = uz_0.fo(byteBuffer.getLong());
            this.sDZ = uw_0.fn(byteBuffer.getLong());
            this.sEc = byteBuffer.get() == 1;
            this.zm();
        }
        catch (Exception exception) {
            fld_0.sDm.error((Object)"Exception during unSerialize NationPoliticHandler", (Throwable)exception);
        }
    }

    @Override
    public int DN() {
        return 25;
    }
}

