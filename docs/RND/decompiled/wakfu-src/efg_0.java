/*
 * Decompiled with CFR 0.152.
 */
import com.ankama.wakfu.utils.criterion.doc.Criterion;
import com.ankama.wakfu.utils.criterion.doc.Signature;
import java.util.ArrayList;

/*
 * Renamed from eFG
 */
@Criterion(description="Return true if the user is in a Admin Jail (ModerationConstants.MODERATION_JAIL_INSTANCE_ID)", signatures={@Signature})
public final class efg_0
extends eAH {
    public efg_0() {
    }

    public efg_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eyo_0 eyo_02 = eAs.m(object, object2, object4, object3);
        if (!(eyo_02 instanceof exP)) {
            return -1;
        }
        if (((exP)eyo_02).aqZ() == 725L) {
            return 0;
        }
        return -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pNQ;
    }
}

