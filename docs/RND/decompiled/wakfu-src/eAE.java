/*
 * Decompiled with CFR 0.152.
 */
import com.ankama.wakfu.utils.criterion.doc.Criterion;
import java.util.ArrayList;
import java.util.Optional;

@Criterion(description="Return the current player dungeon min level (-1 if no dungeon)")
public class eAE
extends eak_0 {
    @Override
    public boolean bDo() {
        return true;
    }

    public eAE(ArrayList<amx_1> arrayList) {
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        eyo_0 eyo_02 = eAs.m(object, object2, object4, object3);
        if (eyo_02 == null) {
            return -1L;
        }
        if (!(eyo_02 instanceof exP)) {
            return -1L;
        }
        exP exP2 = (exP)eyo_02;
        long l = exP2.aqZ();
        Optional<eIb> optional = eId.quO.pC(l);
        return optional.isPresent() ? (long)optional.get().aVf() : -1L;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pJl;
    }
}

