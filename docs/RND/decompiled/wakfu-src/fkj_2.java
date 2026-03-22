/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;

/*
 * Renamed from fKj
 */
public class fkj_2 {
    private static final fkj_2 uFG = new fkj_2();
    private static final short uFH = 20;
    private static final int uFI = Integer.MIN_VALUE;
    private static int dcH = -2147483647;
    private final aah_1<fkm_2> uFJ = new aah_1();
    private final ArrayList<fey_2> uFK = new ArrayList();
    private final Rectangle uFL = new Rectangle();
    private static final ArrayList<fey_2> uFM = new ArrayList();
    private static final String uFN = "stickData";

    private fkj_2() {
    }

    public static fkj_2 gCW() {
        return uFG;
    }

    public aah_1<fkm_2> gCX() {
        return this.uFJ;
    }

    public void a(fey_2 fey_22, boolean bl) {
        this.a(fey_22, bl, true);
    }

    public void a(fey_2 fey_22, boolean bl, boolean bl2) {
        fey_22.setStickData(new fki_2(bl));
        this.uFK.add(fey_22);
        fey_22.getStickData().abT(Integer.MIN_VALUE);
        if (bl2) {
            fey_22.a(new fkk_2(this, fey_22));
        }
    }

    public void bK(fey_2 fey_22) {
        this.bL(fey_22);
        this.uFK.remove(fey_22);
    }

    public void a(fey_2 fey_22, int n) {
        if (fey_22.getStickData().gCU() == n) {
            return;
        }
        this.bL(fey_22);
        fey_22.getStickData().abT(n);
        fkm_2 fkm_22 = this.uFJ.vK(n);
        if (fkm_22 == null) {
            fkm_22 = new fkm_2();
            this.uFJ.b(n, fkm_22);
        }
        fkm_22.bP(fey_22);
    }

    public void bL(fey_2 fey_22) {
        int n = fey_22.getStickData().gCU();
        fkm_2 fkm_22 = this.uFJ.vK(n);
        if (fkm_22 != null) {
            fkm_22.bQ(fey_22);
        }
        fey_22.getStickData().abT(Integer.MIN_VALUE);
    }

    private static int gCY() {
        return ++dcH;
    }

    public fkl_2 abU(int n) {
        fkm_2 fkm_22 = this.uFJ.vK(n);
        if (fkm_22 == null || fkm_22.aJG()) {
            return fkl_2.uFQ;
        }
        this.a(n, this.uFL);
        return fkl_2.a(this.uFL.x, this.uFL.y, this.uFL.width, this.uFL.height, fkm_22.gDa().getContainer());
    }

    public void a(int n, Rectangle rectangle) {
        rectangle.setBounds(0, 0, 0, 0);
        fkm_2 fkm_22 = this.uFJ.vK(n);
        if (fkm_22 == null || fkm_22.aJG()) {
            return;
        }
        double d2 = 2.147483647E9;
        double d3 = 2.147483647E9;
        double d4 = -2.147483648E9;
        double d5 = -2.147483648E9;
        ArrayList<fey_2> arrayList = fkm_22.gDb();
        int n2 = arrayList.size();
        for (int i = 1; i < n2; ++i) {
            fey_2 fey_22 = arrayList.get(i);
            d2 = Math.min(d2, (double)fey_22.getX());
            d3 = Math.min(d3, (double)fey_22.getY());
            d4 = Math.max(d4, (double)(fey_22.getX() + fey_22.getWidth()));
            d5 = Math.max(d5, (double)(fey_22.getY() + fey_22.getHeight()));
        }
        rectangle.setBounds((int)d2, (int)d3, (int)(d4 - d2), (int)(d5 - d3));
    }

