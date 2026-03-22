/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.common.collect.ImmutableSet
 *  org.jetbrains.annotations.NotNull
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableSet;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.stream.Stream;
import javax.imageio.ImageIO;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Renamed from fHq
 */
public class fhq_2 {
    private static final Logger uwN = LoggerFactory.getLogger(fhq_2.class);
    public static final Logger uwO = LoggerFactory.getLogger((String)"theme");
    private static final boolean uwP = false;
    private boolean uwQ = false;
    private HashMap<String, Integer> uwR = null;
    private PrintWriter uwS;
    private ftc_2 uwT = null;
    private fto_1 uwU = null;
    private fhi_1 uwV = null;
    private boolean uwW = false;
    private HashMap<String, ArrayList<Rectangle>> uwX;
    private final HashMap<String, axb_2> uwY = new HashMap();
    private fhg_2 uwZ = null;
    private static final boolean uxa = false;
    private String uxb;
    private String uxc;
    private String uxd;
    private final ArrayList<apd_1> uxe = new ArrayList();
    private final HashMap<String, apd_1> uxf = new HashMap();
    private final HashMap<String, apd_1> uxg = new HashMap();
    private final HashMap<String, awx_1> uxh = new HashMap();
    private final HashMap<String, awj_2> uxi = new HashMap();
    private HashMap<String, List<String>> uxj = new HashMap();
    private final HashMap<String, String> uxk = new HashMap();
    private boolean uxl = false;
    private final List<fhb_2> uxm = new ArrayList<fhb_2>();

    public fhg_2 gAb() {
        return this.uwZ;
    }

    public void a(fhg_2 fhg_22) {
        this.uwZ = fhg_22;
    }

    public fhi_1 gAc() {
        return this.uwV;
    }

    public void a(fhi_1 fhi_12) {
        this.uwV = fhi_12;
    }

    public void oV(boolean bl) {
        this.uwQ = bl;
        this.uwR = this.uwQ ? new HashMap() : null;
    }

    public fhv_1 a(aqs_2 aqs_22, URL uRL, fhu_1 fhu_12, fhs_2 fhs_22, boolean bl, URL uRL2, String string, String string2) {
        Object object;
        fhq_2.a(aqs_22, uRL);
        if (bl) {
            object = null;
            try {
                object = bl_0.a(uRL2, string + ".java");
            }
            catch (MalformedURLException malformedURLException) {
                uwN.error("MalformedURLException during parse", (Throwable)malformedURLException);
            }
            if (object != null) {
                try {
                    this.uwS = new PrintWriter(new OutputStreamWriter((OutputStream)new FileOutputStream(new File(((URL)object).getFile())), Charsets.UTF_8));
                }
                catch (FileNotFoundException fileNotFoundException) {
                    uwN.error("FileNotFoundException during parse", (Throwable)fileNotFoundException);
                }
                this.uwT = new ftc_2(this.uwS, string, string2, aqs_22.bGT());
            }
        }
        Stack<fhs_2> stack = new Stack<fhs_2>();
        stack.push(fhs_22);
        if (bl) {
            object = (fhv_1)this.a(this.uwT.gHm(), this.uwT.gHl(), fhu_12, stack);
            this.uwT.gHh();
            this.uwT = null;
        } else {
            object = (fhv_1)fhq_2.a(aqs_22.bGT(), null, fhu_12, stack);
        }
        return object;
    }

    private static fhi_2 a(apd_1 apd_12, fhv_1 fhv_12, fhu_1 fhu_12, Stack<fhs_2> stack) {
        fhv_1 fhv_13;
        fiw_1<?> fiw_12 = fkc_2.gCQ().vR(apd_12.getName());
        if (fiw_12 == null) {
            uwN.error("Tag Inconnu : " + apd_12.getName());
            return null;
        }
        try {
            fhv_13 = (fhv_1)fiw_12.gBR();
        }
        catch (Exception exception) {
            uwN.error("Erreur lors de l'instanciation du tag " + apd_12.getName() + ".", (Throwable)exception);
            return null;
        }
        fhv_13.a(apd_12, fhv_12, stack, fhu_12);
        fhv_13.p(apd_12);
        fhv_13.d(apd_12, fhv_12, stack, fhu_12);
        fhv_13.b(apd_12, fhv_12, stack, fhu_12);
        return fhv_13;
    }

    private fhv_1 b(apd_1 apd_12, fhv_1 object, fhu_1 fhu_12, Stack<fhs_2> stack) {
        Object object2;
        fhv_1 fhv_12;
        fhs_2 fhs_22;
        Object object3;
        boolean bl = false;
        apd_1 apd_13 = apd_12;
        if ((apd_12 = this.q(apd_12)) == apd_13) {
            apd_13 = null;
        }
        String string = null;
        if (apd_12.getName().equalsIgnoreCase("themeElement")) {
            object3 = apd_12.fq("name");
            if (object3 != null) {
                string = object3.bCt();
            }
            bl = true;
        }
        if (string != null && object != null && (object3 = object instanceof fes_2 ? (fes_2)object : ((fhi_2)object).getParentOfType(fes_2.class)) != null) {
            if ((object3 = ((fes_2)object3).getWidgetByThemeElementName(string, false)) != null) {
                object = object3;
            } else if (!(object instanceof fes_2)) {
                return null;
            }
        }
        object3 = apd_12.getChildren();
        if (bl) {
            Object object4 = object3;
            for (int i = 0; i < ((ArrayList)object4).size(); ++i) {
                apd_1 apd_14 = (apd_1)((ArrayList)object4).get(i);
                if (apd_14.getName().equals("#text") || apd_14.getName().equals("#comment")) continue;
                this.b(apd_14, (fhv_1)object, fhu_12, stack);
            }
            if (apd_13 != null) {
                ArrayList<? extends apd_1> arrayList = apd_13.getChildren();
                for (int i = 0; i < arrayList.size(); ++i) {
                    apd_1 apd_15 = arrayList.get(i);
                    if (apd_15.getName().equals("#text") || apd_15.getName().equals("#comment")) continue;
                    this.b(apd_15, (fhv_1)object, fhu_12, stack);
                }
            }
            return null;
        }
        String string2 = apd_12.fq("id") != null && !this.uwW ? apd_12.fq("id").bCt().trim() : null;
        fhs_2 fhs_23 = fhs_22 = stack != null ? stack.peek() : null;
        if (fhs_22 == null && object != null) {
            fhs_22 = ((fhv_1)object).getElementMap();
        }
        String string3 = fhs_22 == null ? "" : fhs_22.getId();
        fiw_1<?> fiw_12 = fkc_2.gCQ().vR(apd_12.getName());
        if (fiw_12 == null) {
            uwN.error("Tag Inconnu : " + apd_12.getName());
            return null;
        }
        try {
            fhv_12 = (fhv_1)fiw_12.gBR();
        }
        catch (Exception exception) {
            uwN.error("Erreur lors de l'instanciation du tag " + apd_12.getName() + ".", (Throwable)exception);
            return null;
        }
        if (fhv_12 instanceof fyW && (object2 = apd_12.fq("ref")) != null) {
            ((fyW)fhv_12).setRenderer(this.uxh.get(object2.bCt()));
        }
        if (fhv_12 instanceof fys_0 && object != null && (object2 = object instanceof fes_2 ? (fes_2)object : ((fhi_2)object).getParentOfType(fes_2.class)) != null && ((fes_2)object2).guC() && ((fes_2)object2).getAppearance() != null) {
            fhv_12.gAD();
            fhv_12 = ((fes_2)object2).getAppearance();
        }
        fhv_12.setElementMap(fhs_22);
        if (fhs_22 != null && string2 != null) {
            fhs_22.a(string2, fhv_12);
        }
        if (apd_12.getName().equalsIgnoreCase("form")) {
            object2 = null;
            apd_1 apd_16 = apd_12.fq("id");
            if (apd_16 != null) {
                object2 = apd_16.bCt();
            } else {
                uwN.warn("Attention : l'id du formulaire est nulle.");
            }
            fhu_12.a(string3 + "." + (String)object2, (fix_2)fhv_12);
        }
        this.a(fhv_12, null, null, fiw_12, apd_12.bEN(), false, fhu_12, fhs_22);
        if (object != null) {
            if (((fhv_1)object).isValidAdd(fhv_12)) {
                ((fhi_2)object).e(fhv_12);
            } else if (fhv_12.getParent() == null) {
                fhv_12.gAD();
                return null;
            }
        }
        fhv_12.guy();
        int n = ((ArrayList)object3).size();
        for (int i = 0; i < n; ++i) {
            apd_1 apd_17 = (apd_1)((ArrayList)object3).get(i);
            if (apd_17.getName().equals("#text") || apd_17.getName().equals("#comment")) continue;
            if (apd_17.fq("include") != null) {
                String string4 = apd_17.fq("includeId").bCt();
                if (string4 == null) {
                    uwN.error("Pas d'id pour le tag Include, impossible de l'ajouter");
                    continue;
                }
                fhs_2 fhs_24 = fhu_12.uP(string3 + "." + string4);
                fhs_24.j(fhs_22);
                stack.push(fhs_24);
                this.b(apd_17, fhv_12, fhu_12, stack);
                stack.pop();
                continue;
            }
            this.b(apd_17, fhv_12, fhu_12, stack);
        }
        fhv_12.onChildrenAdded();
        if (apd_12.getName().equals("form")) {
            fhu_12.uT(string3 + "." + apd_12.fq("id").bCt());
        }
        return fhv_12;
    }

