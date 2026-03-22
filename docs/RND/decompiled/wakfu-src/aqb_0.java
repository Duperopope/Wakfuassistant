/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

/*
 * Renamed from aQb
 */
public class aqb_0 {
    private final HashMap<String, apz_0> eBu = new HashMap();

    public HashMap<String, apz_0> cBu() {
        return this.eBu;
    }

    public void b(apz_0 apz_02) {
        this.eBu.put(apz_02.getName(), apz_02);
    }

    public void aK(Iterable<apz_0> iterable) {
        for (apz_0 apz_02 : iterable) {
            this.b(apz_02);
        }
    }

    public boolean c(apz_0 apz_02) {
        return this.eBu.remove(apz_02.getName()) != null;
    }

    public boolean jw(String string) {
        if (this.eBu.containsKey(string)) {
            this.eBu.remove(string);
            return true;
        }
        return false;
    }

    public apz_0 jx(String string) {
        return this.eBu.get(string);
    }

    public String cBv() {
        StringBuilder stringBuilder = new StringBuilder();
        for (apz_0 apz_02 : this.cBu().values()) {
            stringBuilder.append(" +").append(apz_02.getName()).append(" (");
            if (apz_02.cBt()) {
                stringBuilder.append("onLine");
            } else {
                stringBuilder.append("offLine");
            }
            stringBuilder.append(")\n");
        }
        return stringBuilder.toString();
    }

    public boolean hC(String string) {
        return this.eBu.containsKey(string);
    }
}

