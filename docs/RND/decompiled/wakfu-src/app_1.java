/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.io.InputStream;
import java.nio.BufferUnderflowException;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from apP
 */
public class app_1
extends InputStream {
    private final apl_1 cPa;

    public app_1(apl_1 apl_12) {
        this.cPa = apl_12;
    }

    @Override
    public int read() {
        try {
            return this.cPa.aIy();
        }
        catch (BufferUnderflowException bufferUnderflowException) {
            return -1;
        }
    }

    @Override
    public int read(byte @NotNull [] byArray, int n, int n2) {
        int n3 = this.cPa.c(byArray, n, n2);
        return n3 == 0 ? -1 : n3;
    }

    @Override
    public void close() {
        this.cPa.close();
    }

    @Override
    public int available() {
        return this.cPa.available();
    }
}

