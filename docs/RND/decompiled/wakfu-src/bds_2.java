/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import org.apache.log4j.Logger;

/*
 * Renamed from bds
 */
public class bds_2
implements WT {
    private static final Logger hLj = Logger.getLogger(bds_2.class);
    private FreeParticleSystem hLk;
    private FreeParticleSystem hLl;
    private FreeParticleSystem hLm;
    private FreeParticleSystem hLn;
    private FreeParticleSystem hLo;
    private FreeParticleSystem hLp;
    private final bdj_2 hLq;

    public bds_2(bdj_2 bdj_22) {
        assert (bdj_22 != null);
        this.hLq = bdj_22;
        this.hLq.a(this);
    }

    @Override
    public void b(boolean bl, WU wU) {
        if (this.hLq == null) {
            return;
        }
        if (bl) {
            this.hLq.dcU();
        } else {
            this.hLq.dcV();
        }
    }

    public void dcW() {
        this.ddf();
        this.ddk();
        this.ddj();
        this.ddh();
        this.ddg();
        this.ddl();
    }

    public void ddC() {
        if (this.hLk != null) {
            this.hLk.setVisible(true);
        }
    }

    public void ddD() {
        if (this.hLk != null) {
            this.hLk.setVisible(false);
        }
    }

    public void ddf() {
        if (this.hLk != null) {
            agZ.bzy().so(this.hLk.bLJ());
            this.hLk = null;
        }
    }

    public void ddg() {
        if (this.hLl != null) {
            agZ.bzy().so(this.hLl.bLJ());
            this.hLl = null;
        }
    }

    public void ddE() {
        if (this.hLm != null) {
            this.hLm.setVisible(true);
        }
    }

    public void ddF() {
        if (this.hLm != null) {
            this.hLm.setVisible(false);
        }
    }

    public void bvg() {
        if (this.hLn != null) {
            this.hLn.setVisible(true);
        }
    }

    public void bvf() {
        if (this.hLn != null) {
            this.hLn.setVisible(false);
        }
    }

    public void ddG() {
        if (this.hLl != null) {
            this.hLl.setVisible(false);
        }
    }

    public void bd(byte by) {
        this.ddk();
        this.a(by, aid_0.dVm);
    }

    public void be(byte by) {
        this.ddk();
        this.a(by, aid_0.dVl);
    }

    private void a(byte by, int[][] nArray) {
        bgy bgy2 = this.hLq.dcP();
        if (bgy2 == null || this.hLm != null) {
            hLj.error((Object)String.format("Cercle d'\u00e9quipe d\u00e9j\u00e0 pr\u00e9sent sur #%d %s - %s", this.hLq.Sn(), bgy2, adu_1.xg(6)));
            return;
        }
        int n = bgy2.bqo();
        byte by2 = bgy2.bcO();
        if (by2 < 0 || by2 >= nArray.length) {
            by2 = 0;
        }
        if (by < 0 || by >= nArray[by2].length) {
            hLj.error((Object)String.format("Id de team invalide pour afficher le cercle d'\u00e9quipe sur #%d %s %s", this.hLq.Sn(), bgy2, adu_1.xg(6)));
            return;
        }
        assert (this.hLm == null);
        this.ddk();
        this.hLm = agY.bzw().sk(nArray[by2][by]);
        if (this.hLm != null) {
            this.hLm.a(this.hLq);
            this.hLm.pu(n);
            this.hLm.setVisible(this.hLq.isVisible());
            agZ.bzy().b(this.hLm);
        } else {
            hLj.error((Object)("Impossible d'afficher le cercle d'\u00e9quipe sur l'acteur id=" + this.hLq.Sn() + " : APS invalide (" + nArray[by2][by] + ")"));
        }
    }

    public void ddk() {
        if (this.hLm == null) {
            return;
        }
        agZ.bzy().so(this.hLm.bLJ());
        this.hLm = null;
    }

    public void i(abi_1 abi_12) {
        bgy bgy2 = this.hLq.dcP();
        int n = bgy2.bqo();
        byte by = bgy2.bcP();
        if (by < 0 || by >= aid_0.dVi.length) {
            return;
        }
        int[] nArray = aid_0.dVi[by];
        int n2 = abi_12.dzy;
        int n3 = switch (n2) {
            case 1 -> nArray[0];
            case 3 -> nArray[1];
            case 5 -> nArray[2];
            case 7 -> nArray[3];
            default -> nArray[0];
        };
        byte by2 = bgy2.bcO();
        acd_1 acd_12 = null;
        if (by2 == 1) {
            acd_12 = bgy2.aZw();
            acd_12.e(abi_12);
        }
        this.ddl();
        this.hLn = agY.bzw().sk(n3);
        if (this.hLn != null) {
            if (acd_12 != null) {
                this.hLn.e(acd_12.getX(), acd_12.getY(), acd_12.bdi());
            } else {
                this.hLn.a(this.hLq);
            }
            this.hLn.pu(n);
            this.hLn.setVisible(this.hLq.isVisible());
            agZ.bzy().b(this.hLn);
        }
    }

    public void ddl() {
        if (this.hLn == null) {
            return;
        }
        agZ.bzy().so(this.hLn.bLJ());
        this.hLn = null;
    }

    public void ddc() {
        bgy bgy2 = this.hLq.dcP();
        if (bgy2 == null) {
            return;
        }
        if (!bgy2.dlB()) {
            return;
        }
        int n = bgy2.bqo();
        byte by = bgy2.bcP();
        if (by < 0 || by >= aid_0.dVh.length) {
            return;
        }
        this.hLk = agY.bzw().sk(aid_0.dVh[by]);
        if (this.hLk != null) {
            this.hLk.a(this.hLq);
            this.hLk.pu(n);
            agZ.bzy().b(this.hLk);
        }
    }

    public void ddd() {
        bgy bgy2 = this.hLq.dcP();
        if (bgy2 == null) {
            return;
        }
        if (!bgy2.dlB()) {
            return;
        }
        int n = bgy2.bqo();
        byte by = bgy2.bcP();
        if (by < 0 || by >= aid_0.dVj.length) {
            return;
        }
        this.hLl = agY.bzw().sk(aid_0.dVj[by]);
        if (this.hLl != null) {
            this.hLl.a(this.hLq);
            this.hLl.pu(n);
            agZ.bzy().b(this.hLl);
        }
    }

    public void bf(byte by) {
        bgy bgy2 = this.hLq.dcP();
        if (bgy2 == null) {
            return;
        }
        int n = bgy2.bqo();
        if (this.hLo != null) {
            agZ.bzy().so(this.hLo.bLJ());
            this.hLo = null;
        }
        this.hLo = by >= 0 ? agY.bzw().sk(aid_0.dVo[by]) : (bgy2.aFW() == 0 || bgy2.aFW() == 5 ? agY.bzw().sk(aid_0.dVp[0]) : agY.bzw().sk(aid_0.dVp[1]));
        if (this.hLo != null) {
            this.hLo.a(this.hLq);
            this.hLo.pu(n);
            agZ.bzy().b(this.hLo);
        }
    }

    public void ddi() {
        bgy bgy2 = this.hLq.dcP();
        if (bgy2 == null) {
            return;
        }
        int n = bgy2.bqo();
        if (this.hLo != null) {
            agZ.bzy().so(this.hLo.bLJ());
            this.hLo = null;
        }
        this.hLo = agY.bzw().sk(aid_0.dVp[1]);
        if (this.hLo != null) {
            this.hLo.a(this.hLq);
            this.hLo.pu(n);
            agZ.bzy().b(this.hLo);
        }
    }

    public void ddj() {
        if (this.hLo != null) {
            agZ.bzy().so(this.hLo.bLJ());
            this.hLo = null;
        }
    }

    public void dde() {
        bgy bgy2 = this.hLq.dcP();
        if (bgy2 == null) {
            return;
        }
        int n = bgy2.bqo();
        byte by = bgy2.bcP();
        if (this.hLp != null) {
            agZ.bzy().so(this.hLp.bLJ());
            this.hLp = null;
        }
        if (by >= 0 && by < aid_0.dVk.length) {
            this.hLp = agY.bzw().sk(aid_0.dVk[by]);
        }
        if (this.hLp != null) {
            this.hLp.a(this.hLq);
            this.hLp.pu(n);
            agZ.bzy().b(this.hLp);
        }
    }

    public void ddh() {
        if (this.hLp != null) {
            agZ.bzy().so(this.hLp.bLJ());
            this.hLp = null;
        }
    }
}