    /*
     * WARNING - void declaration
     */
    private fhi_2 a(String string, String string2, fhu_1 fhu_12, Stack<fhs_2> stack) {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        fhi_2 fhi_22;
        fiw_1<?> fiw_12;
        fhs_2 fhs_22;
        Object object5;
        apd_1 apd_12 = (apd_1)this.uwT.ws(string);
        Object object7 = (fhi_2)this.uwT.ws(string2);
        String string3 = string2;
        boolean bl = this.uwT.gHb();
        if (bl) {
            this.uwT.a(apd_12, (fhi_2)object7, string2);
        }
        this.uwT.E(String.class);
        this.uwT.E(fhu_1.class);
        this.uwT.E(fhs_2.class);
        this.uwT.E(fkc_2.class);
        this.uwT.E(fes_2.class);
        this.uwT.E(fiw_1.class);
        this.uwT.E(fyw_0.class);
        this.uwT.E(fyW.class);
        boolean bl2 = false;
        apd_1 apd_13 = apd_12;
        apd_12 = this.q(apd_12);
        if (apd_12 == apd_13) {
            apd_13 = null;
        }
        String string4 = null;
        if (apd_12.getName().equalsIgnoreCase("themeElement")) {
            apd_1 apd_14 = apd_12.fq("name");
            if (apd_14 != null) {
                string4 = apd_14.bCt();
            }
            bl2 = true;
        }
        boolean bl3 = false;
        if (string4 != null && object7 != null) {
            this.uwT.gHc();
            String object62 = this.uwT.gHa();
            if (object7 instanceof fes_2) {
                object5 = (fes_2)object7;
                this.uwT.a(new fte_2(fes_2.class, object62, string2));
            } else {
                object5 = ((fhi_2)object7).getParentOfType(fes_2.class);
                this.uwT.a(new fte_2(fes_2.class, object62, string2 + ".getParentOfType(Widget.class)"));
            }
            if (object5 != null) {
                if ((object5 = ((fes_2)object5).getWidgetByThemeElementName(string4, true)) != null) {
                    bl3 = true;
                    object7 = object5;
                    string2 = this.uwT.gHa();
                    this.uwT.n(string2, object5);
                    this.uwT.a(new fte_2(fhv_1.class, string2, object62 + ".getWidgetByThemeElementName(\"" + string4 + "\", false)"));
                    this.uwT.a(new fth_2("if (" + string2 + " != null) {"));
                } else if (!(object7 instanceof fes_2)) {
                    this.uwT.gHe();
                    this.uwT.gHd();
                    if (bl) {
                        this.uwT.gHf();
                    }
                    return null;
                }
            }
            this.uwT.gHd();
        }
        if (bl2) {
            String string5;
            for (apd_1 apd_14 : apd_12.getChildren()) {
                if (apd_14.getName().equals("#text") || apd_14.getName().equals("#comment")) continue;
                string5 = this.uwT.gHa();
                this.uwT.n(string5, apd_14);
                this.a(string5, string2, fhu_12, stack);
            }
            if (apd_13 != null) {
                for (apd_1 apd_15 : apd_13.getChildren()) {
                    if (apd_15.getName().equals("#text") || apd_15.getName().equals("#comment")) continue;
                    string5 = this.uwT.gHa();
                    this.uwT.n(string5, apd_15);
                    this.a(string5, string2, fhu_12, stack);
                }
            }
            if (bl3) {
                this.uwT.a(new fth_2("}"));
            }
            if (bl) {
                this.uwT.gHf();
            }
            return null;
        }
        object5 = apd_12.fq("id") != null ? apd_12.fq("id").bCt().trim() : null;
        Object var14_19 = null;
        fhs_2 fhs_23 = fhs_22 = stack != null ? stack.peek() : null;
        if (fhs_22 == null && object7 != null) {
            fhs_22 = ((fhi_2)object7).getParentOfType(fhv_1.class).getElementMap();
        }
        String string6 = fhs_22 == null ? "" : fhs_22.getId();
        if (object5 != null) {
            String string7 = this.uwT.gHa();
            this.uwT.a(new fte_2(String.class, string7, "\"" + (String)object5 + "\""));
        }
        if ((fiw_12 = fkc_2.gCQ().vR(apd_12.getName())) == null) {
            uwN.error("Unknown Tag : \"" + apd_12.getName() + "\" ( with parameters :" + String.valueOf(apd_12.bEN()) + " ) for following class " + this.uwT.aLN());
            if (bl) {
                this.uwT.gHf();
            }
            return null;
        }
        String string8 = this.uwT.gHa();
        try {
            this.uwT.gHc();
            fhi_22 = (fhi_2)fiw_12.b(this.uwT, string8);
        }
        catch (Exception exception) {
            uwN.error("Erreur lors de l'instanciation du tag " + apd_12.getName() + ".", (Throwable)exception);
            this.uwT.gHd();
            if (bl) {
                this.uwT.gHf();
            }
            return null;
        }
        if (fhi_22 instanceof fys_0 && object7 != null) {
            object4 = (fys_0)fhi_22;
            object3 = this.uwT.gHa();
            object2 = null;
            if (object7 instanceof fes_2) {
                object = (fes_2)object7;
                object2 = new fte_2(fes_2.class, (String)object3, string2);
            } else {
                object = ((fhi_2)object7).getParentOfType(fes_2.class);
                object2 = new fte_2(fes_2.class, (String)object3, string2 + ".getParentOfType(Widget.class)");
            }
            if (object != null && ((fes_2)object).getAppearance() != null) {
                ((fhv_1)object4).gAD();
                fhi_22 = ((fes_2)object).getAppearance();
                this.uwT.gHe();
                this.uwT.gHd();
                this.uwT.a((ftb_2)object2);
                this.uwT.a(new fte_2(fhi_22.getClass(), string8, (String)object3 + ".getAppearance()"));
            }
        }
        this.uwT.gHd();
        if (fhi_22 instanceof fyW && (object4 = apd_12.fq("ref")) != null) {
            this.uwT.a(new fth_2("((FontElement)" + string8 + ").setRenderer(Xulor.getInstance().getDocumentParser().getFont(\"" + object4.bCt() + "\"));"));
            ((fyW)fhi_22).setRenderer(fyw_0.gqw().gqB().uG(object4.bCt()));
        }
        if (fhi_22.getElementType() == fht_1.uxB) {
            object4 = (fhv_1)fhi_22;
            this.uwT.a(new ftd_2(null, "setElementMap", string8, "elementMap"));
            ((fhv_1)object4).setElementMap(fhs_22);
            if (fhs_22 != null && object5 != null) {
                fhs_22.a((String)object5, (fhv_1)object4);
            }
            if (object5 != null) {
                void var14_21;
                this.uwT.a(new fth_2("if (elementMap != null && " + (String)var14_21 + " != null)"));
                this.uwT.a(new ftd_2(null, "add", "elementMap", new String[]{var14_21, string8}));
            }
        }
        if (apd_12.getName().equalsIgnoreCase("form")) {
            object4 = null;
            object = apd_12.fq("id");
            if (object != null) {
                object4 = object.bCt();
            } else {
                uwN.warn("Attention : l'id du formulaire est nulle.");
            }
            object3 = string6 + "." + (String)object4;
            this.uwT.a(new fth_2("env.openForm((elementMap != null ? elementMap.getId() : \"\") + \"." + (String)object4 + "\", (Form) " + string8 + ");"));
            fhu_12.a((String)object3, (fix_2)fhi_22);
        }
        this.a(fhi_22, string8, apd_12.getName(), fiw_12, apd_12.bEN(), true, fhu_12, fhs_22);
        if (object7 != null) {
            if (!(object7 instanceof fhv_1) || ((fhv_1)object7).isValidAdd(fhi_22)) {
                this.uwT.a(new ftd_2(null, "addBasicElement", string2, string8));
                ((fhi_2)object7).X(fhi_22);
            } else if (fhi_22.getBasicParent() == null) {
                this.uwT.a(new ftd_2(null, "release", string8, new String[0]));
                fhi_22.aZp();
                if (bl) {
                    this.uwT.gHf();
                }
                return null;
            }
        }
        fhi_22.guy();
        this.uwT.a(new ftd_2(null, "onAttributesInitialized", string8, new String[0]));
        this.uwT.n(string8, fhi_22);
        if (fhi_22 instanceof fes_2 && ((fes_2)fhi_22).getLazyLoadingMode().tGC && !((fes_2)fhi_22).isVisible()) {
            this.uwT.a(apd_12, fhi_22, string8);
            object4 = this.uwT.gHg();
            object = (fes_2)fhi_22;
            object3 = ((fes_2)object).getLazyLoadingMode();
            ((fes_2)object).setLazyLoadingMode(fzb_0.tGy);
            this.a(apd_12, string6, fhs_22, string8, fhu_12, stack);
            fhi_22.onChildrenAdded();
            this.uwT.a(new ftd_2(null, "onChildrenAdded", string8, new String[0]));
            ((fes_2)object).setLazyLoadingMode((fzb_0)((Object)object3));
            this.uwT.px(false);
            object2 = this.uwT.gHa();
            this.uwT.a(new fte_2(fgl_1.class, (String)object2, "new " + fgl_1.class.getSimpleName() + "() { @" + Override.class.getName() + " public void visibilityIsAboutToChanged(final boolean currentVisible, final boolean futureVisible, final @" + NotNull.class.getName() + " " + Runnable.class.getName() + " visibilityApplier) { if (!futureVisible) return; " + string8 + ".removeVisibilityChangePreExecutor(); " + (((fzb_0)((Object)object3)).tGD ? string8 + ".addChildrenAddedListener(new " + ffd_2.class.getName() + "() { @" + Override.class.getName() + " public void onChildrenAdded() { " + string8 + ".removeChildrenAddedListener(this); " + (String)(((fzb_0)((Object)object3)).tGE ? string8 + ".setNeedsToPostProcess(); " + string8 + ".addPostProcessCallback(new " + fia_2.class.getName() + "() { @" + Override.class.getName() + " public boolean onProcess(final int deltaTime) { if (!" + fhj_2.class.getName() + ".getInstance().containsProcessOfChildrenOf(" + string8 + ")) { " + string8 + ".removePostProcessCallback(this); visibilityApplier.run(); } return true; }} ); " : "visibilityApplier.run(); ") + "}} ); " + (String)object4 + "(" + string8 + "); " : (String)object4 + "(" + string8 + "); visibilityApplier.run(); ") + "} }"));
            this.uwT.a(new ftd_2(null, "setVisibilityChangePreExecutor", string8, new String[]{object2}));
        } else {
            this.a(apd_12, string6, fhs_22, string8, fhu_12, stack);
            fhi_22.onChildrenAdded();
            this.uwT.a(new ftd_2(null, "onChildrenAdded", string8, new String[0]));
        }
        if (apd_12.getName().equals("form")) {
            object4 = string6 + "." + apd_12.fq("id").bCt();
            this.uwT.a(new fth_2("env.closeForm((elementMap != null ? elementMap.getId() : \"\") + \"." + apd_12.fq("id").bCt() + "\");"));
            fhu_12.uT((String)object4);
        }
        if (bl) {
            this.uwT.gHf();
        }
        return fhi_22;
    }

