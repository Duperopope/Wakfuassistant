/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
 * Renamed from XH
 */
public class xh_0
implements aao_2 {
    private static final xh_0 bSH = new xh_0();
    private final HashMap<afW, ArrayList<xv_0>> bSI = new HashMap();
    public static final int bSJ = 500;

    private xh_0() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void i(xv_0 xv_02) {
        boolean bl;
        HashMap<afW, ArrayList<xv_0>> hashMap = this.bSI;
        synchronized (hashMap) {
            ArrayList<xv_0> arrayList;
            ArrayList<xv_0> arrayList2 = arrayList = this.bSI.get(xv_02.bnp());
            synchronized (arrayList2) {
                bl = arrayList.isEmpty();
                arrayList.add(xv_02);
            }
        }
        if (bl) {
            xd_0.bnv().a(xv_02);
            abb_2.bUA().a(this, 500L, -1, 1L);
        }
    }

    public static xh_0 bnP() {
        return bSH;
    }

    @Override
    public long Sn() {
        return 1L;
    }

    @Override
    public void dC(long l) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean b(aam_2 aam_22) {
        HashMap<afW, ArrayList<xv_0>> hashMap = this.bSI;
        synchronized (hashMap) {
            for (Map.Entry<afW, ArrayList<xv_0>> entry : this.bSI.entrySet()) {
                ArrayList<xv_0> arrayList;
                xv_0 xv_02 = null;
                ArrayList<xv_0> arrayList2 = arrayList = entry.getValue();
                synchronized (arrayList2) {
                    if (!arrayList.isEmpty()) {
                        xv_02 = arrayList.remove(0);
                    }
                    if (!arrayList.isEmpty()) {
                        abb_2.bUA().a(this, 500L, -1, 1L);
                    } else {
                        this.bSI.remove(entry.getKey());
                    }
                }
                if (xv_02 == null) continue;
                xd_0.bnv().a(xv_02);
            }
        }
        return false;
    }
}

