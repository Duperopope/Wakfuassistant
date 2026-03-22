/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from anD
 */
public class and_1
extends anr_1 {
    private Long cKr;

    public and_1(String string) {
        super(string);
    }

    public Long G(Object object) {
        if (!(object instanceof Long)) {
            throw new aml_1("[Analyse d'un crit\u00e8re] Tentative d'\u00e9valuation d'un crit\u00e8re avec des arguments incompatibles");
        }
        this.cKr = -((Long)object).longValue();
        return this.cKr;
    }

    @Override
    public anc_1 F(Object object) {
        return new ani_1("<automatically built after simplification>", this.G(object));
    }

    @Override
    public Object getValue() {
        return this.cKr;
    }

    @Override
    public /* synthetic */ Object E(Object object) {
        return this.G(object);
    }
}

