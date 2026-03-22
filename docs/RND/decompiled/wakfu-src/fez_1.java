/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;

/*
 * Renamed from fEZ
 */
public class fez_1
extends fey_1<String, ffc_2> {
    private boolean uor = false;
    private Map<ffc_2, String> uos = new HashMap<ffc_2, String>();

    public boolean a(ffc_2 ffc_22) {
        if (this.uot == null || ((String)this.uot).isEmpty()) {
            return true;
        }
        if (ffc_22 == null) {
            return true;
        }
        return this.b(ffc_22).contains(BH.bd((String)this.uot));
    }

    private String b(ffc_2 ffc_22) {
        if (!this.uor) {
            return fez_1.c(ffc_22);
        }
        if (this.uos.containsKey(ffc_22)) {
            return this.uos.get(ffc_22);
        }
        String string = fez_1.c(ffc_22);
        this.uos.put(ffc_22, string);
        return string;
    }

    private static String c(ffc_2 ffc_22) {
        return ffc_22.cUH() ? ffc_22.cUG() : BH.bd(ffc_22.cUG());
    }

    @Override
    public void jR(boolean bl) {
        this.uor = bl;
    }

    @Override
    public void brX() {
        this.uos.clear();
    }

    @Override
    public /* synthetic */ boolean aG(Object object) {
        return this.a((ffc_2)object);
    }
}

