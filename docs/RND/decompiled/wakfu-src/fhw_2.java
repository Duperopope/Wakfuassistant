/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fHw
 */
public class fhw_2 {
    private static final Logger uyc = Logger.getLogger(fhw_2.class);
    private static final fhw_2 uyd = new fhw_2();
    private fes_2 uye;
    private final HashMap<faw_2, ArrayList<fes_2>> uyf = new HashMap();
    private boolean cHn = false;
    private fes_2 uyg = null;

    private fhw_2() {
    }

    public void q(fes_2 fes_22) {
        faw_2 faw_22 = fes_22.getRootFocusParent();
        if (faw_22 != null) {
            ArrayList<fes_2> arrayList = this.uyf.get(faw_22);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.uyf.put(faw_22, arrayList);
            }
            if (!arrayList.contains(fes_22)) {
                arrayList.add(fes_22);
            }
        }
    }

    public void r(fes_2 fes_22) {
        faw_2 faw_22;
        if (this.uye == fes_22) {
            this.gAP();
        }
        if (this.uye == fes_22) {
            this.uye = null;
        }
        if (this.uyg == fes_22) {
            this.uyg = null;
        }
        if ((faw_22 = fes_22.getRootFocusParent()) != null) {
            ArrayList<fes_2> arrayList = this.uyf.get(faw_22);
            this.a(fes_22, faw_22, arrayList);
        } else {
            for (ArrayList<fes_2> arrayList : this.uyf.values()) {
                this.a(fes_22, faw_22, arrayList);
            }
        }
    }

    private void a(fes_2 fes_22, faw_2 faw_22, Collection<fes_2> collection) {
        if (collection != null) {
            collection.remove(fes_22);
            if (collection.isEmpty()) {
                this.uyf.remove(faw_22);
            }
        }
    }

    public void eY(faw_2 faw_22) {
        this.uyf.remove(faw_22);
    }

    public static fhw_2 gAL() {
        return uyd;
    }

    public void setEnabled(boolean bl) {
        if (this.cHn == bl) {
            return;
        }
        if (!bl) {
            this.uyg = this.uye;
            this.e(null, true);
        } else {
            this.e(this.uyg, true);
            this.uyg = null;
        }
        this.cHn = bl;
    }

    public void s(@Nullable fes_2 fes_22) {
        this.e(fes_22, false);
    }

    private void e(@Nullable fes_2 fes_22, boolean bl) {
        fle_2 fle_22;
        fes_2 fes_23;
        boolean bl2 = this.cHn || bl;
        fes_2 fes_24 = fes_23 = fes_22 != null && fes_22.getFocusable() ? fes_22 : null;
        if (bl2 && fes_23 == this.uye || !bl2 && fes_23 == this.uyg) {
            return;
        }
        fes_2 fes_25 = this.uye;
        if (bl2) {
            this.uye = fes_23;
        } else {
            this.uyg = fes_23;
            this.uye = null;
        }
        if (fes_25 != null && fes_25.getFocusable()) {
            fle_22 = new fle_2(fes_25, false);
            fes_25.h(fle_22);
        }
        if (this.uye != null && this.uye.getFocusable()) {
            fle_22 = new fle_2(this.uye, true);
            this.uye.h(fle_22);
        }
    }

    @Nullable
    public fes_2 gAM() {
        return this.uye;
    }

    public void gAN() {
        if (this.uye != null) {
            fes_2 fes_22;
            for (fes_22 = this.uye; fes_22 != null && fes_22 != fbj_1.getInstance() && fes_22.getModalLevel() == -1; fes_22 = fes_22.getContainer()) {
            }
            if (fes_22 != null && fes_22.getModalLevel() < fhx_2.gAQ().gAR()) {
                this.s(null);
            }
        }
    }

    public void gAO() {
        this.oX(false);
    }

    public void gAP() {
        this.oX(true);
    }

    private void oX(boolean bl) {
        fes_2 fes_22 = null;
        if (this.uye == null) {
            for (ArrayList<fes_2> arrayList : this.uyf.values()) {
                if (arrayList.isEmpty()) continue;
                fes_22 = arrayList.get(0);
                break;
            }
        } else {
            ArrayList<fes_2> arrayList;
            faw_2 faw_22 = this.uye.getRootFocusParent();
            if (faw_22 != null && (arrayList = this.uyf.get(faw_22)) != null && !arrayList.isEmpty()) {
                int n = arrayList.indexOf(this.uye);
                int n2 = arrayList.size() - 1;
                if (bl && n == n2) {
                    fes_22 = arrayList.get(0);
                } else if (!bl && n == 0) {
                    fes_22 = arrayList.get(n2);
                } else if (n >= 0 && n <= n2) {
                    fes_22 = arrayList.get(n + (bl ? 1 : -1));
                } else {
                    uyc.error((Object)("m_focused (" + String.valueOf(this.uye) + ") n'est pas enregistr\u00e9 dans les listes de widgets Focusables"));
                }
            }
        }
        this.s(fes_22);
    }
}

