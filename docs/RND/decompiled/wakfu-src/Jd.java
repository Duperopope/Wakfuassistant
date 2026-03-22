/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.io.LittleEndianDataInputStream
 */
import com.google.common.io.LittleEndianDataInputStream;
import java.io.DataInput;
import java.io.InputStream;
import java.util.zip.InflaterInputStream;

public class Jd {
    private final JE aJZ;

    public Jd(JE jE) {
        this.aJZ = jE;
    }

    public void b(DataInput dataInput) {
        JF jF = this.aJZ.aPh();
        Jc jc = new Jc(jF);
        jc.b(dataInput);
        JG jG = this.aJZ.aPi();
        je_0 je_02 = new je_0(jG);
        je_02.b((DataInput)(jF.aPj() ? new LittleEndianDataInputStream((InputStream)new InflaterInputStream(new ie_0(dataInput))) : dataInput));
    }
}

