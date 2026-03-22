/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
 * Renamed from eBp
 */
public final class ebp_0
extends ebx_0 {
    public ebp_0(ArrayList<amx_1> arrayList) {
        super(arrayList);
    }

    @Override
    public Enum bDq() {
        return ehq_0.pHo;
    }

    protected Collection<? extends exP> a(etu_0<?> etu_02, eyo_0 eyo_02) {
        if (etu_02 == null || eyo_02 == null) {
            return Collections.emptyList();
        }
        return etu_02.a(evb_0.fM(eyo_02.bcP()), evb_0.a(evb_0.fNs()));
    }
}