    public void a(fey_2 fey_22, int n, int n2, int n3, int n4, Point point, boolean bl) {
        fkl_2 fkl_22;
        fey_2 fey_23;
        int n5;
        fki_2 fki_22 = fey_22.getStickData();
        int n6 = fki_22 != null ? fki_22.gCU() : Integer.MIN_VALUE;
        fkm_2 fkm_22 = this.uFJ.vK(n6);
        if (fkm_22 != null && !fki_22.gCT() && !bl) {
            ArrayList<fey_2> arrayList = fkm_22.gDb();
            for (n5 = arrayList.size() - 1; n5 >= 0; --n5) {
                fey_23 = arrayList.get(n5);
                if (fey_23 == fey_22 || (fkl_22 = fkl_2.a(n3, n4, fey_22, fey_23)) == fkl_2.uFQ) continue;
                n3 = fkl_22.a(n3, fey_23, fey_22);
                n4 = fkl_22.b(n4, fey_23, fey_22);
            }
            if (n3 == n && n4 == n2) {
                point.setLocation(n3, n4);
                return;
            }
            this.a(fey_22, n3, n4);
            this.a(fkm_22);
        }
        n5 = this.uFK.size();
        for (int i = 0; i < n5; ++i) {
            fey_23 = this.uFK.get(i);
            if (fey_23 == fey_22 || fey_23.getStickData().gCU() == fey_22.getStickData().gCU() && fey_23.getStickData().gCU() != Integer.MIN_VALUE || (fkl_22 = fkl_2.a(n3, n4, fey_22, fey_23)) == fkl_2.uFQ) continue;
            n3 = fkl_22.a(n3, fey_23, fey_22);
            n4 = fkl_22.b(n4, fey_23, fey_22);
        }
        fkl_2 fkl_23 = fkl_2.a(n3, n4, fey_22, fey_22.getContainer());
        n3 = fkl_23.a(n3, fey_22);
        n4 = fkl_23.b(n4, fey_22);
        if ((bl || fey_22.getStickData().gCT()) && fey_22.getStickData().gCU() != Integer.MIN_VALUE) {
            fkm_2 fkm_23 = this.uFJ.vK(fey_22.getStickData().gCU());
            int n7 = n3 - n;
            int n8 = n4 - n2;
            ArrayList<fey_2> arrayList = fkm_23.gDb();
            int n9 = arrayList.size();
            for (int i = 0; i < n9; ++i) {
                fey_2 fey_24 = arrayList.get(i);
                if (fey_24 == fey_22) continue;
                fey_24.setPosition(fey_24.getX() + n7, fey_24.getY() + n8);
            }
        }
        point.x = n3;
        point.y = n4;
    }

    private void a(fkm_2 fkm_22) {
        int n;
        ArrayList<fey_2> arrayList = fkm_22.gDb();
        for (n = arrayList.size() - 1; n >= 0; --n) {
            uFM.add(arrayList.get(n));
        }
        for (n = uFM.size() - 1; n >= 0; --n) {
            fey_2 fey_22 = uFM.get(n);
            this.a(fey_22, fey_22.getX(), fey_22.getY());
        }
        uFM.clear();
    }

    private void a(fey_2 fey_22, int n, int n2) {
        fki_2 fki_22 = fey_22.getStickData();
        if (fki_22.gCU() == Integer.MIN_VALUE) {
            return;
        }
        ArrayList<fey_2> arrayList = this.uFJ.vK(fki_22.gCU()).gDb();
        boolean bl = false;
        for (int i = arrayList.size() - 1; i >= 0; --i) {
            fkl_2 fkl_22;
            fey_2 fey_23 = arrayList.get(i);
            if (fey_23 == fey_22 || (fkl_22 = fkl_2.a(n, n2, fey_22, fey_23)) == fkl_2.uFQ) continue;
            bl = true;
            break;
        }
        if (!bl) {
            arrayList.remove(fey_22);
            fki_22.abT(Integer.MIN_VALUE);
        }
    }

    public void b(fey_2 fey_22, int n, int n2) {
        int n3;
        Object object;
        int n4;
        if (fey_22.getStickData() == null) {
            return;
        }
        fkm_2 fkm_22 = this.bM(fey_22);
        if (fkm_22 != null) {
            this.a(fkm_22);
        }
        int n5 = this.uFK.size();
        for (n4 = 0; n4 < n5; ++n4) {
            fey_2 fey_23 = this.uFK.get(n4);
            if (fey_23 == fey_22 || fey_23.getStickData().gCU() == fey_22.getStickData().gCU() && fey_23.getStickData().gCU() != Integer.MIN_VALUE || (object = fkl_2.a(n, n2, fey_22, fey_23)) == fkl_2.uFQ) continue;
            int n6 = fey_22.getStickData().gCU();
            int n7 = fey_23.getStickData().gCU();
            int n8 = n3 = n6 != Integer.MIN_VALUE ? n6 : n7;
            if (n3 == Integer.MIN_VALUE) {
                n3 = fkj_2.gCY();
            }
            if (n6 != n3) {
                this.a(fey_22, n3);
            }
            if (n7 == n3) continue;
            if (n7 == Integer.MIN_VALUE) {
                this.a(fey_23, n3);
                continue;
            }
            ArrayList<fey_2> arrayList = this.uFJ.vK(n7).gDb();
            for (int i = arrayList.size() - 1; i >= 0; --i) {
                this.a(arrayList.get(i), n3);
            }
        }
        n5 = this.uFJ.bTR();
        for (n4 = 0; n4 < n5; ++n4) {
            int n9 = this.uFJ.wa(n4);
            object = this.uFJ.vU(n4);
            ArrayList<fey_2> arrayList = ((fkm_2)object).gDb();
            fkl_2 fkl_22 = this.abU(n9);
            int n10 = arrayList.size();
            for (n3 = 0; n3 < n10; ++n3) {
                fey_2 fey_24 = arrayList.get(n3);
                fey_24.getStickData().a(fkl_22);
            }
            ((fkm_2)object).gvp();
        }
        n5 = this.uFK.size();
        for (n4 = 0; n4 < n5; ++n4) {
            fey_2 fey_25 = this.uFK.get(n4);
            if (fey_25.getStickData().gCU() != Integer.MIN_VALUE) continue;
            fey_25.getStickData().a(fkl_2.a(fey_25.getX(), fey_25.getY(), fey_25.getWidth(), fey_25.getHeight(), fey_25.getContainer()));
        }
    }

