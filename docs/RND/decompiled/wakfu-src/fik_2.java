/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fIK
 */
public class fik_2 {
    private String cHc;
    @NotNull
    private fin_2 uBV = fin_2.uCC;
    private int eoY = 0;
    @NotNull
    private String aCL = "";
    @Nullable
    private String crF = null;
    private boolean uBW = false;
    private boolean uBX = true;
    private boolean uBY = false;
    private boolean uBZ = false;
    private boolean uCa = false;
    @Nullable
    private fis_2 uCb = null;
    private final List<fil_2> uCc = new ArrayList<fil_2>();
    @Nullable
    private fio_2 uCd = null;
    private final HashSet<fip_2> uCe = new HashSet();

    public static fik_2 gBY() {
        return fik_2.a(null, null);
    }

    public static fik_2 a(@Nullable fim_2 fim_22) {
        return fik_2.a(fim_22, null);
    }

    public static fik_2 a(@Nullable fim_2 fim_22, @Nullable fim_2 fim_23) {
        fil_2 fil_22 = fil_2.gCm();
        if (fim_22 != null) {
            fil_22.c(fim_22);
        }
        fil_2 fil_23 = fil_2.gCo();
        if (fim_23 != null) {
            fil_23.c(fim_23);
        }
        return new fik_2().a(fil_23).a(fil_22);
    }

    public static fik_2 gBZ() {
        return new fik_2().a(fil_2.gCp());
    }

    public static fik_2 gCa() {
        return fik_2.b(null, null);
    }

    public static fik_2 b(@Nullable fim_2 fim_22) {
        return fik_2.b(fim_22, null);
    }

    public static fik_2 b(@Nullable fim_2 fim_22, @Nullable fim_2 fim_23) {
        fil_2 fil_22 = fil_2.gCp();
        if (fim_22 != null) {
            fil_22.c(fim_22);
        }
        fil_2 fil_23 = fil_2.gCq();
        if (fim_23 != null) {
            fil_23.c(fim_23);
        }
        return new fik_2().a(fil_23).a(fil_22);
    }

    public boolean gCb() {
        if (this.uBZ) {
            return false;
        }
        return this.uCc.size() < 2;
    }

    private boolean gCc() {
        return this.uCc.size() <= 2;
    }

    void setId(String string) {
        this.cHc = string;
    }

    public fik_2 a(@NotNull fin_2 fin_22) {
        this.uBV = fin_22;
        return this;
    }

    public fik_2 abQ(int n) {
        this.eoY = n;
        return this;
    }

    public fik_2 vE(@Nullable String string) {
        this.aCL = string == null ? "" : string;
        return this;
    }

    public fik_2 l(@NotNull String string, Object ... objectArray) {
        this.aCL = fyw_0.gqw().k(string, objectArray);
        return this;
    }

    public void vF(@Nullable String string) {
        this.aCL = string == null ? "" : string;
        for (fip_2 fip_22 : this.uCe) {
            fip_22.onMessageBoxTextChanged();
        }
    }

    public fik_2 vG(@Nullable String string) {
        this.crF = string;
        return this;
    }

    public fik_2 pa(boolean bl) {
        this.uBW = bl;
        return this;
    }

    public fik_2 pb(boolean bl) {
        this.uBX = bl && this.gCc();
        return this;
    }

    public fik_2 pc(boolean bl) {
        this.uBY = bl;
        return this;
    }

    public fik_2 pd(boolean bl) {
        this.uBZ = bl;
        return this;
    }

    public fik_2 pe(boolean bl) {
        this.uCa = bl;
        return this;
    }

    public fik_2 a(@Nullable fis_2 fis_22) {
        this.uCb = fis_22;
        return this;
    }

    public fik_2 a(@NotNull fil_2 fil_22) {
        this.uCc.add(fil_22);
        if (!this.gCc()) {
            this.uBX = false;
        }
        return this;
    }

    public fik_2 a(@Nullable fio_2 fio_22) {
        this.uCd = fio_22;
        return this;
    }

    public void a(@NotNull fip_2 fip_22) {
        this.uCe.add(fip_22);
    }

    public String getId() {
        return this.cHc;
    }

    @NotNull
    public fin_2 gCd() {
        return this.uBV;
    }

    public int tL() {
        return this.eoY;
    }

    @NotNull
    public String getMessage() {
        return this.aCL;
    }

    @Nullable
    public String byf() {
        return this.crF;
    }

    public boolean gCe() {
        return this.uBW;
    }

    public boolean isHorizontal() {
        return this.uBX;
    }

    public boolean gCf() {
        return this.uBY;
    }

    public boolean gCg() {
        return this.uBZ;
    }

    public boolean gCh() {
        return this.uCa;
    }

    @Nullable
    public fis_2 gCi() {
        return this.uCb;
    }

    public List<fil_2> gCj() {
        return this.uCc;
    }

    @Nullable
    public fio_2 gCk() {
        return this.uCd;
    }

    public HashSet<fip_2> gCl() {
        return this.uCe;
    }
}

