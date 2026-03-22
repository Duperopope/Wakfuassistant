/*
 * Decompiled with CFR 0.152.
 */
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * Renamed from ZZ
 */
class zz_0
implements Runnable {
    final /* synthetic */ zy_0 bXF;

    zz_0(zy_0 zy_02) {
        this.bXF = zy_02;
    }

    @Override
    public void run() {
        this.bXF.bXt = new JFrame("Debug ANM");
        this.bXF.bXt.setContentPane(new JPanel());
        this.bXF.bXt.setDefaultCloseOperation(3);
        this.bXF.bXt.setSize(640, 480);
        this.bXF.bXt.setVisible(true);
    }
}

