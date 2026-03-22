/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from fCB
 */
public class fcb_1
extends faw_2
implements fzd {
    public static final String TAG = "RepeatableImage";
    private final ArrayList<fbt_1> tZf = new ArrayList();
    private fze tEl = null;
    private axb_2 ncL = null;
    private int tZg = 0;
    private boolean tZh = false;
    private boolean tZi = false;
    public static final int tZj = 1387629604;
    public static final int tZk = -1156593849;
    public static final int tZl = 1792677060;

    @Override
    public void d(fhv_1 fhv_12) {
        if (fhv_12 instanceof fze) {
            this.setPixmap((fze)fhv_12);
        }
        super.d(fhv_12);
    }

    @Override
    public void a(fhp_1 fhp_12) {
        if (fhp_12 instanceof fry_2 && (this.tRg != null || !(fhp_12 instanceof frz_2))) {
            fhp_12.aZp();
            return;
        }
        super.a(fhp_12);
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public void setHorizontal(boolean bl) {
        if (this.tRg instanceof frz_2) {
            ((frz_2)this.tRg).setHorizontal(bl);
        }
    }

    public boolean getHorizontal() {
        if (this.tRg instanceof frz_2) {
            return ((frz_2)this.tRg).isHorizontal();
        }
        return false;
    }

    public void setRepeatNumber(int n) {
        if (n != this.tZg) {
            this.tZg = n;
            this.tZh = true;
            this.setNeedsToPreProcess();
        }
    }

    public int getRepeatNumber() {
        return this.tZg;
    }

    @Override
    public void setPixmap(fze fze2) {
        if (fze2 != this.tEl) {
            this.tEl = fze2;
        }
        this.tZi = true;
        this.setNeedsToPreProcess();
    }

    @Override
    public void setModulationColor(axb_2 axb_22) {
        if (this.ncL == axb_22) {
            return;
        }
        this.ncL = axb_22;
        for (int i = this.tZf.size() - 1; i >= 0; --i) {
            this.tZf.get(i).setModulationColor(axb_22);
        }
    }

    @Override
    public axb_2 getModulationColor() {
        return this.ncL;
    }

    @Override
    public void a(fhi_2 fhi_22) {
        fcb_1 fcb_12 = (fcb_1)fhi_22;
        super.a(fcb_12);
        while (fcb_12.tRe.size() > 0) {
            ((fes_2)fcb_12.tRe.get(0)).gAD();
        }
        fcb_12.setHorizontal(this.getHorizontal());
        fcb_12.setRepeatNumber(this.tZg);
        fcb_12.setModulationColor(this.ncL);
    }

    public void gtY() {
        if (this.tZh) {
            while (this.tZg < this.tZf.size()) {
                this.tZf.remove(this.tZg).gAD();
            }
            if (this.tZg > this.tZf.size()) {
                fbt_1 fbt_12;
                if (this.tZf.isEmpty()) {
                    fbt_12 = new fbt_1();
                    fbt_12.aVI();
                    fbt_12.setNonBlocking(true);
                    fbt_12.setModulationColor(this.ncL);
                    this.d(fbt_12);
                    fbt_12.d(this.tEl.gAK());
                    fbt_12.setVisible(false);
                    fbt_12.setVisibleForLayout(true);
                    this.tZf.add(fbt_12);
                }
                while (this.tZg > this.tZf.size()) {
                    fbt_12 = (fbt_1)this.tZf.get(0).gAK();
                    fbt_12.setVisible(false);
                    fbt_12.setVisibleForLayout(true);
                    this.d(fbt_12);
                    this.tZf.add(fbt_12);
                }
            }
            this.tZh = false;
        }
        if (this.tZi) {
            for (int i = this.tZf.size() - 1; i >= 0; --i) {
                fbt_1 fbt_13 = this.tZf.get(i);
                fbt_13.d(this.tEl.gAK());
            }
            this.tZi = false;
        }
    }

    @Override
    public void gsN() {
        super.gsN();
        for (fbt_1 fbt_12 : this.tZf) {
            fbt_12.setVisible(true);
        }
    }

    @Override
    public boolean LZ(int n) {
        boolean bl = super.LZ(n);
        if (this.tZi || this.tZh) {
            this.gtY();
            this.gsm();
        }
        return bl;
    }

    @Override
    public void aVH() {
        super.aVH();
        this.tZf.clear();
        this.tZg = 0;
        this.tEl = null;
        this.ncL = null;
        this.tZh = false;
        this.tZi = false;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == 1387629604) {
            this.setHorizontal(Bw.aK(string));
        } else if (n == -1156593849) {
            this.setModulationColor(fic_12.vm(string));
        } else if (n == 1792677060) {
            this.setRepeatNumber(Bw.m(string));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 1387629604) {
            this.setHorizontal(Bw.l(object));
        } else if (n == -1156593849) {
            this.setModulationColor((axb_2)object);
        } else if (n == 1792677060) {
            this.setRepeatNumber(Bw.m(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

