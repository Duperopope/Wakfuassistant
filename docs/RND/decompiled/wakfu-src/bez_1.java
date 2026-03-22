/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TShortIterator
 */
import gnu.trove.iterator.TShortIterator;
import java.util.ArrayList;
import java.util.Iterator;

/*
 * Renamed from bEz
 */
public class bez_1
extends ffc_0
implements aeh_2 {
    public static final String jOJ = "browsingBagInventory";
    public static final String jOK = "bagInventory";
    public static final String jOL = "bagType";
    public static final String jOM = "locked";
    public static final String jON = "iconUrl";
    public static final String jOO = "fleaTitle";
    public static final String jOP = "fleaMarketRegistered";
    public static final String jOQ = "currentSize";
    public static final String[] jOR = new String[]{"browsingBagInventory", "bagInventory", "bagType", "locked", "iconUrl", "fleaTitle", "fleaMarketRegistered", "currentSize"};
    private String jOS = "";
    private boolean jOT;
    private int cRf;
    private String crF;

    public bez_1(long l, fgz_0 fgz_02, short s, byte by) {
        super(l, bec_0.dSv(), fgz_02, s, by);
    }

    @Override
    public String[] bxk() {
        return jOR;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(jOJ)) {
            ffh_0[] ffh_0Array = new ffh_0[this.bfa()];
            int n = 0;
            Iterator iterator = this.iterator();
            while (iterator.hasNext()) {
                ffh_0 ffh_02;
                ffh_0Array[n] = ffh_02 = (ffh_0)iterator.next();
                ++n;
            }
            return ffh_0Array;
        }
        if (string.equals(jOK)) {
            ArrayList<ffh_0> arrayList = new ArrayList<ffh_0>();
            Iterator iterator = this.bk(false);
            while (iterator.hasNext()) {
                arrayList.add((ffh_0)iterator.next());
            }
            return arrayList;
        }
        if (string.equals(jOL)) {
            Object object = "";
            fgz_0 fgz_02 = this.fVu();
            if (fgz_02 != null) {
                TShortIterator tShortIterator = fgz_02.fXe();
                while (tShortIterator.hasNext()) {
                    short s = tShortIterator.next();
                    if (aum_0.cWf().e(14, s)) {
                        object = (String)object + aum_0.cWf().a(14, (long)s, new Object[0]);
                    }
                    if (!tShortIterator.hasNext()) continue;
                    object = (String)object + ", ";
                }
                if (((String)object).length() > 0) {
                    object = aum_0.cWf().c("market.authorizedItemTypes", object);
                }
            }
            return ((String)object).length() == 0 ? null : object;
        }
        if (string.equals(jOM)) {
            return this.bfb();
        }
        if (string.equals(jON)) {
            return this.crF;
        }
        if (string.equals(jOO)) {
            return this.jOS;
        }
        if (string.equals(jOP)) {
            return this.jOT;
        }
        if (string.equals(jOQ)) {
            return this.cRf;
        }
        return null;
    }

    public void dSo() {
        fse_1.gFu().a((aef_2)this, jOJ, jOK, jOL, jOM, jON, jOO, jOP);
    }

    public void mG(String string) {
        this.jOS = string;
    }

    public void hC(boolean bl) {
        this.jOT = bl;
        fse_1.gFu().a((aef_2)this, jOP);
    }

    public void ua(int n) {
        this.cRf = n;
    }

    public int bDw() {
        return this.cRf;
    }

    public void CV(int n) {
        this.crF = auc_0.cVq().zx(n);
    }
}

