/*
 * Decompiled with CFR 0.152.
 */
import javax.swing.JFrame;

class aeE
implements Runnable {
    final /* synthetic */ aeD cnA;

    aeE(aeD aeD2) {
        this.cnA = aeD2;
    }

    @Override
    public void run() {
        this.cnA.bXt = new JFrame("RenderTree Debug");
        this.cnA.cny = new aeG();
        this.cnA.bXt.setContentPane(this.cnA.cny.bwz());
        this.cnA.bXt.setDefaultCloseOperation(3);
        this.cnA.bXt.setSize(300, 600);
        this.cnA.bXt.setVisible(true);
        abg_2.bUP().a((Runnable)new aeF(this), 2000L, -1);
    }
}

