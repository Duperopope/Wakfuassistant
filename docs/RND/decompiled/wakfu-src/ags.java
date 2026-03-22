/*
 * Decompiled with CFR 0.152.
 */
import javax.swing.JFrame;

class ags
implements Runnable {
    final /* synthetic */ agr ctQ;

    ags(agr agr2) {
        this.ctQ = agr2;
    }

    @Override
    public void run() {
        this.ctQ.bXt = new JFrame("PSys Debug");
        this.ctQ.ctL = new agq();
        this.ctQ.bXt.setContentPane(this.ctQ.ctL.bwz());
        this.ctQ.bXt.setDefaultCloseOperation(3);
        this.ctQ.bXt.setSize(300, 600);
        this.ctQ.bXt.setVisible(true);
        abg_2.bUP().a((Runnable)new agt(this), 1000L, -1);
    }
}

