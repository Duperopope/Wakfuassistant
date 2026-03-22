/*
 * Decompiled with CFR 0.152.
 */
public class fzk
extends fzs {
    public static final String TAG = "RadioButtonAppearance";

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public boolean grr() {
        if (this.jqv) {
            return false;
        }
        fry_1 fry_12 = this.tCV.getElementMap().uM(((fcu_1)this.tCV).getGroupId());
        if (fry_12 == null) {
            return false;
        }
        fry_12.ad(new fzl(this));
        return super.grr();
    }

    public void grs() {
        if (this.jqv) {
            super.grr();
        }
    }
}

