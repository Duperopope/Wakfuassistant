/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class eBP
extends ebx_0 {
    public eBP(ArrayList<amx_1> arrayList) {
        super(arrayList);
    }

    protected Collection<? extends exP> a(etu_0<?> etu_02, eyo_0 eyo_02) {
        if (etu_02 == null || eyo_02 == null) {
            return Collections.emptyList();
        }
        return etu_02.a(evb_0.d(evb_0.a(evb_0.fK(eyo_02.bcP())), evb_0.fNn(), evb_0.a(evb_0.fNs())));
    }

    @Override
    public Enum bDq() {
        return ehq_0.pHm;
    }
}

