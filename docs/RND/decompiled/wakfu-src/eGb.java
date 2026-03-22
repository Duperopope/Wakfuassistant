/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class eGb
extends eAH {
    private static final String pDN = "teamAreas";
    private static final String pDO = "ownAreas";
    private static final ArrayList<amz_1[]> pDP = new ArrayList();
    public static final byte pDQ = 1;
    public static final byte pDR = 2;
    public static final byte pDS = 3;
    protected final String pDT;
    private final amu_1 pDU;
    private final byte pDV;

    @Override
    protected List<amz_1[]> bDC() {
        return pDP;
    }

    protected eGb(String string, amu_1 amu_12, amz_2 amz_22) {
        this.pDT = string;
        this.pDU = amu_12;
        this.pDV = amz_22.b(null, null, null, null) ? (byte)2 : (byte)1;
    }

    public eGb(ArrayList<amx_1> arrayList) {
        String string;
        boolean bl;
        byte by = this.r(arrayList);
        this.pDT = ((anh_2)arrayList.get(0)).getValue();
        this.pDU = (amu_1)arrayList.get(1);
        this.pDV = by == 1 ? (byte)((bl = ((ang_2)arrayList.get(2)).b(null, null, null, null)) ? 2 : 1) : (by == 2 ? (pDO.equalsIgnoreCase(string = ((anh_2)arrayList.get(2)).getValue()) ? (byte)2 : (pDN.equalsIgnoreCase(string) ? (byte)3 : (byte)1)) : (byte)1);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eyo_0 eyo_02 = eAs.a(this.pDT, object, object2, object4, object3);
        if (eyo_02 == null) {
            return -1;
        }
        long l = this.pDU.d(object, object2, object3, object4);
        etu_0 etu_02 = null;
        if (object4 instanceof etu_0) {
            etu_02 = (etu_0)object4;
        } else if (object4 instanceof ent_0) {
            etu_02 = ((ent_0)object4).fBq();
        }
        if (etu_02 == null) {
            return -1;
        }
        Collection<QQ> collection = etu_02.bai().bdh();
        for (QQ qQ : collection) {
            if (qQ.bcw() != l || !this.c(eyo_02, qQ) || !this.a(qQ, object, object2, object3, object4) || !(eyo_02 instanceof qu_0 ? qQ.a((qu_0)((Object)eyo_02), eyo_02.aZw().getX(), eyo_02.aZw().getY(), eyo_02.aZw().bdi()) : qQ.d(eyo_02.aZw()))) continue;
            return 0;
        }
        return -1;
    }

    private boolean c(eyo_0 eyo_02, QQ qQ) {
        if (this.pDV == 2) {
            qu_0 qu_02 = eAs.aP(eyo_02);
            return qu_02 == null || eAs.aP(qQ) == qu_02;
        }
        if (this.pDV == 3) {
            return eyo_02 != null && eyo_02.bcP() == qQ.bcP();
        }
        return true;
    }

    protected boolean a(QQ qQ, Object object, Object object2, Object object3, Object object4) {
        return true;
    }

    public amu_1 fod() {
        return this.pDU;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pJI;
    }

    static {
        pDP.add(new amz_1[]{amz_1.cJx, amz_1.cJy});
        pDP.add(new amz_1[]{amz_1.cJx, amz_1.cJy, amz_1.cJz});
        pDP.add(new amz_1[]{amz_1.cJx, amz_1.cJy, amz_1.cJx});
    }
}

