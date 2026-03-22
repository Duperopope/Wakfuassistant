/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eHo
 */
public class eho_0
extends eAH {
    private static final ArrayList<amz_1[]> pFx = new ArrayList();

    public eho_0(ArrayList<amx_1> arrayList) {
        this.r(arrayList);
    }

    protected ArrayList<amz_1[]> fnC() {
        return pFx;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eyo_0 eyo_02 = eAs.b(false, object, object2, object4, object3);
        if (!(object3 instanceof ero_0)) {
            return -1;
        }
        ero_0 ero_02 = (ero_0)object3;
        eNl eNl2 = this.d(ero_02);
        if (!(eNl2 instanceof fqE)) {
            return -1;
        }
        etu_0<?> etu_02 = eAs.m(object, object4);
        if (etu_02 == null) {
            return -1;
        }
        if (!(eyo_02 instanceof exP)) {
            return -1;
        }
        acd_1 acd_12 = this.s(object, object2, object3, object4);
        if (acd_12 == null) {
            return -1;
        }
        exP exP2 = (exP)eyo_02;
        fqE fqE2 = (fqE)eNl2;
        eug_1<fqE, exP> eug_12 = new eug_1<fqE, exP>(etu_02);
        Object Spell = fqE2.giP();
        boolean bl = ((fqD)Spell).d(fqE2, (Object)exP2, object2, object4);
        int n = ((fqD)Spell).i(fqE2, exP2, object2, object4);
        int n2 = ((fqD)Spell).j(fqE2, exP2, object2, object4);
        boolean bl2 = ((fqD)Spell).a(fqE2, (Object)exP2, object2, object4);
        boolean bl3 = ((fqD)Spell).f(fqE2, exP2, object2, object4);
        boolean bl4 = ((fqD)Spell).fYo();
        boolean bl5 = ((fqD)Spell).l(fqE2, exP2, object2, object4);
        ang_2 ang_22 = ((fqD)Spell).giF();
        fqH fqH2 = eug_12.a(exP2, fqE2, acd_12, bl, n2, n, bl2, bl3, bl4, bl5, ang_22);
        exP exP3 = eAs.a(ehl_0.pFr, object, object2, object4, object3);
        boolean bl6 = eug_1.a(exP2, acd_12, fqE2, exP3, etu_02);
        if (fqH2 == fqH.sUS && bl6) {
            return -1;
        }
        return 0;
    }

    protected eNl d(ero_0 ero_02) {
        return (eNl)ero_02.bbf();
    }

    protected acd_1 s(Object object, Object object2, Object object3, Object object4) {
        return eAs.d(true, object, object2, object4, object3);
    }

    @Override
    public Enum bDq() {
        return ehq_0.pMv;
    }

    protected /* synthetic */ List bDC() {
        return this.fnC();
    }

    static {
        pFx.add(eAC.pwq);
    }
}

