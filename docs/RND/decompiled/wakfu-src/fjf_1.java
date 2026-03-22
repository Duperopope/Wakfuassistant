/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from fJf
 */
public class fjf_1 {
    private ArrayList<fje_2> uDU;
    private fje_2 uDV = null;
    private static final fje_2 uDW = new fjd_2();
    private final ArrayList<fcv_1> uDX = new ArrayList();

    public fjf_1(ArrayList<fje_2> arrayList) {
        this.ah(arrayList);
    }

    public fjf_1() {
    }

    public void z(fcv_1 fcv_12) {
        this.uDX.add(fcv_12);
    }

    public void A(fcv_1 fcv_12) {
        this.uDX.remove(fcv_12);
    }

    public void clear() {
        this.uDX.clear();
    }

    public void gCF() {
        for (int i = this.uDX.size() - 1; i >= 0; --i) {
            this.uDX.get(i).gtR();
        }
    }

    protected void gCG() {
        this.uDV = null;
        if (this.uDU == null || this.uDU.size() == 0) {
            return;
        }
        if (this.uDV == null) {
            this.uDV = this.uDU.get(0);
        }
    }

    public boolean B(fcv_1 fcv_12) {
        if (this.uDV == null || fcv_12 == null) {
            return false;
        }
        fje_2 fje_22 = null;
        for (fje_2 fje_23 : this.uDU) {
            if (!fje_23.isRenderableCompatible(fcv_12)) continue;
            fje_22 = fje_23;
            break;
        }
        if (fje_22 == null) {
            fje_22 = uDW.isRenderableCompatible(fcv_12) ? uDW : this.uDV;
        }
        if (fcv_12.getRenderer() != fje_22) {
            fcv_12.setRenderer(fje_22);
            return true;
        }
        return false;
    }

    public ArrayList<fje_2> gCH() {
        return this.uDU;
    }

    public void ah(ArrayList<fje_2> arrayList) {
        this.uDU = arrayList;
        if (this.uDU != null) {
            for (int i = this.uDU.size() - 1; i >= 0; --i) {
                this.uDU.get(i).setManager(this);
            }
        }
        this.gCG();
    }

    public void aB(fje_2 fje_22) {
        if (this.uDU == null) {
            this.uDU = new ArrayList();
        }
        this.uDU.add(fje_22);
        fje_22.setManager(this);
        this.gCG();
    }

    public ArrayList<fcv_1> getRenderables() {
        return this.uDX;
    }
}