    private fkm_2 bM(fey_2 fey_22) {
        fki_2 fki_22 = fey_22.getStickData();
        int n = fki_22 != null ? fki_22.gCU() : Integer.MIN_VALUE;
        return this.uFJ.vK(n);
    }

    public void bN(fey_2 fey_22) {
        this.b(fey_22, fey_22.getX(), fey_22.getY());
    }

    public void a(fhv_2 fhv_22, int n, int n2) {
        int n3;
        int n4;
        Object object;
        int n5;
        float f2 = fhv_22.getScale();
        float f3 = fhv_22.bRq() / f2;
        float f4 = fhv_22.bRr() / f2;
        int n6 = this.uFJ.bTR();
        for (n5 = 0; n5 < n6; ++n5) {
            object = this.uFJ.vU(n5);
            ArrayList<fey_2> arrayList = ((fkm_2)object).gDb();
            if (arrayList.size() == 0) continue;
            n4 = (int)((f3 - (float)((fkm_2)object).getWidth()) * ((fkm_2)object).gDc()) - ((fkm_2)object).getX();
            n3 = (int)((f4 - (float)((fkm_2)object).getHeight()) * ((fkm_2)object).gDd()) - ((fkm_2)object).getY();
            fkl_2 fkl_22 = arrayList.get(0).getStickData().gCV();
            switch (fkl_22.ordinal()) {
                case 2: 
                case 5: 
                case 7: {
                    n4 = n;
                }
            }
            switch (fkl_22.ordinal()) {
                case 4: 
                case 5: 
                case 6: {
                    n3 = n2;
                }
            }
            int n7 = arrayList.size();
            for (int i = 0; i < n7; ++i) {
                fey_2 fey_22 = arrayList.get(i);
                fey_22.setPosition(fey_22.getX() + n4, fey_22.getY() + n3, 0, false, false);
            }
            ((fkm_2)object).setPosition(((fkm_2)object).bap + n4, ((fkm_2)object).baq + n3);
        }
        n6 = this.uFK.size();
        for (n5 = 0; n5 < n6; ++n5) {
            object = this.uFK.get(n5);
            if (((fey_2)object).getStickData().gCU() != Integer.MIN_VALUE) continue;
            int n8 = ((fes_2)object).getX();
            n4 = ((fes_2)object).getY();
            n3 = (int)((f3 - (float)((fes_2)object).getWidth()) * ((fes_2)object).getXPercInParent()) - n8;
            int n9 = (int)((f4 - (float)((fes_2)object).getHeight()) * ((fes_2)object).getYPercInParent()) - n4;
            fkl_2 fkl_23 = ((fey_2)object).getStickData().gCV();
            if (fkl_23 == null) continue;
            switch (fkl_23.ordinal()) {
                case 2: 
                case 5: 
                case 7: {
                    n3 = n;
                }
            }
            switch (fkl_23.ordinal()) {
                case 4: 
                case 5: 
                case 6: {
                    n9 = n2;
                }
            }
            ((fes_2)object).setPosition(n8 + n3, n4 + n9, 0, false, false);
        }
    }

    public boolean vS(String string) {
        aeb_1 aeb_12 = fyw_0.gqw().bCh();
        return aeb_12 != null && aeb_12.hC(uFN + string);
    }

    public boolean vT(String string) {
        aeb_1 aeb_12 = fyw_0.gqw().bCh();
        return aeb_12 != null && aeb_12.aK(uFN + string);
    }

    public void bO(fey_2 fey_22) {
        String string = fey_22.getElementMap().getId();
        aeb_1 aeb_12 = fyw_0.gqw().bCh();
        if (aeb_12 != null) {
            aeb_12.d(uFN + fey_22.getHorizontalDialog(), string.startsWith(fey_22.getVerticalDialog()));
        }
    }
}

