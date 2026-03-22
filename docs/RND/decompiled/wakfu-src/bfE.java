/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

public class bfE
implements aeh_2 {
    public static final String hUA = "defaultBuildAsList";
    public static final String hUB = "currentOverBuildSheet";
    public static final String hUC = "currentBuildSheet";
    public static final String hUD = "buildSheetList";
    public static final String hUE = "hasInvalidSheet";
    public static final String hUF = "canCreateNewBuild";
    public static final String hUG = "countAndLimit";
    public static final String hUH = "displayPermanentBuilds";
    public static final String hUI = "currentBuildsListSortId";
    public static final String[] hUJ = new String[]{"buildSheetList", "currentOverBuildSheet", "defaultBuildAsList", "currentBuildSheet", "hasInvalidSheet", "displayPermanentBuilds", "currentBuildsListSortId", "countAndLimit", "canCreateNewBuild"};
    private bgt_0 hUK;
    private eIm hUL;
    private final Map<Integer, bfF> hUM = new LinkedHashMap<Integer, bfF>();
    private bfJ hUN;
    private fhm hUO;
    private frf hUP;
    private eHZ hUQ;
    private final Map<Integer, bgw_1> hUR = new LinkedHashMap<Integer, bgw_1>();
    private final Map<Integer, bMW> hUS = new LinkedHashMap<Integer, bMW>();
    private final Map<Integer, beo_2> hUT = new LinkedHashMap<Integer, beo_2>();
    private byte hUU = (byte)-2;
    private int hUV = -2;
    private Integer hUW;

    public bfE(bgt_0 bgt_02) {
        this.hUK = bgt_02;
        this.hUL = bgt_02.dnK();
    }

    public void aPg() {
        this.c(this.hUK, false);
    }

    public void fA(boolean bl) {
        this.c(this.hUK, bl);
    }

    public void c(bgt_0 bgt_02, boolean bl) {
        this.hUK = bgt_02;
        this.hUL = this.hUK.dnK();
        this.hUO = this.hUK.dnO();
        this.hUP = this.hUK.dnJ();
        this.hUQ = this.hUK.dnN();
        this.hUM.clear();
        this.hUR.clear();
        this.hUS.clear();
        this.hUT.clear();
        if (bl) {
            this.BZ(this.hUL.wM());
        }
        this.hUL.uv().forEach((n, eIj2) -> this.hUM.put((Integer)n, new bfF((int)n, (eIj)eIj2, this.hUK)));
        bfJ bfJ2 = new bfJ(this.hUM.get(this.hUV), this.hUK);
        Set<Integer> set = this.hUN == null ? Collections.emptySet() : this.hUN.c(this.hUM.keySet());
        for (int n2 : this.dgV()) {
            bfJ2.b(this.hUM.get(n2));
        }
        bfJ2.d(set);
        if (this.hUN != null) {
            bfJ2.a(this.hUN);
            if (this.hUN.dhl() != bwh.jwF) {
                bfJ2.b(this.hUN.dhl());
            }
        }
        this.hUN = bfJ2;
        this.dgX();
        this.dgN();
        this.dgO();
        this.dgP();
    }

    public void dgN() {
        this.hUR.clear();
        this.hUO.uv().forEach((n, fhk2) -> this.hUR.put((Integer)n, new bgw_1((int)n, (fhk)fhk2, this.hUK.Sn())));
    }

    public void dgO() {
        this.hUS.clear();
        this.hUP.gjU().forEach((n, frd2) -> this.hUS.put((Integer)n, new bMW((int)n, (frd)frd2, this.hUK)));
    }

    public void dgP() {
        this.hUT.clear();
        this.hUQ.uv().forEach((n, ehy_02) -> this.hUT.put((Integer)n, new beo_2(n.byteValue(), (ehy_0)ehy_02)));
    }

    public int dgQ() {
        if (this.hUW != null) {
            return this.hUW;
        }
        return this.hUV;
    }

    public void BZ(int n) {
        this.hUV = n;
        this.hUW = null;
    }

    public void u(Integer n) {
        this.hUW = n;
    }

    public boolean dgR() {
        return this.hUW != null;
    }

    public int dgS() {
        eIj eIj2 = this.hUL.PR(this.dgQ());
        if (eIj2 == null) {
            return this.hUK.cmL();
        }
        return eIj2.tL() == -1 ? (int)this.hUK.dnG() : eIj2.tL();
    }

    public bfF dgT() {
        return this.hUM.get(this.dgQ());
    }

    public void bg(byte by) {
        this.hUU = by;
    }

    public @Unmodifiable List<bfF> dgU() {
        int n = this.dgQ();
        if (n == 0) {
            return this.hUN.dhj();
        }
        ArrayList<bfF> arrayList = new ArrayList<bfF>(this.hUN.dhj().size());
        arrayList.add(this.hUM.get(0));
        this.hUN.dhj().stream().filter(bfF2 -> bfF2.wp() != n).forEach(arrayList::add);
        return Collections.unmodifiableList(arrayList);
    }

    public void ly(String string) {
        this.hUN.lz(string);
        fse_1.gFu().a((aef_2)this, hUD, hUC);
    }

    public void fB(boolean bl) {
        this.hUN.a(bl, this.hUK);
        fse_1.gFu().a((aef_2)this, hUD, hUH, hUC);
    }

    public void a(@NotNull bwh bwh2) {
        if (this.hUN.b(bwh2)) {
            this.dgW();
        }
    }

    private List<Integer> dgV() {
        String string = ((bsg_1)aie_0.cfn().bmH()).M(this.hUK).bS(bsn_1.lkC.getKey());
        ArrayList<Integer> arrayList = new ArrayList<Integer>(this.hUM.keySet());
        arrayList.remove(0);
        arrayList.sort(Integer::compareTo);
        if (string == null) {
            return arrayList;
        }
        try {
            ArrayList arrayList2 = Arrays.stream(string.split(",")).map(Integer::parseInt).distinct().filter(n -> n != 0).filter(this.hUM::containsKey).collect(Collectors.toCollection(ArrayList::new));
            for (int n2 : arrayList) {
                if (arrayList2.contains(n2)) continue;
                arrayList2.add(n2);
            }
            return arrayList2;
        }
        catch (NumberFormatException numberFormatException) {
            return arrayList;
        }
    }

    public void a(int n, bfF bfF2) {
        this.hUN.a(n, bfF2);
        this.dgW();
    }

    private void dgW() {
        fse_1.gFu().a((aef_2)this, hUJ);
        this.dgX();
    }

    private void dgX() {
        String string = bsn_1.lkC.getKey();
        ((bsg_1)aie_0.cfn().bmH()).M(this.hUK).m(string, this.hUN.dhk());
        ((bsg_1)aie_0.cfn().bmH()).ev(string);
    }

    public void e(BiConsumer<Integer, bfF> biConsumer) {
        this.hUM.forEach(biConsumer);
    }

    public bgw_1 dgY() {
        return this.hUR.get(this.dgQ());
    }

    public bgw_1 Ca(int n) {
        return this.hUR.get(n);
    }

    public bMW dgZ() {
        return this.hUS.get(this.dgQ());
    }

    public bMW Cb(int n) {
        return this.hUS.get(n);
    }

    public beo_2 dha() {
        return this.hUT.get(this.dgQ());
    }

    public beo_2 Cc(int n) {
        return this.hUT.get(n);
    }

    @Override
    public String[] bxk() {
        return hUJ;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "defaultBuildAsList": {
                return List.of(this.hUM.get(0));
            }
            case "currentBuildSheet": {
                return this.dgT();
            }
            case "buildSheetList": {
                if (fse_1.gFu().dp("hideDownscaling")) {
                    return Collections.emptyList();
                }
                return this.hUN.dhi();
            }
            case "hasInvalidSheet": {
                return !this.dgY().j(this.hUK) || !this.dgZ().j(this.hUK) || !this.dha().j(this.hUK);
            }
            case "currentOverBuildSheet": {
                return this.hUU;
            }
            case "canCreateNewBuild": {
                return !cvu_2.eTO().eUl() && this.hUL.fws() < eIp.fwv();
            }
            case "countAndLimit": {
                return "(" + this.hUL.fws() + "/" + eIp.fwv() + ")";
            }
            case "displayPermanentBuilds": {
                return this.hUN.dhm();
            }
            case "currentBuildsListSortId": {
                return this.hUN.dhl().d();
            }
        }
        return null;
    }

    @Nullable
    public bfF Cd(int n) {
        return this.hUM.get(n);
    }
}

