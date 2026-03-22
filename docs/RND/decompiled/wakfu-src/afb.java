/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public interface afb
extends afe {
    public List<afh> bxq();

    default public List<afh> a(afc afc2) {
        return this.a(afc2, true);
    }

    default public List<afh> a(afc afc2, boolean bl) {
        ArrayList<afh> arrayList = new ArrayList<afh>(this.bxq());
        if (bl) {
            arrayList.removeIf(Objects::isNull);
        }
        if (afc2 == afc.cpv) {
            Collections.reverse(arrayList);
        }
        return arrayList;
    }

    public List<aeb_1> b(aez_0<?, ?> var1);

    default public List<aeb_1> a(aez_0<?, ?> aez_02, afc afc2) {
        return this.a(aez_02, afc2, true);
    }

    default public List<aeb_1> a(aez_0<?, ?> aez_02, afc afc2, boolean bl) {
        ArrayList<aeb_1> arrayList = new ArrayList<aeb_1>(this.b(aez_02));
        if (bl) {
            arrayList.removeIf(Objects::isNull);
        }
        if (afc2 == afc.cpv) {
            Collections.reverse(arrayList);
        }
        return arrayList;
    }

    @Override
    default public <R extends aed_1 & aew_1> R c(aez_0<?, ?> aez_02) {
        return (R)aex_0.a(aez_02, this.a(afc.cpv));
    }

    @Override
    default public <W extends aee_1 & aew_1> W d(aez_0<?, ?> aez_02) {
        return (W)aex_0.a(aez_02, this.a(afc.cpv));
    }
}

