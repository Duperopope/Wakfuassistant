/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import com.ankama.wakfu.utils.criterion.doc.Criterion;
import com.ankama.wakfu.utils.criterion.doc.Signature;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eCn
 */
@Criterion(description="Return the level minimum of the current instance (usefull in dungeons when downscale is forced)", signatures={@Signature(description="Return the level minimum of the current instance as an integer")})
public class ecn_0
extends eak_0 {
    public ecn_0() {
    }

    public ecn_0(ArrayList<amx_1> arrayList) {
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public long d(@Nullable Object object, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4) {
        eyo_0 eyo_02 = eAs.m(object, object2, object4, object3);
        if (eyo_02 == null) {
            return -1L;
        }
        if (!(eyo_02 instanceof exP)) {
            return -1L;
        }
        exP exP2 = (exP)eyo_02;
        return exP2.doa().isPresent() ? (long)exP2.doa().get().rI() : -1L;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pNV;
    }
}

