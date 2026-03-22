/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bIX
 */
public class bix_1
implements aeh_2 {
    private static final Logger kjl = Logger.getLogger(bix_1.class);
    public static final String kjm = "notifications";
    public static final String kjn = "mustDisplay";
    private static final String[] kjo = new String[]{"notifications", "mustDisplay"};
    private final List<biy_1> kjp = new ArrayList<biy_1>();
    private final Map<biy_1, Long> kjq = new HashMap<biy_1, Long>();
    private final Map<biy_1, List<fsv_2<biy_1>>> kjr = new HashMap<biy_1, List<fsv_2<biy_1>>>();
    private static final float kjs = 0.9f;
    private static final float kjt = 1.0f;
    private static final float kju = 1.0f;
    private static final long kjv = 30L;
    protected final Runnable kjw = () -> fyw_0.gqw().tl("notificationDialog");
    public final Runnable kjx = this::aPc;
    public boolean kjy = false;
    public fey_2 kjz;
    private boolean kjA = false;

    @Override
    public String[] bxk() {
        return kjo;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string == null) {
            return null;
        }
        switch (string) {
            case "notifications": {
                return this.dZN();
            }
            case "mustDisplay": {
                return this.dZK();
            }
        }
        return null;
    }

    public void a(biy_1 biy_12) {
        if (biy_12 == null) {
            return;
        }
        this.kjq.put(biy_12, System.currentTimeMillis());
        this.e(biy_12);
    }

    public boolean dZK() {
        return this.kjp.size() > 0;
    }

    public void dZL() {
        if (this.kjy) {
            return;
        }
        this.kjy = true;
        abg_2.bUP().a(this.kjx, 30L);
    }

    public void dZM() {
        if (!this.kjy) {
            return;
        }
        this.kjy = false;
        abg_2.bUP().h(this.kjx);
    }

    public void b(biy_1 biy_12) {
        this.kjp.add(0, biy_12);
        this.a(biy_12);
    }

    private Collection<biy_1> dZN() {
        return this.kjp;
    }

    public boolean c(biy_1 biy_12) {
        if (biy_12 == null) {
            return false;
        }
        this.kjq.remove(biy_12);
        return this.kjp.removeIf(biy_13 -> biy_13.equals(biy_12));
    }

    public void aPc() {
        long l = System.currentTimeMillis();
        for (biy_1 biy_12 : new HashSet<biy_1>(this.kjq.keySet())) {
            Long l2 = this.kjq.get(biy_12);
            if (l2 + (long)biy_12.dZD() < l) {
                this.f(biy_12);
                continue;
            }
            if (l2 + (long)biy_12.dZB() >= l || this.d(biy_12)) continue;
            kjl.warn((Object)("[NOTIFICATION] Cannot start fade out on view " + biy_12.getId()));
        }
        if (this.kjA) {
            fse_1.gFu().a((aef_2)this, kjm, kjn);
            this.kjA = false;
        }
        if (!this.dZK()) {
            this.dZM();
        }
    }

    public void dZO() {
        if (!fyw_0.gqw().to("notificationDialog")) {
            fey_2 fey_22 = (fey_2)ccj_2.g("notificationDialog", 40976L);
            this.setWindow(fey_22);
        } else {
            fse_1.gFu().a((aef_2)this, kjm, kjn);
        }
        fhy_2.gBq().eHp();
        this.dZL();
        abg_2.bUP().h(this.kjw);
        fyw_0.gqw().d("wakfu.notification", cfg_1.class);
    }

    public void dZP() {
        if (this.dZK()) {
            this.kjA = true;
            this.dZL();
            return;
        }
        abg_2.bUP().a(this.kjw, 2000L, 1);
        this.dZM();
        fse_1.gFu().a((aef_2)this, kjm, kjn);
    }

    private boolean d(biy_1 biy_12) {
        if (this.kjz == null) {
            return false;
        }
        if (this.kjr.containsKey(biy_12)) {
            return true;
        }
        fhs_2 fhs_22 = this.kjz.getElementMap();
        if (fhs_22 == null) {
            return false;
        }
        ArrayList<fhs_2> arrayList = fhs_22.gAu();
        if (arrayList == null) {
            return false;
        }
        for (fhs_2 fhs_23 : arrayList) {
            fhv_1 fhv_12 = fhs_23.uH(biy_12.getId());
            if (!(fhv_12 instanceof faw_2)) continue;
            faw_2 faw_22 = (faw_2)fhv_12;
            this.kjA = true;
            if (faw_22.y(fsv_2.class)) {
                return true;
            }
            this.a(biy_12, faw_22, 3, faw_22);
            return true;
        }
        return false;
    }

    private static float b(fes_2 fes_22) {
        if (fes_22 == null) {
            return 0.0f;
        }
        if (fes_22 instanceof fad_1) {
            return 1.0f;
        }
        if (fes_22 instanceof faw_2) {
            return 0.9f;
        }
        if (fes_22 instanceof fdy_1) {
            return 1.0f;
        }
        return 1.0f;
    }

    private void a(biy_1 biy_13, fes_2 fes_23, int n, faw_2 faw_22) {
        if (fes_23 == null || biy_13 == null) {
            return;
        }
        axb_2 axb_22 = fes_23.getAppearance().getModulationColor();
        float f2 = axb_22 != null ? axb_22.aIX() : bix_1.b(fes_23);
        fsv_2<biy_1> fsv_22 = new fsv_2<biy_1>(f2, fes_23, biy_13.dZC(), faw_22, biy_13);
        if (faw_22 != null) {
            fsv_22.A(this::f);
        }
        fes_23.a(fsv_22);
        this.kjr.computeIfAbsent(biy_13, biy_12 -> new ArrayList()).add(fsv_22);
        if (!(fes_23 instanceof faw_2) || n <= 0) {
            return;
        }
        ((faw_2)fes_23).getWidgetChildren().forEach(fes_22 -> this.a(biy_13, (fes_2)fes_22, n - 1, null));
    }

    private void e(biy_1 biy_12) {
        if (!this.kjr.containsKey(biy_12)) {
            return;
        }
        this.kjr.get(biy_12).forEach(fsv_2::gGb);
        this.kjr.remove(biy_12);
    }

    private void f(biy_1 biy_12) {
        this.kjq.remove(biy_12);
        this.kjp.remove(biy_12);
        this.kjr.remove(biy_12);
        biy_12.dZS();
        biy_12.dZT();
        this.kjA = true;
        this.dZP();
    }

    public void setWindow(fey_2 fey_22) {
        if (this.kjz != null) {
            this.kjz.x(fsv_2.class);
        }
        this.kjz = fey_22;
    }
}

