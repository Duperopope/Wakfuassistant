/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bkY
 */
public class bky_1
implements aeh_2 {
    public static final String isx = "items";
    public static final String isy = "capacity";
    public static final String isz = "title";
    public static final String isA = "color";
    public static final String isB = "isReadOnly";
    public static final String[] isC = new String[]{"items", "capacity", "title", "color", "isReadOnly"};
    public static final int isD = 100;
    private ejt_0 isE;
    private String cHc;
    private String p;
    private axb_2 chO;
    private boolean isF;
    private String isG;

    @Override
    public String[] bxk() {
        return isC;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (isx.equals(string)) {
            return this.isInitialized() ? this.isE.fba() : null;
        }
        if (isy.equals(string)) {
            return this.isInitialized() ? this.isE.fba().size() : 0;
        }
        if (isz.equals(string)) {
            return aum_0.cWf().c("account.chest.title", this.p);
        }
        if (isA.equals(string)) {
            return this.chO;
        }
        if (isB.equals(string)) {
            return this.isF;
        }
        return null;
    }

    private boolean isInitialized() {
        return this.isE != null;
    }

    public void setName(String string) {
        this.p = string;
    }

    public void setColor(axb_2 axb_22) {
        this.chO = new awx_2(axb_22, 0.75f);
    }

    public void setId(String string) {
        this.cHc = string;
    }

    public void a(ejt_0 ejt_02) {
        this.isE = ejt_02;
    }

    public void setReadOnly(boolean bl) {
        this.isF = bl;
    }

    public String getName() {
        return this.p;
    }

    public axb_2 getColor() {
        return this.chO;
    }

    public String getId() {
        return this.cHc;
    }

    public boolean dtg() {
        return this.isF;
    }

    public boolean jW(long l) {
        return this.isE.jW(l);
    }

    public boolean a(@NotNull ffV ffV2, int n) {
        if (this.isE == null || !this.isE.a(ffV2, n)) {
            return false;
        }
        this.i(ffV2);
        fse_1.gFu().a((aef_2)this, isx);
        return true;
    }

    public boolean b(@NotNull ffV ffV2, int n) {
        if (this.isE == null || !this.isE.b(ffV2, n)) {
            return false;
        }
        this.i(ffV2);
        fse_1.gFu().a((aef_2)this, isx);
        return true;
    }

    public boolean jX(long l) {
        if (this.isE == null || !this.isE.jX(l)) {
            return false;
        }
        fse_1.gFu().a((aef_2)this, isx);
        return true;
    }

    public boolean i(long l, short s) {
        if (this.isE == null || !this.isE.i(l, s)) {
            return false;
        }
        fse_1.gFu().a((aef_2)this, isx);
        return true;
    }

    public void lU(String string) {
        this.isG = string;
    }

    public void dth() {
        if (!this.isInitialized()) {
            return;
        }
        String string = this.isG == null ? "" : BH.bd(this.isG);
        for (ffV ffV2 : this.isE.fba()) {
            if (ffV2 == null) continue;
            ffV2.mW(!string.isEmpty() && !ffV2.dah().contains(string));
        }
        fse_1.gFu().a((aef_2)this, isx);
    }

    private void i(@NotNull ffV ffV2) {
        if (!BH.aU(this.isG)) {
            ffV2.mW(ffV2.dah().contains(BH.aT(this.isG)));
        }
    }

    public Optional<ffV> j(@NotNull ffV ffV3) {
        return this.isE.fba().stream().filter(Objects::nonNull).filter(ffV3::n).filter(ffV2 -> ffV2.bfe() - ffV2.bfd() > 0).findFirst();
    }

    public boolean k(@NotNull ffV ffV3) {
        List<ffV> list = this.isE.fba();
        int n = ffV3.avr();
        return list.stream().anyMatch(ffV2 -> ffV2 != null && ffV2.avr() == n);
    }

    public Integer[] l(ffV ffV3) {
        return (Integer[])this.isE.fba().stream().filter(Objects::nonNull).filter(ffV3::n).filter(ffV2 -> ffV2.bfe() - ffV2.bfd() > 0).map(ffV2 -> this.isE.jY(ffV2.LV())).toArray(Integer[]::new);
    }

    public int jY(long l) {
        return this.isE.jY(l);
    }

    public Optional<ffV> Dz(int n) {
        return this.isE.Dz(n);
    }

    public boolean dti() {
        return this.isE.fba().stream().anyMatch(Objects::isNull);
    }

    public int dtj() {
        return (int)this.isE.fba().stream().filter(Objects::isNull).count();
    }

    public int ajt() {
        return this.isE.fba().size();
    }

    public boolean aJG() {
        return this.isE.fba().isEmpty();
    }

    public boolean q(long l, long l2) {
        boolean bl = this.isE.q(l, l2);
        if (bl) {
            fse_1.gFu().a((aef_2)this, isx);
        }
        return bl;
    }
}

