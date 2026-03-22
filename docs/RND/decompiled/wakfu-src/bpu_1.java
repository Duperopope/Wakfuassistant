/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.procedure.TObjectProcedure;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bPu
 */
public abstract class bpu_1<Id>
implements aeh_2,
aen_2 {
    public static final String kQi = "name";
    public static final String kQj = "description";
    public static final String kQk = "iconUrl";
    public static final String kQl = "depthMargin";
    public static final String kQm = "displayMode";
    public static final String kQn = "children";
    private final Id kQo;
    private final String kQp;
    private final String kQq;
    private final String kQr;
    private final bpv_2 kQs;
    private final String kQt;
    private int cKh;
    private aem_2 kQe;
    private bpu_1<?> kQu;
    private final List<bpu_1<?>> kQv = new ArrayList();

    protected bpu_1(Id Id, String string, String string2, String string3, bpv_2 bpv_22, String string4) {
        this.kQo = Id;
        this.kQp = string;
        this.kQq = string2;
        this.kQr = string3;
        this.kQs = bpv_22;
        this.kQt = string4;
        this.eio();
    }

    public Id eid() {
        return this.kQo;
    }

    public String getName() {
        return this.kQp;
    }

    public String getDescription() {
        return this.kQq;
    }

    public void b(bpu_1<?> bpu_12) {
        this.kQv.add(bpu_12);
        bpu_12.c(this);
    }

    public void c(bpu_1<?> bpu_12) {
        this.kQu = bpu_12;
        this.cKh = bpu_12.cKh + 1;
    }

    public bpu_1<?> eiw() {
        return this.kQu;
    }

    public String getKey() {
        return this.kQt;
    }

    @Override
    public String[] bxk() {
        return dGM;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(kQi)) {
            return this.kQp;
        }
        if (string.equals(kQj)) {
            return this.kQq;
        }
        if (string.equals(kQk)) {
            return this.kQe == null ? null : this.kQe.bZo();
        }
        if (string.equals(kQl)) {
            int n = this.cKh * 10;
            return "0,0," + n + ", 0";
        }
        if (string.equals(kQm)) {
            return this.kQs.aFW();
        }
        if (string.equals(kQn)) {
            return this.kQv;
        }
        return null;
    }

    private void eio() {
        if (this.kQr != null) {
            File file = bpn_2.nr(this.kQr);
            String string = bpn_2.i(file);
            this.kQe = new aem_2(null, string, kQk, this);
            bpm_2.kSN.a(this.kQr, this.kQe);
        }
    }

    @Override
    public void F(String string, String string2) {
        fse_1.gFu().a((aef_2)this, string);
    }

    public boolean w(TObjectProcedure<bpu_1<?>> tObjectProcedure) {
        if (!tObjectProcedure.execute((Object)this)) {
            return false;
        }
        int n = this.kQv.size();
        for (int i = 0; i < n; ++i) {
            bpu_1<?> bpu_12 = this.kQv.get(i);
            if (bpu_12.w(tObjectProcedure)) continue;
            return false;
        }
        return true;
    }

    public String toString() {
        return "Category{m_depth=" + this.cKh + ", m_imageUrl='" + this.kQr + "', m_description='" + this.kQq + "', m_name='" + this.kQp + "', m_id=" + String.valueOf(this.kQo) + "}";
    }
}

