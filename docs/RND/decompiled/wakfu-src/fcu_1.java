/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from fCu
 */
public class fcu_1
extends fdd_2 {
    public static final String TAG = "RadioButton";
    private String tYJ = "";
    private String axs;
    public static final int tYK = 293428218;
    public static final int tYL = 111972721;

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public fzk getAppearance() {
        return (fzk)this.uki;
    }

    @Override
    public boolean isAppearanceCompatible(fys_0 fys_02) {
        return fys_02 instanceof fzk;
    }

    public String getGroupId() {
        return this.tYJ;
    }

    public void setGroupId(String string) {
        this.tYJ = string;
        this.gtL();
    }

    public String getValue() {
        return this.axs;
    }

    public void setValue(String string) {
        this.axs = string;
        this.gtL();
    }

    @Override
    public void a(apd_1 apd_12, fhv_1 fhv_12, Stack<fhs_2> stack, fhu_1 fhu_12) {
        super.a(apd_12, fhv_12, stack, fhu_12);
    }

    private void gtL() {
        if (this.nQt.uN(this.tYJ)) {
            this.nQt.uM(this.tYJ).j(this);
            if (this.axs != null && this.axs.equalsIgnoreCase(this.nQt.uM(this.tYJ).getValue()) && !this.getAppearance().isChecked()) {
                this.getAppearance().grr();
            }
        }
    }

    public void gtM() {
        fzk fzk2 = this.getAppearance();
        if (fzk2 != null && fzk2.isChecked()) {
            fzk2.grs();
        }
    }

    @Override
    public void gtN() {
        super.gtN();
        this.gtL();
    }

    @Override
    public void aVI() {
        super.aVI();
        fzk fzk2 = new fzk();
        fzk2.aVI();
        fzk2.setWidget(this);
        this.d(fzk2);
    }

    @Override
    public void aVH() {
        if (this.nQt.uN(this.tYJ)) {
            this.nQt.uM(this.tYJ).k(this);
        }
        super.aVH();
        this.tYJ = null;
        this.axs = null;
    }

    @Override
    public void a(fhi_2 fhi_22) {
        fcu_1 fcu_12 = (fcu_1)fhi_22;
        super.a(fcu_12);
        fcu_12.tYJ = this.tYJ;
        fcu_12.axs = this.axs;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == 293428218) {
            this.setGroupId(fic_12.a(string, this.nQt));
        } else if (n == 111972721) {
            this.setValue(fic_12.a(string, this.nQt));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 293428218) {
            this.setGroupId(String.valueOf(object));
        } else if (n == 111972721) {
            this.setValue(String.valueOf(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

