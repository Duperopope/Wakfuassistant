/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.InvalidProtocolBufferException
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.procedure.TIntProcedure
 *  org.jetbrains.annotations.NotNull
 */
import com.google.protobuf.InvalidProtocolBufferException;
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.procedure.TIntProcedure;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from fpD
 */
public final class fpd_0 {
    private fpd_0() {
    }

    public static byte[] c(fpv fpv2) {
        oa_2 oa_22 = fpd_0.d(fpv2);
        return oa_22.atR().toByteArray();
    }

    public static fpv gs(ByteBuffer byteBuffer) {
        ny_2 ny_22;
        try {
            ny_22 = ny_2.co(byteBuffer.array());
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw new IllegalStateException("Unable to unserialize battleground info from protobuf.", invalidProtocolBufferException);
        }
        return fpd_0.e(ny_22);
    }

    public static byte[] bo(List<fpv> list) {
        od_2 od_22 = fpd_0.bp(list);
        return od_22.auv().toByteArray();
    }

    public static ArrayList<fpv> gt(ByteBuffer byteBuffer) {
        ob_2 ob_22;
        try {
            ob_22 = ob_2.cp(byteBuffer.array());
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw new IllegalStateException("Unable to unserialize battleground list from protobuf.", invalidProtocolBufferException);
        }
        ArrayList<fpv> arrayList = new ArrayList<fpv>();
        for (ny_2 ny_22 : ob_22.aul()) {
            arrayList.add(fpd_0.e(ny_22));
        }
        return arrayList;
    }

    public static byte[] c(TIntArrayList tIntArrayList, int n) {
        oi_2 oi_22 = fpd_0.d(tIntArrayList, n);
        return oi_22.auQ().toByteArray();
    }

    public static og_2 eU(byte[] byArray) {
        og_2 og_22;
        try {
            og_22 = og_2.cq(byArray);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw new IllegalStateException("Unable to unserialize battleground team info from protobuf.", invalidProtocolBufferException);
        }
        return og_22;
    }

    private static oa_2 d(fpv fpv2) {
        oa_2 oa_22 = ny_2.atL();
        oa_22.jz(fpv2.d()).jA(fpv2.dfF().d()).jD(fpv2.ggH().d()).jB(fpv2.att()).bP(fpv2.ggI().bjB()).bQ(fpv2.ggJ() != null ? fpv2.ggJ().bjB() : 0L).jC(fpv2.atC()).jE(fpv2.atD()).jF(fpv2.eDK()).jG(fpv2.eDL());
        oa_22.a(fpd_0.d(fpv2.ggK(), fpv2.eDI()));
        oa_22.b(fpd_0.d(fpv2.ggL(), fpv2.eDJ()));
        return oa_22;
    }

    private static od_2 bp(List<fpv> list) {
        od_2 od_22 = ob_2.aup();
        for (fpv fpv2 : list) {
            od_22.a(fpd_0.d(fpv2));
        }
        return od_22;
    }

    private static oi_2 d(TIntArrayList tIntArrayList, int n) {
        oi_2 oi_22 = og_2.auJ();
        oi_22.jO(n);
        tIntArrayList.forEach((TIntProcedure)new fpe_0(oi_22));
        return oi_22;
    }

    @NotNull
    private static fpv e(ny_2 ny_22) {
        og_2 og_22;
        fpv fpv2 = new fpv(ny_22.d(), fpf_0.YC(ny_22.aeV()), fpz_0.YB(ny_22.tL()), ny_22.att(), uw_0.fn(ny_22.atA()));
        if (ny_22.atE()) {
            fpv2.c(uw_0.fn(ny_22.atF()));
        }
        if (ny_22.atu()) {
            og_22 = ny_22.atv();
            fpv2.ggK().addAll(og_22.auE());
            fpv2.Yv(og_22.auH());
        }
        if (ny_22.atx()) {
            og_22 = ny_22.aty();
            fpv2.ggL().addAll(og_22.auE());
            fpv2.Yx(og_22.auH());
        }
        fpv2.Yz(ny_22.atC());
        fpv2.YA(ny_22.atD());
        fpv2.fv((short)ny_22.atH());
        fpv2.fw((short)ny_22.atJ());
        return fpv2;
    }
}

