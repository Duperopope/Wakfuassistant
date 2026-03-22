/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

/*
 * Renamed from Ih
 */
public final class ih_0 {
    public static final ih_0 aJV = new ih_0();
    private final HashMap<Class<? extends ki_1>, Ja> aJW = new HashMap();
    private final HashMap<Class<? extends ki_1>, Jb> aJX = new HashMap();

    private ih_0() {
        this.aPg();
    }

    private void a(Class<? extends ki_1> clazz, Ja ja, Jb jb) {
        this.aJW.put(clazz, ja);
        this.aJX.put(clazz, jb);
    }

    public jf_0 a(ki_1 ki_12) {
        Ja ja = this.aJW.get(ki_12.getClass());
        return ja.a(ki_12);
    }

    public kl_2 b(ki_1 ki_12) {
        Jb jb = this.aJX.get(ki_12.getClass());
        return jb.b(ki_12);
    }

    private void aPg() {
        this.a(kk_1.class, new Ii(this), new It(this));
        this.a(km_1.class, new ie_1(this), new IP(this));
        this.a(kn_1.class, new iv_0(this), new iw_0(this));
        this.a(ko_1.class, new IX(this), new iy_0(this));
        this.a(kp_1.class, new iz_0(this), new ij_0(this));
        this.a(kq_1.class, new ik_0(this), new il_0(this));
        this.a(kr_1.class, new im_0(this), new In(this));
        this.a(ks_1.class, new io_0(this), new ip_0(this));
        this.a(kt_1.class, new iq_0(this), new Ir(this));
        this.a(ku_1.class, new Is(this), new Iu(this));
        this.a(kv_1.class, new Iv(this), new Iw(this));
        this.a(kw_0.class, new ix_0(this), new Iy(this));
        this.a(kx_0.class, new Iz(this), new ia_0(this));
        this.a(ky_0.class, new ib_0(this), new ic_0(this));
        this.a(kz_0.class, new id_0(this), new if_1(this));
        this.a(ka_0.class, new ig_0(this), new IH(this));
        this.a(kb_1.class, new ii_0(this), new IJ(this));
        this.a(kc_1.class, new IK(this), new IL(this));
        this.a(ke_0.class, new IM(this), new in_0(this));
        this.a(kf_2.class, new IO(this), new IQ(this));
        this.a(kg_2.class, new ir_0(this), new is_0(this));
        this.a(kh_2.class, new it_0(this), new iu_0(this));
    }
}

