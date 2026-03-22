/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from bFK
 */
public class bfk_1
extends bfc_1 {
    private static final Logger jTU = Logger.getLogger(bfk_1.class);
    long duS;
    protected int biD;

    bfk_1(int n) {
        super(n);
    }

    @Override
    public void v(String[] stringArray) {
        int n = stringArray.length;
        this.biD = n > 0 ? Integer.parseInt(stringArray[0]) : 0;
    }

    @Override
    public boolean aQ(ffV ffV2) {
        bgt_0 bgt_02 = (bgt_0)fcI.ag(aue_0.cVJ().cVK().Xi(), ffV2.LV());
        if (bgt_02 == null) {
            jTU.error((Object)"[ItemAction] On essaye de lancer une action avec un item qui n'est pas dans les bags");
            return false;
        }
        if (bsl_0.jfZ.dFs()) {
            return false;
        }
        this.aU(ffV2);
        return true;
    }

    private void aU(ffV ffV2) {
        fhn_1.gzT().a(fzo_0.tHt, true);
        bfl_0 bfl_02 = new bfl_0(this, ffV2);
        czi_2.eYU().a(bfl_02);
        fbj_1.getInstance().a(fzq_0.tJT, bfl_02, true);
    }

    void aS(ffV ffV2) {
        this.jU(ffV2.LV());
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        super.aF(byteBuffer);
        byteBuffer.putLong(this.duS);
        return true;
    }

    @Override
    public int DN() {
        return super.DN() + 8;
    }

    @Override
    public void clear() {
    }

    @Override
    public fgM dTl() {
        return fgM.skS;
    }
}

