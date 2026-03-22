/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bDI
 */
public class bdi_0
implements aeh_2 {
    public static final String jKV = "name";
    public static final String jKW = "lootList";
    public static final String jKX = "finished";
    public static final String jKY = "selectedItem";
    public static final String jKZ = "maxColumns";
    public static final String jLa = "iconUrl";
    public static final String jLb = "quantity";
    public static final String jLc = "key";
    public static final String[] jLd = new String[]{"name", "lootList", "finished", "selectedItem"};
    private boolean jLe = true;
    private bgv_2 jLf;
    private final int jLg;
    private final ArrayList<ffT> jLh;
    private final String jLi;
    private final String jLj;
    private int ejM;

    public boolean bVp() {
        return this.jLe;
    }

    @Override
    public String[] bxk() {
        return jLd;
    }

    public bdi_0(ffV ffV2, ArrayList<ffT> arrayList) {
        this.jLh = arrayList;
        this.jLi = ffV2.getName();
        this.jLj = ffV2.byf();
        this.ejM = ffV2.bfd();
        int n = this.jLh.size();
        float f2 = GC.J(n);
        int n2 = Math.round(f2);
        int n3 = -1;
        if (n % 10 == 0 && n / 10 > 1) {
            n3 = 10;
        } else if (n % 5 == 0 && n / 5 > 1) {
            n3 = 5;
        } else if (n % 3 == 0 && n / 3 > 1) {
            n3 = 3;
        }
        if (n3 == -1 || Math.abs(n3 - n2) > 2) {
            n3 = n2;
        }
        this.jLg = n3;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(jKV)) {
            return this.jLi;
        }
        if (string.equals(jKW)) {
            return this.jLh;
        }
        if (string.equals(jKX)) {
            return this.jLe;
        }
        if (string.equals(jKY)) {
            return this.jLf;
        }
        if (string.equals(jKZ)) {
            return this.jLg;
        }
        if (string.equals(jLa)) {
            return this.jLj;
        }
        if (string.equals(jLb)) {
            return this.ejM;
        }
        if (string.equals(jLc)) {
            return aUl.zr(32);
        }
        return null;
    }

    public void fI(boolean bl) {
        this.jLe = bl;
        fse_1.gFu().a((aef_2)this, jKX);
    }

    public int Gl(int n) {
        for (ffT ffT2 : this.jLh) {
            if (ffT2.avr() != n) continue;
            return this.jLh.indexOf(ffT2);
        }
        return -1;
    }

    public int dRj() {
        return this.jLh.size();
    }

    public void eC(float f2) {
        fse_1.gFu().a((aef_2)this, jKY);
    }

    public void dRk() {
        if (this.ejM > 0) {
            --this.ejM;
        }
        fse_1.gFu().a((aef_2)this, jLb);
    }

    public int oP() {
        return this.ejM;
    }
}