    private void a(apd_1 apd_12, String string, fhs_2 fhs_22, String string2, fhu_1 fhu_12, Stack<fhs_2> stack) {
        for (apd_1 apd_13 : apd_12.getChildren()) {
            if (apd_13.getName().equals("#text") || apd_13.getName().equals("#comment")) continue;
            String string3 = this.uwT.bn(apd_13);
            if (apd_13.fq("include") != null) {
                String string4 = apd_13.fq("includeId").bCt();
                if (string4 == null) {
                    uwN.error("Pas d'id pour le tag Include, impossible de l'ajouter");
                    continue;
                }
                String string5 = this.uwT.gHa();
                this.uwT.a(new fte_2(fhs_2.class, string5, "elementMap"));
                fhs_2 fhs_23 = fhu_12.uP(string + "." + string4);
                this.uwT.a(new fte_2(fhs_2.class, "elementMap", "env.createElementMap((elementMap != null ? elementMap.getId() : \"\") + \"." + string4 + "\")"));
                fhs_23.j(fhs_22);
                this.uwT.a(new ftd_2(null, "setParentElementMap", "elementMap", string5));
                stack.push(fhs_23);
                this.uwT.a(new ftd_2(null, "push", "elementMaps", "elementMap"));
                this.a(string3, string2, fhu_12, stack);
                stack.pop();
                this.uwT.a(new ftd_2(null, "pop", "elementMaps", new String[0]));
                this.uwT.a(new fte_2(fhs_2.class, "elementMap", "elementMaps.peek()"));
                continue;
            }
            this.a(string3, string2, fhu_12, stack);
        }
    }

