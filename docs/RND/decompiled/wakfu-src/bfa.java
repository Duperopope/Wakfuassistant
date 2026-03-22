/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

public class bfa
implements aeh_2 {
    public static final String hPV = "typesFilter";
    public static final String hPW = "currentType";
    public static final String hPX = "battlegroundList";
    public static final String hPY = "selectedBattleground";
    public static final String hPZ = "maxNumPages";
    public static final String hQa = "currentPage";
    public static final String hQb = "currentPageText";
    public static final String hQc = "isFinishedFilter";
    public static final String hQd = "winnerId";
    public static final String hQe = "winnerIcon";
    private static final int hQf = 7;
    private final ArrayList<bfc_0> hQg = new ArrayList();
    private bfc_0 hQh;
    private final bfd_0 hQi;
    private final ArrayList<bfi_0> hQj = new ArrayList();
    private @Unmodifiable @Nullable List<bfi_0> hQk;
    private bfi_0 hQl;
    private short hQm;
    private short hQn;
    private boolean hQo;
    private int hQp;
    private String hQq;
    public static fpf_0[] hQr = new fpf_0[]{fpf_0.sQm, fpf_0.sQn, fpf_0.sQq};
    public static final String[] hQs = new String[]{"typesFilter", "currentType", "battlegroundList", "selectedBattleground", "maxNumPages", "currentPage", "currentPageText", "isFinishedFilter", "winnerId", "winnerIcon"};

    public bfa() {
        this.hQi = new bfd_0(this, 7);
    }

    @Override
    public String[] bxk() {
        return hQs;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(hPV)) {
            return this.hQg;
        }
        if (string.equals(hPW)) {
            return this.hQh;
        }
        if (string.equals(hPX)) {
            return this.hQi.dfD();
        }
        if (string.equals(hPY)) {
            return this.hQl;
        }
        if (string.equals(hPZ)) {
            return this.hQi.dfC();
        }
        if (string.equals(hQa)) {
            return this.hQi.dfz();
        }
        if (string.equals(hQb)) {
            return this.hQi.dfB();
        }
        if (string.equals(hQc)) {
            return this.hQo;
        }
        if (string.equals(hQd)) {
            return this.hQp;
        }
        if (string.equals(hQe)) {
            return this.hQq;
        }
        return null;
    }

    @Unmodifiable @NotNull List<bfi_0> dft() {
        if (this.hQk != null) {
            return this.hQk;
        }
        this.hQk = this.hQj.stream().filter(bfi_02 -> {
            if (this.hQh.hQu != null && this.hQh.hQu.dfF() != bfi_02.dfI().dfF()) {
                return false;
            }
            if (bfi_02.dfI().ggH().ggS() > this.hQn) {
                return false;
            }
            if (bfi_02.dfI().ggH().ggT() < this.hQm) {
                return false;
            }
            return !bfi_02.bVp() || this.hQo;
        }).toList();
        return this.hQk;
    }

    public short dfu() {
        return this.hQm;
    }

    public short dfv() {
        return this.hQn;
    }

    public void bn(short s) {
        this.hQm = s;
        this.dfw();
    }

    public void bo(short s) {
        this.hQn = s;
        this.dfw();
    }

    private void dfw() {
        this.hQk = null;
        this.dft();
        this.hQi.BH(GC.a(this.hQi.dfz(), 1, this.hQi.dfC()));
        fse_1.gFu().a((aef_2)this, hPX, hPZ, hQb, hQa);
    }

    public void dfx() {
        this.hQo = !this.hQo;
        this.dfw();
        fse_1.gFu().a((aef_2)this, hQc);
    }

    public void bkZ() {
        this.hQi.BH(1);
        this.hQm = 0;
        this.hQn = (short)ewo_0.oBF.i(ewr_0.oCk);
        this.hQo = false;
        bfc_0 bfc_02 = new bfc_0();
        this.hQg.add(bfc_02);
        this.hQh = bfc_02;
        for (fpf_0 fpf_02 : hQr) {
            this.hQg.add(new bfc_0(new bfh_0(fpf_02)));
        }
    }

    public void a(bfi_0 bfi_02) {
        this.hQl = bfi_02;
        fse_1.gFu().a((aef_2)this, hPY);
        if (this.hQl != null) {
            this.hQp = this.hQl.dfI().atC();
            this.hQq = this.hQl.dfH();
        } else {
            this.hQp = 0;
            this.hQq = null;
        }
        fse_1.gFu().a((aef_2)this, hQd);
        fse_1.gFu().a((aef_2)this, hQe);
    }

    public bfi_0 dfy() {
        return this.hQl;
    }

    public void BH(int n) {
        this.hQi.BH(n);
        this.hQk = null;
        fse_1.gFu().a((aef_2)this, hPX, hQb, hPZ, hQa);
    }

    public int dfz() {
        return this.hQi.dfz();
    }

    public void a(bfc_0 bfc_02) {
        this.hQh = bfc_02;
        this.dfw();
    }

    public int dfA() {
        return this.hQi.dfC();
    }

    public void F(List<fpv> list) {
        this.hQj.clear();
        for (fpv fpv2 : list) {
            fpt fpt2;
            foM foM2;
            bfi_0 bfi_02 = new bfi_0(fpv2);
            Optional<fpt> optional = fpu.sOH.FP(fpv2.att());
            if (optional.isPresent() && (foM2 = fpk.sNF.Yn((fpt2 = optional.get()).clk())) != null) {
                bfi_02.a(new bml_2(foM2));
            }
            this.hQj.add(bfi_02);
        }
        this.hQj.sort(new bfb_0(this));
        this.hQk = null;
        fse_1.gFu().a((aef_2)this, hPX, hQa, hQb, hPZ);
    }
}

