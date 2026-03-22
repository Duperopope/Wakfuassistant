/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL
 *  com.jogamp.opengl.GL2
 *  gnu.trove.map.hash.THashMap
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TIntObjectProcedure
 *  gnu.trove.procedure.TObjectObjectProcedure
 *  gnu.trove.procedure.TObjectProcedure
 */
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import com.ankamagames.framework.graphics.engine.geometry.GeometrySprite;
import com.ankamagames.framework.graphics.engine.material.Material;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite;
import com.ankamagames.framework.kernel.core.maths.Matrix44;
import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import gnu.trove.map.hash.THashMap;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TIntObjectProcedure;
import gnu.trove.procedure.TObjectObjectProcedure;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;

/*
 * Renamed from ast
 */
public final class ast_1 {
    public static final boolean cYa = false;
    private asy_1 cYb = new asu_1(this);
    private final asx_1 cYc = new asx_1();
    private final asz_1 cYd = new asz_1();
    public int cYe;
    public int bUi;
    public final EntitySprite cYf;
    public final EntitySprite cYg;
    private static final ast_1 cYh = new ast_1();
    private final HashMap<String, asr_1> cYi;
    private THashMap<String, String> cYj;
    private final ArrayList<asn_1> cYk = new ArrayList();
    private final ArrayList<asn_1> cYl = new ArrayList();
    private final TIntObjectHashMap<ass_1> cYm;
    private final TIntObjectHashMap<ass_1> cYn;
    private final ArrayList<awk_1> cYo;
    private awk_1 cYp;
    private awk_1 cYq;
    private boolean cYr;
    public final GLGeometrySprite cYs;
    private boolean cYt;
    private String cYu = "transform";
    private String cYv = "gui";
    private int cYw;

    private ast_1() {
        this.cYi = new HashMap(16);
        this.cYj = new THashMap(16);
        this.cYm = new TIntObjectHashMap();
        this.cYn = new TIntObjectHashMap();
        this.cYo = new ArrayList();
        this.cYf = (EntitySprite)EntitySprite.cXk.bSJ();
        this.cYf.cWR = this;
        this.cYs = (GLGeometrySprite)GLGeometrySprite.dbk.bSJ();
        this.cYf.a(this.cYs);
        this.cYf.a(Material.daG);
        this.cYf.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.cYf.n(1.0f, 0.0f, 0.0f, 1.0f);
        this.cYg = (EntitySprite)EntitySprite.cXk.bSJ();
        this.cYg.cWR = this;
        this.cYg.a((GeometrySprite)GLGeometrySprite.dbk.bSJ());
        this.cYg.a(Material.daG);
        this.cYg.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.cYg.n(1.0f, 0.0f, 0.0f, 1.0f);
    }

    public static ast_1 bJG() {
        return cYh;
    }

    public void a(asy_1 asy_12) {
        this.cYb = asy_12;
    }

    public void b(String string, String string2, String string3) {
        this.cYj.put((Object)string, (Object)string2);
        asr_1 asr_12 = this.cYb.gd(string3);
        asr_12.setName(string);
        this.cYi.put(asr_12.bJB(), asr_12);
    }

    public void a(asr_1 asr_12) {
        this.cYi.put(asr_12.bJB(), asr_12);
    }

    public void fZ(String string) {
        this.cYi.remove(string);
    }

    public asr_1 ga(String string) {
        return this.cYi.get(string);
    }

    public void gb(String string) {
        this.cYu = string;
    }

    public asr_1 bJH() {
        return this.cYi.get(this.cYu);
    }

    public void gc(String string) {
        this.cYv = string;
    }

    public asr_1 bJI() {
        return this.cYi.get(this.cYv);
    }

    public void bJJ() {
        for (asr_1 asr_12 : this.cYi.values()) {
            asr_12.reset();
        }
    }

    public void bJK() {
        this.cYj.forEachEntry((TObjectObjectProcedure)new asv_1(this));
        this.cYj = null;
    }

    public void qF(int n) {
        this.cYe = n;
        this.bUi += n;
        for (int i = 0; i < this.cYk.size(); ++i) {
            this.cYk.get(i).qF(n);
        }
        this.cYn.forEachEntry((TIntObjectProcedure)this.cYc);
        this.cYn.clear();
        this.cYd.uq(n);
        this.cYm.forEachEntry((TIntObjectProcedure)this.cYd);
    }

    public void cO(boolean bl) {
        this.cYt = bl;
        this.bJL();
    }

    public void a(asn_1 asn_12) {
        this.cYk.add(asn_12);
        this.bJL();
    }

    public void b(asn_1 asn_12) {
        this.cYk.remove(asn_12);
        this.bJL();
    }

    public void a(ass_1 ass_12) {
        assert (ass_12 != null);
        this.cYn.put(ass_12.d(), (Object)ass_12);
    }

    public void b(ass_1 ass_12) {
        this.cYm.remove(ass_12.d());
        this.cYn.remove(ass_12.d());
    }

