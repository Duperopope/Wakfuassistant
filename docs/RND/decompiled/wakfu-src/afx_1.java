/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.commons.lang3.StringUtils
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaException
 *  org.keplerproject.luajava.LuaObject
 *  org.keplerproject.luajava.LuaState
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaException;
import org.keplerproject.luajava.LuaObject;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aFx
 */
public class afx_1 {
    static final Logger dIE = Logger.getLogger(afx_1.class);
    private static final int dIF = -1;
    final int dIG;
    afy_1 dIH;
    int dII;
    String bdX;
    private afr_1[] dIJ;
    int dIK = 0;
    final LuaState dIL;
    private boolean dIM = false;
    private final TIntObjectHashMap<afb_2> dIN = new TIntObjectHashMap();
    private final ConcurrentLinkedQueue<afa_1> dIO = new ConcurrentLinkedQueue();
    private final ArrayList<afd_1> dIP = new ArrayList();
    private boolean dIQ = false;
    private Integer dIR;
    private ArrayList<Object> dIS;

    afx_1(int n, LuaState luaState, afr_1[] afr_1Array) {
        assert (luaState != null);
        this.dIG = n;
        this.dIL = luaState;
        this.dIH = afy_1.dIU;
        this.dIL.openBase();
        this.dIL.openMath();
        this.dIL.openTable();
        this.dIL.openOs();
        this.dIL.openString();
        this.dIK = 0;
        this.dIJ = afr_1Array;
    }

    void e(afr_1 ... afr_1Array) {
        if (afr_1Array != null) {
            for (afr_1 afr_12 : afr_1Array) {
                try {
                    afr_12.c(this.dIL);
                }
                catch (Exception exception) {
                    dIE.error((Object)exception);
                }
            }
        }
    }

    private void cas() {
        if (!this.dIL.isClosed()) {
            this.dIL.close();
        }
        this.dIH = afy_1.dIZ;
        for (int i = 0; i < this.dIP.size(); ++i) {
            this.dIP.get(i).a(this);
        }
    }

    void a(LuaState luaState, afc_1 afc_12) {
        String string = null;
        if (!luaState.isClosed() && luaState.getTop() >= 1 && luaState.isString(-1)) {
            string = luaState.toString(-1);
            luaState.pop(1);
        }
        if (string == null) {
            string = "";
        }
        for (int i = 0; i < this.dIP.size(); ++i) {
            this.dIP.get(i).a(this, afc_12, string);
        }
        this.cay();
    }

    public final void cat() {
        if (this.dIO.isEmpty() && this.dIN.isEmpty()) {
            this.cas();
        }
    }

    public final void cau() {
        if (this.dIO.isEmpty() && this.dIN.isEmpty()) {
            this.dIH = afy_1.dIX;
        }
    }

    final boolean cav() {
        return this.dIQ;
    }

    final void dL(boolean bl) {
        this.dIQ = bl;
    }

    public final int caw() {
        return this.dIG;
    }

    public final int cax() {
        return this.dII;
    }

    public final void cay() {
        this.dIM = true;
    }

    public final afa_1 a(int n, int n2, String string, afq_2[] afq_2Array) {
        if (this.dIH == afy_1.dIX) {
            this.dIH = afy_1.dIW;
        }
        afa_1 afa_12 = new afa_1(this, n, n2, string, afq_2Array);
        this.dIO.add(afa_12);
        return afa_12;
    }

    public final int a(String string, afq_2[] afq_2Array) {
        if (this.dIH == afy_1.dIX) {
            this.dIH = afy_1.dIW;
        }
        afb_2 afb_22 = new afb_2(this, string, afq_2Array);
        this.dIN.put(afb_22.d(), (Object)afb_22);
        return afb_22.d();
    }

    public final boolean a(afz_2 afz_22) {
        if (afz_22 instanceof afb_2) {
            this.dIN.remove(afz_22.d());
            return true;
        }
        return afz_22 instanceof afa_1 && this.dIO.remove(afz_22);
    }

