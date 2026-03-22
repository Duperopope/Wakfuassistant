/*
 * Decompiled with CFR 0.152.
 */
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/*
 * Renamed from fTM
 */
public class ftm_2 {
    private final PrintWriter vhc;
    private final String vhd;
    private final String vhe;
    private final List<String> vhf = new ArrayList<String>();

    public ftm_2(PrintWriter printWriter, String string, String string2) {
        this.vhc = printWriter;
        this.vhd = string;
        this.vhe = string2;
    }

    public void wv(String string) {
        this.vhf.add(string);
    }

    public void gHh() {
        if (this.vhe != null) {
            this.vhc.println("package " + this.vhe + ";");
        }
        this.vhc.println();
        this.vhc.println("import " + Optional.class.getCanonicalName() + ";");
        this.vhc.println("import " + fhz_1.class.getCanonicalName() + ";");
        this.vhc.println();
        this.vhc.println("public enum " + this.vhd + " implements " + fhz_1.class.getSimpleName() + " {");
        this.vhc.println();
        for (String string : this.vhf) {
            this.vhc.println("\t" + string.toUpperCase() + "(\"" + string + "\"),");
        }
        this.vhc.println("\t// End colors");
        this.vhc.println("\t;");
        this.vhc.println();
        this.vhc.println("\tprivate String m_name;");
        this.vhc.println();
        this.vhc.println("\t" + this.vhd + "(final String name) {");
        this.vhc.println("\t\tm_name = name;");
        this.vhc.println("\t}");
        this.vhc.println();
        this.vhc.println("\t@Override");
        this.vhc.println("\tpublic String getName() {");
        this.vhc.println("\t\treturn m_name;");
        this.vhc.println("\t}");
        this.vhc.println();
        this.vhc.println("\tpublic static Optional<" + this.vhd + "> fromName(final String name) {");
        this.vhc.println("\t\tfor (final " + this.vhd + " value : values()) {");
        this.vhc.println("\t\t\tif(value.m_name.equals(name)) return Optional.of(value);");
        this.vhc.println("\t\t}");
        this.vhc.println("\t\treturn Optional.empty();");
        this.vhc.println("\t}");
        this.vhc.println("}");
        this.vhc.flush();
    }
}

