/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fCY
 */
public class fcy_2
extends fbt_1 {
    public static final String TAG = "Separator";
    private boolean tMi = true;
    private boolean ubo = false;
    public static final int ubp = 1387629604;

    @Override
    public String getTag() {
        return TAG;
    }

    public boolean isHorizontal() {
        return this.tMi;
    }

    public void setHorizontal(boolean bl) {
        this.tMi = bl;
        this.ubo = true;
        this.setNeedsToPreProcess();
    }

    @Override
    public boolean gsR() {
        boolean bl = super.gsR();
        if (this.tSa.getPixmap() != null) {
            if (this.tMi) {
                this.setMinSize(new fsm_1(0, this.tSa.getPixmap().getHeight()));
            } else {
                this.setMinSize(new fsm_1(this.tSa.getPixmap().getWidth(), 0));
            }
            bl = true;
        }
        return bl;
    }

    @Override
    public boolean LZ(int n) {
        boolean bl = super.LZ(n);
        if (this.ubo) {
            if (this.gsR()) {
                this.uko.gsm();
            }
            this.ubo = false;
        }
        return bl;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n != 1387629604) {
            return super.setXMLAttribute(n, string, fic_12);
        }
        this.setHorizontal(Bw.aK(string));
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        return super.setPropertyAttribute(n, object);
    }
}

