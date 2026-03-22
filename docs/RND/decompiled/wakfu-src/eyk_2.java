/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.InvalidProtocolBufferException
 *  org.jetbrains.annotations.NotNull
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eYK
 */
public final class eyk_2 {
    private eyk_2() {
    }

    public static byte[] f(ezu_1 ezu_12) {
        jv_2 jv_22 = eyk_2.g(ezu_12);
        return jv_22.YG().toByteArray();
    }

    public static ezu_1 fJ(ByteBuffer byteBuffer) {
        eye_2 eye_22 = new eye_2();
        eyk_2.a(byteBuffer, (ezu_1)eye_22);
        return eye_22;
    }

    public static void a(ByteBuffer byteBuffer, ezu_1 ezu_12) {
        jt_2 jt_22;
        try {
            jt_22 = jt_2.bt(byteBuffer.array());
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw new IllegalStateException("Unable to unserialize guild model info from protobuf.");
        }
        eyk_2.a(jt_22, ezu_12);
    }

    public static byte[] l(fab fab2) {
        jz_2 jz_22 = eyk_2.m(fab2);
        return jz_22.Zt().toByteArray();
    }

    public static fab fK(ByteBuffer byteBuffer) {
        jx_2 jx_22;
        try {
            jx_22 = jx_2.bu(byteBuffer.array());
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw new IllegalStateException("Unable to unserialize guild rank info from protobuf.");
        }
        return eyk_2.e(jx_22);
    }

    public static byte[] n(ezv_1 ezv_12) {
        jn_2 jn_22 = eyk_2.o(ezv_12);
        return jn_22.Xa().toByteArray();
    }

    public static ezv_1 fL(ByteBuffer byteBuffer) {
        jl_2 jl_22;
        try {
            jl_22 = jl_2.br(byteBuffer.array());
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw new IllegalStateException("Unable to unserialize guild bonus info from protobuf.");
        }
        return eyk_2.e(jl_22);
    }

    public static byte[] u(ezz_1 ezz_12) {
        jr_2 jr_22 = eyk_2.v(ezz_12);
        return jr_22.XH().toByteArray();
    }

    public static ezz_1 fM(ByteBuffer byteBuffer) {
        jp_2 jp_22;
        try {
            jp_22 = jp_2.bs(byteBuffer.array());
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw new IllegalStateException("Unable to unserialize guild member info from protobuf.", invalidProtocolBufferException);
        }
        return eyk_2.e(jp_22);
    }

    @NotNull
    private static jv_2 g(ezu_1 ezu_12) {
        jv_2 jv_22 = jt_2.YA();
        jv_22.aK(ezu_12.Sn()).fU(ezu_12.cmL()).aL(ezu_12.Yc()).J(ezu_12.getName()).K(ezu_12.getDescription()).L(ezu_12.getMessage()).fV(ezu_12.Yh()).fW(ezu_12.Yj()).fX(ezu_12.Yl()).fY(ezu_12.fPY()).fZ(ezu_12.Yp());
        ezu_12.g(new eyl_2(jv_22));
        ArrayList arrayList = new ArrayList();
        ezu_12.I(new eym_2(arrayList, ezu_12));
        for (int i = 0; i < arrayList.size(); ++i) {
            jv_22.a((jr_2)arrayList.get(i));
        }
        ezu_12.J(new eyn_2(jv_22));
        return jv_22;
    }

    @NotNull
    private static ezu_1 a(jt_2 jt_22, ezu_1 ezu_12) {
        eye_2 eye_22 = ezu_12 == null ? new eye_2() : (eye_2)ezu_12;
        eye_22.dC(jt_22.Ya());
        eye_22.bw((short)jt_22.tL());
        eye_22.jS(jt_22.Yc());
        eye_22.setName(jt_22.getName());
        eye_22.cA(jt_22.getDescription());
        eye_22.co(jt_22.getMessage());
        eye_22.Tw(jt_22.Yh());
        eye_22.Tv(jt_22.Yj());
        eye_22.Tq(jt_22.Yl());
        eye_22.Tx(jt_22.Yn());
        eye_22.Ty(jt_22.Yp());
        for (jx_2 generatedMessageV3 : jt_22.Yq()) {
            eye_22.g(eyk_2.e(generatedMessageV3));
        }
        for (jp_2 jp_22 : jt_22.Yt()) {
            eye_22.f(eyk_2.e(jp_22));
        }
        for (jl_2 jl_22 : jt_22.Yw()) {
            eye_22.j(eyk_2.e(jl_22));
        }
        return eye_22;
    }

    @NotNull
    static jz_2 m(fab fab2) {
        jz_2 jz_22 = jx_2.Zn();
        jz_22.aM(fab2.Sn()).M(fab2.getName()).aN(fab2.fQk()).gj(fab2.bfE());
        return jz_22;
    }

    @NotNull
    private static fab e(jx_2 jx_22) {
        eyj_2 eyj_22 = new eyj_2(jx_22.Sn());
        eyj_22.setName(jx_22.getName());
        eyj_22.rN(jx_22.Zl());
        eyj_22.cX((short)jx_22.Lz());
        return eyj_22;
    }

    @NotNull
    static jr_2 v(ezz_1 ezz_12) {
        jr_2 jr_22 = jp_2.XB();
        jr_22.aF(ezz_12.Sn()).aG(ezz_12.Xi()).fL(ezz_12.Xk()).aH(ezz_12.Xm()).aI(ezz_12.pf()).O(ezz_12.bSr()).cp(ByteString.copyFrom((byte[])new byte[]{ezz_12.dJY()})).cq(ByteString.copyFrom((byte[])new byte[]{ezz_12.aWO()})).fM(ezz_12.aWP()).fN(ezz_12.Xt()).I(ezz_12.getName()).aJ(ezz_12.Xv()).cs(ByteString.copyFrom((byte[])new byte[]{ezz_12.fdX()})).ct(ByteString.copyFrom((byte[])new byte[]{ezz_12.fPR()}));
        return jr_22;
    }

    @NotNull
    private static ezz_1 e(jp_2 jp_22) {
        eyd_2 eyd_22 = new eyd_2(jp_22.Sn());
        eyd_22.pi(jp_22.Xi());
        eyd_22.lS(jp_22.Xk());
        eyd_22.rE(jp_22.Xm());
        eyd_22.ij(jp_22.pf());
        eyd_22.jJ(jp_22.Xo());
        eyd_22.fU(jp_22.Xq().byteAt(0));
        eyd_22.aQ(jp_22.Xr().byteAt(0));
        eyd_22.aT((short)jp_22.xT());
        eyd_22.Le(jp_22.Xt());
        eyd_22.setName(jp_22.getName());
        eyd_22.rF(jp_22.Xv());
        eyd_22.l(Mv.A(jp_22.Xx().byteAt(0)));
        eyd_22.b(vb_0.pS(jp_22.Xz().byteAt(0)));
        return eyd_22;
    }

    @NotNull
    static jn_2 o(ezv_1 ezv_12) {
        jn_2 jn_22 = jl_2.WU();
        jn_22.fK(ezv_12.tJ()).aD(ezv_12.fPK().bjB()).aE(ezv_12.fPJ().bjB());
        return jn_22;
    }

    @NotNull
    private static ezv_1 e(jl_2 jl_22) {
        return new eyw_2().Tk(jl_22.d()).R(uw_0.fn(jl_22.WS())).S(uw_0.fn(jl_22.WQ())).fPI();
    }
}