    public ass_1 uo(int n) {
        ass_1 ass_12 = (ass_1)this.cYm.get(n);
        if (ass_12 != null) {
            return ass_12;
        }
        return (ass_1)this.cYn.get(n);
    }

    public boolean f(art_1 art_12) {
        if (!art_12.bIr() || this.cYr) {
            return false;
        }
        return this.bJM();
    }

    private void bJL() {
        this.cYl.clear();
        for (asn_1 asn_12 : this.cYk) {
            if (!this.cYt && !asn_12.bKa()) continue;
            this.cYl.add(asn_12);
        }
    }

    private boolean bJM() {
        for (asn_1 asn_12 : this.cYl) {
            if (!asn_12.bJX() || !asn_12.bJY().un(asn_12.bJZ())) continue;
            return true;
        }
        return false;
    }

    public void bY(int n, int n2) {
        atg_2 atg_22 = aru_2.cVG.bIv();
        if (!((art_1)atg_22).bIr()) {
            return;
        }
        this.bJO();
        this.cYp = this.bZ(n, n2);
        this.cYq = this.bZ(n, n2);
        if (this.cYp == null || this.cYq == null) {
            this.bJO();
            this.cYr = true;
        }
        this.cYf.e((float)n2 / 2.0f, (float)(-n) / 2.0f, n, n2);
        this.cYg.e((float)n2 / 2.0f, (float)(-n) / 2.0f, n, n2);
    }

    public void a(arr_2 arr_22, art_1 art_12) {
        if (!this.f(art_12)) {
            arr_22.b(art_12);
            this.g(art_12);
        } else {
            this.b(arr_22);
        }
    }

    private awk_1 bZ(int n, int n2) {
        int n3 = this.cYo.size();
        for (int i = 0; i < n3; ++i) {
            awk_1 awk_12 = this.cYo.get(i);
            axj_2 axj_22 = awk_12.ve(0);
            if (axj_22.getWidth() != n || axj_22.getHeight() != n2 || awk_12.bPd() || awk_12 == this.cYp || awk_12 == this.cYq) continue;
            return awk_12;
        }
        return this.ca(n, n2);
    }

    public void bJN() {
        this.cYm.forEachValue((TObjectProcedure)new asw_1(this));
        this.cYm.clear();
        this.cYk.clear();
        this.bJL();
    }

    private void g(art_1 art_12) {
        Collection collection = this.cYm.valueCollection();
        collection.stream().sorted(Comparator.comparingInt(ass_1::btf)).forEachOrdered(ass_12 -> {
            if (ass_12.aOY()) {
                ass_12.b(art_12);
            }
        });
    }

    private void b(arr_2 arr_22) {
        atg_2 atg_22 = aru_2.cVG.bIv();
        GL2 gL2 = atg_22.bIq();
        ava_2 ava_22 = ava_2.bMH();
        atg_22.a(this.cYp);
        avd_2.bMO().j((GL)gL2);
        arr_22.b(atg_22);
        this.g(atg_22);
        Matrix44 matrix44 = atg_22.bIp();
        atg_22.b(Matrix44.dAe);
        assert (this.bJM());
        axj_2 axj_22 = this.cYp.ve(0);
        ava_22.a((GL)gL2, 0, 0, axj_22.getWidth(), axj_22.getHeight());
        this.cYf.a(Material.daH);
        this.cYs.c(auw_2.dfI, auw_2.dfH);
        awk_1 awk_12 = this.cYp;
        for (int i = 0; i < this.cYl.size(); ++i) {
            awk_1 awk_13 = i != this.cYl.size() - 1 ? (awk_12 == this.cYq ? this.cYp : this.cYq) : null;
            atg_22.a(awk_13);
            avd_2.bMO().j((GL)gL2);
            this.cYf.setTexture(awk_12);
            this.cYl.get(i).a(this.cYf);
            awk_12 = awk_13;
            avd_2.bMO().j((GL)gL2);
            this.cYf.b(atg_22);
        }
        atg_22.b(matrix44);
    }

    private awk_1 ca(int n, int n2) {
        atg_2 atg_22 = aru_2.cVG.bIv();
        GL2 gL2 = atg_22.bIq();
        awk_1 awk_12 = ((art_1)atg_22).b(arv_2.bIx(), n, n2, false);
        awk_12.b((GL)gL2);
        if (!awk_12.bPe()) {
            awk_12.bsI();
            awk_12.bsI();
            return null;
        }
        awk_12.bGY();
        this.cYo.add(awk_12);
        return awk_12;
    }

    private void bJO() {
        int n = this.cYo.size();
        for (int i = 0; i < n; ++i) {
            awk_1 awk_12 = this.cYo.get(i);
            awk_12.bsI();
            awk_12.bsI();
        }
        this.cYo.clear();
    }

    void a(int n, ass_1 ass_12) {
        this.cYm.put(n, (Object)ass_12);
    }

    void up(int n) {
        this.cYm.remove(n);
    }
}

