/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

public class fzo
extends fzq {
    public static final String TAG = "TextEditorAppearance";
    @Nullable
    protected axb_2 tFv;
    private boolean tFw = false;
    public static final int tFx = -410102681;

    @Override
    public void setWidget(fes_2 fes_22) {
        super.setWidget(fes_22);
        this.k(fes_22);
    }

    protected void k(fes_2 fes_22) {
        if (fes_22 instanceof fyo_0 && this.tFw) {
            fyo_0 fyo_02 = (fyo_0)((Object)fes_22);
            fyo_02.setColor(this.tFv, "ghostText");
        }
    }

    @Override
    public void setColor(axb_2 axb_22, String string) {
        if ("ghostText".equals(string)) {
            this.setGhostTextColor(axb_22);
        } else {
            super.setColor(axb_22, string);
        }
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public void setGhostTextColor(@Nullable axb_2 axb_22) {
        if (this.tFw && this.tFv == axb_22) {
            return;
        }
        this.tFv = axb_22;
        this.tFw = true;
        this.k(this.tCV);
    }

    @Override
    public void aVH() {
        super.aVH();
        this.tFw = false;
        this.tFv = null;
    }

    @Override
    public void a(fhi_2 fhi_22) {
        fzo fzo2 = (fzo)fhi_22;
        super.a(fzo2);
        if (this.tFw) {
            fzo2.setGhostTextColor(this.tFv);
        }
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        switch (n) {
            case -410102681: {
                this.setGhostTextColor(fic_12.vm(string));
                return true;
            }
        }
        return super.setXMLAttribute(n, string, fic_12);
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        switch (n) {
            case -410102681: {
                this.setGhostTextColor((axb_2)object);
                return true;
            }
        }
        return super.setPropertyAttribute(n, object);
    }
}

