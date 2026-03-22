/*
 * Decompiled with CFR 0.152.
 */
import com.ankama.wakfu.utils.criterion.doc.Criterion;
import com.ankama.wakfu.utils.criterion.doc.Signature;
import java.util.ArrayList;
import java.util.Collection;

/*
 * Renamed from eBb
 */
@Criterion(description="Return the territory id where the fights take place in the current battleground instance", signatures={@Signature(description="Return the territory id as an integer")})
public final class ebb_0
extends eak_0 {
    @Override
    public boolean bDo() {
        return true;
    }

    public ebb_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        exP exP2 = eAs.k(object, object2, object4, object3);
        long l = 0L;
        if (exP2 != null) {
            l = exP2.aqZ();
        } else if (object4 instanceof tt_0) {
            l = ((tt_0)object4).bhh();
        }
        if (l == 0L) {
            throw new amf_2("Impossible d'evaluer le critere GetBattlegroundTerritoryId");
        }
        Collection<fpt> collection = fpu.sOH.ggE();
        for (fpt fpt2 : collection) {
            ArrayList<fpy_0> arrayList = fpt2.ggC();
            for (fpy_0 fpy_02 : arrayList) {
                if ((long)fpy_02.clo() != l) continue;
                return fpy_02.clr();
            }
        }
        return 0L;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pNK;
    }
}

