/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 */
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;

/*
 * Renamed from fyM
 */
public class fym_0
extends fzq {
    private static final Logger tDo = Logger.getLogger(fym_0.class);
    public static final String TAG = "ButtonAppearance";
    public static final String tDp = tDM;
    public static final String tDq = fzy_0.tGc.getName();
    public static final String tDr = fzy_0.tGg.getName();
    public static final String tDs = fzy_0.tGe.getName();
    private static final ObjectPool tDt = new ayv_2(new fyn_0());
    protected int bSO = 5;
    protected int tDu = -3;
    protected boolean tDv = false;
    protected boolean tDw = false;
    protected boolean cHn = true;
    public static final int tDx = 102102;
    public static final int tDy = -1466575902;

    public static fym_0 checkOut() {
        fym_0 fym_02;
        try {
            fym_02 = (fym_0)tDt.borrowObject();
            fym_02.uth = tDt;
        }
        catch (Exception exception) {
            tDo.error((Object)"Probl\u00e8me au borrowObject.");
            fym_02 = new fym_0();
            fym_02.aVI();
        }
        return fym_02;
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public int getGap() {
        return this.bSO;
    }

    public void setGap(int n) {
        this.bSO = n;
    }

    public int getClickSoundId() {
        return this.tDu;
    }

    public void setClickSoundId(int n) {
        this.tDu = n;
        fad_1 fad_12 = (fad_1)this.tCV;
        if (fad_12 != null && this.tDu != -3) {
            fad_12.setClickSoundId(this.tDu);
        }
    }

    @Override
    public void setWidget(fes_2 fes_22) {
        super.setWidget(fes_22);
        fad_1 fad_12 = (fad_1)this.tCV;
        if (this.tDu != -3) {
            fad_12.setClickSoundId(this.tDu);
        }
    }

    public boolean isOver() {
        return this.tDw;
    }

    public boolean isArmed() {
        return this.tDv;
    }

    public void gqR() {
        this.tDw = true;
        this.elr();
    }

    public void gqS() {
        this.tDw = false;
        this.elr();
    }

    public void gqT() {
        this.tDv = true;
        this.elr();
    }

    public void gqU() {
        if (this.tDv) {
            this.tDv = false;
            this.elr();
        }
    }

    public void gqV() {
        if (this.cHn) {
            this.cHn = false;
            this.elr();
        }
    }

    public void gqW() {
        if (!this.cHn) {
            this.cHn = true;
            this.elr();
        }
    }

    protected void elr() {
        this.grf();
        this.gqX();
    }

    protected void gqX() {
        if (this.cHn) {
            if (this.tDw) {
                if (this.tDv) {
                    this.setEnabled(tDs, true);
                } else {
                    this.setEnabled(tDr, true);
                }
            } else {
                this.setEnabled(tDp, true);
            }
        } else {
            this.setEnabled(tDq, true);
        }
    }

    @Override
    public void a(fhi_2 fhi_22) {
        fym_0 fym_02 = (fym_0)fhi_22;
        super.a(fhi_22);
        fym_02.bSO = this.bSO;
        fym_02.tDu = this.tDu;
    }

    @Override
    public void aVI() {
        super.aVI();
        this.bSO = 5;
        this.tDu = -3;
        this.tDv = false;
        this.tDw = false;
        this.cHn = true;
    }

    @Override
    public void aVH() {
        super.aVH();
        this.bSO = 5;
        this.tDu = -3;
        this.tDv = false;
        this.tDw = false;
        this.cHn = true;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == 102102) {
            this.setGap(Bw.m(string));
        } else if (n == -1466575902) {
            this.setClickSoundId(Bw.m(string));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n != 102102) {
            return super.setPropertyAttribute(n, object);
        }
        this.setGap(Bw.m(object));
        return true;
    }
}

