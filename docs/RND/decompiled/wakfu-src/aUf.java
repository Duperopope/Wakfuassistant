/*
 * Decompiled with CFR 0.152.
 */
import java.util.regex.Pattern;

public abstract class aUf {
    private static final String gwR = "(?:\\s+.*|$)";
    private static final String gwS = "\\s+";
    private String p = "";
    private final Pattern gwT;
    private final Pattern gwU;
    private byte cjU = (byte)-128;
    private boolean gwV;

    public aUf(String string, String string2, boolean bl) {
        Object object = "";
        if (string != null && string.length() != 0 && !string.endsWith(gwR)) {
            object = string + gwR;
        }
        this.gwT = Pattern.compile((String)object);
        String string3 = "(" + string + ")";
        if (string2 != null && string2.length() != 0 && !string2.startsWith(string3 + gwS)) {
            string3 = string3 + gwS + string2;
        }
        if (bl) {
            string3 = string3 + "|(" + string + ")";
        }
        this.gwU = Pattern.compile(string3);
    }

    public void setName(String string) {
        this.p = string;
    }

    public String getName() {
        return this.p;
    }

    public byte cUo() {
        return this.cjU;
    }

    public void aV(byte by) {
        this.cjU = by;
    }

    public Pattern cUp() {
        return this.gwT;
    }

    public Pattern cUq() {
        return this.gwU;
    }

    public boolean cUr() {
        return this.gwV;
    }

    public void eS(boolean bl) {
        this.gwV = bl;
    }

    public abstract aQm cUi();
}

