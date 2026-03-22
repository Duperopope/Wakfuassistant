/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.io.LittleEndianDataOutputStream
 */
import com.google.common.io.LittleEndianDataOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.List;

public class HH {
    private final JE aJu;
    private final ll_2 aJv;
    private final long aJw;

    public HH(JE jE, ll_2 ll_22, long l) {
        this.aJu = jE;
        this.aJv = ll_22;
        this.aJw = l;
    }

    public final void cz(String string) {
        try (LittleEndianDataOutputStream littleEndianDataOutputStream = new LittleEndianDataOutputStream((OutputStream)new FileOutputStream(string));){
            this.a((DataOutput)littleEndianDataOutputStream);
        }
    }

    public final void a(DataOutput dataOutput) {
        ku_1 ku_12 = (ku_1)this.aJu.aPi().aPl().get(0).aPq();
        this.a(dataOutput, ku_12);
    }

    private void a(DataOutput dataOutput, ku_1 ku_12) {
        dataOutput.writeBoolean(ku_12.aQM());
        dataOutput.writeBoolean(ku_12.aQO());
        dataOutput.writeBoolean(ku_12.aQP());
        dataOutput.writeInt(ku_12.aQR());
        dataOutput.writeInt(ku_12.aQS());
        dataOutput.writeLong(this.aJw);
        dataOutput.writeShort((short)(ku_12.aQN()[0] & 0xFFFF));
        dataOutput.writeShort((short)(ku_12.aQN()[1] & 0xFFFF));
        dataOutput.writeByte(ku_12.aQQ());
        this.a(dataOutput, (JH)ku_12);
    }

    private void a(DataOutput dataOutput, JH jH) {
        List<kt_1> list = jH.aPi().aPl().stream().filter(arg_0 -> HC.a(JI.aLa).apply(arg_0)).map(arg_0 -> HC.aPf().apply(arg_0)).toList();
        dataOutput.writeByte((byte)list.size());
        for (kt_1 kt_12 : list) {
            this.a(dataOutput, kt_12);
        }
    }

    private void a(DataOutput dataOutput, kt_1 kt_12) {
        dataOutput.writeByte((byte)kt_12.aQr()[0]);
        dataOutput.writeByte((byte)kt_12.aQr()[1]);
        byte[] byArray = this.c(kt_12);
        dataOutput.writeInt(byArray.length);
        dataOutput.write(byArray);
    }

    private byte[] c(kt_1 kt_12) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        LittleEndianDataOutputStream littleEndianDataOutputStream = new LittleEndianDataOutputStream((OutputStream)byteArrayOutputStream);
        hs_0 hs_02 = new hs_0(kt_12);
        hs_02.b((DataOutput)littleEndianDataOutputStream);
        this.a(littleEndianDataOutputStream, (JH)kt_12);
        this.b(littleEndianDataOutputStream, kt_12);
        this.d(littleEndianDataOutputStream, kt_12);
        this.a((DataOutput)littleEndianDataOutputStream, (JH)kt_12);
        littleEndianDataOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    private void a(LittleEndianDataOutputStream littleEndianDataOutputStream, JH jH) {
        List<kh_1> list = jH.aPi().aPl().stream().filter(arg_0 -> HC.a(JI.aKG, JI.aKS).apply(arg_0)).toList();
        littleEndianDataOutputStream.writeByte(list.size());
        for (kh_1 kh_12 : list) {
            id_1 id_12 = this.d(kh_12);
            id_12.b((DataOutput)littleEndianDataOutputStream);
        }
    }

    private void b(LittleEndianDataOutputStream littleEndianDataOutputStream, JH jH) {
        List<kh_1> list = jH.aPi().aPl().stream().filter(arg_0 -> HC.a(JI.aKI, JI.aKT, JI.aKR, JI.aKH, JI.aKM, JI.aKP, JI.aKL, JI.aKW, JI.aKJ, JI.aKV, JI.aKX, JI.aKY, JI.aKK).apply(arg_0)).toList();
        littleEndianDataOutputStream.writeByte(list.size());
        for (kh_1 kh_12 : list) {
            id_1 id_12 = this.d(kh_12);
            id_12.b((DataOutput)littleEndianDataOutputStream);
            this.c(littleEndianDataOutputStream, (JH)((Object)kh_12.aPq()));
        }
    }

    private void c(LittleEndianDataOutputStream littleEndianDataOutputStream, JH jH) {
        List<kh_1> list = jH.aPi().aPl().stream().filter(arg_0 -> HC.a(JI.aKN, JI.aKQ).apply(arg_0)).toList();
        littleEndianDataOutputStream.writeByte(list.size());
        for (kh_1 kh_12 : list) {
            id_1 id_12 = this.d(kh_12);
            id_12.b((DataOutput)littleEndianDataOutputStream);
        }
    }

    private void d(LittleEndianDataOutputStream littleEndianDataOutputStream, JH jH) {
        List<kh_1> list = jH.aPi().aPl().stream().filter(arg_0 -> HC.a(JI.aKU).apply(arg_0)).toList();
        littleEndianDataOutputStream.writeByte(list.size());
        for (kh_1 kh_12 : list) {
            hw_0 hw_02 = new hw_0((ky_0)kh_12.aPq());
            hw_02.b((DataOutput)littleEndianDataOutputStream);
            this.b(littleEndianDataOutputStream, (JH)((Object)kh_12.aPq()));
        }
    }

    private id_1 d(kh_1 kh_12) {
        return switch (kh_12.aPp().aPr()) {
            case JI.aKG -> new hl_0((km_1)kh_12.aPq());
            case JI.aKS -> new hm_0((kn_1)kh_12.aPq(), this.aJv.nn(((kn_1)kh_12.aPq()).aPA()));
            case JI.aKI -> new HK((kk_1)kh_12.aPq());
            case JI.aKT -> new hn_0((ko_1)kh_12.aPq());
            case JI.aKR -> new ho_0((kp_1)kh_12.aPq());
            case JI.aKH -> new hp_0((kq_1)kh_12.aPq());
            case JI.aKM -> new hq_0((kr_1)kh_12.aPq());
            case JI.aKP -> new hr_0((ks_1)kh_12.aPq());
            case JI.aKL -> new ht_0((kw_0)kh_12.aPq());
            case JI.aKW -> new hv_0((kz_0)kh_12.aPq());
            case JI.aKJ -> new hx_0((ka_0)kh_12.aPq());
            case JI.aKV -> new hz_0((ke_0)kh_12.aPq());
            case JI.aKX -> new ib_1((kf_2)kh_12.aPq());
            case JI.aKY -> new ia_1((kg_2)kh_12.aPq());
            case JI.aKK -> new ic_1((kh_2)kh_12.aPq());
            case JI.aKN -> new hu_0((kx_0)kh_12.aPq());
            case JI.aKQ -> new hy_0((kc_1)kh_12.aPq());
            default -> throw new IllegalArgumentException("Unknown tag " + String.valueOf((Object)kh_12.aPp().aPr()));
        };
    }
}

