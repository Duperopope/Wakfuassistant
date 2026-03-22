/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fKr
 */
public abstract class fkr_1
extends fkn_2
implements fku_1 {
    private fzq_0 uGm;
    public static final int uGn = -2108778994;

    @Override
    public fzq_0 getTriggerAction() {
        return this.uGm;
    }

    @Override
    public void setTriggerAction(fzq_0 fzq_02) {
        this.uGm = fzq_02;
    }

    @Override
    public void aVH() {
        super.aVH();
        this.uGm = null;
    }

    @Override
    public void a(fhi_2 fhi_22) {
        fkr_1 fkr_12 = (fkr_1)fhi_22;
        super.a(fhi_22);
        fkr_12.setTriggerAction(this.getTriggerAction());
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n != -2108778994) {
            return super.setXMLAttribute(n, string, fic_12);
        }
        this.setTriggerAction(fzq_0.ty(string));
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n != -2108778994) {
            return super.setPropertyAttribute(n, object);
        }
        this.setTriggerAction((fzq_0)((Object)object));
        return true;
    }
}

