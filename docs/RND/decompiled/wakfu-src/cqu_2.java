/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cQu
 */
public class cqu_2
extends cpm_1 {
    private static final Logger nlf = Logger.getLogger(cqu_2.class);

    @Override
    public cps_1 eLz() {
        return cps_1.njx;
    }

    @Override
    public String getLabel() {
        if (!(this.cqO instanceof bgy)) {
            return null;
        }
        bgy bgy2 = (bgy)this.cqO;
        ahv_2 ahv_22 = new ahv_2().ceu().c(aum_0.cWf().c("desc.mru." + this.ely(), bgy2.getName())).cev();
        return ahv_22.ceL();
    }

    @Override
    public String ely() {
        return "followPlayer";
    }

    @Override
    protected int eLB() {
        return crc_2.nnM.nnW;
    }

    @Override
    public void run() {
        if (!this.bxO()) {
            nlf.error((Object)("Tentative de lancement de l'action '" + this.eLz().aXB() + "' alors que isRunnable retourne que l'action est impossible"));
            return;
        }
        bhJ bhJ2 = (bhJ)this.cqO;
        if (bhJ2.ddI().isVisible()) {
            dcJ.fce().fg(bhJ2.Sn());
            aue_0.cVJ().a(dcJ.fce());
        }
    }

    @Override
    public boolean isEnabled() {
        return super.isEnabled();
    }

    @Override
    public boolean bxO() {
        if (this.cqO == null) {
            return false;
        }
        if (!(this.cqO instanceof bhJ)) {
            return false;
        }
        bhJ bhJ2 = (bhJ)this.cqO;
        return dcJ.aI(bhJ2);
    }

    @Override
    public cpm_1 eLD() {
        return new cqu_2();
    }
}