    public static void a(fhi_2 fhi_22, fiw_1<?> fiw_12, String string, String string2) {
        Method method = fiw_12.vy(string);
        if (method != null) {
            Class<?> clazz = method.getParameterTypes()[0];
            Object var6_6 = null;
            try {
                var6_6 = fic_1.gBr().b(clazz, string2);
                method.invoke((Object)fhi_22, var6_6);
            }
            catch (Exception exception) {
                uwN.error("Probl\u00e8me \u00e0 l'invoke :" + method.getName() + ":" + String.valueOf(var6_6), (Throwable)exception);
            }
        }
    }

    private void a(fhi_2 fhi_22, String string, String string2, fiw_1<?> fiw_12, List<? extends apd_1> list, boolean bl, fhu_1 fhu_12, fhs_2 fhs_22) {
        if (bl) {
            this.uwT.E(Class.class);
            this.uwT.E(Method.class);
            this.uwT.E(fib_1.class);
            this.uwT.E(fic_1.class);
        }
        boolean bl2 = fhi_22 instanceof fze;
        String string3 = null;
        int n = list.size();
        for (int i = 0; i < n; ++i) {
            boolean bl3;
            apd_1 apd_12 = list.get(i);
            String string4 = apd_12.getName();
            if ("id".equals(string4) || "ref".equals(string4) || "templateId".equals(string4) || "templateRef".equals(string4) || "since".equals(string4)) continue;
            if (bl2 && "texture".equalsIgnoreCase(string4)) {
                string3 = apd_12.bCt();
            }
            if ((bl3 = fhi_22.setXMLAttribute(string4, apd_12.bCt())) && !bl) continue;
            Method method = fiw_12.a(string4, null, fhi_2.class);
            String string5 = null;
            if (method != null) {
                Class<?> clazz = method.getParameterTypes()[0];
                String string6 = null;
                fib_1<?> fib_12 = fic_1.gBr().A(clazz);
                String string7 = null;
                if (fib_12 == null) continue;
                if (bl && !fib_12.gzN()) {
                    String string8 = this.uwT.gHa();
                    this.uwT.a(new fte_2(fiw_1.class, string8, "XulorTagLibrary.getInstance().getFactory(\"" + string2 + "\")"));
                    string5 = this.uwT.gHa();
                    this.uwT.a(new fte_2(Method.class, string5, string8 + ".guessSetter(\"" + string4 + "\")"));
                    string7 = this.uwT.gHa();
                    string6 = this.uwT.gHa();
                    this.uwT.a(new fte_2(Class.class, string6, string5 + ".getParameterTypes()[0]"));
                    this.uwT.a(new fte_2(fib_1.class, string7, "ConverterLibrary.getInstance().getConverter(" + string6 + ")"));
                }
                Object var23_23 = null;
                try {
                    if (bl) {
                        String string9 = null;
                        if (fib_12.gzN()) {
                            string9 = fib_12.a(this.uwT, this, clazz, apd_12.bCt(), fhu_12);
                        } else {
                            var23_23 = fib_12.b(clazz, apd_12.bCt());
                            string9 = this.uwT.gHa();
                            this.uwT.a(new fte_2(clazz, string9, string7 + ".convert(" + string6 + ", \"" + apd_12.bCt() + "\")"));
                        }
                        this.uwT.a(new ftd_2(method.getDeclaringClass(), method.getName(), string, string9));
                    }
                    var23_23 = fib_12.b(clazz, apd_12.bCt());
                    method.invoke((Object)fhi_22, var23_23);
                }
                catch (Exception exception) {
                    uwN.error("Probl\u00e8me \u00e0 l'invoke :" + method.getName() + ":" + String.valueOf(var23_23), (Throwable)exception);
                }
                continue;
            }
            if (!bl || string4.equals("atlas") || string4.equals("includeId") || string4.equals("include") || string4.equals("xmlns:xsi") || string4.equals("xsi:noNamespaceSchemaLocation")) continue;
            throw new IllegalArgumentException("Can't find the attribute " + string4 + " (or its setter) for class " + fhi_22.getClass().getSimpleName() + " tagElement=" + string2);
        }
    }

    public static void a(aqs_2 aqs_22, URL uRL) {
        aqt_2 aqt_22 = aqs_22.bGT();
        Stack<URL> stack = new Stack<URL>();
        HashMap<String, String> hashMap = new HashMap<String, String>();
        stack.push(uRL);
        apd_1 apd_12 = fhq_2.a(aqt_22, stack, hashMap);
        if (apd_12 != null) {
            aqs_22.a((aqt_2)apd_12);
        }
    }

    public static apd_1 a(apd_1 apd_12, Stack<URL> stack, HashMap<String, String> hashMap) {
        int n;
        apd_1 apd_132;
        Object object;
        if (apd_12 == null) {
            return null;
        }
        Object object2 = apd_12;
        int n2 = stack.size();
        if ("template".equalsIgnoreCase(apd_12.getName())) {
            object = apd_12.fq("path");
            if (object != null) {
                for (apd_1 apd_132 : apd_12.bEN()) {
                    if (((aqu_2)apd_132).getName().equals("path")) continue;
                    hashMap.put(((aqu_2)apd_132).getName(), ((aqu_2)apd_132).bCt());
                }
                var6_6 = apd_12.fo("templateElement");
                apd_132 = fhq_2.a(object.bCt(), stack, false);
                fhq_2.a(apd_132, apd_12, (ArrayList<apd_1>)var6_6, false, hashMap);
                object2 = apd_132;
            }
        } else if ("include".equalsIgnoreCase(apd_12.getName()) && (object = apd_12.fq("path")) != null) {
            var6_6 = fhq_2.a(object.bCt(), stack, true);
            apd_132 = apd_12.fq("id");
            object2 = var6_6;
            object2.c(new aqu_2("include", ""));
            if (apd_132 != null) {
                object2.c(new aqu_2("includeId", apd_132.bCt()));
            }
        }
        object = new ArrayList();
        for (n = object2.getChildren().size() - 1; n >= 0; --n) {
            apd_132 = object2.getChildren().get(n);
            ((ArrayList)object).add(apd_132);
        }
        for (n = ((ArrayList)object).size() - 1; n >= 0; --n) {
            object2.b((apd_1)((ArrayList)object).get(n));
        }
        for (n = ((ArrayList)object).size() - 1; n >= 0; --n) {
            apd_132 = (apd_1)((ArrayList)object).get(n);
            if (apd_132.getName().equals("#text") || apd_132.getName().equals("#comment")) continue;
            apd_1 apd_14 = fhq_2.a(apd_132, stack, hashMap);
            if (apd_14 != null) {
                object2.a(apd_14);
                continue;
            }
            object2.a(apd_132);
        }
        while (stack.size() > n2) {
            stack.pop();
        }
        if (object2 == apd_12) {
            return null;
        }
        return object2;
    }

