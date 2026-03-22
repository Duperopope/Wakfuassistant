/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from buC
 */
public class buc_0
implements aeh_2 {
    private static final buc_0 jpO = new buc_0();
    public static final String jpP = "giftPackages";
    public static final String jpQ = "numPackages";
    public static final String jpR = "selectedPackage";
    public static final String jpS = "giftEnabled";
    public static final String[] jpT = new String[]{"giftPackages", "numPackages", "selectedPackage", "giftEnabled"};
    private final ArrayList<bux_0> jpU = new ArrayList();
    private final ArrayList<bud_0> jpV = new ArrayList();
    private bud_0 jpW = null;

    public ArrayList<bud_0> dJf() {
        return this.jpV;
    }

    private buc_0() {
    }

    public static buc_0 dJg() {
        return jpO;
    }

    public void a(bud_0 bud_02, bub_0 bub_02, boolean bl) {
        this.jpU.add(new bux_0(bud_02, bub_02, bl));
    }

    public void gW(boolean bl) {
        if (this.jpU.size() == 0) {
            return;
        }
        bux_0 bux_02 = this.jpU.remove(0);
        if (!bl) {
            return;
        }
        bud_0 bud_02 = bux_02.dJb();
        int n = this.jpV.indexOf(bud_02);
        if (n == -1) {
            return;
        }
        fse_1.gFu().a((aef_2)bud_02, "gifts");
        if (bud_02.a(bux_02.dJc(), bux_02.dJd())) {
            this.jpV.remove(bud_02);
            if (this.jpW == bud_02) {
                this.jpW = this.jpV.size() > 0 ? this.jpV.get(0) : null;
            }
        }
        fse_1.gFu().a((aef_2)this, jpP, jpQ, jpR);
    }

    @Override
    public String[] bxk() {
        return jpT;
    }

    @Override
    public Object eu(String string) {
        return switch (string) {
            case jpP -> this.jpV;
            case jpR -> this.jpW;
            case jpQ -> this.jpV.size();
            case jpS -> ewo_0.oBF.k(ewr_0.oGh);
            default -> null;
        };
    }

    public void G(ArrayList<bud_0> arrayList) {
        this.clear();
        this.jpV.addAll(arrayList);
        this.dJh();
        if (this.jpV.size() > 0) {
            this.a(this.jpV.get(0));
        } else {
            this.a(null);
        }
    }

    private void dJh() {
        fse_1.gFu().a((aef_2)this, jpP);
    }

    public bud_0 dJi() {
        return this.jpW;
    }

    public void a(bud_0 bud_02) {
        this.jpW = bud_02;
        fse_1.gFu().a((aef_2)this, jpR);
    }

    public boolean aJG() {
        return this.jpV.isEmpty();
    }

    public void clear() {
        this.jpV.clear();
        this.jpU.clear();
        this.jpW = null;
    }
}

