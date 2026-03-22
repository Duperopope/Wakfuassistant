/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

class bKY
implements adi_0<bKV> {
    final /* synthetic */ bKV krn;

    bKY(bKV bKV2) {
        this.krn = bKV2;
    }

    @Override
    public void a(bKV bKV2, boolean bl, boolean bl2) {
        if (this.krn.kre == null || !bKV2.isVisible()) {
            return;
        }
        if (bl2) {
            aIp.c(bKV2);
            return;
        }
        if (bl) {
            Object object;
            fes_2 fes_22 = fbj_1.getInstance().getMouseOver();
            if (fes_22 != null && fes_22 != fbj_1.getInstance()) {
                return;
            }
            aIp.b(bKV2);
            String string = this.krn.ecm();
            if (string.length() == 0) {
                return;
            }
            ArrayList<String> arrayList = new ArrayList<String>();
            bJr bJr2 = bTj.eno().doD();
            short s = bKV2.eco().ghz();
            if (bJr2 != null && ((foG)(object = bJr2.eaH())).XW(s)) {
                arrayList.add(auc_0.cVq().a("ecosystemProtectedIconPath", "defaultIconPath", new Object[0]));
            }
            object = new dci_0(bKV2, 0);
            ejj_0 ejj_02 = ejj_0.dG(s);
            if (ejj_02 != null) {
                String string2 = null;
                try {
                    string2 = String.format(auc_0.cVq().bS("popupIconPath"), "resource" + ejj_02.aJr());
                }
                catch (fu_0 fu_02) {
                    bKV.aGh().error((Object)fu_02.getMessage(), (Throwable)fu_02);
                }
                ((dci_0)object).rd(string2);
            }
            ((dci_0)object).a(string, this.krn.l(bKV2), arrayList);
            cxq_1.eWO().a((dci_0)object);
        } else {
            cxq_1.eWO().a(bKV2);
            aIp.d(bKV2);
        }
    }
}

