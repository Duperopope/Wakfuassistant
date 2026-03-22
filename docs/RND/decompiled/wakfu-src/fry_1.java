/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.Optional;

/*
 * Renamed from fRY
 */
public class fry_1
extends fha_2 {
    public static final String TAG = "RadioGroup";
    private ArrayList<fcu_1> vcf = new ArrayList();
    private String axs;
    public static final int vcg = 111972721;

    @Override
    public String getTag() {
        return TAG;
    }

    public String getValue() {
        return this.axs;
    }

    public Optional<String> getValueOfSelectedButton() {
        for (fcu_1 fcu_12 : this.vcf) {
            if (!fcu_12.getSelected()) continue;
            return Optional.ofNullable(fcu_12.getValue());
        }
        return Optional.empty();
    }

    public void setValue(String string) {
        this.axs = string;
        for (fcu_1 fcu_12 : this.vcf) {
            if (fcu_12.getValue() == null || !fcu_12.getValue().equalsIgnoreCase(string)) continue;
            fcu_12.setSelected(true);
            break;
        }
    }

    public void ad(TObjectProcedure<fcu_1> tObjectProcedure) {
        int n = this.vcf.size();
        for (int i = 0; i < n; ++i) {
            if (tObjectProcedure.execute((Object)this.vcf.get(i))) continue;
            return;
        }
    }

    public void gFq() {
        for (fcu_1 fcu_12 : this.vcf) {
            fcu_12.gtM();
        }
    }

    public void j(fcu_1 fcu_12) {
        if (!this.vcf.contains(fcu_12)) {
            this.vcf.add(fcu_12);
        }
    }

    public void k(fcu_1 fcu_12) {
        this.vcf.remove(fcu_12);
    }

    public void setRadioButtonList(ArrayList<fcu_1> arrayList) {
        this.vcf = arrayList;
    }

    @Override
    public void setElementMap(fhs_2 fhs_22) {
        super.setElementMap(fhs_22);
        if (this.cHc != null) {
            this.nQt.a(this.cHc, this);
        }
    }

    @Override
    public void setId(String string) {
        if (this.nQt != null && this.nQt.uN(this.cHc)) {
            this.nQt.uO(this.cHc);
        }
        super.setId(string);
        if (this.nQt != null) {
            this.nQt.a(this.cHc, this);
        }
    }

    @Override
    public void aVH() {
        super.aVH();
        this.vcf.clear();
    }

    @Override
    public void a(fhi_2 fhi_22) {
        fry_1 fry_12 = (fry_1)fhi_22;
        super.a(fry_12);
        fry_12.axs = this.axs;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == 111972721) {
            this.setValue(fic_12.a(string, this.nQt));
            return true;
        }
        return super.setXMLAttribute(n, string, fic_12);
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 111972721) {
            this.setValue(String.valueOf(object));
            return true;
        }
        return super.setPropertyAttribute(n, object);
    }
}

