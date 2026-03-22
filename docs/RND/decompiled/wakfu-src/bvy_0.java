/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bvY
 */
public class bvy_0
implements aeh_2 {
    public static final String jvW = "filteredList";
    public static final String jvX = "hasPreviousPage";
    public static final String jvY = "hasNextPage";
    public static final String jvZ = "currentPageText";
    public static final String jwa = "isOpenedFilter";
    public static final String jwb = "isGuildFilter";
    public static final String[] jwc = new String[]{"filteredList", "hasPreviousPage", "hasNextPage", "currentPageText", "isOpenedFilter", "isGuildFilter"};
    private int jwd;
    private int hQx = 1;
    private String jwe = "";
    private List<bvx_0> jpl;
    private boolean jwf = true;
    private boolean jwg = true;

    @Override
    public String[] bxk() {
        return jwc;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (jvW.equals(string)) {
            return this.jpl;
        }
        if (string.equals(jvX)) {
            return this.hQx > 1;
        }
        if (string.equals(jvY)) {
            return this.hQx < this.jwd;
        }
        if (string.equals(jvZ)) {
            if (this.jpl.isEmpty()) {
                return aum_0.cWf().c("haven.world.no.result", new Object[0]);
            }
            return this.hQx + "/" + this.jwd;
        }
        return null;
    }

    public void R(List<bvx_0> list) {
        this.jpl = new ArrayList<bvx_0>(list);
        fse_1.gFu().a((aef_2)this, jvX, jvY, jvW, jvZ);
    }

    public void mB(String string) {
        this.jwe = string;
        this.hQx = 1;
        this.dLk();
    }

    @Nullable
    public bvx_0 dLe() {
        return this.jpl == null || this.jpl.isEmpty() ? null : this.jpl.get(0);
    }

    public void dxn() {
        this.hQx = 1;
        this.dLk();
    }

    public void dxo() {
        if (this.hQx <= 1) {
            return;
        }
        --this.hQx;
        this.dLk();
    }

    public void dxp() {
        if (this.hQx > this.jwd) {
            return;
        }
        ++this.hQx;
        this.dLk();
    }

    public void dxq() {
        this.hQx = this.jwd;
        this.dLk();
    }

    public void FS(int n) {
        this.jwd = n;
        fse_1.gFu().a((aef_2)this, jvX, jvY, jvW, jvZ);
    }

    public int dfz() {
        return this.hQx;
    }

    public String dLf() {
        return this.jwe;
    }

    public void dLg() {
        this.jwf = !this.jwf;
        fse_1.gFu().a((aef_2)this, jwa);
    }

    public boolean dLh() {
        return this.jwf;
    }

    public void dLi() {
        this.jwg = !this.jwg;
        fse_1.gFu().a((aef_2)this, jwb);
    }

    public boolean dLj() {
        return this.jwg;
    }

    private void dLk() {
        aue_0.cVJ().etu().d(new cxc_0(this.jwe, this.hQx, this.jwf, this.jwg));
    }
}

