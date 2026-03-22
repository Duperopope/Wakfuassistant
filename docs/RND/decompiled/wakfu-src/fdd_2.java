/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fDD
 */
public class fdd_2
extends fad_1 {
    public static final String TAG = "CheckBox";
    public static final String uhp = "ToggleButton";
    protected fis_1 nQu;
    protected boolean uhq = true;
    public static final int uhr = 1191572123;
    public static final int uhs = -607653549;

    @Override
    public String getTag() {
        return TAG;
    }

    public void setSelected(boolean bl) {
        fzs fzs2 = this.getAppearance();
        if (fzs2 != null && bl != fzs2.isChecked()) {
            fzs2.grr();
        }
    }

    public boolean getSelected() {
        return this.getAppearance().isChecked();
    }

    public void setOverrideClickSound(boolean bl) {
        this.uhq = bl;
    }

    @Override
    public void setClickSoundId(int n) {
        super.setClickSoundId(n);
        this.uhq = false;
    }

    @Override
    public fzs getAppearance() {
        return (fzs)this.uki;
    }

    @Override
    public boolean isAppearanceCompatible(fys_0 fys_02) {
        return fys_02 instanceof fzs;
    }

    @Override
    @Nullable
    protected faa_2 getDefaultLabelAlignment() {
        return null;
    }

    @Override
    public void gsx() {
        super.gsx();
        this.nQu = new fde_2(this);
        this.a(fzq_0.tJU, this.nQu, true);
    }

    @Override
    public void a(fhi_2 fhi_22) {
        super.a(fhi_22);
        ((fdd_2)fhi_22).uhq = this.uhq;
        ((fdd_2)fhi_22).b(fzq_0.tJU, this.nQu, true);
    }

    @Override
    protected void b(fiq_1 fiq_12, boolean bl) {
        if (this.uhq) {
            switch (fiq_12.gBy()) {
                case tJU: 
                case tJV: 
                case tJB: 
                case tJC: {
                    return;
                }
            }
        }
        super.b(fiq_12, bl);
    }

    @Override
    public void grv() {
        super.grv();
        this.getAppearance().grv();
    }

    @Override
    public void aVH() {
        super.aVH();
        this.nQu = null;
    }

    @Override
    public void aVI() {
        super.aVI();
        this.uhq = true;
        fzs fzs2 = new fzs();
        fzs2.aVI();
        fzs2.setWidget(this);
        this.d(fzs2);
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == 1191572123) {
            this.setSelected(Bw.aK(string));
        } else if (n == -607653549) {
            this.setOverrideClickSound(Bw.aK(string));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n != 1191572123) {
            return super.setPropertyAttribute(n, object);
        }
        this.setSelected(Bw.l(object));
        return true;
    }
}

