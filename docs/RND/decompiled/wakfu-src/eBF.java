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

@Criterion(description="Return the difficulty of the current dungeon", signatures={@Signature(description="Return the difficulty as an integer, -1 if not in dungeon")})
public class eBF
extends eak_0 {
    public eBF(ArrayList<amx_1> arrayList) {
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
        return exP2.doa().isPresent() ? (long)exP2.doa().get().GN() : -1L;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pNk;
    }
}

