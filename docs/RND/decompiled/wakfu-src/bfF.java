/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Comparator;
import org.jetbrains.annotations.Nullable;

public class bfF
implements aeh_2 {
    public static final String hUX = "sheetName";
    public static final String hUY = "sheetNameWithLevel";
    public static final String hUZ = "index";
    public static final String hVa = "level";
    public static final String hVb = "shortLevel";
    public static final String hVc = "isActive";
    public static final String hVd = "hasInvalidSheet";
    public static final String hVe = "iconUrl";
    public static final String hVf = "isRealLevel";
    public static final String hVg = "canBeDeleted";
    public static final String hVh = "deleteButtonPopup";
    public static final String hVi = "isPermanent";
    public static final String[] hVj = new String[]{"sheetName", "sheetNameWithLevel", "level", "shortLevel", "isActive", "hasInvalidSheet", "iconUrl", "isRealLevel", "index", "canBeDeleted", "deleteButtonPopup", "isPermanent"};
    public static final Comparator<bfF> hVk = Comparator.comparing(bfF::getName);
    public static final Comparator<bfF> hVl = Comparator.comparingInt(bfF2 -> bfF2.tL() == -1 ? Integer.MAX_VALUE : bfF2.tL());
    private final eIj hVm;
    private final int hVn;
    private final bgt_0 hVo;

    public bfF(int n, eIj eIj2, bgt_0 bgt_02) {
        this.hVn = n;
        this.hVm = eIj2;
        this.hVo = bgt_02;
    }

    @Override
    public String[] bxk() {
        return hVj;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "sheetNameWithLevel": {
                return aum_0.cWf().c("aptitude.sheet.name", this.hVm.getName(), this.dgL());
            }
            case "sheetName": {
                return this.hVm.getName();
            }
            case "index": {
                return this.hVm.wp();
            }
            case "level": {
                return this.dgL();
            }
            case "shortLevel": {
                if (this.hVm.tL() > 0) {
                    return this.hVm.tL();
                }
                return aum_0.cWf().c("real", new Object[0]);
            }
            case "isActive": {
                return cvu_2.eTO().eUs() == this.hVn;
            }
            case "hasInvalidSheet": {
                return this.dhb();
            }
            case "iconUrl": {
                return auc_0.cVq().kv(String.valueOf(this.hVm.ws()));
            }
            case "isRealLevel": {
                return this.hVm.tL() == -1;
            }
            case "canBeDeleted": {
                return cvu_2.eTO().Nj(this.hVn);
            }
            case "deleteButtonPopup": {
                return this.dhc();
            }
            case "isPermanent": {
                return this.dhe();
            }
        }
        return null;
    }

    public long KU() {
        return this.hVo.Sn();
    }

    private boolean dhb() {
        fhk fhk2;
        int n = this.hVm.wp();
        if (!eIp.b(this.hVo, n, fhk2 = this.hVo.CL((byte)n)).isEmpty()) {
            return true;
        }
        frd frd2 = this.hVo.dnJ().Zx(n);
        if (!eIp.a((exP)this.hVo, frd2).isEmpty()) {
            return true;
        }
        Object t = this.hVo.dnN().PI(n);
        return !eIp.a((exP)this.hVo, t).isEmpty();
    }

    private String dgL() {
        int n = this.hVm.tL();
        bfC bfC2 = bfD.hUw.bp((short)n);
        String string = bfC2.dgL();
        if (n > 0) {
            return aum_0.cWf().c("levelShort.custom", string);
        }
        return string;
    }

    private String dhc() {
        if (this.hVm.dhe()) {
            return aum_0.cWf().c("build.cant.delete.permanent", new Object[0]);
        }
        if (eIp.an(this.hVo)) {
            return aum_0.cWf().c("build.cant.delete.occupation", new Object[0]);
        }
        fse_0 fse_02 = ((fsf)fsf.gkM()).mC(this.hVo.aqZ());
        if (fse_02 == null || fse_02.eqx() || fse_02.eqw()) {
            return aum_0.cWf().c("build.cant.delete.fight", new Object[0]);
        }
        bsj_0 bsj_02 = this.hVo.dkZ();
        if (bsj_02 != null && bsj_02.dGp() != etw_0.rqT && bsj_02.dGp() != etw_0.rqW) {
            return aum_0.cWf().c("build.cant.delete.fight", new Object[0]);
        }
        return aum_0.cWf().c("build.delete", new Object[0]);
    }

    public eIj dhd() {
        return this.hVm;
    }

    public int wp() {
        return this.hVn;
    }

    public String getName() {
        return this.hVm.getName();
    }

    private int tL() {
        return this.hVm.tL();
    }

    public boolean dhe() {
        return this.hVm.dhe();
    }

    public String toString() {
        return this.hVm.toString();
    }
}

