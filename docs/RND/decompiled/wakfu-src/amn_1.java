/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;
import org.apache.log4j.Logger;

/*
 * Renamed from amn
 */
public class amn_1 {
    private static final boolean cHw = false;
    protected static final Logger cHx = Logger.getLogger(amn_1.class);
    private static final amn_1 cHy;
    private static final ArrayList<ArrayList<Enum>> cHz;
    private static int[][] cHA;
    private static HashMap<Enum, ArrayList<Enum>> cHB;
    private static HashMap<Enum, ArrayList<Enum>> cHC;
    private static boolean bXs;
    private static final int cHD = -5;
    private static final int cHE = -1;

    public static amn_1 bCV() {
        return cHy;
    }

    public void bkZ() {
        if (bXs) {
            throw new aml_1("Tentative d'initialisation de la table d'analyse syntaxique alors qu'elle est d\u00e9j\u00e0 initialis\u00e9e");
        }
        this.bCW();
        for (amo_2 amo_22 : amo_2.values()) {
            cHB.put(amo_22, this.a(amo_22));
        }
        for (amo_2 amo_22 : amo_2.values()) {
            cHC.put(amo_22, new ArrayList());
        }
        this.bCZ();
        cHA = new int[amo_2.values().length][amr_2.values().length];
        this.bCY();
        bXs = true;
        cHx.info((Object)"[Analyse Syntaxique des Crit\u00e8res] Analyseur Syntaxique initialis\u00e9.");
    }

    private void bCW() {
        this.a(amo_2.cHM, new Enum[]{amo_2.cHF, amr_2.cIm});
        this.a(amo_2.cHG, new Enum[]{amr_2.cIk, amo_2.cHF});
        this.a(amo_2.cHG, new Enum[]{amr_2.cIb, amo_2.cHF});
        this.a(amo_2.cHK, new Enum[]{amr_2.cIk, amo_2.cHK});
        this.a(amo_2.cHK, new Enum[]{amr_2.cIc, amo_2.cHK});
        this.a(amo_2.cHF, new Enum[]{amo_2.cHK, amo_2.cHG});
        this.a(amo_2.cHG, new Enum[]{amr_2.cIl});
        this.a(amo_2.cHK, new Enum[]{amr_2.cIh});
        this.a(amo_2.cHK, new Enum[]{amr_2.cIj});
        this.a(amo_2.cHK, new Enum[]{amr_2.cIi});
        this.a(amo_2.cHK, new Enum[]{amr_2.cId, amr_2.cIf, amo_2.cHH, amr_2.cIg});
        this.a(amo_2.cHK, new Enum[]{amr_2.cIf, amo_2.cHF, amr_2.cIg});
        this.a(amo_2.cHH, new Enum[]{amo_2.cHI});
        this.a(amo_2.cHH, new Enum[]{amr_2.cIl});
        this.a(amo_2.cHI, new Enum[]{amo_2.cHF, amo_2.cHJ});
        this.a(amo_2.cHJ, new Enum[]{amr_2.cIe, amo_2.cHI});
        this.a(amo_2.cHJ, new Enum[]{amr_2.cIl});
    }

    private void a(amo_2 amo_22, Enum[] enumArray) {
        ArrayList<Enum> arrayList = new ArrayList<Enum>();
        arrayList.add(amo_22);
        for (Enum enum_ : enumArray) {
            if (!(enum_ instanceof amr_2) && !(enum_ instanceof amo_2)) {
                throw new aml_1("Erreur d'ans l'ajout d'une r\u00e8gle dans la table d'analyse syntaxique - Element de type inattendu");
            }
            arrayList.add(enum_);
        }
        cHz.add(arrayList);
    }

    private String bCX() {
        Object object = "/**** Grammaire reconnue ****/\n";
        for (ArrayList<Enum> arrayList : cHz) {
            for (int i = 0; i < arrayList.size(); ++i) {
                object = (String)object + arrayList.get(i).name();
                object = i == 0 ? (String)object + " -> " : (String)object + " ";
            }
            object = (String)object + "\n";
        }
        return object;
    }

