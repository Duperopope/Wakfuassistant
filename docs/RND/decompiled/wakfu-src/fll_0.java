/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from fll
 */
public class fll_0
extends fkl_0 {
    final /* synthetic */ fld_0 sDW;

    fll_0(fld_0 fld_02) {
        this.sDW = fld_02;
    }

    @Override
    public void g(ByteBuffer byteBuffer, int n) {
        this.sDW.sDy.d(fkL.sCr);
        if (byteBuffer.get() == 0) {
            return;
        }
        fkH fkH2 = fkH.gm(byteBuffer);
        this.sDW.sDy.d(fkH2);
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        fkH fkH2 = this.sDW.sDy.gcw();
        if (fkH2 == null) {
            byteBuffer.put((byte)0);
            return;
        }
        byteBuffer.put((byte)1);
        fkH2.as(byteBuffer);
    }

    @Override
    public int DN() {
        fkH fkH2 = this.sDW.sDy.gcw();
        return 1 + (fkH2 != null ? fkH2.DN() : 0);
    }
}