    public static void a(apd_1 apd_12, apd_1 apd_13, ArrayList<apd_1> arrayList, boolean bl, HashMap<String, String> hashMap) {
        Object object;
        if (apd_12 == null || arrayList == null || arrayList.isEmpty()) {
            return;
        }
        for (apd_1 apd_14 : apd_12.bEN()) {
            Matcher matcher = fzp_0.tIe.matcher(((aqu_2)apd_14).bCt());
            while (matcher.find()) {
                String string = hashMap.get(matcher.group(2));
                if (string == null) continue;
                ((aqu_2)apd_14).fa(BH.a(((aqu_2)apd_14).bCt(), matcher.group(1), string));
            }
        }
        apd_1 apd_15 = apd_12.fq("templateId");
        if (apd_15 != null) {
            apd_1 apd_14;
            apd_14 = null;
            int n = arrayList.size();
            for (int i = 0; i < n; ++i) {
                object = arrayList.get(i);
                apd_1 apd_16 = object.fq("templateRef");
                if (!apd_15.bCt().equalsIgnoreCase(apd_16.bCt())) continue;
                apd_14 = object;
                break;
            }
            if (apd_14 != null) {
                apd_1 apd_17 = apd_14.fq("templateElementIgnore");
                if (apd_17 != null && apd_17.bCu()) {
                    apd_13.b(apd_12);
                    return;
                }
                ArrayList<? extends apd_1> arrayList2 = apd_14.getChildren();
                int n2 = arrayList2.size();
                for (int i = 0; i < n2; ++i) {
                    apd_12.a(arrayList2.get(i));
                }
                object = apd_14.bEN();
                int n3 = ((ArrayList)object).size();
                for (n2 = 0; n2 < n3; ++n2) {
                    apd_1 apd_18 = (apd_1)((ArrayList)object).get(n2);
                    String string = apd_18.getName();
                    if (string.equals("#text") || string.equals("#comment") || "templateRef".equalsIgnoreCase(string)) continue;
                    apd_1 apd_19 = apd_12.fq(string);
                    if (apd_19 != null) {
                        apd_12.d(apd_19);
                    }
                    apd_12.c(apd_18);
                }
            }
            apd_12.d(apd_15);
        }
        boolean bl2 = apd_12.getName().equalsIgnoreCase("templateElement");
        if (bl && bl2) {
            return;
        }
        ArrayList<? extends apd_1> arrayList3 = apd_12.getChildren();
        for (int i = arrayList3.size() - 1; i >= 0; --i) {
            object = arrayList3.get(i);
            if (object.getName().equals("#text") || object.getName().equals("#comment")) continue;
            boolean bl3 = object.getName().equalsIgnoreCase("template");
            fhq_2.a((apd_1)object, apd_12, arrayList, bl3, hashMap);
        }
    }

    public static apd_1 a(String string, Stack<URL> stack, boolean bl) {
        URL uRL = null;
        aqs_2 aqs_22 = null;
        try {
            uRL = bl_0.a(stack.peek(), string);
            if (bl) {
                stack.push(uRL);
            }
            aqs_22 = fyw_0.j(uRL);
        }
        catch (Exception exception) {
            uwN.error("Impossible de charger le template d'url : " + String.valueOf(stack.peek()) + string, (Throwable)exception);
        }
        if (aqs_22 != null) {
            return aqs_22.bGT();
        }
        return null;
    }

    public apd_1 q(apd_1 apd_12) {
        if (apd_12 == null) {
            return null;
        }
        apd_1 apd_13 = apd_12.fq("ref");
        apd_1 apd_14 = null;
        if (apd_13 != null) {
            apd_14 = this.uxf.get(apd_13.bCt().toUpperCase());
        }
        if (apd_14 == null) {
            return apd_12;
        }
        return apd_14;
    }

    public apd_1 b(apd_1 apd_12, String string) {
        if (apd_12 == null) {
            uwN.error("Probl\u00e8me lors de la recherche de ThemeElement : entry est null");
            return null;
        }
        if (string == null) {
            uwN.error("Probl\u00e8me lors de la recherche de ThemeElement : name est null");
            return null;
        }
        ArrayList<apd_1> arrayList = fhq_2.d(apd_12 = this.q(apd_12), "themeElement");
        if (arrayList != null) {
            for (apd_1 apd_13 : arrayList) {
                apd_1 apd_14 = (apd_13 = this.q(apd_13)).fq("name");
                if (apd_14 == null || !string.equalsIgnoreCase(apd_14.bCt())) continue;
                return apd_13;
            }
        }
        return null;
    }

    private static boolean aJ(String string, String string2) {
        acc_1 acc_12 = axc_2.gG(string);
        acc_1 acc_13 = axc_2.gG(string2);
        if (acc_12 == null || acc_13 == null) {
            return false;
        }
        return acc_13.bWx() >= acc_12.bWx() && acc_13.bWy() >= acc_12.bWy();
    }

    private ArrayList<fhr_2> c(apd_1 apd_12, String string) {
        ArrayList<fhr_2> arrayList = new ArrayList<fhr_2>();
        this.a(apd_12, arrayList, string);
        return arrayList;
    }

    private void a(apd_1 apd_12, ArrayList<fhr_2> arrayList, String string) {
        if (apd_12 == null) {
            uwN.error("Probl\u00e8me lors de la recherche de ThemeElement : entry est null");
            return;
        }
        apd_1 apd_13 = (apd_12 = this.q(apd_12)).fq("type");
        if (apd_13 == null) {
            uwN.warn("type inconnu pour " + string);
            return;
        }
        fiw_1<?> fiw_12 = fkc_2.gCQ().vR(apd_13.bCt());
        fhi_2 fhi_22 = null;
        try {
            fhi_22 = (fhi_2)fiw_12.gBR();
        }
        catch (Exception exception) {
            uwN.warn("Probl\u00e8me \u00e0 la g\u00e9n\u00e9ration de " + apd_13.bCt(), (Throwable)exception);
            return;
        }
        arrayList.add(new fhr_2(fhi_22, string, apd_12));
        ArrayList<apd_1> arrayList2 = fhq_2.d(apd_12, "themeElement");
        if (arrayList2 != null) {
            for (apd_1 apd_14 : arrayList2) {
                apd_1 apd_15;
                apd_1 apd_16 = this.q(apd_14);
                if (apd_16 == apd_12 || (apd_15 = apd_16.fq("name")) == null) continue;
                String string2 = apd_15.bCt();
                this.a(apd_16, arrayList, string + "$" + BH.aQ(string2));
            }
        }
    }

