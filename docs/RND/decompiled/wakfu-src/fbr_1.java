/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fBr
 */
public class fbr_1
extends fes_2 {
    public static final String TAG = "graph";
    private ffh_1 tSx;
    private fsm_1 tMc = null;
    private boolean tSy = false;
    private boolean tSz = false;
    private fbs_1 tSA = null;
    public static final int tSB = "content".hashCode();
    public static final int tSC = -917611389;

    @Override
    protected void eKZ() {
        super.eKZ();
        this.bVe.g(this.tSx.gwH());
    }

    public void setContent(fbs_1 fbs_12) {
        this.tSA = fbs_12;
        this.tSx.a(fbs_12);
        this.tSz = true;
        this.tSy = true;
        this.setNeedsToPreProcess();
        this.setNeedsToPostProcess();
    }

    public void setCellSize(fsm_1 fsm_12) {
        this.tMc = fsm_12;
        this.tSx.setCellWidth(this.tMc.width);
    }

    @Override
    public boolean isAppearanceCompatible(fys_0 fys_02) {
        return true;
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public void clear() {
        this.tSx.clear();
    }

    private boolean gsR() {
        int n = this.tSA != null ? this.tSA.gsY().size() : 0;
        int n2 = this.tMc.width * n;
        int n3 = this.tMc.height;
        fsm_1 fsm_12 = this.getContentMinSize();
        if (fsm_12.width == n2 || fsm_12.height == n3) {
            return false;
        }
        this.setMinSize(new fsm_1(n2, n3));
        this.tSy = false;
        return true;
    }

    @Override
    public void grg() {
        super.grg();
        if (this.tSx != null) {
            this.tSx.a(this.ukt, this.uki.getMargin(), this.uki.getBorder(), this.uki.getPadding());
        }
    }

    @Override
    public boolean LZ(int n) {
        boolean bl;
        boolean bl2 = super.LZ(n);
        if (this.tSy && (bl = this.gsR()) && this.uko != null) {
            this.uko.gsm();
            this.tSz = true;
            this.setNeedsToPostProcess();
        }
        return bl2;
    }

    @Override
    public boolean LY(int n) {
        boolean bl = super.LY(n);
        if (this.tSz) {
            this.tSx.a(this.ukt, this.uki.getMargin(), this.uki.getBorder(), this.uki.getPadding());
            this.tSz = false;
        }
        return bl;
    }

    @Override
    public void aVH() {
        super.aVH();
        this.tSA = null;
        this.tMc = null;
    }

    @Override
    public void aVI() {
        super.aVI();
        fys_0 fys_02 = fys_0.checkOut();
        fys_02.setWidget(this);
        this.d(fys_02);
        this.tSx = new ffh_1();
        this.tSx.aVI();
        this.tSy = false;
        this.tSz = false;
        this.tMc = new fsm_1(0, 0);
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n != -917611389) {
            return super.setXMLAttribute(n, string, fic_12);
        }
        this.setCellSize(fic_12.vn(string));
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n != tSB) {
            return super.setPropertyAttribute(n, object);
        }
        this.setContent((fbs_1)object);
        return true;
    }
}

