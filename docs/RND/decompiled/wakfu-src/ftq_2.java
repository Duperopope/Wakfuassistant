/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from fTQ
 */
public class ftq_2
implements ftw_1 {
    private static final Logger vhi = Logger.getLogger(ftq_2.class);
    private int bap;
    private int baq;
    private fzo_0 uwG;
    private int bSr;
    private ArrayList<String> oBz;
    private boolean bXs = false;

    public ftq_2(apd_1 apd_12) {
        if (!apd_12.getName().equalsIgnoreCase("animatedCursor")) {
            return;
        }
        try {
            apd_1 apd_13 = apd_12.fq("x");
            apd_1 apd_14 = apd_12.fq("y");
            apd_1 apd_15 = apd_12.fq("delay");
            apd_1 apd_16 = apd_12.fq("type");
            this.bap = apd_13 == null ? 0 : apd_13.bCo();
            this.baq = apd_14 == null ? 0 : apd_14.bCo();
            this.bSr = apd_15 == null ? 500 : apd_15.bCo();
            this.uwG = apd_16 == null ? fzo_0.tHq : fzo_0.valueOf(apd_16.bCt().toUpperCase());
            ArrayList<apd_1> arrayList = apd_12.fo("cursorFrame");
            this.oBz = new ArrayList(arrayList.size());
            int n = arrayList.size();
            for (int i = 0; i < n; ++i) {
                apd_1 apd_17 = arrayList.get(i);
                apd_1 apd_18 = apd_17.fq("path");
                this.oBz.add(apd_18.bCt());
            }
            this.bXs = true;
        }
        catch (Exception exception) {
            vhi.warn((Object)"Probl\u00e8me \u00e0 la lecture d'un AnimatedCursor");
        }
    }

    public ftq_2(int n, int n2, fzo_0 fzo_02, int n3, int n4, ArrayList<String> arrayList) {
        this.bap = n;
        this.baq = n2;
        this.uwG = fzo_02;
        this.bSr = n3;
        this.oBz = arrayList;
    }

    @Override
    public void k(fhq_2 fhq_22) {
        if (this.bXs) {
            fhq_22.b(this.uwG, this.bap, this.baq, this.bSr, this.oBz);
        }
    }

    public String a(ftf_2 ftf_22) {
        if (!this.bXs) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        String string = ftf_22.gHa();
        stringBuilder.append(new fte_2(ArrayList.class, string, "new ArrayList<String>()").a(ftf_22));
        stringBuilder.append("\n");
        int n = this.oBz.size();
        for (int i = 0; i < n; ++i) {
            stringBuilder.append(new ftd_2(null, "add", string, "\"" + this.oBz.get(i) + "\"").a(ftf_22)).append("\n");
        }
        stringBuilder.append("\n");
        stringBuilder.append("InitLoaderManager.getInstance().addLoader(new AnimatedCursorInitLoader(").append(this.bap).append(", ").append(this.baq).append(", ").append("CursorFactory.CursorType.").append(this.uwG.name()).append(", ").append(this.bSr).append(", ").append(string).append("));");
        return stringBuilder.toString();
    }

    @Override
    public void a(ftj_1 ftj_12) {
        if (!this.bXs) {
            return;
        }
        ftj_12.E(ArrayList.class);
        ftj_12.E(fzo_0.class);
        String string = ftj_12.gHu();
        String string2 = ftj_12.gHa();
        ftj_12.a(new fte_2(ArrayList.class, string2, "new ArrayList<String>()"));
        int n = this.oBz.size();
        for (int i = 0; i < n; ++i) {
            ftj_12.a(new ftd_2(null, "add", string2, "\"" + this.oBz.get(i) + "\""));
        }
        ftj_12.a(new ftd_2(null, "loadAnimatedCursor", string, fzo_0.class.getSimpleName() + "." + this.uwG.name(), String.valueOf(this.bap), String.valueOf(this.baq), String.valueOf(this.bSr), string2));
    }

    @Override
    public boolean isInitialized() {
        return this.bXs;
    }
}

