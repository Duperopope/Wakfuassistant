/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Point;
import java.util.List;
import java.util.Map;

/*
 * Renamed from box
 */
class box_1
implements Runnable {
    private int cmT = 0;
    final /* synthetic */ Map iPP;
    final /* synthetic */ faw_2 iPQ;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    box_1(Map map, faw_2 faw_22) {
        this.iPP = map;
        this.iPQ = faw_22;
    }

    @Override
    public void run() {
        boolean bl = this.ER(this.cmT);
        boolean bl2 = this.ER(this.cmT + 1);
        if (!bl && !bl2) {
            abg_2.bUP().h(this);
        }
        this.cmT += 3;
    }

    private boolean ER(int n) {
        List list = (List)this.iPP.get(n);
        if (list == null) {
            return false;
        }
        for (Point point : list) {
            fka_1 fka_12 = new fka_1();
            fka_12.aVI();
            fka_12.setFile("6001084.xps");
            fka_12.setFixedPosition(new Point(40 * point.x + -3, 40 * point.y));
            this.iPQ.getAppearance().d(fka_12);
        }
        return true;
    }
}

