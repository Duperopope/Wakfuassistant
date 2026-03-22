/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public final class agr {
    public static final agr ctK = new agr();
    private boolean bXs;
    JFrame bXt;
    agq ctL;
    final ArrayList<ParticleSystem> ctM = new ArrayList();
    final ArrayList<ast_2> ctN = new ArrayList();
    int ctO;
    int ctP;

    private agr() {
    }

    public void aPg() {
        if (this.bXs) {
            return;
        }
        SwingUtilities.invokeLater(new ags(this));
        this.bXs = true;
    }

    public void a(ParticleSystem particleSystem) {
        if (!this.bXs) {
            return;
        }
        this.ctM.add(particleSystem);
        if (this.ctM.size() > this.ctO) {
            this.ctO = this.ctM.size();
        }
        if (this.ctL != null) {
            this.ctL.b(this.ctM, this.ctN);
            this.ctL.bwz().updateUI();
        }
    }

    public void b(ParticleSystem particleSystem) {
        if (!this.bXs) {
            return;
        }
        this.ctM.remove(particleSystem);
        if (this.ctL != null) {
            this.ctL.b(this.ctM, this.ctN);
            this.ctL.bwz().updateUI();
        }
    }

    public void c(ast_2 ast_22) {
        if (!this.bXs) {
            return;
        }
        this.ctN.add(ast_22);
        if (this.ctN.size() > this.ctP) {
            this.ctP = this.ctN.size();
        }
        if (this.ctL != null) {
            this.ctL.b(this.ctM, this.ctN);
            this.ctL.bwz().updateUI();
        }
    }

    public void d(ast_2 ast_22) {
        if (!this.bXs) {
            return;
        }
        this.ctN.remove(ast_22);
        if (this.ctL != null) {
            this.ctL.b(this.ctM, this.ctN);
            this.ctL.bwz().updateUI();
        }
    }
}

