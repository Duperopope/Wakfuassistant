/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bck
 */
public class bck_1
implements bNC {
    public static final bck_1 hDV = new bck_1();
    private final ArrayList<bci_1> hDW = new ArrayList();

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(bci_1 bci_12) {
        ArrayList<bci_1> arrayList = this.hDW;
        synchronized (arrayList) {
            this.hDW.add(bci_12);
        }
    }

    public void start() {
        bNB.kDS.a(this);
    }

    public void bhk() {
        bNB.kDS.b(this);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void daZ() {
        ArrayList<bci_1> arrayList = this.hDW;
        synchronized (arrayList) {
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            if (bgt_02 == null) {
                return;
            }
            bcd_2 bcd_22 = bgt_02.dpy();
            ux_0 ux_02 = ue_0.bjV().bjc();
            for (int i = this.hDW.size() - 1; i >= 0; --i) {
                bci_1 bci_12 = this.hDW.get(i);
                bci_12.dcp();
                bbu_2 bbu_22 = bcd_22.AZ(bci_12.d());
                if (bbu_22.aYp() != null || PK.e(bbu_22, ux_02) || PK.f(bbu_22, ux_02)) continue;
                this.hDW.remove(i);
            }
        }
        bci_2.hDG.daQ();
    }

    public String toString() {
        return "QuestTimeManager{m_achievements=" + String.valueOf(this.hDW) + "}";
    }
}

