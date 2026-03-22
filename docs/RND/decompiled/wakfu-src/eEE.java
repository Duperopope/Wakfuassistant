/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class eEE
extends eAH {
    private static final ArrayList<amz_1[]> pBZ = new ArrayList();
    private static final String pCa = "ignoreObstacles";
    private static final String pCb = "inlineOnly";
    private static final String pCc = "inPercentMPCaster";
    private boolean pCd;
    private boolean pCe;
    private boolean pCf;
    private float pCg = 1.0f;
    private long pCh;

    public eEE(ArrayList<amx_1> arrayList) {
        byte by = this.r(arrayList);
        this.pCd = false;
        this.pCh = -1L;
        switch (by) {
            case 1: {
                this.pCd = ((anh_2)arrayList.get(0)).getValue().toLowerCase().contains(pCa.toLowerCase());
                this.pCe = ((anh_2)arrayList.get(0)).getValue().toLowerCase().contains(pCb.toLowerCase());
                this.pCf = ((anh_2)arrayList.get(0)).getValue().toLowerCase().contains(pCc.toLowerCase());
                break;
            }
            case 2: {
                this.pCh = ((amu_1)arrayList.get(0)).d(null, null, null, null);
                break;
            }
            case 3: {
                this.pCd = ((anh_2)arrayList.get(0)).getValue().toLowerCase().contains(pCa.toLowerCase());
                this.pCe = ((anh_2)arrayList.get(0)).getValue().toLowerCase().contains(pCb.toLowerCase());
                this.pCf = ((anh_2)arrayList.get(0)).getValue().toLowerCase().contains(pCc.toLowerCase());
                if (this.pCf) {
                    this.pCg = (float)((amu_1)arrayList.get(1)).d(null, null, null, null) / 100.0f;
                    break;
                }
                this.pCh = ((amu_1)arrayList.get(1)).d(null, null, null, null);
            }
        }
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pBZ;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        acd_1 acd_12;
        etu_0 etu_02;
        if (object2 == null) {
            return 0;
        }
        exP exP2 = eAs.k(object, object2, object4, object3);
        if (this.pCf && exP2 != null && exP2.a(exx_2.rGk)) {
            this.pCh = Math.round((float)exP2.e(exx_2.rGk).aYB() * this.pCg);
        }
        if ((etu_02 = eAs.aO(object4)) == null) {
            return -1;
        }
        if (object2 instanceof acd_1) {
            acd_12 = (acd_1)object2;
        } else if (object2 instanceof eyo_0) {
            acd_12 = ((eyo_0)object2).aZw();
        } else {
            return -2;
        }
        rh_0 rh_02 = etu_02.bag();
        if (this.pCd) {
            rh_02.bd(true);
        }
        sr_0 sr_02 = sr_0.bgd();
        int n = -1;
        try {
            boolean bl;
            boolean bl2 = exP2.aZw().getX() == acd_12.getX();
            boolean bl3 = bl = exP2.aZw().getY() == acd_12.getY();
            if (this.pCe && !bl2 && !bl) {
                int n2 = -1;
                return n2;
            }
            if (this.pCe) {
                n = this.a(rh_02, exP2.aZw(), acd_12, bl2, bl);
            } else {
                sr_02.a((int)exP2.bcN(), exP2.bcO(), exP2.bvy());
                sr_02.b(rh_02);
                sr_02.l(exP2.aZw());
                sr_02.m(acd_12);
                st_0 st_02 = new st_0();
                st_02.bqO = (int)this.pCh;
                st_02.bqN = 256;
                sr_02.a(st_02);
                n = sr_02.bgj();
            }
        }
        catch (Exception exception) {
            cKa.error((Object)"Exception levee", (Throwable)exception);
        }
        finally {
            sr_02.aZp();
            rh_02.bd(false);
        }
        if (n == -1) {
            return -1;
        }
        return 0;
    }

    private int a(rh_0 rh_02, acd_1 acd_12, acd_1 acd_13, boolean bl, boolean bl2) {
        int n;
        if (!bl && !bl2) {
            return -1;
        }
        int n2 = 0;
        int n3 = bl ? Math.max(acd_12.getY(), acd_13.getY()) : Math.max(acd_12.getX(), acd_13.getX());
        int n4 = n = bl ? Math.min(acd_12.getY(), acd_13.getY()) : Math.min(acd_12.getX(), acd_13.getX());
        while (n < n3) {
            short s;
            int n5;
            int n6 = bl ? acd_12.getX() : n;
            if (rh_02.g(n6, n5 = bl2 ? acd_12.getY() : n, s = rh_02.Z(n6, n5))) {
                return -1;
            }
            ++n2;
            ++n;
        }
        if (this.pCh > 0L && (long)n2 <= this.pCh) {
            return n2;
        }
        return -1;
    }

    @Override
    public Enum bDq() {
        return ehq_0.pLa;
    }

    static {
        pBZ.add(eAC.pwq);
        pBZ.add(eAC.pwr);
        pBZ.add(eAC.pwt);
        pBZ.add(new amz_1[]{amz_1.cJx, amz_1.cJy});
    }
}

