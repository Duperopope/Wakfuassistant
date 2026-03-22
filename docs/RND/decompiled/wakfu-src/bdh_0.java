/*
 * Decompiled with CFR 0.152.
 */
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.function.Consumer;

/*
 * Renamed from bDH
 */
public class bdh_0
extends bDz
implements ejl_0 {
    public static final String jKR = "bag";
    public static final String jKS = String.format("%s.%s", "collapsedView", "bag");
    private final bde_0 jKT;
    protected final ffm_0 jKU = (by, by2) -> {
        aeb_1 aeb_12 = this.bCh();
        if (aeb_12 == null) {
            return;
        }
        aeb_12.b(this.lc(by), this.jKF);
        this.f(aeb_12);
        aeb_12.a(this.lc(by2), this.jKF);
    };

    public bdh_0(bde_0 bde_02) {
        this.jKT = bde_02;
        this.jKT.a(this.jKU);
        this.dQX();
        this.dQZ();
    }

    @Override
    public Object eu(String string) {
        if (string.equals("bagName")) {
            return this.getName();
        }
        if (string.equals("bagIconUrl")) {
            Object r = fgD.fXh().Vd(this.jKT.avr());
            if (r != null) {
                return auc_0.cVq().zx(((fhc_0)r).aVt());
            }
        } else {
            if (string.equals("bagId")) {
                return this.jKT.Lx();
            }
            if (string.equals("bagInventory")) {
                Object[] objectArray = new Object[this.jKT.fVb().bfa()];
                ffV[] ffVArray = (ffV[])this.jKT.fVb().a(new ffV[this.jKT.fVb().bfa()]);
                for (int i = 0; i < ffVArray.length; ++i) {
                    objectArray[i] = ffVArray[i] == null ? bEb.dRP() : ffVArray[i];
                }
                return objectArray;
            }
            if (string.equals("bagNameSize")) {
                return this.getName() + " (" + this.jKT.aVo() + "/" + this.jKT.bfa() + ")";
            }
            if (string.equals("bagSizeMaxSize")) {
                return this.jKT.aVo() + "/" + this.jKT.bfa();
            }
            if (string.equals("bagSize")) {
                return this.jKT.aVo();
            }
            if (string.equals("bagPosition")) {
                return this.jKT.eDo();
            }
            if (string.equals("canBeSorted")) {
                return true;
            }
            if ("collapsible".equals(string)) {
                return true;
            }
            if ("collapsingIgnoreSize".equals(string)) {
                return true;
            }
        }
        return super.eu(string);
    }

    private String getName() {
        Object r = fgD.fXh().Vd(this.jKT.avr());
        if (r != null) {
            return ((fhc_0)r).getName();
        }
        return null;
    }

    public bde_0 dNO() {
        return this.jKT;
    }

    protected boolean D(bgt_0 bgt_02) {
        bdl_0 bdl_02 = bgt_02.dno();
        return bdl_02.sY(this.jKT.Lx()) != null;
    }

    @Override
    protected afh dQT() {
        bgt_0 bgt_02 = bvz_0.dLl();
        if (bgt_02 == null) {
            return null;
        }
        return this.D(bgt_02) ? afh.cpV : afh.cpW;
    }

    @Override
    protected bgt_0 dQU() {
        bgt_0 bgt_02 = aie_0.cfo().cVK();
        if (bgt_02 == null) {
            return null;
        }
        return (bgt_0)fcI.ab(bgt_02.Xi(), this.jKT.Lx());
    }

    @Override
    public void j(Consumer<fgf_0> consumer) {
        this.jKT.fVb().forEach(consumer);
    }

    @Override
    public OptionalInt lb(long l) {
        short s = this.jKT.dK(l);
        return s < 0 ? OptionalInt.empty() : OptionalInt.of(s);
    }

    @Override
    public OptionalLong Gk(int n) {
        ffV ffV2 = this.jKT.eQ((short)n);
        if (ffV2 == null) {
            return OptionalLong.empty();
        }
        return OptionalLong.of(ffV2.LV());
    }

    @Override
    public int aVo() {
        return this.jKT.aVo();
    }

    @Override
    public int bTg() {
        return this.jKT.bfa();
    }

    @Override
    public OptionalLong dQS() {
        return OptionalLong.of(this.jKT.Lx());
    }

    protected String lc(long l) {
        return String.format("%s.%s", jKS, l);
    }

    @Override
    protected String getKey() {
        return this.lc(this.jKT.eDo());
    }

    @Override
    public ejm_0 drG() {
        return ejm_0.qyT;
    }

    @Override
    public Object drH() {
        return this.jKT.Lx();
    }

    @Override
    public String drI() {
        return ((fhc_0)fgD.fXh().Vd(this.jKT.avr())).getName();
    }
}

