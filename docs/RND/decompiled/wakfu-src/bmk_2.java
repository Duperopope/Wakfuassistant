/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/*
 * Renamed from bmK
 */
public class bmk_2
extends bmy_1 {
    public static final int iDX = 8;
    public static final String iDY = "recipes";
    public static final String iDZ = "isExpanded";
    public static final String iEa = "isMouseOver";
    public static final String iEb = "hasPreviousPage";
    public static final String iEc = "hasNextPage";
    public static final String iEd = "currentPageText";
    private ArrayList<bmv_1> iDp;
    private boolean iEe;
    private boolean iEf;
    private int iEg;
    private int iEh;

    public bmk_2(int n, int n2) {
        super(n, ekg_0.qDB);
    }

    public void Ej(int n) {
        this.b(eKQ.qEb.QV(this.iBx).Ra(n));
    }

    public void Ek(int n) {
        this.b(eKQ.qEb.QV(this.iBx).Rb(n));
    }

    private void b(Iterator<eKR> iterator) {
        this.iDp = new ArrayList();
        if (iterator == null) {
            return;
        }
        eki_0 eki_02 = baj_2.hzf.cZr();
        while (iterator.hasNext()) {
            eKR eKR2 = iterator.next();
            if (eKR2.b(eki_02)) continue;
            bmv_1 bmv_12 = new bmv_1(eKR2, this);
            this.iDp.add(bmv_12);
        }
        this.iDp.sort(Comparator.comparingInt(bmv_1::dxy));
        int n = this.iDp.size();
        this.iEh = (int)Math.floor(n / 8);
    }

    public boolean dxk() {
        return this.iDp != null && this.iDp.size() != 0;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(iDY)) {
            int n = this.iEg * 8;
            n = Math.max(n, 0);
            int n2 = n + 8;
            if (n > (n2 = Math.min(n2, this.iDp.size()))) {
                return Collections.emptyList();
            }
            return this.iDp.subList(n, n2);
        }
        if (string.equals(iDZ)) {
            return this.iEe;
        }
        if (string.equals(iEa)) {
            return this.iEf;
        }
        if (string.equals(iEb)) {
            return this.iEg > 0;
        }
        if (string.equals(iEc)) {
            return this.iEg < this.iEh;
        }
        if (string.equals(iEd)) {
            return this.iEg + 1 + "/" + (this.iEh + 1);
        }
        return super.eu(string);
    }

    @Override
    public short cmL() {
        return 100;
    }

    @Override
    public boolean dwq() {
        return false;
    }

    public boolean dxl() {
        return this.iEe;
    }

    public boolean dxm() {
        return this.iEf;
    }

    public void gB(boolean bl) {
        this.iEe = bl;
    }

    public ArrayList<bmv_1> dwP() {
        return this.iDp;
    }

    public void gC(boolean bl) {
        this.iEf = bl;
        fse_1.gFu().a((aef_2)this, iEa);
    }

    public void dxn() {
        this.iEg = 0;
        fse_1.gFu().a((aef_2)this, iEb);
        fse_1.gFu().a((aef_2)this, iEc);
        fse_1.gFu().a((aef_2)this, iDY);
        fse_1.gFu().a((aef_2)this, iEd);
    }

    public void dxo() {
        if (this.iEg <= 0) {
            return;
        }
        --this.iEg;
        fse_1.gFu().a((aef_2)this, iEb);
        fse_1.gFu().a((aef_2)this, iEc);
        fse_1.gFu().a((aef_2)this, iDY);
        fse_1.gFu().a((aef_2)this, iEd);
    }

    public void dxp() {
        if (this.iEg >= this.iEh) {
            return;
        }
        ++this.iEg;
        fse_1.gFu().a((aef_2)this, iEb);
        fse_1.gFu().a((aef_2)this, iEc);
        fse_1.gFu().a((aef_2)this, iDY);
        fse_1.gFu().a((aef_2)this, iEd);
    }

    public void dxq() {
        this.iEg = this.iEh;
        fse_1.gFu().a((aef_2)this, iEb);
        fse_1.gFu().a((aef_2)this, iEc);
        fse_1.gFu().a((aef_2)this, iDY);
        fse_1.gFu().a((aef_2)this, iEd);
    }
}

