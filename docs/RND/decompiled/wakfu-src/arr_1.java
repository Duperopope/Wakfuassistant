/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Ordering
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeNode;
import org.apache.log4j.Logger;

/*
 * Renamed from arr
 */
public class arr_1 {
    private static final Logger cTj = Logger.getLogger(arr_1.class);
    protected static final Color cTk = new Color(25, 180, 25);
    protected static final Color cTl = new Color(180, 25, 25);
    protected static final Color cTm = new Color(25, 25, 180);
    protected static final Color cTn = new Color(128, 128, 128);
    private static DefaultMutableTreeNode cTo;

    public static void a(Anm anm, DefaultMutableTreeNode defaultMutableTreeNode) {
        cTo = defaultMutableTreeNode;
        defaultMutableTreeNode.add(arr_1.b(anm.aId()));
        arr_1.b(anm, defaultMutableTreeNode);
        defaultMutableTreeNode.add(arr_1.d(anm));
        if (anm.aId().aJB()) {
            defaultMutableTreeNode.add(arr_1.f(anm));
        }
        defaultMutableTreeNode.add(arr_1.g(anm));
        defaultMutableTreeNode.add(arr_1.h(anm));
        defaultMutableTreeNode.add(arr_1.i(anm));
        defaultMutableTreeNode.add(arr_1.e(anm));
    }

    private static arw_1 d(Anm anm) {
        String[] stringArray;
        Object object;
        arw_1 arw_12 = new arw_1("Index", cTl);
        arw_12.add(new arw_1("Scale: " + anm.aID().getScale()));
        arw_12.add(new arw_1("Radius: " + anm.aID().aJM()));
        arw_12.add(new arw_1("UsePerfectHitTest: " + anm.aID().aJz()));
        if (!anm.aId().aJx()) {
            return arw_12;
        }
        fa_1[] fa_1Array = anm.aID().aJL();
        if (fa_1Array != null) {
            object = new arw_1("HiddenParts (" + fa_1Array.length + ")", Color.GRAY);
            for (int i = 0; i < fa_1Array.length; ++i) {
                fa_1 fa_12 = fa_1Array[i];
                ((DefaultMutableTreeNode)object).add(new arw_1("key:" + fa_12.aAg + "  hide: " + fa_12.aAh));
            }
            arw_12.add((MutableTreeNode)object);
        }
        if ((object = anm.aID().aJU()) != null) {
            arw_1 arw_13 = new arw_1("CanHideParts (" + ((ez_1[])object).length + ")", Color.GRAY);
            for (int i = 0; i < ((ez_1[])object).length; ++i) {
                ez_1 ez_12 = object[i];
                arw_13.add(new arw_1("onEquip:" + ez_12.aAe + "  hideKey: " + ez_12.aAf));
            }
            arw_12.add(arw_13);
        }
        if ((stringArray = anm.aID().aJK()) != null) {
            arw_1 arw_14 = new arw_1("Files (" + stringArray.length + ")", Color.GRAY);
            for (int i = 0; i < stringArray.length; ++i) {
                arw_14.add(new arw_1(i + " " + stringArray[i]));
            }
            arw_12.add(arw_14);
        }
        ew_1[] ew_1Array = anm.aID().aJJ();
        arw_1 arw_15 = new arw_1("Animations (" + ew_1Array.length + ")", Color.GRAY);
        for (int i = 0; i < ew_1Array.length; ++i) {
            arw_1 arw_16 = new arw_1("Anim [" + ew_1Array[i].getName() + "]");
            arw_16.add(new arw_1("Name: " + ew_1Array[i].getName()));
            arw_16.add(new arw_1("Crc: " + ew_1Array[i].aJE()));
            arw_16.add(new arw_1("fileIndex: " + ew_1Array[i].aJH()));
            arw_15.add(arw_16);
        }
        arw_12.add(arw_15);
        return arw_12;
    }

    private static void b(Anm anm, DefaultMutableTreeNode defaultMutableTreeNode) {
        arw_1 arw_12 = new arw_1("Links", Color.GRAY);
        defaultMutableTreeNode.add(arw_12);
        List<fk_0> list = anm.bGV().aIF().aIt();
        for (fk_0 fk_02 : list) {
            if (fk_02 == null || fk_02.getName() == null) continue;
            arw_1 arw_13 = new arw_1(fk_02.getName() + " [sprite: " + fk_02.aIi() + "]");
            arw_12.add(arw_13);
        }
        arw_12.setUserObject("Links (" + arw_12.getChildCount() + ")");
    }

    private static arw_1 e(Anm anm) {
        Map<Short, eu_1> map = anm.bGV().aIh().aJF();
        int n = map.size();
        arw_1 arw_12 = new arw_1("Imports (" + n + ")", cTl);
        Object[] objectArray = new Short[n];
        map.keySet().toArray(objectArray);
        Arrays.sort(objectArray);
        for (int i = 0; i < objectArray.length; ++i) {
            eu_1 eu_12 = map.get(objectArray[i]);
            arw_1 arw_13 = new arw_1("Import " + (Short)objectArray[i] + "[" + eu_12.getName() + "]", cTm);
            arw_12.add(arw_13);
            arw_1 arw_14 = new arw_1("id: " + eu_12.aIi());
            arw_13.add(arw_14);
            arw_14 = new arw_1("name: " + eu_12.getName());
            arw_13.add(arw_14);
            arw_14 = new arw_1("crc: " + eu_12.aJE());
            arw_13.add(arw_14);
        }
        return arw_12;
    }

