/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eHk
 */
public final class ehk_0
extends eak_0 {
    private static final ArrayList<amz_1[]> pFo = new ArrayList();
    private boolean pxm = true;

    @Override
    protected List<amz_1[]> bDC() {
        return pFo;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    public ehk_0(ArrayList<amx_1> arrayList) {
        short s = this.r(arrayList);
        if (s == 0) {
            this.pxm = false;
        }
        if (s == 1) {
            this.pxm = ((anh_2)arrayList.get(0)).getValue().equalsIgnoreCase("target");
        }
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        long l = 0L;
        if (object4 == null) {
            throw new amf_2("Pas de contexte...");
        }
        boolean bl = object4 instanceof etu_0;
        boolean bl2 = object4 instanceof ent_0;
        if (!bl && !bl2) {
            throw new amf_2("On essaie de compter les invocations en dehors d'un combat...");
        }
        if (!(object instanceof exP)) {
            throw new amf_2("On essaie de compter les invocations d'un caster qui n'est pas un perso");
        }
        exP exP2 = eAs.a(this.pxm, object, object2, object4, object3);
        if (exP2 == null) {
            return -1L;
        }
        l = exP2.dlr();
        return super.fny() * l;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pIW;
    }

    static {
        pFo.add(amz_1.cJI);
        pFo.add(new amz_1[]{amz_1.cJx});
    }
}