    public static ArrayList<apd_1> d(apd_1 apd_12, String string) {
        ArrayList<apd_1> arrayList = new ArrayList<apd_1>();
        if (apd_12.getName().equalsIgnoreCase(string)) {
            arrayList.add(apd_12);
        }
        for (apd_1 apd_13 : apd_12.getChildren()) {
            ArrayList<apd_1> arrayList2 = apd_13.fo(string);
            if (arrayList2 == null) continue;
            arrayList.addAll(arrayList2);
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        return arrayList;
    }

    public void a(fhb_2 fhb_22) {
        this.uxm.add(fhb_22);
    }

    public void b(fhb_2 fhb_22) {
        this.uxm.remove(fhb_22);
    }

    public void gAd() {
        this.gAe();
        this.gAf();
        for (fhb_2 fhb_22 : this.uxm) {
            fhb_22.ciU();
        }
    }

    public void gAe() {
        this.uxe.clear();
        this.uxf.clear();
        this.uxg.clear();
        this.uxh.clear();
        this.uxj.clear();
        this.uxk.clear();
    }

    private void gAf() {
        this.uxd = fho_2.gzX().gzY();
        if (this.uwV != null && this.uwZ != null) {
            fhm_2.uwB.clear();
            this.gAi();
            fhm_2.uwB.gzS();
            this.gAg();
            return;
        }
        fhm_2.uwB.clear();
        this.gAj();
        this.gAg();
    }

    private void gAg() {
        aqs_2 aqs_22;
        if (this.uxd == null) {
            return;
        }
        URL uRL = null;
        try {
            uRL = new URL(this.uxd + "theme/colors/colors.xml");
        }
        catch (MalformedURLException malformedURLException) {
            uwO.error("[THEME] Error when opening custom color file '" + this.uxd + "theme/colors/colors.xml'", (Throwable)malformedURLException);
        }
        if (uRL == null) {
            return;
        }
        if (!bl_0.a(uRL)) {
            uwO.error("[THEME] Error when opening custom color file: file '" + uRL.getPath() + "' does not exist");
            return;
        }
        try {
            aqs_22 = fyw_0.j(uRL);
        }
        catch (Exception exception) {
            uwN.error("[THEME] Error when loading colors of file '" + uRL.getPath() + "'", (Throwable)exception);
            return;
        }
        this.u(aqs_22.bGT());
    }

    public void uD(String string) {
        new fhs_1(this, string).gBi();
    }

    public void b(fhg_2 fhg_22, fhi_1 fhi_12, String string) {
        this.uwZ = fhg_22;
        this.uwV = fhi_12;
        this.uxc = string;
        this.uxe.clear();
        this.gAf();
    }

    public void b(String string, String string2, fti_1 fti_12) {
        this.uxb = string;
        this.uxc = string2;
        this.uxd = null;
        this.uxe.clear();
        this.gAj();
        this.a(fti_12);
    }

    public void aK(String string, String string2) {
        this.uxb = string;
        this.uxc = string2;
        this.uxe.clear();
        this.gAf();
    }

    public String gAh() {
        if (this.uwQ) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Styles non utilis\u00e9s : \n");
            ArrayList<String> arrayList = new ArrayList<String>();
            for (Map.Entry<String, Integer> entry : this.uwR.entrySet()) {
                if (entry.getValue() != 0) continue;
                arrayList.add(entry.getKey());
            }
            Collections.sort(arrayList);
            int n = arrayList.size();
            for (int i = 0; i < n; ++i) {
                stringBuilder.append((String)arrayList.get(i)).append("\n");
            }
            return stringBuilder.toString();
        }
        return null;
    }

    public void b(fes_2 fes_22, String string) {
        if (this.uwZ != null) {
            this.d(fes_22, string);
        } else {
            this.c(fes_22, string);
        }
    }

    private void c(fes_2 fes_22, String string) {
        apd_1 apd_12;
        String[] stringArray = BH.j(string, "$");
        if (stringArray.length == 1) {
            stringArray[0] = fes_22.getStyleTag() + stringArray[0];
        }
        if ((apd_12 = this.uxg.get(stringArray[0].toUpperCase())) == null) {
            apd_12 = this.uxg.get(fes_22.getStyleTag().toUpperCase());
        } else if (this.uwQ) {
            String string2 = stringArray[0].toUpperCase();
            Integer n = this.uwR.get(string2);
            this.uwR.put(string2, n + 1);
        }
        if (this.uwT != null || apd_12 == null) {
            return;
        }
        apd_1 apd_13 = apd_12.fn("themeElement");
        for (int i = 1; i < stringArray.length; ++i) {
            apd_13 = this.b(apd_13, stringArray[i]);
        }
        if (apd_13 != null) {
            Stack<fhs_2> stack = new Stack<fhs_2>();
            stack.push(fes_22.getElementMap());
            this.uwW = true;
            this.b(apd_13, fes_22, fes_22.getElementMap().gqC(), stack);
            this.uwW = false;
        }
    }

    private void d(fes_2 fes_22, String string) {
        assert (this.uwZ != null) : "m_styleProvider est null !";
        string = string.contains("$") ? string.toUpperCase() : fes_22.getStyleTag().toUpperCase() + string.toUpperCase();
        fhh_2 fhh_22 = this.uwZ.rt(string);
        if (fhh_22 == null && (fhh_22 = this.uwZ.rt(string = fes_22.getStyleTag().toUpperCase())) == null) {
            return;
        }
        fhh_22.a(fes_22.getElementMap(), this, fes_22);
    }

    public Stream<String> ru(@NotNull String string) {
        String string2 = string.toUpperCase();
        return this.uxg.entrySet().stream().filter(entry -> ((String)entry.getKey()).startsWith(string2)).map(entry -> ((apd_1)entry.getValue()).fr("style") ? ((apd_1)entry.getValue()).fq("style").bCt() : "");
    }

    private void gAi() {
        assert (this.uwV != null && this.uwZ != null) : "loadInitDirect : variable mal initialis\u00e9e !";
        this.uwV.g(this);
    }

    private void gAj() {
        new fhs_1(this, this.uxb).gAf();
    }

    void r(apd_1 apd_12) {
        if (apd_12.getName().equals("#text") || apd_12.getName().equals("#comment")) {
            return;
        }
        apd_1 apd_13 = apd_12.fq("id");
        if (apd_13 == null) {
            return;
        }
        this.uxf.put(apd_13.bCt().toUpperCase(), apd_12);
    }

    @NotNull
    private static String s(apd_1 apd_12) {
        String string;
        apd_1 apd_13 = apd_12.fq("type");
        if (apd_13 == null || apd_13.bCt() == null || apd_13.bCt().isBlank()) {
            throw new IllegalArgumentException("Theme component " + String.valueOf(apd_12) + " does not have \"type\" attribute");
        }
        apd_1 apd_14 = apd_12.fq("style");
        if (apd_14 == null || apd_14.bCt() == null || apd_14.bCt().isBlank()) {
            string = "";
        } else {
            String string2 = apd_14.bCt();
            string = BH.aQ(string2);
        }
        return apd_13.bCt() + string;
    }

    void t(apd_1 apd_12) {
        String string = fhq_2.s(apd_12).toUpperCase();
        this.uxg.put(string, apd_12);
        if (this.uwQ) {
            this.uwR.put(string, 0);
        }
    }

    private void u(apd_1 apd_12) {
        if (!apd_12.getName().equalsIgnoreCase("colors")) {
            uwO.error("[THEME] Invalid color file, main node should be named 'colors'");
            return;
        }
        for (apd_1 apd_13 : apd_12.getChildren()) {
            apd_1 apd_14;
            String string = apd_13.getName();
            if (!string.equalsIgnoreCase("color") || (apd_14 = apd_13.fq("id")) == null) continue;
            this.y(apd_13);
        }
        fhm_2.uwB.gzS();
    }

    private void a(fti_1 fti_12) {
        new fhr_1(this, this.uxb, fti_12).gBg();
    }

    void a(fto_1 fto_12) {
        this.uwU = fto_12;
    }

    void a(apd_1 apd_12, fti_1 fti_12) {
        URL uRL = null;
        try {
            uRL = fo_0.bA("file:" + fti_12.gHt());
        }
        catch (MalformedURLException malformedURLException) {
            // empty catch block
        }
        fhh_1 fhh_12 = (fhh_1)fic_1.gBr().A(awk_1.class);
        fhh_12.oU(true);
        apd_1 apd_13 = apd_12.fn("themeElement");
        String string = fhq_2.s(apd_12);
        String string2 = BH.aQ(string);
        ArrayList<fhr_2> arrayList = this.c(apd_13, string2);
        URL uRL2 = null;
        for (fhr_2 fhr_22 : arrayList) {
            string2 = fhr_22.gAr();
            try {
                uRL2 = bl_0.a(uRL, string2 + ".java");
            }
            catch (MalformedURLException malformedURLException) {
                uwN.error("MalformedURLException during createPrecompiledStyle", (Throwable)malformedURLException);
            }
            if (uRL2 == null) continue;
            try {
                this.uwS = new PrintWriter(new FileOutputStream(new File(uRL2.getFile())));
            }
            catch (FileNotFoundException fileNotFoundException) {
                uwN.error("FileNotFoundException during createPrecompiledStyle", (Throwable)fileNotFoundException);
            }
            this.uwT = new ftl_2(this.uwS, string2, fti_12.gHp(), fhr_22.gAs(), fhr_22.gAq(), this);
            Stack<fhs_2> stack = new Stack<fhs_2>();
            fhs_2 fhs_22 = new fhs_2("", new fhu_1());
            stack.push(fhs_22);
            this.a(this.uwT.gHm(), this.uwT.gHl(), fhs_22.gqC(), stack);
            this.uwT.gHh();
            this.uwU.a(new fth_2("m_setters.put(\"" + string2.toUpperCase() + "\", new " + string2 + "());"));
        }
        fhh_12.oU(false);
    }

