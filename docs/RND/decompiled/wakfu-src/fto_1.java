/*
 * Decompiled with CFR 0.152.
 */
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.stream.Stream;

/*
 * Renamed from fTO
 */
public class fto_1
extends ftz_2<ftp_2> {
    private int cKh = 0;

    public fto_1(PrintWriter printWriter, String string, String string2) {
        super(printWriter, string, string2);
        this.E(fhg_2.class);
        this.E(fhh_2.class);
        this.E(HashMap.class);
        this.E(Stream.class);
        this.vgu = new ftp_2("init", null);
        this.vgt.add((ftp_2)this.vgu);
    }

    @Override
    public void a(ftb_2 ftb_22) {
        if (((ftp_2)this.vgu).isFull()) {
            this.gHv();
            ++this.cKh;
        }
        super.a(ftb_22);
    }

    public void gHv() {
        this.a(new ftp_2("init" + this.laa++, (ftp_2)this.vgu));
    }

    @Override
    public void gHf() {
        ftd_2 ftd_22 = new ftd_2(null, ((ftp_2)this.vgu).aLO(), null, new String[0]);
        super.gHf();
        ((ftp_2)this.vgu).a(ftd_22);
    }

    @Override
    public void gHh() {
        for (int i = this.cKh - 1; i >= 0; --i) {
            this.gHf();
        }
        for (Object object : this.vgt) {
            for (ftb_2 ftb_22 : ((fta_1)object).gHk()) {
                Class<?> clazz = ftb_22.gBQ();
                if (clazz == null) continue;
                this.E(clazz);
            }
        }
        if (this.vgr != null) {
            this.vgv.println("package " + this.vgr + ";");
        }
        this.vgv.println();
        for (Object object : this.vgs) {
            this.vgv.println("import " + ((Class)object).getCanonicalName() + ";");
        }
        this.vgv.println();
        this.vgv.println("public class " + this.vgq + " implements StyleProvider {");
        this.vgv.println();
        this.vgv.println("\tprivate HashMap<String, StyleSetter> m_setters = new HashMap<String, StyleSetter>();");
        this.vgv.println("\tpublic " + this.vgq + "() {");
        this.vgv.println("\t\tinit();");
        this.vgv.println("\t}");
        this.vgv.println("\tpublic StyleSetter getStyleSetter(String style) {");
        this.vgv.println("\t\treturn m_setters.get(style);");
        this.vgv.println("\t}");
        this.vgv.println();
        this.vgv.println("\tpublic Stream<String> getWidgetStyleList(final String widgetName) {");
        this.vgv.println("\t\treturn m_setters.keySet()");
        this.vgv.println("\t\t\t\t.stream()");
        this.vgv.println("\t\t\t\t.filter(s -> s.startsWith(widgetName.toUpperCase()))");
        this.vgv.println("\t\t\t\t.filter(s -> !s.contains(\"$\"))");
        this.vgv.println("\t\t\t\t.map(s -> s.substring(widgetName.length()));");
        this.vgv.println("\t}");
        this.vgv.println();
        for (Object object : this.vgt) {
            ((ftp_2)object).a(this.vgv);
            this.vgv.println();
        }
        this.vgv.println("}");
        this.vgv.flush();
    }
}