    private static arw_1 b(et_1 et_12) {
        arw_1 arw_12;
        arw_1<et_1> arw_13 = new arw_1<et_1>("Header", cTk, et_12);
        if (et_12.aIq()) {
            arw_12 = new arw_1("optimized");
            arw_13.add(arw_12);
        }
        if (et_12.aJw()) {
            arw_12 = new arw_1("use Atlas");
            arw_13.add(arw_12);
        }
        if (et_12.aJx()) {
            arw_12 = new arw_1("use localIndex");
            arw_13.add(arw_12);
        }
        if (et_12.aJz()) {
            arw_12 = new arw_1("use perfect Hit Test");
            arw_13.add(arw_12);
        }
        if (et_12.aJB()) {
            arw_12 = new arw_1("use transform index");
            arw_13.add(arw_12);
        }
        arw_12 = new arw_1("frameRate: " + et_12.aJv());
        arw_13.add(arw_12);
        return arw_13;
    }

    private static arw_1 f(Anm anm) {
        assert (anm.aIE() != null);
        arw_1 arw_12 = new arw_1("Transformations", cTl);
        arw_12.add(new arw_1("Rotations: " + anm.aIE().aJa().length / 4, cTm));
        arw_12.add(new arw_1("Translation: " + anm.aIE().aJb().length / 2, cTm));
        arw_12.add(new arw_1("Couleurs: " + anm.aIE().aIZ().length / 4, cTm));
        arw_12.add(new arw_1("Actions: " + anm.aIE().aIH().length, cTm));
        return arw_12;
    }

    private static arw_1 g(Anm anm) {
        Object object;
        arw_1 arw_12 = new arw_1("Textures (1)", cTl);
        String string = arr_1.fQ(anm.aKJ());
        BufferedImage bufferedImage = null;
        try {
            object = axe_2.gJ(string);
            bufferedImage = axe_2.b((BufferedImage)object, false);
        }
        catch (Exception exception) {
            cTj.error((Object)exception.getMessage());
        }
        object = new ars_1("Texture ", cTm, bufferedImage);
        arw_12.add((MutableTreeNode)object);
        arw_1 arw_13 = new arw_1("name: " + string);
        ((DefaultMutableTreeNode)object).add(arw_13);
        return arw_12;
    }

    private static String fQ(String string) {
        et_1 et_12 = (et_1)arr_1.fR((String)"Header").att;
        String string2 = et_12.aJw() ? "Atlas/" : "Textures/";
        String string3 = cTo.getUserObject().toString();
        return fq_0.bL(string3) + "/" + string2 + string + ".tga";
    }

    private static arw_1 h(Anm anm) {
        Collection<fc_1> collection = anm.bGV().aIe().aKv();
        int n = collection.size();
        arw_1 arw_12 = new arw_1("Shapes (" + n + ")", cTl);
        ImmutableList immutableList = Ordering.natural().onResultOf((Function)new art_2()).immutableSortedCopy(collection);
        for (fc_1 fc_12 : immutableList) {
            aru_1 aru_12 = new aru_1("Shape " + fc_12.aIi(), cTm, fc_12);
            arw_12.add(aru_12);
            arr_1.a((arw_1)aru_12, fc_12);
        }
        return arw_12;
    }

    static BufferedImage aC(short s) {
        arw_1 arw_12 = arr_1.fR("Textures");
        if (arw_12 == null) {
            cTj.error((Object)"noeud Textures inconnu");
            return null;
        }
        TreeNode treeNode = arw_12.getChildAt(s);
        if (treeNode == null) {
            return null;
        }
        return (BufferedImage)((arw_1)treeNode).att;
    }

    private static arw_1 fR(String string) {
        Enumeration<TreeNode> enumeration = cTo.children();
        while (enumeration.hasMoreElements()) {
            arw_1 arw_12;
            TreeNode treeNode = enumeration.nextElement();
            if (!(treeNode instanceof arw_1) || !(arw_12 = (arw_1)treeNode).getUserObject().toString().startsWith(string)) continue;
            return arw_12;
        }
        return null;
    }

