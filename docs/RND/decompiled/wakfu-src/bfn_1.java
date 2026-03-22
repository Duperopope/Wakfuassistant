/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from bFN
 */
public class bfn_1
extends bfc_1 {
    private static final Logger jTY = Logger.getLogger(bfn_1.class);
    private int jTZ;
    private int jUa;

    public bfn_1(int n) {
        super(n);
    }

    @Override
    public void v(String[] stringArray) {
        if (stringArray.length != 2) {
            jTY.error((Object)"[LD] Mauvais nombre de param\u00e8tres sur une action d'item");
            return;
        }
    }

    @Override
    public boolean aQ(ffV ffV2) {
        if (!this.dTs()) {
            return false;
        }
        fhn_1.gzT().a(fzo_0.tHU, true);
        bfo_1 bfo_12 = new bfo_1(this);
        czi_2.eYU().a(bfo_12);
        fbj_1.getInstance().a(fzq_0.tJT, bfo_12, true);
        if (ffV2 != null) {
            if (aue_0.cVJ().c(cxs_2.nXl)) {
                aue_0.cVJ().b(cxs_2.nXl);
            } else {
                cxs_2.nXl.y(ffV2);
                cxs_2.nXl.eNa();
                aue_0.cVJ().a(cxs_2.nXl);
            }
        }
        return true;
    }

    private boolean dTs() {
        bso_0 bso_02 = bsl_0.jfZ.dFt();
        return bso_02 == null;
    }

    public void a(ffV ffV2, int n, int n2) {
        cxs_2.nXl.dsH();
        this.jTZ = n;
        this.jUa = n2;
        this.jU(ffV2.LV());
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        super.aF(byteBuffer);
        byteBuffer.putInt(this.jTZ);
        byteBuffer.putInt(this.jUa);
        return true;
    }

    @Override
    public int DN() {
        return super.DN() + 4 + 4;
    }

    @Override
    public void clear() {
        this.jTZ = 0;
        this.jUa = 0;
    }

    @Override
    public fgM dTl() {
        return fgM.skJ;
    }
}

