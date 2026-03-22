/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/*
 * Renamed from cSh
 */
public class csh_1
implements adi_1 {
    private static final csh_1 nFg = new csh_1();
    private ScheduledExecutorService nFh;

    public static csh_1 eNW() {
        return nFg;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 18809: {
                aue_0.cVJ().b(this);
                return false;
            }
        }
        return true;
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        fyw_0.gqw().a(new csi_1(this));
        fse_1.gFu().f("statistics", brt_1.ekR());
        ccj_2.pd("adminMonitorDialog");
        brt_1.ekR().clear();
        this.nFh = Executors.newSingleThreadScheduledExecutor();
        this.nFh.scheduleWithFixedDelay(new csj_1(this), 0L, 5L, TimeUnit.SECONDS);
        if (!aue_0.cVJ().c(ccu_1.etC())) {
            aue_0.cVJ().a(ccu_1.etC());
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        fse_1.gFu().vX("statistics");
        fyw_0.gqw().tl("adminMonitorDialog");
        brt_1.ekR().clear();
        if (this.nFh != null) {
            this.nFh.shutdown();
            this.nFh = null;
        }
        aue_0.cVJ().b(ccu_1.etC());
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }
}

