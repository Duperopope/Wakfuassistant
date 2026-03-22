/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.net.URL;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aEr
 */
public class aer_2
extends aei_1 {
    private static final int dFG = 1024;
    private final ByteArrayOutputStream dFH = new ByteArrayOutputStream(1024);

    public aer_2(@NotNull URL uRL) {
        super(uRL);
    }

    @Override
    OutputStream bZj() {
        return this.dFH;
    }

    @Override
    boolean dH(boolean bl) {
        return bl;
    }

    public byte[] bZs() {
        return this.dFH.toByteArray();
    }

    public String bZt() {
        return this.dFH.toString("UTF-8");
    }

    public String hq(String string) {
        return this.dFH.toString(string);
    }

    @Override
    protected String bZl() {
        return "Memory";
    }
}

