/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import java.util.Optional;
import org.apache.log4j.Logger;

/*
 * Renamed from bFP
 */
public class bfp_1
extends bfc_1 {
    private static final Logger jUb = Logger.getLogger(bfp_1.class);
    private int ejc;
    private short enb;
    private int iFm;
    private int jTZ;
    private int jUa;

    public bfp_1(int n) {
        super(n);
    }

    @Override
    public void v(String[] stringArray) {
        if (stringArray.length != 4) {
            jUb.error((Object)"[LD] Mauvais nombre de param\u00e8tres sur une action d'item");
            return;
        }
        int n = Integer.parseInt(stringArray[0]);
        this.ejc = Integer.parseInt(stringArray[1]);
        this.enb = Short.parseShort(stringArray[2]);
        this.iFm = Integer.parseInt(stringArray[3]);
    }

    @Override
    public boolean aQ(ffV ffV2) {
        if (!this.dTs()) {
            return false;
        }
        if (aue_0.cVJ().c(cxt_2.eXB()) && cxt_2.eXB().getItem() == ffV2) {
            aue_0.cVJ().b(cxt_2.eXB());
            return false;
        }
        fhn_1.gzT().a(fzo_0.tHU, true);
        bfq_1 bfq_12 = new bfq_1(this);
        czi_2.eYU().a(bfq_12);
        fbj_1.getInstance().a(fzq_0.tJT, bfq_12, true);
        if (ffV2 != null) {
            if (aue_0.cVJ().c(cxt_2.eXB())) {
                aue_0.cVJ().b(cxt_2.eXB());
            } else {
                cxt_2.eXB().y(ffV2);
                cxt_2.eXB().eNa();
                aue_0.cVJ().a(cxt_2.eXB());
            }
        }
        return true;
    }

    private boolean dTs() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        Optional<eki_0> optional = bgt_02.dpJ();
        if (optional.isEmpty()) {
            bNG.egl();
            bNG.a(40, new Object[0]);
            return false;
        }
        if (bgt_02.i(ezj_0.puu)) {
            bNG.egl();
            bNG.a(39, new Object[0]);
            return false;
        }
        bso_0 bso_02 = bsl_0.jfZ.dFt();
        if (bso_02 != null) {
            return false;
        }
        if (!optional.get().tX(this.ejc)) {
            bNG.egl();
            bNG.a(21, new Object[0]);
            return false;
        }
        short s = optional.get().PG(this.ejc);
        if (s < this.enb) {
            bNG.egl();
            bNG.a(4, new Object[0]);
            return false;
        }
        bKT bKT2 = (bKT)bKU.eca().YN(this.iFm);
        if (bKT2 == null) {
            bNG.egl();
            bNG.a(1, new Object[0]);
            return false;
        }
        if (bfp_1.dTw()) {
            aPd.e("error.notInOwnHavenWorld", new Object[0]);
            return false;
        }
        return !aue_0.cVJ().cVK().dnv();
    }

    private static boolean dTw() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        long l = bgt_02.aqZ();
        bjn_1 bjn_12 = bgt_02.dpI();
        long l2 = bjn_12.Ya();
        return caf_2.lFq.rV(l) && !caf_2.lFq.X(l, l2);
    }

    public int cms() {
        return this.ejc;
    }

    public short cqz() {
        return this.enb;
    }

    public int dDR() {
        return this.iFm;
    }

    public void a(ffV ffV2, int n, int n2) {
        cxt_2.eXB().dsH();
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
        return fgM.skl;
    }
}

