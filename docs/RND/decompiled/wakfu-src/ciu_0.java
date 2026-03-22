/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

/*
 * Renamed from ciu
 */
public class ciu_0
extends nr_0 {
    private byte lUJ;
    private final AtomicReference<civ_0> lUL = new AtomicReference();

    @Override
    public boolean dn(byte[] byArray) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);
            try (DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);){
                this.lUJ = dataInputStream.readByte();
                if (dataInputStream.readBoolean()) {
                    this.lUL.set(civ_0.f(dataInputStream));
                }
            }
            return true;
        }
        catch (IOException iOException) {
            throw new IllegalStateException("Decoding exception", iOException);
        }
    }

    @Override
    public int d() {
        return 559;
    }

    public byte evk() {
        return this.lUJ;
    }

    public long xl() {
        return this.lUL.get().xl();
    }

    public long cWj() {
        return this.lUL.get().cWj();
    }

    public vb_0 cWk() {
        return this.lUL.get().cWk();
    }

    public Optional<evk_2> cWm() {
        return this.lUL.get().evl();
    }

    public ns_2 cWn() {
        return this.lUL.get().cWn();
    }

    public String etm() {
        return this.lUL.get().etm();
    }
}

