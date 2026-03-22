/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bkE
 */
public class bke_2 {
    private static final Logger irq = Logger.getLogger(bke_2.class);
    private final fos_0 irr;
    private final sm_0 irs;
    private final bdj_2 irt;
    private FreeParticleSystem iru;
    private Anm cUt;

    public bke_2(@NotNull fos_0 fos_02, @NotNull sm_0 sm_02, @NotNull bdj_2 bdj_22) {
        this.irr = fos_02;
        this.irs = sm_02;
        this.irt = bdj_22;
    }

    public String dsL() {
        fjk fjk2 = this.irr.gfA();
        return ajf_0.yG(fjk2.d());
    }

    public void dsM() {
        this.dsN();
        ajh_0 ajh_02 = new ajh_0(new ajg_0(this.irs, this.irr.gfA().d()));
        if (this.irt.dcP().bvY()) {
            this.irt.a(ajh_02);
        } else {
            this.irt.b(ajh_02);
        }
        this.irt.ddp();
    }

    public void dsN() {
        String string = this.irr.aXE();
        fjk fjk2 = this.irr.gfA();
        try {
            this.a(this.irt, string, fjk2);
        }
        catch (fu_0 fu_02) {
            irq.error((Object)"Exception levee", (Throwable)fu_02);
        }
    }

    private void a(bdj_2 bdj_22, String string, fjk fjk2) {
        String string2 = "petGfxPath";
        String string3 = auc_0.cVq().bS("petGfxPath");
        String string4 = String.format(string3, string);
        if (this.iru != null) {
            agZ.bzy().so(this.iru.bLJ());
            this.iru = null;
        }
        if (this.irr.bBE() > 0) {
            this.iru = agY.bzw().sk(this.irr.bBE());
            this.iru.a(bdj_22);
            agZ.bzy().b(this.iru);
        }
        bdj_22.a(this.cUt);
        this.cUt = bdj_22.dS(string4);
        bdj_22.a(this.cUt, () -> {
            if (bdj_22.dcP().djT()) {
                return;
            }
            String string = ajf_0.yG(fjk2.d());
            bdj_22.dV(string);
            bdj_22.dT(string);
        });
    }

    public void dsO() {
        this.r(this.irt);
    }

    public void r(bdj_2 bdj_22) {
        if (this.cUt != null) {
            bdj_22.a(this.cUt);
            this.cUt = null;
        }
        if (this.iru != null) {
            agZ.bzy().so(this.iru.bLJ());
            this.iru = null;
        }
        if (this.irt.bkI().contains("Mnt")) {
            bdj_22.dT("AnimStatique");
        }
        bdj_22.dV("AnimStatique");
        if (this.irt.dcP().bvY()) {
            bdj_22.a(this.bvD());
        } else {
            bdj_22.b(this.bvD());
        }
        bdj_22.ddp();
    }

    private aex bvD() {
        eid_0 eid_02 = this.irt.dcP().dpX();
        if (eid_02 == null) {
            return aeB.bww();
        }
        return eid_02.dsm() == 16 ? aez.bwu() : aeB.bww();
    }

    public String toString() {
        return "Ride{m_mountSkin=" + String.valueOf(this.irr) + ", m_particleSystem=" + String.valueOf(this.iru) + ", m_anm=" + this.cUt.aLM() + "}";
    }
}

