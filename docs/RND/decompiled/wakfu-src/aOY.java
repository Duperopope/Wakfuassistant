/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.jetbrains.annotations.Unmodifiable
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.jetbrains.annotations.Unmodifiable;

public abstract class aOY
implements aef_2,
aPk {
    public static final String euU = "chat.dialogView";
    public static final String euV = "input";
    public static final String euW = "history";
    public static final String euX = "channelsList";
    public static final String euY = "currentChannel";
    public static final String euZ = "privateName";
    public static final String eva = "currentChannelName";
    public static final String evb = "isPaused";
    public static final String[] evc = new String[]{"history", "input", "channelsList", "currentChannel", "privateName", "currentChannelName", "isPaused"};
    private final List<aPl> evd;
    private ArrayList<aPl> eve;
    private String evf = "";
    private String evg = "";
    private static final int evh = 100;
    private final EnumMap<aPl, ArrayList<aPR>> evi = new EnumMap(aPl.class);
    private int evj;
    private aPR evk = null;
    private String evl = "";
    private boolean dOj;
    private String evm = "";

    protected aOY(int n, List<aPl> list) {
        this.evj = n;
        this.evd = List.copyOf(list);
        this.eve = new ArrayList<aPl>(list);
    }

    public void cyE() {
        ArrayList<api_0> arrayList = new ArrayList<api_0>();
        for (ArrayList<aPR> arrayList2 : this.evi.values()) {
            for (aPR aPR2 : arrayList2) {
                if (!this.a(aPR2.cBn().czu())) continue;
                aOY.a(arrayList, aPR2.cBn());
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        arrayList.stream().distinct().sorted().forEach(api_02 -> stringBuilder.append(this.a((api_0)api_02)));
        this.evg = this.iB(stringBuilder.toString());
        aeg_2.caa().a((aef_2)this, euW);
    }

    private static void a(ArrayList<api_0> arrayList, apj_0 apj_02) {
        if (apj_02 == null) {
            return;
        }
        if (apj_02.czy() != null) {
            arrayList.addAll(apj_02.czy());
        }
        if (apj_02.czA() != null) {
            for (apj_0 apj_03 : apj_02.czA().values()) {
                aOY.a(arrayList, apj_03);
            }
        }
    }

    protected abstract String a(api_0 var1);

    public @Unmodifiable List<aPQ> cyF() {
        ArrayList<aPQ> arrayList = new ArrayList<aPQ>();
        for (aPl aPl2 : this.evd) {
            apj_0 apj_02 = aPh.czg().l(aPl2);
            if (!this.a(apj_02)) continue;
            arrayList.add(new aPQ(apj_02, this.a(aPl2)));
        }
        return arrayList.stream().sorted(Comparator.comparingInt(aPQ::aYs)).toList();
    }

    private Optional<Integer> cyG() {
        apr_0 apr_02 = aPt.cAg().zg(this.evj);
        if (apr_02 == null) {
            return Optional.empty();
        }
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR(cza_2.NL(apr_02.czm()));
        if (fhs_22 == null) {
            return Optional.empty();
        }
        fhv_1 fhv_12 = fhs_22.uH("chatWindow");
        if (!(fhv_12 instanceof fey_2)) {
            return Optional.empty();
        }
        return Optional.of(((fey_2)fhv_12).getSize().height);
    }

    public boolean a(apj_0 apj_02) {
        return apj_02.czw() && ((bsg_1)aie_0.cfn().bmH()).t(apj_02.aUXX());
    }

    public boolean a(aPl aPl2) {
        return this.eve.contains((Object)aPl2);
    }

    public boolean a(aPl aPl2, boolean bl) {
        if (bl) {
            if (this.a(aPl2)) {
                return false;
            }
            this.eve.add(aPl2);
            apj_0 apj_03 = aPh.czg().l(aPl2);
            this.a(apj_03, aOZ.evn);
            if (!this.cyN()) {
                apj_03.czA().values().forEach(apj_02 -> this.a((apj_0)apj_02, aOZ.evn));
            }
        } else {
            if (!this.a(aPl2)) {
                return false;
            }
            this.eve.remove((Object)aPl2);
            this.d(aPl2);
        }
        return true;
    }

    public aPR a(apj_0 apj_02, aOZ aOZ2) {
        return this.a(apj_02, aOZ2, null);
    }

    public aPR a(apj_0 apj_02, aOZ aOZ2, aPO aPO2) {
        aPR aPR2;
        ArrayList<aPR> arrayList;
        if (aOZ2 == aOZ.evn) {
            apj_02.a(this);
        }
        if ((arrayList = this.evi.get((Object)apj_02.czu())) == null) {
            arrayList = new ArrayList();
        }
        if (arrayList.contains(aPR2 = new aPR(apj_02, apj_02.getName(), aOZ2, aPO2))) {
            return null;
        }
        aPR2.eM(apj_02.czw());
        arrayList.add(aPR2);
        this.evi.put(apj_02.czu(), arrayList);
        this.b(aPR2);
        return aPR2;
    }

    public boolean b(aPl aPl2) {
        ArrayList<aPR> arrayList = this.evi.get((Object)aPl2);
        if (arrayList == null) {
            return false;
        }
        for (int i = arrayList.size() - 1; i >= 0; --i) {
            aPR aPR2 = arrayList.get(i);
            if (aPR2.cBp() == aOZ.evn) continue;
            return true;
        }
        return false;
    }

    public void c(aPl aPl2) {
        ArrayList<aPR> arrayList = this.evi.get((Object)aPl2);
        if (arrayList == null) {
            return;
        }
        for (int i = arrayList.size() - 1; i >= 0; --i) {
            aPR aPR2 = arrayList.get(i);
            if (aPR2.cBp() == aOZ.evn) continue;
            arrayList.remove(i);
        }
    }

    protected void d(aPl aPl2) {
        ArrayList<aPR> arrayList = this.evi.get((Object)aPl2);
        if (arrayList == null) {
            return;
        }
        for (aPR aPR2 : arrayList) {
            apj_0 apj_02 = aPR2.cBn();
            apj_02.b(this);
            for (apj_0 apj_03 : apj_02.czA().values()) {
                apj_03.b(this);
            }
        }
    }

    public List<aPR> cyH() {
        ArrayList<aPR> arrayList = new ArrayList<aPR>();
        for (ArrayList<aPR> arrayList2 : this.evi.values()) {
            for (aPR aPR2 : arrayList2) {
                if (!aPR2.cBr()) continue;
                arrayList.add(aPR2);
            }
        }
        arrayList.sort(Comparator.comparingInt(aPR::cBq).reversed());
        return arrayList;
    }

    public aPR a(aPP aPP2, boolean bl) {
        ArrayList<aPR> arrayList = new ArrayList<aPR>();
        for (ArrayList<aPR> object2 : this.evi.values()) {
            for (aPR aPR3 : object2) {
                if (aPP2 != aPR3.cBm() || aPR3.cBp() == aOZ.evn) continue;
                arrayList.add(aPR3);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        Optional<aPR> optional = arrayList.stream().min(Comparator.comparing(aPR2 -> aPR2.cBn().czA().size()));
        aPR aPR4 = (aPR)optional.get();
        this.a(aPR4);
        return aPR4;
    }

    private void a(aPR aPR2) {
        if (aPR2 != this.evk && (aPR2 == null || aPR2.cBp() != aOZ.evn)) {
            this.evk = aPR2;
            aeg_2.caa().a((aef_2)this.evk, aPR.eBa);
            aeg_2.caa().a((aef_2)this, euY, eva);
        }
    }

    public aPR cyI() {
        return this.evk;
    }

    private void b(aPR aPR2) {
        if (aPR2.cBp() != aOZ.evn) {
            aeg_2.caa().a((aef_2)this, euX);
        }
    }

    @Override
    public void b(api_0 api_02) {
        String string = this.a(api_02);
        this.e(euW, string);
        aeg_2.caa().a((aef_2)this, euW);
    }

    @Override
    public void b(apj_0 apj_02, aOZ aOZ2) {
        if (!this.cyN()) {
            this.a(apj_02, aOZ2);
        }
    }

    @Override
    public String[] bxk() {
        return evc;
    }

    public int cyJ() {
        return this.evj;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(euV)) {
            return this.evf;
        }
        if (string.equals(euW)) {
            return this.evg;
        }
        if (string.equals(euX)) {
            return this.cyH();
        }
        if (string.equals(euZ)) {
            return this.cyK();
        }
        if (string.equals(evb)) {
            return this.dOj;
        }
        if (string.equals(euY)) {
            return this.evk;
        }
        if (string.equals(eva)) {
            String string2 = this.cyK();
            return string2 != null ? string2 : (this.evk != null ? this.evk.cBo() : null);
        }
        return null;
    }

    public String cyK() {
        if (this.evl == null) {
            return null;
        }
        int n = this.evl.indexOf(32) + 1;
        if (n == 0 || n > this.evl.length() - 1) {
            return null;
        }
        return this.evl.substring(n).replaceAll("\"", "");
    }

    @Override
    public void c(String string, Object object) {
        if (string.equals(euV)) {
            this.evf = (String)object;
        } else if (string.equals(euW)) {
            this.evg = this.iB((String)object);
        }
    }

    @Override
    public void d(String string, Object object) {
        if (string.equals(euV)) {
            this.evf = this.evf == null ? (String)object : String.valueOf(object) + this.evf;
        }
    }

    @Override
    public void e(String string, Object object) {
        if (string.equals(euW)) {
            if (this.dOj) {
                this.evm = this.evm.length() == 0 ? this.iB(this.evg + String.valueOf(object)) : this.iB(this.evm + String.valueOf(object));
            } else if (this.evm.length() == 0) {
                this.evg = this.iB(this.evg + String.valueOf(object));
            } else {
                this.evg = this.evm;
                this.evm = "";
            }
        } else if (string.equals(euV)) {
            this.evf = this.evf == null ? (String)object : this.evf + String.valueOf(object);
        }
    }

    private String iB(String string) {
        String[] stringArray = BH.a(string, '\n');
        int n = 0;
        int n2 = stringArray.length;
        if (n2 > 100) {
            for (int i = 0; i < n2 - 100; ++i) {
                n += stringArray[i].length() + 1;
            }
        }
        return string.substring(n);
    }

    @Override
    public boolean hP(String string) {
        return string.equals(euV);
    }

    public void clear() {
        this.evg = "";
        this.evm = "";
        this.evf = "";
        aeg_2.caa().a((aef_2)this, euW, euV);
    }

    public String cyL() {
        return this.evl;
    }

    public final void iC(String string) {
        this.evl = string;
        aeg_2.caa().a((aef_2)this, eva, euZ);
    }

    public void yS(int n) {
        this.evj = n;
    }

    public void setPaused(boolean bl) {
        this.dOj = bl;
        if (!this.dOj) {
            this.e(euW, this.evm);
        }
        aeg_2.caa().a((aef_2)this, euW, evb);
    }

    public boolean isPaused() {
        return this.dOj;
    }

    public void cyM() {
        for (ArrayList<aPR> arrayList : this.evi.values()) {
            for (aPR aPR2 : arrayList) {
                apj_0 apj_02 = aPR2.cBn();
                apj_02.b(this);
                Map<String, apj_0> map = apj_02.czA();
                ArrayList arrayList2 = Lists.newArrayList(map.values());
                for (apj_0 apj_03 : arrayList2) {
                    apj_03.b(this);
                    if (!apj_03.czz()) continue;
                    apj_02.d(apj_03);
                }
            }
        }
        this.evi.clear();
    }

    public boolean cyN() {
        return false;
    }

    public ArrayList<aPl> cyO() {
        return this.eve;
    }

    public void x(List<aPl> list) {
        this.eve = new ArrayList<aPl>(list);
    }

    public void c(long l, String string) {
        for (ArrayList<aPR> arrayList : this.evi.values()) {
            for (aPR aPR2 : arrayList) {
                if (aPR2.cBp() != aOZ.evn || !aPR2.cBn().czB()) continue;
                aOY.a(aPR2.cBn(), l, string);
            }
        }
    }

    private static void a(apj_0 apj_02, long l, String string) {
        if (apj_02 == null) {
            return;
        }
        if (apj_02.czy() != null) {
            for (api_0 object : apj_02.czy()) {
                if (l != object.czn() && !string.equals(object.czo())) continue;
                object.bLe();
            }
        }
        if (apj_02.czA() != null) {
            for (apj_0 apj_03 : apj_02.czA().values()) {
                aOY.a(apj_03, l, string);
            }
        }
    }
}

