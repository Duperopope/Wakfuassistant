/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

/*
 * Renamed from awu
 */
class awu_1 {
    private static final Pattern dlG = Pattern.compile(",");
    public static final String dlH = "default";
    private final ArrayList<Mv> dlI = new ArrayList();
    private String awN;
    private int dlJ;
    private int dhZ;
    private int dia;

    awu_1() {
    }

    void cL(String string) {
        this.awN = string;
    }

    void uR(int n) {
        this.dlJ = n;
    }

    void setDeltaX(int n) {
        this.dhZ = n;
    }

    void setDeltaY(int n) {
        this.dia = n;
    }

    void b(CharSequence charSequence) {
        ArrayList<Mv> arrayList = new ArrayList<Mv>();
        if (charSequence != null) {
            for (String string : dlG.split(charSequence)) {
                Mv mv = Mv.f(string, true);
                if (mv == null) continue;
                arrayList.add(mv);
            }
        }
        if (arrayList.isEmpty()) {
            this.bOM();
        } else {
            this.dlI.clear();
            this.dlI.addAll(arrayList);
        }
    }

    private void bOM() {
        this.dlI.clear();
        this.dlI.addAll(Arrays.asList(Mv.values()));
    }

    boolean f(Mv mv) {
        return this.dlI.contains((Object)mv);
    }

    String bpu() {
        return this.awN;
    }

    int bOo() {
        return this.dlJ;
    }

    int getDeltaX() {
        return this.dhZ;
    }

    int getDeltaY() {
        return this.dia;
    }
}