    private static fhi_2 uE(String string) {
        int n = string.length();
        for (int i = 0; i < n; ++i) {
            fiw_1<?> fiw_12 = fkc_2.gCQ().vR(string.substring(0, i + 1));
            if (fiw_12 == null) continue;
            try {
                return (fhi_2)fiw_12.gBR();
            }
            catch (Exception exception) {
                return null;
            }
        }
        return null;
    }

    public void a(float f2, axb_2 axb_22, axb_2 axb_23, axb_2 axb_24, String string) {
        fsb_1.vcw = f2;
        fsb_1.vct = axb_22;
        fsb_1.vcs = axb_23;
        fsb_1.vcu = axb_24;
        awx_1 awx_12 = this.uxh.get(string);
        if (awx_12 != null) {
            fsb_1.vcv = awx_12.getFont();
        }
        if (fsb_1.vcv == null) {
            fsb_1.vcv = awk_2.gx(string);
        }
    }

    void v(apd_1 apd_12) {
        Object object;
        Object object2;
        axb_2 axb_22;
        if (!apd_12.getName().equalsIgnoreCase("tooltip")) {
            return;
        }
        float f2 = fsb_1.vcw;
        apd_1 apd_13 = apd_12.fq("borderWidth");
        if (apd_13 != null) {
            f2 = apd_13.bCs();
        }
        axb_2 axb_23 = fsb_1.vct;
        fha_1 fha_12 = (fha_1)fic_1.gBr().A(axb_2.class);
        apd_13 = apd_12.fq("backgroundColor");
        if (apd_13 != null) {
            axb_22 = axb_23;
            axb_23 = this.uy(apd_13.bCt());
            if (axb_23 == null) {
                axb_23 = fha_12.h(axb_2.class, apd_13.bCt());
            }
            if (axb_23 == null) {
                axb_23 = axb_22;
            }
        }
        axb_22 = fsb_1.vcs;
        apd_13 = apd_12.fq("textColor");
        if (apd_13 != null) {
            object2 = axb_22;
            axb_22 = this.uy(apd_13.bCt());
            if (axb_22 == null) {
                axb_22 = fha_12.h(axb_2.class, apd_13.bCt());
            }
            if (axb_22 == null) {
                axb_22 = object2;
            }
        }
        object2 = fsb_1.vcu;
        apd_13 = apd_12.fq("borderColor");
        if (apd_13 != null) {
            object = object2;
            object2 = this.uy(apd_13.bCt());
            if (object2 == null) {
                object2 = fha_12.h(axb_2.class, apd_13.bCt());
            }
            if (object2 == null) {
                object2 = object;
            }
        }
        object = null;
        apd_13 = apd_12.fq("font");
        if (apd_13 != null) {
            object = apd_13.bCt();
        }
        this.a(f2, axb_23, axb_22, (axb_2)object2, (String)object);
    }

    public void a(String string, String string3, String string4, String string5) {
        awj_2 awj_22 = this.uxi.get(string3);
        String string6 = awj_22.bpu();
        Object object = "default";
        int n = (string6 = string6.toLowerCase()).lastIndexOf(47);
        if (n >= 0) {
            ++n;
        }
        object = fq_0.bJ(string6) + string4;
        awk_2.gw(this.uxc + string6.substring(0, n));
        String string7 = awk_2.gA((String)object);
        int n2 = awk_2.B((String)object, string5);
        int n3 = awk_2.gz((String)object);
        awh_2 awh_22 = awk_2.a(string7, n2, n3 += awj_22.bOo(), awj_22.getDeltaX(), awj_22.getDeltaY(), false);
        this.uxh.put(string, awa_1.c(awh_22));
        this.uxj.compute(string3, (string2, list) -> {
            List list2 = list == null ? new ArrayList() : list;
            list2.add(string);
            return list2;
        });
    }

