/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from anw
 */
public class anw_2
extends ans_1 {
    private Long cKr;

    public anw_2(String string) {
        super(string);
    }

    public Long e(Object object, Object object2) {
        if (!(object instanceof Long) || !(object2 instanceof Long)) {
            throw new aml_1("[Analyse d'un crit\u00e8re] Tentative d'\u00e9valuation d'un crit\u00e8re avec des arguments incompatibles");
        }
        long l = (Long)object / (Long)object2;
        this.cKr = l;
        return l;
    }

    @Override
    public anc_1 c(Object object, Object object2) {
        return new ani_1("<automatically built after simplification>", this.e(object, object2));
    }

    public Long bDS() {
        return this.cKr;
    }

    @Override
    public /* synthetic */ Object b(Object object, Object object2) {
        return this.e(object, object2);
    }

    @Override
    public /* synthetic */ Object getValue() {
        return this.bDS();
    }
}

