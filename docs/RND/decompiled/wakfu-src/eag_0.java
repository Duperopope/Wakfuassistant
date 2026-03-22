/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from eAg
 */
public abstract class eag_0
extends eak_0 {
    private static final ArrayList<amz_1[]> pvC = new ArrayList();
    protected final anh_2 pvD;
    protected final amu_1 pvE;
    protected final ang_2 pvF;
    private eyo_0 pvG;
    private final String pvH;

    public eag_0(ArrayList<amx_1> arrayList) {
        byte by = this.r(arrayList);
        this.pvD = (anh_2)arrayList.get(0);
        this.pvE = (amu_1)arrayList.get(1);
        this.pvF = (ang_2)arrayList.get(2);
        this.pvH = by == 1 ? ((anh_2)arrayList.get(3)).getValue() : "";
    }

    protected @Unmodifiable List<Integer> i(Object object, Object object2, Object object3, Object object4) {
        String string = this.pvD.getValue();
        long l = this.pvE.d(object, object2, object3, object4);
        boolean bl = this.pvF.b(object, object2, object3, object4);
        ehl_0 ehl_02 = ehl_0.rV(string);
        eyo_0 eyo_02 = eAs.b(ehl_02, object, object2, object4, object3);
        if (eyo_02 == null) {
            return null;
        }
        if (!(eyo_02 instanceof exP)) {
            return null;
        }
        exP exP2 = (exP)eyo_02;
        etu_0<?> etu_02 = eAs.m(object, object4);
        if (etu_02 == null) {
            throw new amf_2("Unable to retrieve fight");
        }
        Function<QQ, Integer> function = bl ? qQ -> eag_0.a(exP2, etu_02.bag(), qQ) : qQ -> eag_0.b(exP2, qQ);
        Collection<QQ> collection = etu_02.bai().bdh();
        if (!this.pvH.isEmpty()) {
            this.j(object, object2, object4, object3);
        }
        return collection.stream().filter(qQ -> eag_0.a(this.pvG, qQ)).filter(qQ -> eag_0.c(l, qQ)).map(function).filter(eag_0::au).toList();
    }

    protected static boolean a(eyo_0 eyo_02, QQ qQ) {
        if (eyo_02 == null) {
            return true;
        }
        qu_0 qu_02 = qQ.bci();
        if (!(qu_02 instanceof ant_1)) {
            return false;
        }
        return qu_02.Sn() == eyo_02.Sn();
    }

    protected static boolean au(Integer n) {
        return n > 0;
    }

    protected static boolean c(long l, QQ qQ) {
        return qQ.bcw() == l;
    }

    protected static Integer b(eyo_0 eyo_02, QQ qQ) {
        acd_1 acd_12 = eyo_02.aZw();
        return acd_12.A(qQ.aZw());
    }

    protected static Integer a(exP exP2, rh_0 rh_02, QQ qQ) {
        sr_0 sr_02 = sr_0.bgd();
        sr_02.a((int)exP2.bcN(), exP2.bcO(), exP2.bvy());
        sr_02.b(rh_02);
        sr_02.l(exP2.aZw());
        st_0 st_02 = new st_0();
        st_02.bqO = 400;
        st_02.bqN = 256;
        st_02.bqP = false;
        sr_02.a(st_02);
        sr_02.m(qQ.aZw());
        return sr_02.bgj();
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pvC;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    protected void j(Object object, Object object2, Object object3, Object object4) {
        this.pvG = eAs.a(this.pvH, object, object2, object3, object4);
    }

    static {
        pvC.add(new amz_1[]{amz_1.cJx, amz_1.cJy, amz_1.cJz});
        pvC.add(new amz_1[]{amz_1.cJx, amz_1.cJy, amz_1.cJz, amz_1.cJx});
    }
}

