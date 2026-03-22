/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fRG
 */
public abstract class frg_1
extends frc_1 {
    private frc_1 var;
    private frc_1 vas;

    public frg_1(frc_1 frc_12, frc_1 frc_13) {
        if (frc_12 == null || frc_13 == null) {
            frc_1.vah.error((Object)("Probl\u00e8me dans un " + this.getClass().getName() + " : un des Spring est null"));
        }
        this.var = frc_12 != null ? frc_12 : frg_1.acc(0);
        this.vas = frc_13 != null ? frc_13 : frg_1.acc(0);
    }

    @Override
    public int getValue() {
        return this.hh(this.var.getValue(), this.vas.getValue());
    }

    @Override
    public void setValue(int n) {
        super.setValue(n);
        this.var.setValue(n);
        this.vas.setValue(n);
    }

    public abstract int hh(int var1, int var2);

    @Override
    public void aVH() {
        super.aVH();
        this.var = null;
        this.vas = null;
    }
}

