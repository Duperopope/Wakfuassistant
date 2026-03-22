/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from cYB
 */
class cyb_2
implements ftl_1 {
    final /* synthetic */ fey_2 nYM;
    final /* synthetic */ cya_1 nYN;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cyb_2(cya_1 cya_12, fey_2 fey_22) {
        this.nYN = cya_12;
        this.nYM = fey_22;
    }

    @Override
    public void epr() {
        ArrayList<Rectangle> arrayList = new ArrayList<Rectangle>();
        for (int i = 0; i < this.nYN.nYL.size() - 1; ++i) {
            fhv_1 fhv_12 = fyw_0.gqw().th(this.nYN.nYL.get(i));
            if (!(fhv_12 instanceof fey_2)) continue;
            fey_2 fey_22 = (fey_2)fhv_12;
            arrayList.add(new Rectangle(fey_22.getX(), fey_22.getY(), fey_22.getWidth(), fey_22.getHeight()));
        }
        this.aD(arrayList);
        this.nYM.b(this);
    }

    private void aD(List<Rectangle> list) {
        int n = this.nYM.getWidth();
        int n2 = fbj_1.getInstance().getWidth() - n;
        int n3 = this.nYM.getHeight();
        int n4 = fbj_1.getInstance().getHeight() - n3;
        for (int i = n4 - 1; i >= 0; --i) {
            for (int j = 0; j < n2; ++j) {
                Rectangle rectangle = new Rectangle(j, i, n, n3);
                if (!cyb_2.a(list, rectangle)) continue;
                this.nYM.setPosition(j, i);
                return;
            }
        }
    }

    private static boolean a(List<Rectangle> list, Rectangle rectangle) {
        for (Rectangle rectangle2 : list) {
            if (!rectangle2.intersects(rectangle)) continue;
            return false;
        }
        return true;
    }
}

