/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from anx
 */
public class anx_2
extends ans_1 {
    private Boolean cKq;

    public anx_2(String string) {
        super(string);
    }

    public Boolean d(Object object, Object object2) {
        if (object.getClass() != object2.getClass()) {
            throw new aml_1("[Analyse d'un crit\u00e8re] Tentative d'\u00e9valuation d'un crit\u00e8re avec des arguments incompatibles");
        }
        this.cKq = object.equals(object2);
        return this.cKq;
    }

    @Override
    public anc_1 c(Object object, Object object2) {
        if (this.d(object, object2).booleanValue()) {
            return new anm_1("<automatically built after simplification>");
        }
        return new any_2("<automatically built after simplification>");
    }

    public Boolean bDR() {
        return this.cKq;
    }

    @Override
    public /* synthetic */ Object b(Object object, Object object2) {
        return this.d(object, object2);
    }

    @Override
    public /* synthetic */ Object getValue() {
        return this.bDR();
    }
}

