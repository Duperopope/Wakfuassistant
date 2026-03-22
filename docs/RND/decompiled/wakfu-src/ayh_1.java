/*
 * Decompiled with CFR 0.152.
 */
import javax.swing.JFrame;

/*
 * Renamed from ayh
 */
class ayh_1
implements Runnable {
    final /* synthetic */ ayg_1 dsl;

    ayh_1(ayg_1 ayg_12) {
        this.dsl = ayg_12;
    }

    @Override
    public void run() {
        this.dsl.bXt = new JFrame("GL Debug view");
        this.dsl.bXt.setSize(400, 600);
        this.dsl.bXt.setDefaultCloseOperation(3);
        this.dsl.dsk.aPg();
        this.dsl.bXt.setContentPane(this.dsl.dsk.bwz());
        this.dsl.bXt.setVisible(true);
    }
}

