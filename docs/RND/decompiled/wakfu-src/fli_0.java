/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from fli
 */
public class fli_0
extends fkl_0 {
    final /* synthetic */ fld_0 sDT;

    fli_0(fld_0 fld_02) {
        this.sDT = fld_02;
    }

    @Override
    public void g(ByteBuffer byteBuffer, int n) {
        this.sDT.sDw.clear();
        this.sDT.sDw.eL(byteBuffer);
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        this.sDT.sDw.as(byteBuffer);
    }

    @Override
    public int DN() {
        return this.sDT.sDw.DN();
    }
}

