/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.Stack;

/*
 * Renamed from fIx
 */
public class fix_2
extends fha_2 {
    public static final String TAG = "Form";
    private final HashMap<String, fsf_1> uBC = new HashMap();
    private fiy_2 uBD = null;
    public static final int uBE = -1421272810;

    @Override
    public void b(fsf_1 fsf_12) {
        this.a(fsf_12.getName(), fsf_12);
    }

    public void a(String string, fsf_1 fsf_12) {
        this.uBC.put(string, fsf_12);
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public fsf_1 getProperty(String string) {
        return this.uBC.get(string);
    }

    public Collection<fsf_1> getProperties() {
        return this.uBC.values();
    }

    public Set<String> getPropertyNames() {
        return this.uBC.keySet();
    }

    public void gBS() {
        for (fsf_1 fsf_12 : this.uBC.values()) {
            fsf_12.gFC();
        }
    }

    @Override
    public boolean isValid() {
        if (this.uBD != null) {
            Object object = this.uBD.gBz();
            return object != null && object instanceof Boolean && (Boolean)object != false;
        }
        return true;
    }

    public void setValidate(fiy_2 fiy_22) {
        this.uBD = fiy_22;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Form : ");
        for (fsf_1 fsf_12 : this.uBC.values()) {
            stringBuilder.append("\n\t").append(fsf_12.toString());
        }
        return stringBuilder.toString();
    }

    @Override
    public void aVH() {
        this.nQt.gqC().f(this);
        super.aVH();
    }

    @Override
    public void a(fhi_2 fhi_22) {
        fix_2 fix_22 = (fix_2)fhi_22;
        super.a(fix_22);
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n != -1421272810) {
            return super.setXMLAttribute(n, string, fic_12);
        }
        this.setValidate(fic_12.b(fiy_2.class, string));
        return true;
    }

    @Override
    public void a(apd_1 apd_12, fhv_1 fhv_12, Stack<fhs_2> stack, fhu_1 fhu_12) {
        super.a(apd_12, fhv_12, stack, fhu_12);
        String string = null;
        apd_1 apd_13 = apd_12.fq("id");
        if (apd_13 != null) {
            string = apd_13.bCt();
        } else {
            uxJ.warn((Object)"Attention : l'id du formulaire est nulle.");
        }
        fhu_12.a(stack.peek().getId() + "." + string, this);
    }

    @Override
    public void f(apd_1 apd_12, fhv_1 fhv_12, Stack<fhs_2> stack, fhu_1 fhu_12) {
        super.f(apd_12, fhv_12, stack, fhu_12);
        fhu_12.uT(stack.peek().getId() + "." + apd_12.fq("id").bCt());
    }
}