    void w(apd_1 apd_12) {
        if (!apd_12.getName().equalsIgnoreCase("fontDefinition") || apd_12.fq("name") == null) {
            return;
        }
        apd_1 apd_13 = apd_12.fq("name");
        String string = apd_13.bCt();
        ArrayList<apd_1> arrayList = apd_12.fo("desc");
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            apd_1 apd_14 = arrayList.get(i);
            apd_1 apd_15 = apd_14.fq("path");
            apd_1 apd_16 = apd_14.fq("lang");
            apd_1 apd_17 = apd_14.fq("size");
            apd_1 apd_18 = apd_14.fq("deltaX");
            apd_1 apd_19 = apd_14.fq("deltaY");
            if (apd_15 == null || apd_16 == null) continue;
            String string2 = apd_15.bCt();
            String string3 = apd_16.bCt();
            int n2 = apd_17 != null ? Bw.b((Object)apd_17.bCt(), 0) : 0;
            int n3 = apd_18 != null ? Bw.b((Object)apd_18.bCt(), 0) : 0;
            int n4 = apd_19 != null ? Bw.b((Object)apd_19.bCt(), 0) : 0;
            this.a(string, string2, string3, n2, n3, n4);
        }
    }

    public void a(String string, String string2, String string3, int n, int n2, int n3) {
        awj_2 awj_22 = this.uxi.get(string);
        if (awj_22 == null) {
            awj_22 = new awj_2(string);
            this.uxi.put(string, awj_22);
        }
        awj_22.a(string3, string2, n, n2, n3);
        if (!awj_22.aJG()) {
            this.uxi.put(string, awj_22);
        }
    }

    void x(apd_1 apd_12) {
        if (!apd_12.getName().equalsIgnoreCase("font") || apd_12.fq("font") == null || apd_12.fq("id") == null) {
            return;
        }
        String string = null;
        if (apd_12.fq("modifier") != null) {
            string = apd_12.fq("modifier").bCt();
        }
        apd_1 apd_13 = apd_12.fq("definition");
        String string2 = apd_12.fq("font").bCt();
        String string3 = apd_12.fq("id").bCt();
        this.a(string3, apd_13 != null ? apd_13.bCt() : null, string2, string);
    }

    public void d(String string, axb_2 axb_22) {
        fhm_2.uwB.b(string, axb_22);
    }

    public void b(fhz_1 fhz_12, axb_2 axb_22) {
        fhm_2.uwB.a(fhz_12, axb_22);
    }

    void y(apd_1 apd_12) {
        if (!apd_12.getName().equalsIgnoreCase("color") || apd_12.fq("color") == null || apd_12.fq("id") == null) {
            return;
        }
        String string = apd_12.fq("id").bCt();
        apd_1 apd_13 = apd_12.fq("color");
        axb_2 axb_22 = fha_1.uvJ.us(apd_13.bCt());
        if (axb_22 == null) {
            uwO.error("[THEME] Invalid color " + string + " - This value does not match color format : " + apd_13.bCt());
            return;
        }
        this.d(string, axb_22);
        aqt_2 aqt_22 = new aqt_2("color", null);
        aqt_22.c(new aqu_2("color", string));
        this.uxf.put(string.toUpperCase(), aqt_22);
    }

    public void a(String string, fzo_0 fzo_02, int n, int n2) {
        try {
            BufferedImage bufferedImage = ImageIO.read(fo_0.bA(this.uxc + string));
            fhn_1.gzT().a(fzo_02, n, n2, bufferedImage);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Impossible de cr\u00e9er le curseur");
            if (string != null) {
                stringBuilder.append(" : ").append(string);
            }
            uwN.error(stringBuilder.toString(), (Throwable)exception);
        }
    }

    void z(apd_1 apd_12) {
        if (!apd_12.getName().equalsIgnoreCase("cursor") || apd_12.fq("path") == null || apd_12.fq("id") == null) {
            return;
        }
        apd_1 apd_13 = apd_12.fq("path");
        if (apd_13 != null) {
            apd_1 apd_14 = apd_12.fq("x");
            apd_1 apd_15 = apd_12.fq("y");
            apd_1 apd_16 = apd_12.fq("type");
            int n = apd_14 == null ? 0 : apd_14.bCo();
            int n2 = apd_15 == null ? 0 : apd_15.bCo();
            fzo_0 fzo_02 = apd_16 == null ? fzo_0.tHq : fzo_0.valueOf(apd_16.bCt().toUpperCase());
            this.a(apd_13.bCt(), fzo_02, n, n2);
        }
    }

    public void b(fzo_0 fzo_02, int n, int n2, int n3, ArrayList<String> arrayList) {
        try {
            ArrayList<BufferedImage> arrayList2 = new ArrayList<BufferedImage>(arrayList.size());
            int n4 = arrayList.size();
            for (int i = 0; i < n4; ++i) {
                String string = arrayList.get(i);
                arrayList2.add(ImageIO.read(fo_0.bA(this.uxc + string)));
            }
            fhn_1.gzT().a(fzo_02, n, n2, n3, arrayList2);
        }
        catch (Exception exception) {
            uwN.error("Impossible de cr\u00e9er le curseur", (Throwable)exception);
        }
    }

    void A(apd_1 apd_12) {
        if (!apd_12.getName().equalsIgnoreCase("animatedCursor") || apd_12.fq("id") == null) {
            return;
        }
        try {
            apd_1 apd_13 = apd_12.fq("x");
            apd_1 apd_14 = apd_12.fq("y");
            apd_1 apd_15 = apd_12.fq("delay");
            apd_1 apd_16 = apd_12.fq("type");
            int n = apd_13 == null ? 0 : apd_13.bCo();
            int n2 = apd_14 == null ? 0 : apd_14.bCo();
            int n3 = apd_15 == null ? 500 : apd_15.bCo();
            fzo_0 fzo_02 = apd_16 == null ? fzo_0.tHq : fzo_0.valueOf(apd_16.bCt().toUpperCase());
            ArrayList<apd_1> arrayList = apd_12.fo("cursorFrame");
            ArrayList<String> arrayList2 = new ArrayList<String>(arrayList.size());
            int n4 = arrayList.size();
            for (int i = 0; i < n4; ++i) {
                apd_1 apd_17 = arrayList.get(i);
                apd_1 apd_18 = apd_17.fq("path");
                arrayList2.add(apd_18.bCt());
            }
            this.b(fzo_02, n, n2, n3, arrayList2);
        }
        catch (Exception exception) {
            uwN.error("Impossible de cr\u00e9er le curseur", (Throwable)exception);
        }
    }

    public void c(@NotNull String string, @NotNull String string2, boolean bl) {
        fhh_1 fhh_12 = (fhh_1)fic_1.gBr().A(awk_1.class);
        try {
            if (bl) {
                awk_1 awk_12 = fhh_12.m(awk_1.class, string2);
                awk_12.bGY();
            }
            this.uxk.put(string, string2);
        }
        catch (Exception exception) {
            uwN.error("Impossible de cr\u00e9er l'instance de texture", (Throwable)exception);
        }
    }

    public void a(@NotNull String string, @NotNull String string2, boolean bl, boolean bl2) {
        if (bl2 && this.d(string, string2, bl)) {
            return;
        }
        this.c(string, this.uxc + string2, bl);
    }

    private boolean d(@NotNull String string, @NotNull String string2, boolean bl) {
        if (this.uxd == null) {
            return false;
        }
        String string3 = fq_0.bK(this.uxd + string2);
        for (String string4 : fzp_0.tIf) {
            String string5 = string3 + string4;
            if (!this.a(string, string2, bl, string5)) continue;
            return true;
        }
        return false;
    }

    private boolean a(@NotNull String string, @NotNull String string2, boolean bl, String string3) {
        if (!bl_0.bl(string3)) {
            uwN.debug("File " + string3 + " does not exist");
            return false;
        }
        if (!fhq_2.aJ(this.uxc + string2, string3)) {
            uwN.error("Invalid texture size : " + string3);
            return false;
        }
        awm_1.bPn().gC(arn_2.fX(string3));
        uwN.info("Custom texture loaded : " + string3);
        this.c(string, string3, bl);
        return true;
    }

    void B(apd_1 apd_12) {
        if (!apd_12.getName().equalsIgnoreCase("texture") || apd_12.fq("path") == null || apd_12.fq("id") == null) {
            return;
        }
        try {
            String string = apd_12.fq("id").bCt();
            String string2 = apd_12.fq("path").bCt();
            apd_1 apd_13 = apd_12.fq("permanent");
            boolean bl = apd_13 != null && apd_13.bCu();
            apd_1 apd_14 = apd_12.fq("overridable");
            boolean bl2 = apd_14 != null && apd_14.bCu();
            this.a(string, string2, bl, bl2);
        }
        catch (Exception exception) {
            uwN.error("Impossible de cr\u00e9er l'instance de texture", (Throwable)exception);
        }
    }

    public void gAk() {
        for (apd_1 apd_12 : this.uxe) {
            this.B(apd_12);
        }
        this.uxl = false;
    }

    public boolean gAl() {
        return this.uxl;
    }

    public void oW(boolean bl) {
        this.gAk();
    }

    public awk_1 uF(String string) {
        String string2 = this.uxk.get(string);
        if (string2 == null) {
            return null;
        }
        awk_1 awk_12 = awm_1.bPn().gB(arn_2.fX(string2));
        if (awk_12 == null) {
            fhh_1 fhh_12 = (fhh_1)fic_1.gBr().A(awk_1.class);
            awk_12 = fhh_12.m(awk_1.class, string2);
        }
        return awk_12;
    }

    public Set<String> gAm() {
        return ImmutableSet.copyOf(this.uxk.keySet());
    }

    public awx_1 uG(String string) {
        return this.uxh.get(string);
    }

    public HashMap<String, List<String>> gAn() {
        return this.uxj;
    }

    public axb_2 uy(String string) {
        apd_1 apd_12 = this.uxf.get(string.toUpperCase());
        if (apd_12 == null || !apd_12.getName().equalsIgnoreCase("color")) {
            return null;
        }
        if ((apd_12 = apd_12.fq("color")) == null) {
            return null;
        }
        fib_1<axb_2> fib_12 = fic_1.gBr().A(axb_2.class);
        return fib_12.b(axb_2.class, apd_12.bCt());
    }

    public void gAo() {
    }

    public void gAp() {
    }
}

