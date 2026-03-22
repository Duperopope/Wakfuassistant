/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;

public class Pw {
    private final String beh;
    private final String[] bei;

    public Pw(String string, String[] stringArray) {
        this.beh = string;
        this.bei = this.j(stringArray);
    }

    private String[] j(String[] stringArray) {
        if (stringArray == null) {
            return Pv.bed;
        }
        int n = stringArray.length;
        ArrayList<String> arrayList = new ArrayList<String>(n);
        for (int i = 0; i < n; ++i) {
            for (String string : ary_2.fT(stringArray[i])) {
                if (arrayList.contains(string)) continue;
                arrayList.add(string);
            }
        }
        return arrayList.toArray(new String[arrayList.size()]);
    }

    public String aXP() {
        return this.beh;
    }

    public String[] aXX() {
        return this.bei;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        Pw pw = (Pw)object;
        if (!this.beh.equals(pw.beh)) {
            return false;
        }
        return Arrays.equals(this.bei, pw.bei);
    }

    public int hashCode() {
        int n = this.beh.hashCode();
        n = 31 * n + Arrays.hashCode(this.bei);
        return n;
    }
}

