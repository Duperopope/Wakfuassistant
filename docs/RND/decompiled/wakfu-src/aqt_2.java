/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;

/*
 * Renamed from aqT
 */
public class aqt_2
implements apd_1 {
    public static final String cRr = "#text";
    public static final String cRs = "#cdata-section";
    public static final String cRt = "#comment";
    private String p;
    private String axs;
    private final ArrayList<aqu_2> cRu = new ArrayList();
    private final ArrayList<aqt_2> cRv = new ArrayList();

    public aqt_2(String string, String string2) {
        this.p = string != null ? string.intern() : null;
        this.axs = string2 != null ? string2.intern() : null;
    }

    @Override
    public String getName() {
        return this.p;
    }

    @Override
    public void setName(String string) {
        this.p = string != null ? string.intern() : null;
    }

    @Override
    public int d() {
        return 0;
    }

    @Override
    public void lK(int n) {
    }

    @Override
    public String bCt() {
        return this.axs;
    }

    @Override
    public boolean bCu() {
        return Boolean.parseBoolean(this.axs);
    }

    @Override
    public byte bCn() {
        return Byte.parseByte(this.axs);
    }

    @Override
    public short bCq() {
        return Short.parseShort(this.axs);
    }

    @Override
    public int bCo() {
        return Integer.parseInt(this.axs);
    }

    @Override
    public long bCp() {
        return Long.parseLong(this.axs);
    }

    @Override
    public float bCs() {
        return Float.parseFloat(this.axs);
    }

    @Override
    public double bCr() {
        return Double.parseDouble(this.axs);
    }

    @Override
    public void fa(String string) {
        this.axs = string != null ? string.intern() : null;
    }

    @Override
    public void cC(boolean bl) {
        this.axs = bl ? "true" : "false";
    }

    @Override
    public void ay(byte by) {
        this.axs = ("" + by).intern();
    }

    @Override
    public void sY(int n) {
        this.axs = ("" + n).intern();
    }

    @Override
    public void gj(long l) {
        this.axs = ("" + l).intern();
    }

    @Override
    public void cL(float f2) {
        this.axs = ("" + f2).intern();
    }

    @Override
    public void B(double d2) {
        this.axs = ("" + d2).intern();
    }

    @Override
    public apd_1 fq(String string) {
        if (this.cRu != null) {
            int n = this.cRu.size();
            for (int i = 0; i < n; ++i) {
                aqu_2 aqu_22 = this.cRu.get(i);
                if (!aqu_22.getName().equalsIgnoreCase(string)) continue;
                return aqu_22;
            }
        }
        return null;
    }

    @Override
    public boolean fr(String string) {
        if (this.cRu != null) {
            int n = this.cRu.size();
            for (int i = 0; i < n; ++i) {
                aqu_2 aqu_22 = this.cRu.get(i);
                if (!aqu_22.getName().equalsIgnoreCase(string)) continue;
                return true;
            }
        }
        return false;
    }

    @Override
    public void c(apd_1 apd_12) {
        if (!this.cRu.contains(apd_12)) {
            this.cRu.add((aqu_2)apd_12);
        }
    }

    public void n(ArrayList<? extends apd_1> arrayList) {
        for (apd_1 apd_12 : arrayList) {
            this.c(apd_12);
        }
    }

    @Override
    public void d(apd_1 apd_12) {
        this.cRu.remove(apd_12);
    }

    @Override
    public <T extends apd_1> ArrayList<T> bEN() {
        return this.cRu;
    }

    @Override
    public apd_1 fn(String string) {
        if (this.p.equalsIgnoreCase(string)) {
            return this;
        }
        for (apd_1 apd_12 : this.cRv) {
            apd_1 apd_13 = apd_12.fn(string);
            if (apd_13 == null) continue;
            return apd_13;
        }
        return null;
    }

    @Override
    public ArrayList<apd_1> fo(String string) {
        ArrayList<apd_1> arrayList = new ArrayList<apd_1>();
        if (this.p.equalsIgnoreCase(string)) {
            arrayList.add(this);
        } else {
            for (apd_1 apd_12 : this.cRv) {
                ArrayList<apd_1> arrayList2 = apd_12.fo(string);
                if (arrayList2 == null) continue;
                arrayList.addAll(arrayList2);
            }
        }
        return arrayList.isEmpty() ? null : arrayList;
    }

    @Override
    public ArrayList<apd_1> fp(String string) {
        ArrayList<apd_1> arrayList = new ArrayList<apd_1>();
        for (apd_1 apd_12 : this.cRv) {
            if (!apd_12.getName().equalsIgnoreCase(string)) continue;
            arrayList.add(apd_12);
        }
        return arrayList.isEmpty() ? null : arrayList;
    }

    @Override
    public void a(apd_1 apd_12) {
        if (!this.cRv.contains(apd_12)) {
            this.cRv.add((aqt_2)apd_12);
        }
    }

    @Override
    public void b(apd_1 apd_12) {
        this.cRv.remove(apd_12);
    }

    @Override
    public ArrayList<? extends apd_1> getChildren() {
        return this.cRv;
    }

    public String toString() {
        if (this.cRu == null) {
            return this.p + " " + this.axs;
        }
        return this.p + " " + this.axs + " (" + this.cRu.stream().filter(Objects::nonNull).map(Object::toString).collect(Collectors.joining(", ")) + ")";
    }
}

