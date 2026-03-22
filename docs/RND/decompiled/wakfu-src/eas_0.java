/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import com.ankama.wakfu.utils.criterion.doc.Criterion;
import com.ankama.wakfu.utils.criterion.doc.Parameter;
import com.ankama.wakfu.utils.criterion.doc.Signature;
import com.ankama.wakfu.utils.criterion.doc.VarType;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eAS
 */
@Criterion(description="Return the id of the active cosmetic for a given type", signatures={@Signature(description="type", params={@Parameter(name="typeId", type=VarType.NUMBER)})})
public final class eas_0
extends eak_0 {
    private final amu_1 pwM;

    public eas_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        this.pwM = (amu_1)arrayList.get(0);
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public long d(@Nullable Object object, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4) {
        if (!(object instanceof exP)) {
            return 0L;
        }
        exP exP2 = (exP)object;
        int n = (int)this.pwM.d(object, object2, object3, object4);
        fm_1 fm_12 = fm_1.ce(n);
        if (fm_12 == null) {
            return 0L;
        }
        switch (fm_12) {
            case pw: {
                return exP2.doZ();
            }
            case px: {
                return exP2.dpR();
            }
            case py: {
                return exP2.dpS().isEmpty() ? 0L : ((Integer)exP2.dpS().toArray()[0]).longValue();
            }
            case pz: {
                return exP2.dpT();
            }
            case pA: {
                return exP2.dpD();
            }
        }
        return ekj_0.b(exP2.Xi(), exP2.Sn(), fm_12).AK();
    }

    @Override
    public Enum bDq() {
        return ehq_0.pNn;
    }
}

