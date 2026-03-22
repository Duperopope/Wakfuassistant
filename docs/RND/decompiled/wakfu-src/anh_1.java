/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from anH
 */
public class anh_1
extends anr_1 {
    private Boolean cKq;

    public anh_1(String string) {
        super(string);
    }

    public Boolean H(Object object) {
        if (!(object instanceof Boolean)) {
            throw new aml_1("[Analyse d'un crit\u00e8re] Tentative d'\u00e9valuation d'un crit\u00e8re avec des arguments incompatibles");
        }
        this.cKq = (Boolean)object == false;
        return this.cKq;
    }

    @Override
    public anc_1 F(Object object) {
        boolean bl = this.H(object);
        if (bl) {
            return new anm_1("<automatically built after simplification>");
        }
        return new any_2("<automatically built after simplification>");
    }

    public Boolean bDR() {
        return this.cKq;
    }

    @Override
    public /* synthetic */ Object E(Object object) {
        return this.H(object);
    }

    @Override
    public /* synthetic */ Object getValue() {
        return this.bDR();
    }
}

