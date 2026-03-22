/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 */
import java.util.ArrayList;
import javax.inject.Inject;

public class btZ
implements aeh_2,
cpw_2 {
    public static final String jnY = "iconUrl";
    public static final String jnZ = "description";
    public static final String joa = "isAvailable";
    public static final String job = "isUnknown";
    public static final String joc = "dimension";
    public static final String jod = "stack";
    private final ArrayList<enk_0> joe = new ArrayList();
    private final boolean jof;
    private int jog = 0;
    private final fsm_1 joh = new fsm_1(32, 32);

    @Inject
    public btZ() {
        this(null, false);
    }

    public btZ(boolean bl) {
        this(null, bl);
    }

    public btZ(enk_0 enk_02) {
        this(enk_02, false);
    }

    public btZ(enk_0 enk_02, boolean bl) {
        this.joe.clear();
        if (enk_02 != null) {
            this.joe.add(enk_02);
        }
        this.jof = bl;
    }

    public enk_0 dIy() {
        if (this.joe.isEmpty()) {
            return null;
        }
        return this.joe.get(0);
    }

    public void k(enk_0 enk_02) {
        this.joe.clear();
        if (enk_02 != null) {
            this.joe.add(enk_02);
        }
        fse_1.gFu().a((aef_2)this, jnY, jnZ);
    }

    public void dIz() {
        ++this.jog;
    }

    public void dB(int n, int n2) {
        this.joh.setSize(n, n2);
        fse_1.gFu().a((aef_2)this, joc);
    }

    @Override
    public String[] bxk() {
        return null;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(jnY)) {
            enk_0 enk_02 = this.dIy();
            if (enk_02 != null) {
                return auc_0.cVq().a("timePointBonusIconsPath", "defaultIconPath", ewc_1.rBP.SL(enk_02.aZH()));
            }
        } else {
            if (string.equals(jnZ)) {
                if (this.jof) {
                    return aum_0.cWf().c("fight.timePointBar.unknownBonus", new Object[0]);
                }
                if (this.joe.isEmpty()) {
                    return aum_0.cWf().c("fight.timePointBar.noBonus", new Object[0]);
                }
                StringBuilder stringBuilder = new StringBuilder();
                ArrayList<String> arrayList = eLL.a(new eLU(this.joe, 0, 1, true, eLN.qJo, 0));
                boolean bl = true;
                for (String string2 : arrayList) {
                    if (!bl) {
                        stringBuilder.append("\n");
                    } else {
                        bl = false;
                    }
                    stringBuilder.append(string2);
                }
                return stringBuilder.toString();
            }
            if (string.equals(job)) {
                return this.jof;
            }
            if (string.equals(joa)) {
                return this.jog != 0;
            }
            if (string.equals(jod)) {
                return this.jog;
            }
            if (string.equals(joc)) {
                return this.joh;
            }
        }
        return null;
    }
}