    public final boolean xJ(int n) {
        if (this.dIN.remove(n) != null) {
            return true;
        }
        Iterator<afa_1> iterator = this.dIO.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().d() != n) continue;
            iterator.remove();
            return true;
        }
        return false;
    }

    final afy_1 caz() {
        return this.dIH;
    }

    final void hW(String string) {
        if (string != null && this.dIL.LloadString(string) == 0) {
            this.dIH = afy_1.dIV;
        } else {
            this.a(this.dIL, afc_1.dJm);
        }
    }

    public void b(String string, byte[] byArray) {
        this.bdX = string;
        if (string != null && this.dIL.LloadBuffer(byArray, string) == 0) {
            this.dIH = afy_1.dIV;
        } else {
            this.a(this.dIL, afc_1.dJm);
        }
    }

    final void y(String string, boolean bl) {
        this.bdX = string;
        if (string != null && this.dIL.LloadFile(string) == 0) {
            this.dIH = afy_1.dIV;
        } else {
            this.a(this.dIL, afc_1.dJm);
        }
    }

    final void s(Map<String, Object> map) {
        if (this.dIH == afy_1.dIV) {
            if (map != null) {
                for (Map.Entry<String, Object> object : map.entrySet()) {
                    try {
                        this.dIL.pushObjectValue(object.getValue());
                        this.dIL.setGlobal(object.getKey());
                    }
                    catch (LuaException afd_12) {
                        dIE.error((Object)"Impossible de d?finir une variable de contexte pour un script", (Throwable)afd_12);
                    }
                }
            }
            int n = this.dIL.resume(0);
            this.dIH = afy_1.dIY;
            for (afd_1 afd_12 : this.dIP) {
                afd_12.b(this);
            }
            if (n != 0) {
                this.a(this.dIL, afc_1.dJn);
            } else {
                this.cat();
            }
        } else if (!this.dIM) {
            this.dIL.pushString("No file loaded");
            this.a(this.dIL, afc_1.dJo);
        }
    }

    public void xK(int n) {
        afb_2 afb_22 = (afb_2)this.dIN.remove(n);
        if (afb_22 == null) {
            return;
        }
        afb_22.bGy();
    }

    public void xL(int n) {
        this.dIN.remove(n);
    }

    public void caA() {
        this.dIN.clear();
    }

    public void caB() {
        this.dIN.clear();
        this.dIO.clear();
    }

    final void xM(int n) {
        if (this.dIM) {
            switch (this.dIH.ordinal()) {
                case 3: {
                    break;
                }
                case 2: {
                    this.dIH = afy_1.dIX;
                    break;
                }
                default: {
                    this.caG();
                    break;
                }
            }
        } else {
            this.dII += n;
            switch (this.dIH.ordinal()) {
                case 0: 
                case 1: 
                case 3: {
                    break;
                }
                case 2: {
                    Iterator<afa_1> iterator = this.dIO.iterator();
                    while (iterator.hasNext()) {
                        if (!iterator.next().bHW()) continue;
                        iterator.remove();
                    }
                    this.cau();
                    break;
                }
                case 4: {
                    Iterator<afa_1> iterator = this.dIO.iterator();
                    while (iterator.hasNext()) {
                        if (!iterator.next().bHW()) continue;
                        iterator.remove();
                    }
                    this.cat();
                    break;
                }
            }
        }
    }

    public String aXV() {
        return this.bdX;
    }

    public void hX(String string) {
        this.bdX = string;
    }

    public LuaState caC() {
        return this.dIL;
    }

    public afq_2 hY(String string) {
        if (this.dIL.isClosed()) {
            dIE.error((Object)("Tente de r?cup?rer une variable (" + string + ") alors que le script est ferm?"));
            return null;
        }
        this.dIL.getGlobal(string);
        afq_2 afq_22 = null;
        try {
            afq_22 = afq_2.b(this.dIL, -1);
        }
        catch (LuaException luaException) {
            dIE.error((Object)("Variable " + string + " inconnue?"), (Throwable)luaException);
        }
        this.dIL.pop(1);
        return afq_22;
    }

    boolean caD() {
        if (!this.dIL.isFunction(-1) && !this.dIL.isJavaFunction(-1)) {
            this.dIL.Lwhere(1);
            this.dIL.pop(1);
            return false;
        }
        return true;
    }

    public final afq_2[] a(String string, afq_2[] afq_2Array, afp_2 ... afp_2Array) {
        int n;
        if (this.dIH == afy_1.dIU || this.dIH == afy_1.dIZ) {
            dIE.error((Object)("Script should be load before calling the function : " + string + ", m_state = " + String.valueOf((Object)this.dIH) + ", m_source = " + this.bdX));
            return null;
        }
        if (this.dIH == afy_1.dIV) {
            this.dIL.resume(0);
            this.dIH = afy_1.dIW;
        }
        if (afp_2Array != null) {
            for (int i = 0; i < afp_2Array.length; ++i) {
                if (afp_2Array[i] == null) continue;
                afp_2Array[i].d(this.dIL);
            }
        }
        if (string.contains(".")) {
            String[] stringArray = StringUtils.split((String)string, (String)"\\.");
            this.dIL.pushString(stringArray[0]);
            this.dIL.getTable(LuaState.LUA_GLOBALSINDEX.intValue());
            if (!this.dIL.isTable(-1)) {
                dIE.error((Object)(stringArray[0] + " n'est pas une librairie connue"));
                this.dIL.remove(-1);
                switch (this.dIH.ordinal()) {
                    case 4: {
                        this.cat();
                        break;
                    }
                    case 2: {
                        this.cau();
                    }
                }
                return null;
            }
            this.dIL.pushString(stringArray[1]);
            this.dIL.getTable(-2);
            this.dIL.remove(-2);
        } else {
            this.dIL.getGlobal(string);
        }
        if (!this.caD()) {
            dIE.error((Object)("Fonction inconnue " + string + " dans le script " + this.bdX + " ligne " + this.caE()), (Throwable)new Exception());
            return null;
        }
        int n2 = 0;
        if (afq_2Array != null) {
            n2 = afq_2Array.length;
            for (n = 0; n < n2; ++n) {
                if (afq_2Array[n] == null) {
                    this.dIL.pushNil();
                    continue;
                }
                afq_2Array[n].d(this.dIL);
            }
        }
        if (this.dIL.pcall(n2, LuaState.LUA_MULTRET.intValue(), 0) != 0) {
            this.a(this.dIL, afc_1.dJn);
        }
        n = this.dIL.getTop();
        afq_2[] afq_2Array2 = new afq_2[n];
        for (int i = 0; i < n; ++i) {
            try {
                afq_2Array2[i] = afq_2.b(this.dIL, -1);
            }
            catch (LuaException luaException) {
                dIE.error((Object)("Error retrieving a function(" + string + ") result : " + String.valueOf((Object)luaException)));
            }
            this.dIL.pop(1);
        }
        return afq_2Array2;
    }

    public String caE() {
        String[] stringArray;
        this.dIL.Lwhere(1);
        String string = this.dIL.toString(-1);
        this.dIL.pop(1);
        if (string != null && string.length() > 0 && (stringArray = StringUtils.split((String)string, (char)':')).length > 1) {
            string = stringArray[1];
        }
        return string;
    }

    public void hZ(String string) {
        this.a(string, null, new afp_2[0]);
    }

    public boolean c(afd_1 afd_12) {
        return this.dIP.add(afd_12);
    }

    public final void caF() {
        this.dIP.clear();
    }

    public final boolean d(afd_1 afd_12) {
        return this.dIP.contains(afd_12);
    }

    public final boolean e(afd_1 afd_12) {
        return this.dIP.remove(afd_12);
    }

    public final void caG() {
        this.dIO.clear();
        this.dIN.clear();
        this.cat();
    }

    public int bha() {
        if (this.dIR == null) {
            Optional<Integer> optional = this.ia("fightId");
            optional.ifPresentOrElse(n -> {
                this.dIR = n;
            }, () -> {
                this.dIR = -1;
            });
        }
        return this.dIR;
    }

    public Optional<Integer> ia(String string) {
        LuaObject luaObject = this.dIL.getLuaObject(string);
        if (luaObject == null) {
            return Optional.empty();
        }
        if (luaObject.isNumber()) {
            return Optional.of((int)luaObject.getNumber());
        }
        if (luaObject.isJavaObject()) {
            try {
                return Optional.of(Integer.parseInt(luaObject.toString()));
            }
            catch (NumberFormatException numberFormatException) {
                dIE.error((Object)String.format("Unable to retrieve following var : %s because %s can't be converted as integer", string, luaObject), (Throwable)numberFormatException);
                return Optional.empty();
            }
        }
        return Optional.empty();
    }

    public afr_1[] bya() {
        return this.dIJ;
    }

    public void ae(Object object) {
        if (this.dIS == null) {
            this.dIS = new ArrayList();
        }
        this.dIS.add(object);
    }

    public void k(TObjectProcedure<Object> tObjectProcedure) {
        if (this.dIS == null) {
            return;
        }
        int n = this.dIS.size();
        for (int i = 0; i < n; ++i) {
            if (tObjectProcedure.execute(this.dIS.get(i))) continue;
            return;
        }
    }
}

