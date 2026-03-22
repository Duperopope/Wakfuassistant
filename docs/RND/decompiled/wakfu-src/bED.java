/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class bED
implements aeh_2 {
    public static final String jPm = "quantity";
    public static final String jPn = "enabled";
    public static final String jPo = "selected";
    private final fnm jPp;
    public static final String[] jPq = new String[]{"quantity"};
    private final boolean jPr;
    private boolean bWn;

    public bED(fnm fnm2, boolean bl, boolean bl2) {
        this.jPp = fnm2;
        this.jPr = bl;
        this.bWn = bl2;
    }

    public static Object[] dSw() {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (fnm fnm2 : fnm.values()) {
            arrayList.add(bED.b(fnm2));
        }
        return arrayList.toArray();
    }

    public static String b(fnm fnm2) {
        return "x" + fnm2.sID;
    }

    public fnm dSx() {
        return this.jPp;
    }

    public short bfd() {
        return this.jPp.sID;
    }

    public void setSelected(boolean bl) {
        this.bWn = bl;
    }

    public String toString() {
        return "x" + this.bfd();
    }

    @Override
    public String[] bxk() {
        return jPq;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(jPm)) {
            return this.jPp.sID;
        }
        if (string.equals(jPn)) {
            return this.jPr;
        }
        if (string.equals(jPo)) {
            return this.bWn;
        }
        return null;
    }
}

