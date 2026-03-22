/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TIntObjectProcedure;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.regex.Pattern;

/*
 * Renamed from aSM
 */
public final class asm_0
extends aRY {
    public static final byte ePm = 0;
    public static final byte ePn = 1;
    public static final byte ePo = 2;
    public static final byte ePp = 3;
    public static final byte ePq = 4;
    public static final byte ePr = 5;
    public static final byte ePs = 6;
    public static final byte ePt = 7;
    public static final byte ePu = 8;
    public static final byte ePv = 9;
    public static final byte ePw = 10;
    public static final byte ePx = 11;
    private final Object[] ePy;
    private final byte ePz;

    public asm_0(byte by, Object ... objectArray) {
        this.ePz = by;
        this.ePy = objectArray;
    }

    @Override
    public boolean isValid() {
        switch (this.ePz) {
            case 0: {
                return true;
            }
            case 1: 
            case 2: 
            case 3: 
            case 6: {
                if (this.ePy != null && this.ePy.length > 0 && this.ePy[0] instanceof Integer) {
                    return true;
                }
            }
            case 4: 
            case 5: 
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: {
                if (this.ePy == null || this.ePy.length != 1 || !(this.ePy[0] instanceof String)) break;
                return true;
            }
        }
        aqh_0.cBI().jI("Type de recherche inconnue " + this.ePz);
        return false;
    }

    @Override
    public void bGy() {
        switch (this.ePz) {
            case 0: {
                this.cDA();
                break;
            }
            case 1: {
                this.aT((byte)2);
                break;
            }
            case 3: 
            case 6: {
                this.aT((byte)3);
                break;
            }
            case 2: {
                this.aS((byte)3);
                break;
            }
            case 7: {
                Pattern pattern = Pattern.compile(((String)this.ePy[0]).toLowerCase());
                StringBuilder stringBuilder = new StringBuilder("Result :\r\n========\r\n");
                TIntObjectHashMap<fqU> tIntObjectHashMap = bao.cZg();
                int[] nArray = new int[]{0};
                tIntObjectHashMap.forEachEntry((TIntObjectProcedure)new aSN(this, pattern, stringBuilder, nArray));
                stringBuilder.append("========\r\n").append(nArray[0]).append(" \u00e9tats trouv\u00e9s");
                aqh_0.cBI().n(stringBuilder.toString(), 0xFFFFFF);
                break;
            }
            case 4: {
                List<bgv_2> list = asm_0.jU((String)this.ePy[0]);
                String string = asm_0.b(list, (String)this.ePy[0]);
                aqh_0.cBI().n(string, 0xFFFFFF);
                break;
            }
            case 8: {
                Pattern pattern = Pattern.compile(((String)this.ePy[0]).toLowerCase());
                StringBuilder stringBuilder = new StringBuilder("Result :\r\n========\r\n");
                TIntObjectHashMap<bEq> tIntObjectHashMap = bEr.dSi().cZg();
                int[] nArray = new int[]{0};
                tIntObjectHashMap.forEachEntry((TIntObjectProcedure)new aso_0(this, pattern, stringBuilder, nArray));
                stringBuilder.append("========\r\n").append(nArray[0]).append(" sets found");
                aqh_0.cBI().n(stringBuilder.toString(), 0xFFFFFF);
                break;
            }
            case 5: {
                Pattern pattern = Pattern.compile(((String)this.ePy[0]).toLowerCase());
                StringBuilder stringBuilder = new StringBuilder("Result :\r\n========\r\n");
                int[] nArray = new int[]{0};
                bja_1.drJ().drK().forEach(bjz_12 -> {
                    if (pattern.matcher(bjz_12.getName().toLowerCase()).find()) {
                        stringBuilder.append(bjz_12.aWP()).append(" : ").append(bjz_12.getName()).append("\r\n");
                        nArray[0] = nArray[0] + 1;
                    }
                });
                stringBuilder.append("========\r\n").append(nArray[0]).append(" breeds found");
                aqh_0.cBI().n(stringBuilder.toString(), 0xFFFF00);
                break;
            }
            case 9: {
                Pattern pattern = Pattern.compile(((String)this.ePy[0]).toLowerCase());
                StringBuilder stringBuilder = new StringBuilder("Result :\r\n========\r\n");
                int[] nArray = new int[]{0};
                bcb_1.hDb.a(new aSP(this, pattern, stringBuilder, nArray));
                stringBuilder.append("========\r\n").append(nArray[0]).append(" items found");
                aqh_0.cBI().n(stringBuilder.toString(), 0xFFFF00);
                break;
            }
            case 10: {
                Pattern pattern = Pattern.compile(((String)this.ePy[0]).toLowerCase());
                StringBuilder stringBuilder = new StringBuilder("Result :\r\n========\r\n");
                TIntObjectHashMap<bmt_0> tIntObjectHashMap = bmb_0.eeV().cZg();
                int[] nArray = new int[]{0};
                tIntObjectHashMap.forEachEntry((TIntObjectProcedure)new aSQ(this, pattern, stringBuilder, nArray));
                stringBuilder.append("========\r\n").append(nArray[0]).append(" items found");
                aqh_0.cBI().n(stringBuilder.toString(), 0xFFFFFF);
                break;
            }
            case 11: {
                String string = ((String)this.ePy[0]).toLowerCase();
                StringBuilder stringBuilder = new StringBuilder("Result :\r\n========\r\n");
                bmr_1.iEC.dxu().forEach(eKR2 -> {
                    eKV eKV2 = eKR2.fyZ();
                    String string2 = aum_0.cWf().a(15, (long)eKV2.azv(), new Object[0]).toLowerCase();
                    if (string2.contains(string)) {
                        bgv_2 bgv_22 = (bgv_2)fgD.fXh().Vd(eKV2.azv());
                        String string3 = aum_0.cWf().c("item.rarity." + bgv_22.dwg().name(), new Object[0]);
                        stringBuilder.append(eKR2.d()).append(" : ").append(string2).append(" (").append(string3).append(")\n");
                    }
                });
                aqh_0.cBI().n(stringBuilder.toString(), 0xFFFFFF);
                break;
            }
        }
    }

    public static List<bgv_2> jU(String string) {
        if (string == null) {
            return List.of();
        }
        String string3 = BH.aT(string);
        String string4 = ".*?" + string3 + ".*?";
        Function<String, Boolean> function = BH.bh(string4) && !string3.matches("[\\w\\s]+") ? string2 -> string2.matches(string4) : string2 -> string2.contains(string3);
        ArrayList<bgv_2> arrayList = new ArrayList<bgv_2>();
        for (bgv_2 bgv_22 : bEm.dSb().fXi()) {
            if (!function.apply(bgv_22.dah()).booleanValue()) continue;
            arrayList.add(bgv_22);
        }
        return arrayList;
    }

    public static String b(List<bgv_2> list, String string) {
        StringBuilder stringBuilder = new StringBuilder("\nResult for \"").append(string).append("\" :\r\n========\r\n");
        for (bgv_2 bgv_22 : list) {
            stringBuilder.append(bgv_22.d()).append(" : ").append(bgv_22.getName());
            if (bgv_22.dGh().fZq().length > 0 && bgv_22.dwg() != null) {
                String string2 = aum_0.cWf().c("item.rarity." + bgv_22.dwg().name(), new Object[0]);
                stringBuilder.append(' ').append('(').append(string2).append(')');
            }
            stringBuilder.append("\r\n");
        }
        stringBuilder.append("========\r\n").append(list.size()).append(" items found");
        return stringBuilder.toString();
    }

    private void cDA() {
        asm_0.jF("/!\\ Don't type search but these commands : si \"itemName\" -> search itemId, sm monsterId (limit) -> search monsters with this Id (if another number is given, its limit the search result. It is 10 by default), sm monsterId (limit) (nation | territory | instance) optionId -> search monsters with this id in the given location (when no option is given it will search globally) smi \"name\" -> search monsterId, search quest \"questName\" -> search questId, ss \"monsterName\" -> search the states for the monsters with this name, sr \"recipeName\" -> search the recipe with this name.");
    }

    private void aS(byte by) {
        ayf_2 ayf_22;
        ns_0 ns_02 = new ns_0();
        ns_02.D(this.ePz);
        ns_02.Q((short)212);
        ns_02.C(by);
        ns_02.nX((Integer)this.ePy[0]);
        ns_02.nX((Integer)this.ePy[1]);
        if (this.ePy.length > 2) {
            ns_02.cT((String)this.ePy[2]);
            ns_02.nX((Integer)this.ePy[3]);
        }
        if ((ayf_22 = aue_0.cVJ().etu()) != null) {
            ayf_22.d(ns_02);
        } else {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }

    private void aT(byte by) {
        ns_0 ns_02 = new ns_0();
        ns_02.D(this.ePz);
        ns_02.Q((short)212);
        ns_02.C(by);
        ns_02.nX((Integer)this.ePy[0]);
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 != null) {
            ayf_22.d(ns_02);
        } else {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }
}