    private void bCY() {
        this.bDa();
        for (int i = 0; i < cHz.size(); ++i) {
            ArrayList arrayList;
            ArrayList<Enum> arrayList2 = cHz.get(i);
            if (arrayList2.get(1) instanceof amr_2 && arrayList2.get(1) != amr_2.cIl) {
                if (cHA[arrayList2.get(0).ordinal()][arrayList2.get(1).ordinal()] != -1) {
                    amn_1.cHA[arrayList2.get((int)0).ordinal()][arrayList2.get((int)1).ordinal()] = -2;
                    bXs = false;
                    throw new aml_1("Cr\u00e9ation d'une table d'analyse \u00e0 partir d'une grammaire ambig\u00fce - Verifiez ou modifiez la grammaire");
                }
                amn_1.cHA[arrayList2.get((int)0).ordinal()][arrayList2.get((int)1).ordinal()] = i;
                continue;
            }
            if (arrayList2.get(1) instanceof amo_2) {
                Object object2;
                arrayList = (ArrayList)cHB.get(arrayList2.get(1)).clone();
                for (Object object2 : arrayList) {
                    if (!(object2 instanceof amr_2) || object2 == amr_2.cIl) continue;
                    if (cHA[arrayList2.get(0).ordinal()][((Enum)object2).ordinal()] != -1) {
                        amn_1.cHA[arrayList2.get((int)0).ordinal()][((Enum)object2).ordinal()] = -2;
                        bXs = false;
                        throw new aml_1("Cr\u00e9ation d'une table d'analyse \u00e0 partir d'une grammaire ambig\u00fce - Verifiez ou modifiez la grammaire");
                    }
                    amn_1.cHA[arrayList2.get((int)0).ordinal()][((Enum)object2).ordinal()] = i;
                }
                if (!arrayList.contains((Object)amr_2.cIl)) continue;
                ArrayList arrayList3 = (ArrayList)cHC.get(arrayList2.get(0)).clone();
                object2 = arrayList3.iterator();
                while (object2.hasNext()) {
                    Enum enum_ = (Enum)object2.next();
                    if (!(enum_ instanceof amr_2) || enum_ == amr_2.cIl) continue;
                    if (cHA[arrayList2.get(0).ordinal()][enum_.ordinal()] != -1) {
                        amn_1.cHA[arrayList2.get((int)0).ordinal()][enum_.ordinal()] = -2;
                        bXs = false;
                        throw new aml_1("Cr\u00e9ation d'une table d'analyse \u00e0 partir d'une grammaire ambig\u00fce - Verifiez ou modifiez la grammaire");
                    }
                    amn_1.cHA[arrayList2.get((int)0).ordinal()][enum_.ordinal()] = i;
                }
                continue;
            }
            if (arrayList2.get(1) != amr_2.cIl) continue;
            arrayList = (ArrayList)cHC.get(arrayList2.get(0)).clone();
            for (Object object2 : arrayList) {
                if (!(object2 instanceof amr_2) || object2 == amr_2.cIl) continue;
                if (cHA[arrayList2.get(0).ordinal()][((Enum)object2).ordinal()] != -1) {
                    amn_1.cHA[arrayList2.get((int)0).ordinal()][((Enum)object2).ordinal()] = -2;
                    bXs = false;
                    throw new aml_1("Cr\u00e9ation d'une table d'analyse \u00e0 partir d'une grammaire ambig\u00fce - Verifiez ou modifiez la grammaire");
                }
                amn_1.cHA[arrayList2.get((int)0).ordinal()][((Enum)object2).ordinal()] = i;
            }
        }
        amn_1.cHA[amo_2.cHN.ordinal()][amr_2.cIm.ordinal()] = -5;
    }

    private ArrayList<Enum> a(Enum enum_) {
        ArrayList<Enum> arrayList = new ArrayList<Enum>();
        if (enum_ instanceof amr_2) {
            if (!arrayList.contains(enum_)) {
                arrayList.add(enum_);
            }
            return arrayList;
        }
        if (enum_ instanceof amo_2) {
            for (ArrayList<Enum> arrayList2 : cHz) {
                if (arrayList2.get(0) != enum_ || arrayList2.get(1) != amr_2.cIl || arrayList.contains((Object)amr_2.cIl)) continue;
                arrayList.add(amr_2.cIl);
            }
            boolean bl = true;
            while (bl) {
                bl = false;
                block2: for (ArrayList arrayList3 : cHz) {
                    if (arrayList3.get(0) != enum_) continue;
                    int n = 1;
                    while (true) {
                        boolean bl2 = false;
                        ArrayList arrayList4 = (ArrayList)this.a((Enum)arrayList3.get(n)).clone();
                        if (arrayList4.contains((Object)amr_2.cIl)) {
                            bl2 = true;
                            arrayList4.remove((Object)amr_2.cIl);
                        }
                        for (Enum enum_2 : arrayList4) {
                            if (arrayList.contains(enum_2)) continue;
                            arrayList.add(enum_2);
                            bl = true;
                        }
                        if (!bl2) continue block2;
                        if (n == arrayList3.size() - 1) {
                            if (arrayList.contains((Object)amr_2.cIl)) continue block2;
                            arrayList.add(amr_2.cIl);
                            bl = true;
                            continue block2;
                        }
                        ++n;
                    }
                }
            }
        }
        return arrayList;
    }

