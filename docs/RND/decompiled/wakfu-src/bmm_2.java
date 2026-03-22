/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bmM
 */
public class bmm_2
implements aeh_2 {
    public static final String iEo = "zones";
    public static final String iEp = "isExpanded";
    public static final String iEq = "isMouseOver";
    public static final String iEr = "name";
    private final String iEs;
    private final ArrayList<bml_2> iEt = new ArrayList();
    private boolean iEe = true;
    private boolean iEf;

    public bmm_2(String string) {
        this.iEs = string;
    }

    @Override
    public String[] bxk() {
        return new String[0];
    }

    @Override
    public Object eu(String string) {
        if (string.equals(iEo)) {
            return this.iEt;
        }
        if (string.equals(iEp)) {
            return this.iEe;
        }
        if (string.equals(iEq)) {
            return this.iEf;
        }
        if (string.equals(iEr)) {
            return this.iEs;
        }
        return null;
    }

    public boolean dxl() {
        return this.iEe;
    }

    public boolean dxm() {
        return this.iEf;
    }

    public void gB(boolean bl) {
        this.iEe = bl;
    }

    public void gC(boolean bl) {
        this.iEf = bl;
        fse_1.gFu().a((aef_2)this, iEq);
    }

    public ArrayList<bml_2> dxr() {
        return this.iEt;
    }

    public void b(bml_2 bml_22) {
        this.iEt.add(bml_22);
    }

    public String getName() {
        return this.iEs;
    }

    public void dxs() {
        this.iEt.sort(new bmn_2(this));
    }
}

