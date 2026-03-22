/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import lombok.Generated;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aiv
 */
public class aiv_2
extends afr_1
implements ahr_0,
aif_2,
aig_2,
air_2 {
    protected static final Logger czf = Logger.getLogger(aiv_2.class);
    private static final aiv_2 czg = new aiv_2();
    private aig_2 czh;
    private ahr_0 czi;
    private aif_2 czj;
    private air_2 czk;

    @Override
    public final String getName() {
        return "Sound";
    }

    @Override
    public String getDescription() {
        return "Main sound library";
    }

    private aiv_2() {
    }

    public boolean bpD() {
        return this.czh != null;
    }

    public void a(aig_2 aig_22) {
        this.czh = aig_22;
    }

    public void a(ahr_0 ahr_02) {
        this.czi = ahr_02;
    }

    public void a(aif_2 aif_22) {
        this.czj = aif_22;
    }

    public void a(air_2 air_22) {
        this.czk = air_22;
    }

    @Override
    public afk_1[] a(LuaState luaState) {
        return new afk_1[]{new akh_1(luaState), new akk_1(luaState), new akj_1(luaState), new akq_1(luaState), new aks_1(luaState), new akz_1(luaState), new akn_1(luaState), new ake_1(luaState), new akg_1(luaState), new akf_1(luaState), new aku_1(luaState), new aka_1(luaState), new akd_1(luaState), new akc_1(luaState), new akx_1(luaState), new ako_1(luaState), new akw_1(luaState), new akm_1(luaState), new akv_1(luaState)};
    }

    @Override
    public afk_1[] b(LuaState luaState) {
        return null;
    }

    public static aiv_2 bBr() {
        return czg;
    }

    public aix_2 f(byte by, byte by2) {
        if (this.czh != null && this.czj != null) {
            return this.czj.e(by, by2);
        }
        return null;
    }

    public aix_2 a(int n, agn_1 agn_12, int n2) {
        if (this.czh != null && this.czi != null) {
            return this.czi.a(agn_12, n, n2);
        }
        return null;
    }

    @Override
    @Generated
    public ahm_1 a(long l, float f2, int n, long l2, long l3, int n2) {
        return this.czh.a(l, f2, n, l2, l3, n2);
    }

    @Override
    @Generated
    public ahm_1 a(long l, float f2, int n, long l2, long l3, int n2, int n3) {
        return this.czh.a(l, f2, n, l2, l3, n2, n3);
    }

    @Override
    @Generated
    public ahm_1 a(long l, float f2, float f3, int n, long l2, long l3, int n2) {
        return this.czh.a(l, f2, f3, n, l2, l3, n2);
    }

    @Override
    @Generated
    public ahm_1 a(long l, float f2, long l2, long l3, int n, agn_1 agn_12, int n2) {
        return this.czh.a(l, f2, l2, l3, n, agn_12, n2);
    }

    @Override
    @Generated
    public ahm_1 a(long l, float f2, float f3, int n, long l2, long l3, int n2, int n3) {
        return this.czh.a(l, f2, f3, n, l2, l3, n2, n3);
    }

    @Override
    @Generated
    public ahm_1 a(long l, float f2, long l2, long l3, int n, agn_1 agn_12, int n2, boolean bl) {
        return this.czh.a(l, f2, l2, l3, n, agn_12, n2, bl);
    }

    @Override
    @Generated
    public ahm_1 a(long l, float f2, int n, long l2, long l3, int n2, agn_1 agn_12, int n3) {
        return this.czh.a(l, f2, n, l2, l3, n2, agn_12, n3);
    }

    @Override
    @Generated
    public ahm_1 a(long l, float f2, int n, long l2, long l3, int n2, agn_1 agn_12, int n3, boolean bl) {
        return this.czh.a(l, f2, n, l2, l3, n2, agn_12, n3, bl);
    }

    @Override
    @Generated
    public ahm_1 a(long l, float f2, float f3, int n, long l2, long l3, int n2, agn_1 agn_12, int n3) {
        return this.czh.a(l, f2, f3, n, l2, l3, n2, agn_12, n3);
    }

    @Override
    @Generated
    public ahm_1 a(long l, float f2, float f3, int n, long l2, long l3, int n2, agn_1 agn_12, int n3, boolean bl) {
        return this.czh.a(l, f2, f3, n, l2, l3, n2, agn_12, n3, bl);
    }

    @Override
    @Generated
    public ahm_1 a(long l, float f2, float f3, int n, long l2, long l3, int n2, int n3, agn_1 agn_12, int n4) {
        return this.czh.a(l, f2, f3, n, l2, l3, n2, n3, agn_12, n4);
    }

    @Override
    @Generated
    public ahm_1 a(long l, float f2, int n, long l2, long l3, int n2, int n3, agn_1 agn_12, int n4, boolean bl) {
        return this.czh.a(l, f2, n, l2, l3, n2, n3, agn_12, n4, bl);
    }

    @Override
    @Generated
    public ahm_1 a(long l, float f2, float f3, int n, long l2, long l3, int n2, int n3, agn_1 agn_12, int n4, boolean bl) {
        return this.czh.a(l, f2, f3, n, l2, l3, n2, n3, agn_12, n4, bl);
    }

    @Override
    @Generated
    public void a(long l, ahk_1 ahk_12) {
        this.czh.a(l, ahk_12);
    }

    @Override
    @Generated
    public void ga(long l) {
        this.czh.ga(l);
    }

    @Override
    @Generated
    public void a(long l, float f2) {
        this.czh.a(l, f2);
    }

    @Override
    @Generated
    public void gb(long l) {
        this.czh.gb(l);
    }

    @Override
    @Generated
    public void b(long l, float f2) {
        this.czh.b(l, f2);
    }

    @Override
    @Generated
    public void bBk() {
        this.czh.bBk();
    }

    @Override
    @Generated
    public void bBl() {
        this.czh.bBl();
    }

    @Override
    @Generated
    public void aX(float f2, float f3) {
        this.czh.aX(f2, f3);
    }

    @Override
    @Generated
    public void bBm() {
        this.czh.bBm();
    }

    @Override
    @Generated
    public aix_2 a(agn_1 agn_12, int n) {
        return this.czi.a(agn_12, n);
    }

    @Override
    @Generated
    public aix_2 a(agn_1 agn_12, int n, int n2) {
        return this.czi.a(agn_12, n, n2);
    }

    @Override
    @Generated
    public aix_2 e(byte by, byte by2) {
        return this.czj.e(by, by2);
    }

    @Override
    @Generated
    public float bBj() {
        return this.czj.bBj();
    }

    @Override
    @Generated
    public aix_2 a(byte by, int n, String string) {
        return this.czk.a(by, n, string);
    }
}

