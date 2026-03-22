/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eAY
 */
public final class eay_0
extends eak_0 {
    private static final ArrayList<amz_1[]> pwV = new ArrayList();
    boolean pvJ;

    @Override
    protected List<amz_1[]> bDC() {
        return pwV;
    }

    eay_0() {
    }

    public eay_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
        if (arrayList.size() == 1) {
            this.pvJ = ((anh_2)arrayList.get(0)).getValue().equalsIgnoreCase("target");
        }
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public long d(@Nullable Object object, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4) {
        if (object4 == null) {
            throw new amf_2("Pas de contexte...");
        }
        boolean bl = object4 instanceof etu_0;
        boolean bl2 = object4 instanceof ent_0;
        if (!bl && !bl2) {
            throw new amf_2("On essaie de compter les fighters en dehors d'un combat...");
        }
        if (!(object instanceof eyo_0)) {
            throw new amf_2("On essaie de compter les fighters d'un caster qui n'est pas un perso");
        }
        etu_0 etu_02 = bl ? (etu_0)object4 : ((ent_0)object4).fBq();
        if (etu_02 == null) {
            return 0L;
        }
        eyo_0 eyo_02 = eAs.b(this.pvJ, object, object2, object4, object3);
        return etu_02.bJ(eyo_02.bcP()).size();
    }

    @Override
    public Enum bDq() {
        return ehq_0.pLq;
    }

    static {
        pwV.add(eAC.pwq);
        pwV.add(eAC.pwr);
    }
}

