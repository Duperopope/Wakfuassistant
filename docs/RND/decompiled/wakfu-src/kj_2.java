/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.io.LittleEndianDataOutputStream
 */
import com.google.common.io.LittleEndianDataOutputStream;
import java.io.DataOutput;
import java.io.OutputStream;
import java.util.zip.DeflaterOutputStream;

/*
 * Renamed from KJ
 */
public class kj_2 {
    private final JE aOM;

    public kj_2(JE jE) {
        this.aOM = jE;
    }

    public void b(DataOutput dataOutput) {
        JF jF = this.aOM.aPh();
        ki_2 ki_22 = new ki_2(jF);
        ki_22.b(dataOutput);
        JG jG = this.aOM.aPi();
        kk_2 kk_22 = new kk_2(jG);
        kk_22.b((DataOutput)(jF.aPj() ? new LittleEndianDataOutputStream((OutputStream)new DeflaterOutputStream(new if_0(dataOutput))) : dataOutput));
    }
}

