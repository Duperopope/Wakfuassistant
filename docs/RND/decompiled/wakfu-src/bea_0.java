/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.text.DecimalFormat;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bEA
 */
public class bea_0
extends ffh_0
implements aef_2 {
    public static final String jOU = "packType";
    public static final String jOV = "price";
    public static final String jOW = "formatedPrice";
    public static final String jOX = "item";
    public static final String jOY = "packList";
    public static final String jOZ = "durationList";
    public static final String jPa = "duration";
    public static final String jPb = "protectorTaxFactor";
    public static final String[] jPc = new String[]{"packType", "price", "formatedPrice", "item", "packList", "duration", "durationList", "protectorTaxFactor"};
    private final ArrayList<bED> jPd = new ArrayList();
    private final ArrayList<beb_0> jPe = new ArrayList();
    @NotNull
    protected fnl jPf = fnl.sIp;

    @Override
    public boolean bfh() {
        return true;
    }

    @Override
    public String[] bxk() {
        return jPc;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(jOU)) {
            if (this.jPd.isEmpty()) {
                this.dSq();
            }
            int n = this.jPd.size();
            for (int i = 0; i < n; ++i) {
                bED bED2 = this.jPd.get(i);
                if (bED2.dSx() != this.dSx()) continue;
                return bED2;
            }
            return null;
        }
        if (string.equals(jPa)) {
            if (this.jPe.isEmpty()) {
                this.dSr();
            }
            int n = this.jPe.size();
            for (int i = 0; i < n; ++i) {
                beb_0 beb_02 = this.jPe.get(i);
                if (beb_02.dSu() != this.jPf) continue;
                return beb_02;
            }
            return null;
        }
        if (string.equals(jOV)) {
            return this.eAU() == 0L ? "" : aum_0.cWf().cQ(this.eAU());
        }
        if (string.equals(jOW)) {
            return DecimalFormat.getIntegerInstance().format(this.eAU());
        }
        if (string.equals(jOX)) {
            return this.getItem();
        }
        if (string.equals(jOY)) {
            if (this.jPd.isEmpty()) {
                this.dSq();
            }
            return this.jPd;
        }
        if (string.equals(jOZ)) {
            if (this.jPe.isEmpty()) {
                this.dSr();
            }
            return this.jPe;
        }
        if (jPb.equals(string)) {
            long l = frn.sXO.b(aue_0.cVJ().cVK(), frk.sXG, 100L);
            axb_2 axb_22 = l < 20L ? awx_2.dnM : (l < 40L ? awx_2.dnZ : awx_2.dnK);
            ahv_2 ahv_22 = new ahv_2();
            ahv_22.e(axb_22).hY(l).ceD();
            return aum_0.cWf().c("desc.taxFactor", ahv_22.toString());
        }
        return this.getItem() == null ? null : this.getItem().eu(string);
    }

    @Override
    public short bfd() {
        if (this.getItem() == null) {
            return -1;
        }
        return super.bfd();
    }

    @NotNull
    public fnl dSp() {
        return this.jPf;
    }

    public void dSq() {
        this.jPd.clear();
        for (fnm fnm2 : fnm.values()) {
            if (fnm2.sID > this.bfd()) continue;
            this.jPd.add(new bED(fnm2, true, fnm2 == this.jPp));
        }
    }

    public void dSr() {
        this.jPe.clear();
        for (fnl fnl2 : fnl.values()) {
            this.jPe.add(new beb_0(fnl2, fnl2 == this.jPf));
        }
    }

    @Override
    public void c(String string, Object object) {
        int n;
        if (string.equalsIgnoreCase(jOV) && (n = cdd_2.parseStringNumber(object.toString())) != -1) {
            this.lk(n);
        }
    }

    @Override
    public void d(String string, Object object) {
    }

    @Override
    public void e(String string, Object object) {
    }

    @Override
    public boolean hP(String string) {
        return string.equalsIgnoreCase(jOV);
    }

    @Override
    public void lk(long l) {
        super.lk(l);
        fse_1.gFu().a((aef_2)this, jOV, jOW);
    }

    @Override
    public void a(fnm fnm2) {
        super.a(fnm2);
        for (bED bED2 : this.jPd) {
            bED2.setSelected(bED2.dSx() == fnm2);
        }
        fse_1.gFu().a((aef_2)this, jOU);
    }

    public void a(@NotNull fnl fnl2) {
        this.jPf = fnl2;
        for (beb_0 beb_02 : this.jPe) {
            beb_02.setSelected(beb_02.dSu() == fnl2);
        }
        fse_1.gFu().a((aef_2)this, jPa);
    }

    @Override
    public void ak(short s) {
        super.ak(s);
        fse_1.gFu().a((aef_2)this, "quantity");
    }

    @Override
    public RT bfg() {
        bea_0 bea_02 = new bea_0();
        bea_02.iWZ = this.iWZ;
        bea_02.jPp = this.jPp;
        bea_02.kVl = this.kVl;
        bea_02.jPf = this.jPf;
        return bea_02;
    }

    @Override
    public boolean a(vy_2 vy_22) {
        this.iWZ = fgD.fXh().a(vy_22.agz);
        if (this.iWZ != null) {
            this.lk(vy_22.agB);
            fnm fnm2 = fnm.fo(vy_22.agA);
            if (fnm2 != null) {
                this.a(fnm2);
                return true;
            }
            sga.error((Object)("Impossible de trouver le pack \u00e0 " + vy_22.agA + " items"));
            return false;
        }
        return false;
    }

    @Override
    public boolean b(vy_2 vy_22) {
        vy_22.agB = GC.cw(this.eAU());
        vy_22.agA = this.dSx().sID;
        this.iWZ.b(vy_22.agz);
        return true;
    }

    public String getName() {
        if (this.getItem() == null) {
            return "<undefined>";
        }
        return this.getItem().getName();
    }

    public String byf() {
        if (this.getItem() == null) {
            return "";
        }
        return this.getItem().byf();
    }

    public int dSs() {
        if (this.getItem() == null) {
            return 0;
        }
        return this.bfd() / this.dSx().sID;
    }

    @Override
    public /* synthetic */ boolean b(Object object) {
        return this.a((vy_2)object);
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.b((vy_2)object);
    }
}