    private boolean b(Enum enum_) {
        boolean bl = false;
        if (amo_2.cHM == enum_ && !cHC.get(enum_).contains((Object)amr_2.cIm)) {
            cHC.get(enum_).add(amr_2.cIm);
            bl = true;
        }
        if (enum_ instanceof amo_2) {
            for (ArrayList<Enum> iterator : cHz) {
                for (int i = 2; i < iterator.size(); ++i) {
                    if (iterator.get(i - 1) != enum_ || !(iterator.get(i) instanceof amr_2) || cHC.get(enum_).contains(iterator.get(i))) continue;
                    cHC.get(enum_).add(iterator.get(i));
                    bl = true;
                }
            }
        }
        if (enum_ instanceof amo_2) {
            boolean bl2 = true;
            while (bl2) {
                bl2 = false;
                for (ArrayList<Enum> arrayList : cHz) {
                    block4: for (int i = 2; i < arrayList.size(); ++i) {
                        if (arrayList.get(i - 1) != enum_ || !(arrayList.get(i) instanceof amo_2)) continue;
                        int n = i;
                        while (true) {
                            Object object;
                            Object object2;
                            boolean bl3;
                            if (bl3 = ((ArrayList)(object2 = (ArrayList)cHB.get(arrayList.get(n)).clone())).contains((Object)amr_2.cIl)) {
                                ((ArrayList)object2).remove((Object)amr_2.cIl);
                            }
                            Object object3 = ((ArrayList)object2).iterator();
                            while (object3.hasNext()) {
                                object = (Enum)object3.next();
                                if (cHC.get(enum_).contains(object)) continue;
                                cHC.get(enum_).add((Enum)object);
                                bl2 = true;
                                bl = true;
                            }
                            if (!bl3) continue block4;
                            if (n == arrayList.size() - 1 && arrayList.get(0) != enum_) {
                                object3 = (ArrayList)cHC.get(arrayList.get(0)).clone();
                                object = ((ArrayList)object3).iterator();
                                while (object.hasNext()) {
                                    Enum enum_2 = (Enum)object.next();
                                    if (cHC.get(enum_).contains(enum_2)) continue;
                                    cHC.get(enum_).add(enum_2);
                                    bl2 = true;
                                    bl = true;
                                }
                                continue block4;
                            }
                            if (n == arrayList.size() - 1) continue block4;
                            ++n;
                        }
                    }
                }
                for (ArrayList<Enum> arrayList : cHz) {
                    if (arrayList.get(arrayList.size() - 1) != enum_ || arrayList.get(0) == enum_) continue;
                    ArrayList arrayList2 = (ArrayList)cHC.get(arrayList.get(0)).clone();
                    for (Object object2 : arrayList2) {
                        if (cHC.get(enum_).contains(object2)) continue;
                        cHC.get(enum_).add((Enum)object2);
                        bl2 = true;
                        bl = true;
                    }
                }
            }
        }
        return bl;
    }

    private void bCZ() {
        int n;
        do {
            n = 0;
            for (amo_2 amo_22 : amo_2.values()) {
                if (this.b(amo_22)) continue;
                ++n;
            }
        } while (n != amo_2.values().length);
    }

    private void bDa() {
        bXs = false;
        for (int i = 0; i < cHA.length; ++i) {
            for (int j = 0; j < cHA[i].length; ++j) {
                amn_1.cHA[i][j] = -1;
            }
        }
    }

    public String bDb() {
        Object object = "\n/**** Table d'analyse ****/\n\n";
        for (int i = 0; i < cHA.length; ++i) {
            object = (String)object + "| ";
            for (int j = 0; j < cHA[i].length; ++j) {
                object = cHA[i][j] >= 0 && cHA[i][j] < 10 ? (String)object + " " + cHA[i][j] : (cHA[i][j] == -5 ? (String)object + "OK" : (cHA[i][j] == -1 ? (String)object + "##" : (String)object + cHA[i][j]));
                object = (String)object + " | ";
            }
            object = (String)object + "\n";
        }
        return object;
    }

