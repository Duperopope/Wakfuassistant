/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class eBa
extends eby_0 {
    public eBa(ArrayList<amx_1> arrayList) {
        super(arrayList);
    }

    @Override
    protected Collection<? extends qu_0> a(etu_0<?> etu_02, eyo_0 eyo_02) {
        if (etu_02 == null || eyo_02 == null) {
            return Collections.emptyList();
        }
        return etu_02.fo(eyo_02.bcP());
    }

    @Override
    public Enum bDq() {
        return ehq_0.pMW;
    }
}

