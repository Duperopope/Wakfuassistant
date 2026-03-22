/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from anK
 */
public class ank_1
extends ans_1 {
    private Object aGT;

    public ank_1(String string) {
        super(string);
    }

    @Override
    public Object b(Object object, Object object2) {
        if (object instanceof Long && object2 instanceof Long) {
            long l = (Long)object + (Long)object2;
            this.aGT = l;
            return l;
        }
        if (object instanceof String && object2 instanceof String) {
            this.aGT = String.valueOf(object) + String.valueOf(object2);
            return this.aGT;
        }
        throw new aml_1("[Analyse d'un crit\u00e8re] Tentative d'\u00e9valuation d'un crit\u00e8re avec des arguments incompatibles");
    }

    @Override
    public anc_1 c(Object object, Object object2) {
        Object object3 = this.b(object, object2);
        if (object3 instanceof Long) {
            return new ani_1("<automatically built after simplification>", (Long)object3);
        }
        return new anl_1((String)object3, false);
    }

    @Override
    public Object getValue() {
        return this.aGT;
    }
}

