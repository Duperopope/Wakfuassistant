/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.InvalidProtocolBufferException
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import com.google.protobuf.InvalidProtocolBufferException;
import java.util.Map;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public final class eMX {
    private static final Logger qOA = Logger.getLogger(eMX.class);

    private eMX() {
    }

    public static byte[] b(eMW eMW2) {
        go_1 go_12 = eMX.c(eMW2);
        return go_12.FN().toByteArray();
    }

    public static eMW eC(byte[] byArray) {
        gm_0 gm_02;
        try {
            gm_02 = gm_0.aI(byArray);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw new IllegalStateException("Unable to unserialize stasis dungeon info from protobuf.");
        }
        return eMX.f(gm_02);
    }

    public static byte[] b(eMS eMS2) {
        hf_1 hf_12 = eMX.c(eMS2);
        return hf_12.Hl().toByteArray();
    }

    public static eMS eD(byte[] byArray) {
        hd_1 hd_12;
        try {
            hd_12 = hd_1.aM(byArray);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw new IllegalStateException("Unable to unserialize dungeon progression from protobuf.");
        }
        return eMX.d(hd_12);
    }

    public static byte[] b(eyo_1 eyo_12) {
        gs_1 gs_12 = eMX.c(eyo_12);
        return gs_12.Gk().toByteArray();
    }

    public static eyo_1 eE(byte[] byArray) {
        gq_1 gq_12;
        try {
            gq_12 = gq_1.aJ(byArray);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw new IllegalStateException("Unable to unserialize dungeon progression from protobuf.");
        }
        return eMX.d(gq_12);
    }

    @NotNull
    private static go_1 c(eMW eMW2) {
        go_1 go_12 = gm_0.FE();
        go_12.df(eMW2.Fq()).dh(eMW2.rI()).dg(eMW2.Fs()).n(eMW2.erC()).m(eMW2.cmT()).o(eMW2.erD()).p(eMW2.erF()).y(eMW2.fAR());
        return go_12;
    }

    @NotNull
    private static eMW f(gm_0 gm_02) {
        eMW eMW2 = new eMW();
        eMW2.Km(gm_02.Fq());
        eMW2.RK(gm_02.rI());
        eMW2.iT(gm_02.Fw());
        eMW2.RL(gm_02.Fs());
        eMW2.iS(gm_02.Fu());
        for (Long l : gm_02.FB()) {
            eMW2.qr(l);
        }
        eMW2.lQ(gm_02.FA());
        return eMW2;
    }

    @NotNull
    private static hf_1 c(eMS eMS2) {
        hf_1 hf_12 = hd_1.Hf();
        for (Map.Entry<Integer, Integer> entry : eMS2.fAM()) {
            Integer n = entry.getKey();
            Integer n2 = entry.getValue();
            hf_12.a(eMX.fB(n, n2));
        }
        return hf_12;
    }

    @NotNull
    private static gs_1 c(eyo_1 eyo_12) {
        gs_1 gs_12 = gq_1.Ge();
        for (Map.Entry<Long, eMW> entry : eyo_12.fdq()) {
            Long l = entry.getKey();
            eMW eMW2 = entry.getValue();
            gs_12.a(eMX.c(l, eMW2));
        }
        return gs_12;
    }

    @NotNull
    private static hb_0 fB(int n, int n2) {
        hb_0 hb_02 = gz_0.GP();
        hb_02.dn(n).do(n2);
        return hb_02;
    }

    @NotNull
    private static eMS d(hd_1 hd_12) {
        eMS eMS2 = new eMS();
        for (gz_0 gz_02 : hd_12.Hb()) {
            eMS2.fA(gz_02.wp(), gz_02.GN());
        }
        return eMS2;
    }

    @NotNull
    private static eyo_1 d(gq_1 gq_12) {
        eyo_1 eyo_12 = new eyo_1();
        for (gt_0 gt_02 : gq_12.Ga()) {
            eyo_12.a(gt_02.Gt(), eMX.f(gt_02.Gv()));
        }
        return eyo_12;
    }

    @NotNull
    private static gv_0 c(long l, eMW eMW2) {
        gv_0 gv_02 = gt_0.Gy();
        gv_02.U(l).a(eMX.c(eMW2));
        return gv_02;
    }
}