    private static arw_1 i(Anm anm) {
        List<fk_0> list = anm.bGV().aIF().aIt();
        arw_1 arw_12 = new arw_1("Sprites (" + list.size() + ")", cTl);
        for (fk_0 fk_02 : list) {
            Object object = "";
            if (fk_02 == null) continue;
            if (fk_02.getName() != null) {
                object = " [" + fk_02.getName() + "]";
            }
            arw_1 arw_13 = null;
            try {
                String string = arr_1.e(fk_02);
                arw_13 = new arw_1("Sprite " + fk_02.aIi() + " " + (String)object + "(" + string + ")", cTm);
                arw_12.add(arw_13);
                arw_1 arw_14 = new arw_1("id: " + fk_02.aIi());
                arw_13.add(arw_14);
                arw_14 = new arw_1("flags: " + (fk_02.aIl() & 0xFF));
                arw_13.add(arw_14);
                if (fk_02.getName() != null) {
                    arw_14 = new arw_1("name: " + fk_02.getName());
                    arw_13.add(arw_14);
                    arw_14 = new arw_1("crc: " + fk_02.aIj());
                    arw_13.add(arw_14);
                    arw_14 = new arw_1("baseNameCRC: " + fk_02.aIk());
                    arw_13.add(arw_14);
                }
                arr_1.a(arw_13, fk_02);
            }
            catch (Exception exception) {
                if (arw_13 != null) {
                    arw_13.bXH = cTn;
                }
                cTj.error((Object)"", (Throwable)exception);
            }
        }
        return arw_12;
    }

    private static String e(fk_0 fk_02) {
        switch (fk_02.aKA()) {
            case aAP: {
                return " index\u00e9";
            }
            case aAM: {
                return "sprite unique";
            }
            case aAN: {
                return "sprite sans action";
            }
            case aAO: {
                return "frame unique";
            }
        }
        return "";
    }

    private static void a(arw_1 cloneable, fk_0 fk_02) {
        Cloneable cloneable2;
        int n = fk_02.aIs();
        if (n <= 0) {
            return;
        }
        if (n > 1) {
            cloneable2 = new arw_1("Frames (" + n + ")", Color.DARK_GRAY);
            ((DefaultMutableTreeNode)cloneable).add((MutableTreeNode)((Object)cloneable2));
            cloneable = cloneable2;
        }
        cloneable2 = new ArrayList();
        for (int i = 0; i < n; ++i) {
            Object object;
            Object object2;
            arw_1 arw_12;
            arw_1 arw_13;
            int n2 = fk_02.mI(i);
            if (n > 1) {
                arw_13 = new arw_1("Frame " + i);
                ((DefaultMutableTreeNode)cloneable).add(arw_13);
            } else {
                arw_13 = cloneable;
            }
            if (n2 > 1) {
                arw_12 = new arw_1("Sprites (" + n2 + ")");
                arw_13.add(arw_12);
            } else {
                arw_12 = arw_13;
            }
            for (int j = 0; j < n2; ++j) {
                fk_02.aKF();
                object2 = new ef_2();
                object = new ef_2();
                short s = fk_02.d((ef_2)object2, (ef_2)object);
                arr_1.a(arw_12, (ef_2)object, s);
            }
            ((ArrayList)cloneable2).clear();
            fk_02.a(i, (ArrayList<eh_2>)cloneable2);
            if (((ArrayList)cloneable2).size() <= 0) continue;
            arw_1 arw_14 = new arw_1("Actions (" + ((ArrayList)cloneable2).size() + ")");
            arw_13.add(arw_14);
            object2 = ((ArrayList)cloneable2).iterator();
            while (object2.hasNext()) {
                object = (eh_2)object2.next();
                arw_14.add(new arw_1("action: " + ((eh_2)object).aJd().name() + " "));
            }
        }
    }

    private static void a(arw_1 arw_12, ef_2 ef_22, int n) {
        arw_1 arw_13 = new arw_1("Sprite " + n, Color.MAGENTA);
        arw_12.add(arw_13);
        arw_1 arw_14 = new arw_1("id: " + n);
        arw_13.add(arw_14);
        if (ef_22.aIU() != 1.0f || ef_22.aIV() != 1.0f || ef_22.aIW() != 1.0f || ef_22.aIX() != 1.0f) {
            arw_14 = new arw_1("color: " + ef_22.aIU() + "  " + ef_22.aIV() + "  " + ef_22.aIW() + "  " + ef_22.aIX());
            arw_13.add(arw_14);
        }
        arw_14 = new arw_1("matrix:(x) " + ef_22.aIM() + "  " + ef_22.aIO() + "   " + ef_22.aIQ());
        arw_13.add(arw_14);
        arw_14 = new arw_1("matrix:(y) " + ef_22.aIN() + "  " + ef_22.aIP() + "   " + ef_22.aIR());
        arw_13.add(arw_14);
    }

    private static void a(arw_1 arw_12, fc_1 fc_12) {
        arw_1 arw_13 = new arw_1("id: " + fc_12.aIi());
        arw_12.add(arw_13);
        arw_13 = new arw_1("textureIndex: " + fc_12.aKo());
        arw_12.add(arw_13);
        arw_13 = new arw_1("width: " + fc_12.aKt() + "  height: " + fc_12.aKu());
        arw_12.add(arw_13);
        arw_13 = new arw_1("offsetX: " + fc_12.getOffsetX() + "  offsetY: " + fc_12.getOffsetY());
        arw_12.add(arw_13);
        arw_13 = new arw_1("top: " + fc_12.aKp() + "  left: " + fc_12.aKq() + "  bottom: " + fc_12.aKr() + "  right: " + fc_12.aKs());
        arw_12.add(arw_13);
    }
}

