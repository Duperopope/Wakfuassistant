/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Point;

/*
 * Renamed from fED
 */
public class fed_2
extends faw_2 {
    public static final String TAG = "WindowResizePoint";
    public static final String una = "WRP";
    fey_2 lAX = null;
    faa_2 unb;
    Point tVX;
    boolean unc = false;
    faw_2 und = null;
    private fis_1 mTP;
    public static final int une = 1238322005;

    @Override
    public String getTag() {
        return TAG;
    }

    public void setPointAlign(faa_2 faa_22) {
        this.unb = faa_22;
        switch (this.unb) {
            case tLP: 
            case tLN: {
                this.setCurrentCursorType(fzo_0.tHV);
                break;
            }
            case tLL: 
            case tLR: {
                this.setCurrentCursorType(fzo_0.tHW);
                break;
            }
            case tLK: 
            case tLS: {
                this.setCurrentCursorType(fzo_0.tHX);
                break;
            }
            case tLM: 
            case tLQ: {
                this.setCurrentCursorType(fzo_0.tHY);
                break;
            }
            case tLO: {
                this.setCurrentCursorType(fzo_0.tHO);
            }
        }
    }

    public faa_2 getPointAlign() {
        return this.unb;
    }

    public void setWindow(fey_2 fey_22) {
        this.lAX = fey_22;
    }

    public fey_2 getWindow() {
        return this.lAX;
    }

    protected int setCheckedWidth(int n) {
        fsm_1 fsm_12 = this.lAX.getPrefSize();
        if (n < fsm_12.width) {
            n = fsm_12.width;
        }
        fsm_1 fsm_13 = this.lAX.getMaxSize();
        if (fsm_13.width < n) {
            n = fsm_13.width;
        }
        this.lAX.setSize(n, this.lAX.ukt.height);
        return n;
    }

    protected int setCheckedHeight(int n) {
        fsm_1 fsm_12 = this.lAX.getPrefSize();
        if (n < fsm_12.height) {
            n = fsm_12.height;
        }
        fsm_1 fsm_13 = this.lAX.getMaxSize();
        if (fsm_13.height < n) {
            n = fsm_13.height;
        }
        this.lAX.setSize(this.lAX.ukt.width, n);
        return n;
    }

    public void dKc() {
        this.mTP = new fee_2(this);
        fbj_1.getInstance().a(fzq_0.tJT, this.mTP, false);
        this.a(fzq_0.tJO, new fef_2(this), false);
    }

    @Override
    public void eKI() {
        super.eKI();
        this.lAX = this.getParentOfType(fey_2.class);
        if (this.lAX != null) {
            this.und = this.lAX.getWidgetParentOfType(fch_1.class);
        }
    }

    @Override
    public void aVH() {
        super.aVH();
        fbj_1.getInstance().b(fzq_0.tJT, this.mTP, false);
        this.lAX = null;
        this.unb = null;
    }

    @Override
    public void aVI() {
        super.aVI();
        this.dKc();
        this.ukD = false;
    }

    @Override
    public void a(fhi_2 fhi_22) {
        fed_2 fed_22 = (fed_2)fhi_22;
        super.a(fhi_22);
        fed_22.setPointAlign(this.unb);
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n != 1238322005) {
            return super.setXMLAttribute(n, string, fic_12);
        }
        this.setPointAlign(faa_2.tI(string));
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        return super.setPropertyAttribute(n, object);
    }

    @Override
    public void setEnabled(boolean bl) {
        super.setEnabled(bl);
        this.gsv();
    }

    @Override
    public void setNetEnabled(boolean bl) {
        super.setNetEnabled(bl);
        this.gsv();
    }

    private void gsv() {
        if (this.isEnabledFull()) {
            this.setPointAlign(this.unb);
        } else {
            this.setCurrentCursorType(fzo_0.tHq);
        }
    }
}

