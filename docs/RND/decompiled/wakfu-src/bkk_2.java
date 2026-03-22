/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from bkK
 */
public class bkk_2
extends bkb_0 {
    private static final Logger irN = Logger.getLogger(bkk_2.class);
    bkn_2 irO;
    final bhJ irP;
    private int irQ;
    private boolean irR;

    public boolean dsR() {
        return this.irR;
    }

    public bkk_2(bhJ bhJ2) {
        this.irP = bhJ2;
    }

    @Override
    public short dsm() {
        return 4;
    }

    @Override
    public boolean dsn() {
        return true;
    }

    @Override
    public void bIH() {
        irN.info((Object)("[DEATH] Lancement de l'occupation pour le joueur " + String.valueOf(this.irP)));
        this.irP.i(false, true);
        assert (this.irO == null);
        this.irO = new bkn_2();
        this.irO.ab(this.irP);
        if (this.irP == this.iqd) {
            this.iqd.fZ(false);
            this.gr(false);
            bqm_0.jbp.b(new bre_1());
            this.irQ = aIz.cgP();
        }
        this.irP.dnh();
        this.irP.gf(true);
        this.irP.a(this);
        if (this.irP == this.iqd) {
            aue_0.cVJ().a(bkq_1.isa);
        }
    }

    private void gr(boolean bl) {
        fse_1.gFu().f("isAlive", bl);
    }

    @Override
    public boolean k(boolean bl, boolean bl2) {
        irN.info((Object)("[DEATH] Annulation l'occupation pour le joueur " + String.valueOf(this.irP) + " (fromServer=" + bl + ", sendMessage=" + bl2 + ")"));
        return false;
    }

    @Override
    public boolean dsd() {
        irN.info((Object)("[DEATH] Fin de l'occupation pour le joueur " + String.valueOf(this.irP)));
        if (!this.irP.dmc()) {
            if (this.irP == this.iqd && bkq_1.isa.dsW()) {
                this.dsT();
            } else {
                String string = "AnimTombe-Fin";
                if (this.irP.ddI().bvW()) {
                    string = "AnimArtefact-Nager-Debut";
                } else {
                    this.dsS();
                }
                this.irP.ddI().dT(string);
            }
        }
        if (this.irP == this.iqd) {
            this.iqd.fZ(true);
            this.gr(true);
            aue_0.cVJ().b(bkq_1.isa);
            aIz.yD(this.irQ);
        }
        this.irP.gf(false);
        return true;
    }

    private void dsS() {
        this.irP.ddI().a(new bkl_2(this));
    }

    private void dsT() {
        asj_2.bJt().a(new bkm_2(this));
    }

    void dsU() {
        bdj_2 bdj_22 = this.irP.ddI();
        bdj_22.setVisible(true);
        bdj_22.dT("AnimResurection");
        FreeParticleSystem freeParticleSystem = agY.bzw().sk(this.irP.dlD());
        freeParticleSystem.a(bdj_22);
        agZ.bzy().b(freeParticleSystem);
    }

    public void dX(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.irR = byteBuffer.get() == 1;
    }

    @Override
    public boolean dsj() {
        return false;
    }
}

