/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bGX
 */
public class bgx_1
implements aeh_2 {
    public static final String jWQ = "selectedUids";
    public static final String jWR = "hasSelection";
    public static final String jWS = "recyclingPopup";
    public static final String jWT = "transferPopup";
    public static final String[] jWU = new String[]{"selectedUids", "hasSelection", "recyclingPopup", "transferPopup"};
    @NotNull
    private final bgi_1 jWV;
    @Nullable
    private Integer jWW;
    private final Set<Integer> jWX = new HashSet<Integer>();
    private final Set<Long> jWY = new HashSet<Long>();
    private final TreeSet<bgy_1> jWZ = new TreeSet<bgy_1>(Comparator.comparingInt(bgy_1::dUI));

    public bgx_1(@NotNull bgi_1 bgi_12) {
        this.jWV = bgi_12;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        String string2 = string;
        int n = 0;
        return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{jWQ, jWR, jWS, jWT}, (Object)string2, n)) {
            case 0 -> this.jWY;
            case 1 -> this.dUD();
            case 2 -> this.dUy();
            case 3 -> this.dUz();
            default -> null;
        };
    }

    @Nullable
    private String dUy() {
        if (!this.dUD()) {
            return null;
        }
        bgt_0 bgt_02 = this.dUF();
        if (bgt_02 == null) {
            return null;
        }
        bdw_0 bdw_02 = bdr_0.a(this.dUG(), bgt_02);
        if (bdw_02.dRF() == 0) {
            return aum_0.cWf().c("inventory.recycle.none.selection", new Object[0]);
        }
        return aum_0.cWf().c("inventory.recycle.selection.popup", bdw_02.dRF(), bdw_02.dRI());
    }

    @Nullable
    private String dUz() {
        if (!this.dUD()) {
            return null;
        }
        bgt_0 bgt_02 = this.dUF();
        if (bgt_02 == null) {
            return null;
        }
        int n = this.dUG().stream().filter(ffV2 -> cvu_1.b(bgt_02, ffV2)).mapToInt(ffV::bfd).sum();
        if (n == 0) {
            return aum_0.cWf().c("inventory.transfer.items.none.selection.popup", new Object[0]);
        }
        return aum_0.cWf().c("inventory.transfer.items.selection.popup", n);
    }

    private void deS() {
        fse_1.gFu().a((aef_2)this, jWQ, jWR);
    }

    public void GG(int n) {
        this.jWX.clear();
        this.jWY.clear();
        this.jWZ.clear();
        this.jWW = n;
        this.deS();
    }

    public void GH(int n) {
        this.jWW = n;
        if (this.jWX.contains(n)) {
            this.dJ(this.jWW, this.jWW);
        } else {
            this.dI(this.jWW, this.jWW);
        }
        this.deS();
    }

    public void GI(int n) {
        this.jWX.clear();
        this.jWY.clear();
        this.jWZ.clear();
        if (this.jWW == null) {
            this.jWW = n;
            this.dI(this.jWW, this.jWW);
        } else {
            this.dI(Math.min(this.jWW, n), Math.max(this.jWW, n));
        }
        this.deS();
    }

    public void dUA() {
        this.jWX.clear();
        this.jWY.clear();
        this.jWZ.clear();
        this.jWW = 0;
        this.dI(0, this.jWV.dTM() - 1);
        this.deS();
    }

    public void dUB() {
        this.jWX.clear();
        this.jWY.clear();
        this.jWZ.clear();
        this.jWW = null;
        this.deS();
    }

    private void dI(int n, int n2) {
        for (int i = n; i <= n2; ++i) {
            this.jWX.add(i);
            int n3 = i;
            this.jWV.GB(i).ifPresent(l -> {
                this.jWY.add(l);
                this.jWZ.add(new bgy_1(l, n3));
            });
        }
    }

    private void dJ(int n, int n2) {
        for (int i = n; i <= n2; ++i) {
            this.jWX.remove(i);
            int n3 = i;
            this.jWV.GB(i).ifPresent(l -> {
                this.jWY.remove(l);
                this.jWZ.remove(new bgy_1(l, n3));
            });
        }
    }

    public void dUC() {
        boolean bl = this.dUD();
        this.jWX.clear();
        this.jWZ.clear();
        for (Long l : this.jWY) {
            this.jWV.lm(l).ifPresent(n -> {
                this.jWX.add(n);
                this.jWZ.add(new bgy_1(l, n));
            });
        }
        if (bl != this.dUD()) {
            fse_1.gFu().a((aef_2)this, jWR);
        }
    }

    public boolean dUD() {
        return !this.jWZ.isEmpty();
    }

    public int dUE() {
        return this.jWZ.size();
    }

    public boolean lo(long l) {
        return this.jWY.contains(l);
    }

    @Nullable
    public bgt_0 dUF() {
        return (bgt_0)fcL.rUh.sw(this.jWV.KU());
    }

    @NotNull
    public @NotNull List<@NotNull ffV> dUG() {
        return this.hF(false);
    }

    @NotNull
    public @NotNull List<@NotNull ffV> hF(boolean bl) {
        ArrayList<ffV> arrayList = new ArrayList<ffV>();
        bgt_0 bgt_02 = this.dUF();
        if (bgt_02 == null) {
            return arrayList;
        }
        for (bgy_1 bgy_12 : this.jWZ) {
            ffV ffV2 = bgt_02.dno().tb(bgy_12.jXa);
            if (ffV2 == null || !bl && bdq_0.dRC().ab(ffV2)) continue;
            arrayList.add(ffV2);
        }
        return arrayList;
    }

    @Override
    public String[] bxk() {
        return jWU;
    }
}

