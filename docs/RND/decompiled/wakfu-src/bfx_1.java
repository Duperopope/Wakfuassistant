/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from bFx
 */
public class bfx_1
extends bfc_1 {
    private static final Logger jTD = Logger.getLogger(bfx_1.class);
    private int brI;
    private int bap;
    private int baq;

    public bfx_1(int n) {
        super(n);
    }

    @Override
    public void v(String[] stringArray) {
        if (stringArray.length != 1) {
            jTD.error((Object)"[LD] Mauvais nombre de param\u00e8tres sur une action d'item");
            return;
        }
        this.brI = Integer.parseInt(stringArray[0]);
    }

    public int getRadius() {
        return this.brI;
    }

    @Override
    public boolean aQ(ffV ffV2) {
        if (!this.dTs()) {
            return false;
        }
        bfy_0 bfy_02 = new bfy_0(this);
        czi_2.eYU().a(bfy_02);
        fbj_1.getInstance().a(fzq_0.tJT, bfy_02, true);
        if (ffV2 != null) {
            if (aue_0.cVJ().c(cwc_1.eVd())) {
                aue_0.cVJ().b(cwc_1.eVd());
            } else {
                cwc_1.eVd().setItem(ffV2);
                aue_0.cVJ().a(cwc_1.eVd());
            }
        }
        return true;
    }

    private boolean dTs() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bso_0 bso_02 = bsl_0.jfZ.dFt();
        if (bso_02 != null) {
            return false;
        }
        if (!bfx_1.dkH()) {
            aPd.e("error.notInOwnHavenWorld", new Object[0]);
            return false;
        }
        if (!this.dTt()) {
            aPd.e("guild.rank.missing", aum_0.cWf().c(eyh_2.rKM.name(), new Object[0]));
            return false;
        }
        return true;
    }

    private static boolean dkH() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bjn_1 bjn_12 = bgt_02.dpI();
        long l = bjn_12.Ya();
        if (l <= 0L) {
            return false;
        }
        long l2 = bgt_02.aqZ();
        return l2 == caf_2.lFq.rT(l);
    }

    private boolean dTt() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        return ezr.a(bgt_02.dpI(), bgt_02.dpI().jP(bgt_02.Sn()), eyh_2.rKM);
    }

    public void a(ffV ffV2, int n, int n2) {
        this.bap = n;
        this.baq = n2;
        this.jU(ffV2.LV());
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        super.aF(byteBuffer);
        byteBuffer.putInt(this.bap);
        byteBuffer.putInt(this.baq);
        return true;
    }

    @Override
    public int DN() {
        return super.DN() + 4 + 4;
    }

    @Override
    public void clear() {
        this.bap = 0;
        this.baq = 0;
        this.U(null);
    }

    @Override
    public fgM dTl() {
        return fgM.skM;
    }
}

