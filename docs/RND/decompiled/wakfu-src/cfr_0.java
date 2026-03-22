/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.CellParticleSystem;
import com.ankamagames.baseImpl.graphics.isometric.particles.IsoParticleSystem;
import org.apache.log4j.Logger;

/*
 * Renamed from cfr
 */
final class cfr_0
extends ceK<cqi, bsj_0> {
    private static final Logger lSP = Logger.getLogger(cfr_0.class);
    private CellParticleSystem lSQ;

    cfr_0() {
    }

    public boolean a(cqi cqi2) {
        acd_1 acd_12 = cqi2.exV();
        if (this.lSQ != null && agZ.bzy().a((IsoParticleSystem)this.lSQ)) {
            this.lSQ.bLH();
            agZ.bzy().so(this.lSQ.bLJ());
        }
        CellParticleSystem cellParticleSystem = agY.bzw().sl(78900);
        cellParticleSystem.r(acd_12.getX(), acd_12.getY(), acd_12.bdi());
        cellParticleSystem.setDuration(2000);
        agZ.bzy().b(cellParticleSystem);
        this.lSQ = cellParticleSystem;
        Long l = cqi2.exW();
        if (l != null) {
            if (l.longValue() == aue_0.cVJ().cVK().Sn()) {
                lSP.info((Object)("<text color=\"" + String.valueOf(aPc.ewv) + "\">" + aum_0.cWf().c("fight.reportCell", cqi2.exV().getX(), cqi2.exV().getY()) + "</text>"));
            } else {
                bgy bgy2 = (bgy)((bsj_0)this.jkR).qJ(cqi2.exW());
                Object object = bgy2 != null ? bgy2.aZk() : "reporterId=" + cqi2.exW();
                lSP.info((Object)aum_0.cWf().c("fight.hasReceivedCellReport", "<b color=\"" + String.valueOf(aPc.ewv) + "\">" + (String)object + "</b>", cqi2.exV().getX(), cqi2.exV().getY()));
            }
        }
        return false;
    }

    @Override
    public /* synthetic */ boolean b(aam_2 aam_22) {
        return this.a((cqi)aam_22);
    }
}