    public static amq_1 q(List<anc_1> list) {
        amq_1 amq_12 = new amq_1();
        amq_1 amq_13 = new amq_1();
        ArrayList<anc_1> arrayList = new ArrayList<anc_1>();
        Stack<Enum> stack = new Stack<Enum>();
        list.add(new anz_2());
        stack.push(amo_2.cHN);
        stack.push(amo_2.cHF);
        int n = 0;
        Stack<Integer> stack2 = new Stack<Integer>();
        int n2 = 0;
        boolean bl = false;
        Stack<Object[]> stack3 = new Stack<Object[]>();
        block4: while (!stack.isEmpty() && n2 < list.size()) {
            if (list.get(n2).bDM() == stack.peek() && list.get(n2).bDM() != amr_2.cIm) {
                if (list.get(n2).bDM() instanceof amr_2) {
                    list.get(n2).ti(n);
                }
                if (!stack2.isEmpty()) {
                    int n3 = (Integer)stack2.pop();
                    stack2.push(n3 - 1);
                    while (!stack2.isEmpty() && (Integer)stack2.peek() < 1) {
                        stack2.pop();
                        --n;
                    }
                }
                stack.pop();
                if (bl && list.get(++n2).bDM() == amr_2.cIf) {
                    Object[] objectArray = (Object[])stack3.pop();
                    objectArray[0] = (Integer)objectArray[0] + 1;
                    stack3.push(objectArray);
                    continue;
                }
                if (bl && list.get(n2).bDM() == amr_2.cIg) {
                    Object[] objectArray = (Object[])stack3.pop();
                    objectArray[0] = (Integer)objectArray[0] - 1;
                    if ((Integer)objectArray[0] == -1) {
                        if (!amq_12.aJG() || ((anq_1)objectArray[1]).bDP().size() != 0) {
                            ((anq_1)objectArray[1]).e(amq_12.bDm());
                        }
                        amq_12 = (amq_1)objectArray[2];
                        amq_13 = (amq_1)objectArray[3];
                    } else {
                        stack3.push(objectArray);
                    }
                    if (!stack3.isEmpty()) continue;
                    bl = false;
                    continue;
                }
                if (!bl || list.get(n2).bDM() != amr_2.cIe) continue;
                Object[] objectArray = (Object[])stack3.pop();
                ((anq_1)objectArray[1]).e(amq_12.bDm());
                amq_12 = new amq_1();
                amq_13 = new amq_1();
                stack3.push(objectArray);
                continue;
            }
            switch (cHA[((Enum)stack.peek()).ordinal()][list.get(n2).bDM().ordinal()]) {
                case -5: {
                    stack.pop();
                    break block4;
                }
                case -1: {
                    throw new aml_1("[Analyse syntaxique des crit\u00e8res]  Erreur de syntaxe");
                }
                default: {
                    int n4;
                    ArrayList<Enum> arrayList2 = null;
                    if (cHA[((Enum)stack.peek()).ordinal()][list.get(n2).bDM().ordinal()] == 1) {
                        arrayList2 = cHz.get(2);
                        list.remove(n2);
                        list.add(n2, new ane_1("-"));
                    } else if (cHA[((Enum)stack.peek()).ordinal()][list.get(n2).bDM().ordinal()] == 3) {
                        arrayList2 = cHz.get(4);
                        list.remove(n2);
                        list.add(n2, new and_1("-"));
                    } else {
                        arrayList2 = cHz.get(cHA[((Enum)stack.peek()).ordinal()][list.get(n2).bDM().ordinal()]);
                    }
                    if (arrayList2.size() == 2 && arrayList2.get(1) == amr_2.cIl) {
                        if (!stack2.isEmpty()) {
                            n4 = (Integer)stack2.pop();
                            stack2.push(n4 - 1);
                            while (!stack2.isEmpty() && (Integer)stack2.peek() < 1) {
                                stack2.pop();
                                --n;
                            }
                        }
                        stack.pop();
                        continue block4;
                    }
                    if (!stack2.isEmpty()) {
                        n4 = (Integer)stack2.pop();
                        stack2.push(n4 - 1);
                    }
                    stack2.push(arrayList2.size() - 1);
                    ++n;
                    stack.pop();
                    for (n4 = arrayList2.size() - 1; n4 > 0; --n4) {
                        stack.push(arrayList2.get(n4));
                    }
                    if (arrayList.contains(list.get(n2))) continue block4;
                    arrayList.add(list.get(n2));
                    if (list.get(n2).bDM() == amr_2.cIb || list.get(n2).bDM() == amr_2.cIc) {
                        while (true) {
                            if (amq_12.aJG()) {
                                amq_12 = amq_13 = new amq_1(list.get(n2));
                                continue block4;
                            }
                            if (amq_13.bDj() == null && !amq_13.bDf() && !amq_13.bDg()) {
                                amq_13.a(new amq_1(list.get(n2)));
                                amq_13 = amq_13.bDj();
                                continue block4;
                            }
                            if (amq_13.bDi() == null && !amq_13.bDf()) {
                                amq_13.b(new amq_1(list.get(n2)));
                                amq_13 = amq_13.bDi();
                                continue block4;
                            }
                            if (amq_13.bDh().bDN() < n && !amq_13.bDf()) {
                                amq_13.b(new amq_1(list.get(n2), amq_13.bDi(), null));
                                amq_13 = amq_13.bDi();
                                continue block4;
                            }
                            if (amq_13.bDe() && amq_13.bDh().bDN() >= n) {
                                amq_12 = amq_13 = new amq_1(list.get(n2), amq_13, null);
                                continue block4;
                            }
                            if (amq_13.bDe() || amq_13.bDh().bDN() < n) continue;
                            amq_13 = amq_13.bDk();
                        }
                    }
                    if (list.get(n2).bDM() == amr_2.cIh || list.get(n2).bDM() == amr_2.cIi || list.get(n2).bDM() == amr_2.cIj) {
                        while (true) {
                            if (amq_12.aJG()) {
                                amq_12 = amq_13 = new amq_1(list.get(n2));
                                continue block4;
                            }
                            if (amq_13.bDj() == null && !amq_13.bDf() && !amq_13.bDg()) {
                                amq_13.a(new amq_1(list.get(n2)));
                                amq_13 = amq_13.bDj();
                                continue block4;
                            }
                            if (amq_13.bDi() == null && !amq_13.bDf()) {
                                amq_13.b(new amq_1(list.get(n2)));
                                amq_13 = amq_13.bDi();
                                continue block4;
                            }
                            if (amq_13.bDe()) continue block4;
                            amq_13 = amq_13.bDk();
                        }
                    }
                    if (list.get(n2).bDM() != amr_2.cId) continue block4;
                    bl = true;
                    while (true) {
                        if (amq_12.aJG()) {
                            amq_12 = amq_13 = new amq_1(list.get(n2));
                            break;
                        }
                        if (amq_13.bDj() == null && !amq_13.bDf() && !amq_13.bDg()) {
                            amq_13.a(new amq_1(list.get(n2)));
                            amq_13 = amq_13.bDj();
                            break;
                        }
                        if (amq_13.bDi() == null && !amq_13.bDf()) {
                            amq_13.b(new amq_1(list.get(n2)));
                            amq_13 = amq_13.bDi();
                            break;
                        }
                        if (amq_13.bDe()) break;
                        amq_13 = amq_13.bDk();
                    }
                    stack3.push(new Object[]{-1, list.get(n2), amq_12, amq_13});
                    amq_12 = new amq_1();
                    amq_13 = new amq_1();
                    continue block4;
                }
            }
        }
        if (!stack.isEmpty()) {
            throw new aml_1("[Analyse syntaxique des crit\u00e8es] Erreur de syntaxe");
        }
        return amq_12;
    }

    private static List<anc_1> a(List<anc_1> list, int n) {
        if (n > 0) {
            amn_1.a(list, n - 1);
            for (int i = 0; i < n; ++i) {
                if (list.get(i).bDN() < list.get(n).bDN() || list.get(i).bDN() <= list.get(n).bDN()) continue;
                anc_1 anc_12 = list.remove(n);
                list.add(i, anc_12);
            }
        }
        return list;
    }

    static {
        bXs = false;
        cHy = new amn_1();
        cHz = new ArrayList();
        cHB = new HashMap();
        cHC = new HashMap();
        try {
            cHy.bkZ();
        }
        catch (aml_1 aml_12) {
            cHx.error((Object)"CriteriaException during CriterionSyntaxeAnalyser", (Throwable)aml_12);
        }
        cHB = null;
        cHC = null;
    }
}

