/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongByteHashMap
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TLongByteHashMap;
import gnu.trove.map.hash.TLongObjectHashMap;
import java.awt.geom.Point2D;
import org.apache.log4j.Logger;

/*
 * Renamed from fBH
 */
public class fbh_2
extends fbb_2<ffr_1> {
    private static final Logger tUY = Logger.getLogger(fbh_2.class);
    public static final String TAG = "map";
    public static final String tUZ = "internalPopup";
    public static final String tVa = "internalPopupTextView";
    public static final String tVb = "internalPopupTextEditor";
    public static final String tVc = "internalPopupValid";
    public static final String tVd = "internalPopupCancel";
    private fin_1 tVe;
    private fis_1 tVf;
    private boolean tVg = true;
    private boolean tVh;
    boolean tSy;
    public static final int tVi = "knownMaps".hashCode();

    @Override
    public void d(fhv_1 fhv_12) {
        super.d(fhv_12);
    }

    public Point2D.Float getMapWidgetZoom() {
        if (this.tUl == null) {
            return new Point2D.Float(1.0f, 1.0f);
        }
        float f2 = (float)(this.tUo - this.tUm) / (float)this.tUl.getWidth();
        float f3 = (float)(this.tUp - this.tUn) / (float)this.tUl.getHeight();
        float f4 = (float)this.getWidth() / f2;
        float f5 = (float)this.getHeight() / f3;
        float f6 = f4 / (float)this.tUl.getWidth();
        float f7 = f5 / (float)this.tUl.getHeight();
        tUY.info((Object)("width ratio = " + f6));
        tUY.info((Object)("height ratio = " + f7));
        return new Point2D.Float(f6, f7);
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public ffx_2 getZoneManager() {
        return (ffx_2)this.tUk;
    }

    public void setKnownMaps(int[] nArray) {
    }

    @Override
    protected void setMeshCenter() {
    }

    @Override
    protected void gti() {
        this.tVh = true;
        this.tSy = true;
        super.gti();
    }

    public void setAllMapZonesVisible(boolean bl) {
        this.tVg = bl;
        ((ffr_1)this.tUj).oM(this.tVg && this.getZoneManager().gwo());
        this.tUr = true;
        this.setNeedsToPostProcess();
    }

    public void setMapZoneVisibleById(int n, boolean bl) {
        if (!this.getZoneManager().aj(n, bl)) {
            tUY.info((Object)("Impossible de trouver la zone d'id " + n));
        }
        this.tUr = true;
        this.setNeedsToPostProcess();
    }

    public void setPlayerMapZone(int n, int n2) {
        this.getZoneManager().setPlayerMapZone(n, n2);
    }

    public ffl_2 getSelectedMapZone() {
        return this.getZoneManager().getSelectedMapZone();
    }

    @Override
    protected void gK(int n, int n2) {
        super.gK(n, n2);
        int n3 = Wa.qf(n);
        int n4 = Wa.qg(n2);
        this.getZoneManager().gP(n3, n4);
    }

    @Override
    public void grg() {
        super.grg();
        this.tVh = true;
        this.getZoneManager().gwn();
    }

    private boolean gsR() {
        if (this.tSy) {
            fsm_1 fsm_12 = fbj_1.getInstance().getSize();
            boolean bl = false;
            float f2 = (float)fsm_12.width * 0.9f;
            float f3 = (float)fsm_12.height * 0.9f;
            float f4 = f2 / f3;
            float f5 = 2.0f;
            if (f4 >= 2.0f) {
                f2 = f3 * 2.0f;
            } else {
                f3 = f2 / 2.0f;
            }
            if (this.uku == null || (float)this.uku.width != f2 || (float)this.uku.height != f3) {
                this.setMinSize(new fsm_1((int)f2, (int)f3));
                bl = true;
            }
            this.tSy = false;
            return bl;
        }
        return false;
    }

    private void gtv() {
        if (!this.tVh) {
            return;
        }
        if (this.uki == null) {
            return;
        }
        float f2 = (float)this.uki.getContentWidth() / this.tUh;
        float f3 = (float)this.uki.getContentHeight() / this.tUi;
        float f4 = Math.min(f2, f3);
        this.setMinZoom(f4);
        this.setMaxZoom(f4);
        this.tVh = false;
        this.tUr = true;
        float f5 = -this.tUf * this.aXn;
        float f6 = -this.tUg * this.aXn;
        float f7 = this.crl.aO(f5, f6);
        float f8 = this.crl.aP(f5, f6);
        this.setIsoCenterX(f7);
        this.setIsoCenterY(f8);
        this.setIsoCenterZ(0.0f);
    }

    @Override
    protected void gtk() {
        TLongObjectHashMap tLongObjectHashMap = new TLongObjectHashMap();
        TLongByteHashMap tLongByteHashMap = new TLongByteHashMap();
        this.getZoneManager().a(this.aXn, (TLongObjectHashMap<axb_2>)tLongObjectHashMap, tLongByteHashMap);
        super.gtk();
        ((ffr_1)this.tUj).h((TLongObjectHashMap<axb_2>)tLongObjectHashMap);
        ((ffr_1)this.tUj).b(tLongByteHashMap);
        ((ffr_1)this.tUj).oM(this.tVg && this.getZoneManager().gwo());
    }

    @Override
    public boolean LZ(int n) {
        boolean bl = super.LZ(n);
        if (this.tSy && this.gsR() && this.uko != null) {
            this.uko.gsm();
            this.setNeedsToPostProcess();
        }
        return bl;
    }

    @Override
    public boolean LY(int n) {
        boolean bl = super.LY(n);
        if (this.tSd) {
            return bl;
        }
        if (this.tUt) {
            this.gtm();
        }
        this.tUk.qy(n);
        if (this.tVh) {
            this.gtv();
        }
        if (this.tUs) {
            this.gtj();
        }
        if (this.tUr) {
            this.gtr();
        }
        return bl;
    }

    @Override
    public void aVH() {
        super.aVH();
        this.tUv.clear();
        this.tUk.clear();
        this.tUk = null;
        fil_1.gBx().a(this.tVe, true);
        fbj_1.getInstance().b(fzq_0.tKh, this.tVf, false);
        this.tVf = null;
    }

    @Override
    public void aVI() {
        super.aVI();
        fzb fzb2 = new fzb();
        fzb2.aVI();
        fzb2.setWidget(this);
        this.d(fzb2);
        this.setLayoutManager(null);
        this.tUj = new ffr_1();
        ((ffr_1)this.tUj).aVI();
        ((ffr_1)this.tUj).z(new awx_2(awx_2.dnF));
        this.tUk = new ffx_2((ffr_1)this.tUj);
        this.tVg = true;
        this.tUt = false;
        this.tSd = false;
        this.tTP = false;
        this.tVe = new fin_1(this);
        fil_1.gBx().a(this.tVe);
        this.tVf = new fbi_2(this);
        fbj_1.getInstance().a(fzq_0.tKh, this.tVf, false);
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n != tVi) {
            return super.setPropertyAttribute(n, object);
        }
        this.setKnownMaps((int[])object);
        return true;
    }
}

