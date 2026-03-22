/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownServiceException;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from aHB
 */
public class ahb_1
extends Thread {
    private static final boolean dQW = true;
    private URLConnection dQX = null;
    private InputStream dQY = null;
    byte[] dQZ = null;
    final int dRa = 2048;
    int dQP = 0;
    int Yk = 0;
    byte[] dRb;
    int dRc;
    private SourceDataLine dRd = null;
    private float[][][] dRe;
    private int[] dRf;
    private final fub_2 dRg = new fub_2();
    private final fuc_2 dRh = new fuc_2();
    private final fud_2 dRi = new fud_2();
    private final fue_2 dRj = new fue_2();
    private final fum_1 dRk = new fum_1();
    private final fuf_1 dRl = new fuf_1(this.dRk);
    private final fuj_2 dRm = new fuj_2();
    private final fua_1 dRn = new fua_1();

    public static void main(String[] stringArray) {
        String string;
        string = stringArray.length > 0 ? (string = stringArray[0]) : null;
        string = "file:////H:\\Work\\Adamai_Assets\\audio\\export\\musics\\200000.ogg";
        if (string != null) {
            ahb_1 ahb_12 = new ahb_1(string);
            ahb_12.start();
        } else {
            System.err.println("Please provide an argument with the file to play.");
        }
    }

    ahb_1(String string) {
        this.f(this.if(string));
    }

    public URL if(String string) {
        URL uRL = null;
        try {
            uRL = fo_0.bA(string);
        }
        catch (MalformedURLException malformedURLException) {
            System.err.println("Malformed \"url\" parameter: \"" + string + "\"");
        }
        return uRL;
    }

    private void f(URL uRL) {
        try {
            this.dQX = uRL.openConnection();
        }
        catch (UnknownServiceException unknownServiceException) {
            System.err.println("The protocol does not support input.");
        }
        catch (IOException iOException) {
            System.err.println("An I/O error occoured while trying create the URL connection.");
        }
        if (this.dQX != null) {
            try {
                this.dQY = this.dQX.getInputStream();
            }
            catch (IOException iOException) {
                System.err.println("An I/O error occoured while trying to get an input stream from the URL.");
                System.err.println(iOException);
            }
        }
    }

    @Override
    public void run() {
        if (this.dQY == null) {
            System.err.println("We don't have an input stream and therefor cannot continue.");
            return;
        }
        this.cdS();
        if (this.cdT() && this.cdU()) {
            this.cdV();
        }
        this.bmX();
    }

    private void cdS() {
        this.ig("Initializing JOrbis.");
        this.dRj.act(2048);
        this.dQZ = this.dRj.SY;
        this.ig("Done initializing JOrbis.");
    }

    private boolean cdT() {
        this.ig("Starting to read the header.");
        boolean bl = true;
        int n = 1;
        while (bl) {
            try {
                this.dQP = this.dQY.read(this.dQZ, this.Yk, 2048);
            }
            catch (IOException iOException) {
                System.err.println("Could not read from the input stream.");
                System.err.println(iOException);
            }
            this.dRj.acu(this.dQP);
            block1 : switch (n) {
                case 1: {
                    switch (this.dRj.e(this.dRh)) {
                        case -1: {
                            System.err.println("There is a hole in the first packet data.");
                            return false;
                        }
                        case 0: {
                            break;
                        }
                        case 1: {
                            this.dRi.tZ(this.dRh.gHL());
                            this.dRi.gHQ();
                            this.dRn.bkZ();
                            this.dRm.bkZ();
                            if (this.dRi.c(this.dRh) == -1) {
                                System.err.println("We got an error while reading the first header page.");
                                return false;
                            }
                            if (this.dRi.b(this.dRg) != 1) {
                                System.err.println("We got an error while reading the first header packet.");
                                return false;
                            }
                            if (this.dRn.a(this.dRm, this.dRg) < 0) {
                                System.err.println("We got an error while interpreting the first packet. Apparantly, it's not Vorbis data.");
                                return false;
                            }
                            ++n;
                        }
                    }
                    if (n == 1) break;
                }
                case 2: 
                case 3: {
                    switch (this.dRj.e(this.dRh)) {
                        case -1: {
                            System.err.println("There is a hole in the second or third packet data.");
                            return false;
                        }
                        case 0: {
                            break block1;
                        }
                        case 1: {
                            this.dRi.c(this.dRh);
                            switch (this.dRi.b(this.dRg)) {
                                case -1: {
                                    System.err.println("There is a hole in the firstpacket data.");
                                    return false;
                                }
                                case 0: {
                                    break block1;
                                }
                                case 1: {
                                    this.dRn.a(this.dRm, this.dRg);
                                    if (++n != 4) break block1;
                                    bl = false;
                                }
                            }
                        }
                    }
                }
            }
            this.Yk = this.dRj.act(2048);
            this.dQZ = this.dRj.SY;
            if (this.dQP != 0 || !bl) continue;
            System.err.println("Not enough header data was supplied.");
            return false;
        }
        this.ig("Finished reading the header.");
        return true;
    }

    private boolean cdU() {
        this.ig("Initializing the sound system.");
        this.dRc = 4096;
        this.dRb = new byte[this.dRc];
        this.dRk.a(this.dRn);
        this.dRl.a(this.dRk);
        int n = this.dRn.vkU;
        int n2 = this.dRn.vjB;
        AudioFormat audioFormat = new AudioFormat(n2, 16, n, true, false);
        DataLine.Info info = new DataLine.Info(SourceDataLine.class, audioFormat, -1);
        if (!AudioSystem.isLineSupported(info)) {
            System.err.println("Audio output line is not supported.");
            return false;
        }
        try {
            this.dRd = (SourceDataLine)AudioSystem.getLine(info);
            this.dRd.open(audioFormat);
        }
        catch (LineUnavailableException lineUnavailableException) {
            System.out.println("The audio output line could not be opened due to resource restrictions.");
            System.err.println(lineUnavailableException);
            return false;
        }
        catch (IllegalStateException illegalStateException) {
            System.out.println("The audio output line is already open.");
            System.err.println(illegalStateException);
            return false;
        }
        catch (SecurityException securityException) {
            System.out.println("The audio output line could not be opened due to security restrictions.");
            System.err.println(securityException);
            return false;
        }
        this.dRd.start();
        this.dRe = new float[1][][];
        this.dRf = new int[this.dRn.vkU];
        this.ig("Done initializing the sound system.");
        return true;
    }

    private void cdV() {
        this.ig("Reading the body.");
        boolean bl = true;
        while (bl) {
            switch (this.dRj.e(this.dRh)) {
                case -1: {
                    this.ig("There is a hole in the data. We proceed.");
                }
                case 0: {
                    break;
                }
                case 1: {
                    this.dRi.c(this.dRh);
                    if (this.dRh.gHK() == 0L) {
                        bl = false;
                        break;
                    }
                    block13: while (true) {
                        switch (this.dRi.b(this.dRg)) {
                            case -1: {
                                this.ig("There is a hole in the data, we continue though.");
                            }
                            case 0: {
                                break block13;
                            }
                            case 1: {
                                this.cdW();
                            }
                            default: {
                                continue block13;
                            }
                        }
                        break;
                    }
                    if (this.dRh.gHJ() == 0) break;
                    bl = false;
                }
            }
            if (!bl) continue;
            this.Yk = this.dRj.act(2048);
            this.dQZ = this.dRj.SY;
            try {
                this.dQP = this.dQY.read(this.dQZ, this.Yk, 2048);
            }
            catch (Exception exception) {
                System.err.println(exception);
                return;
            }
            this.dRj.acu(this.dQP);
            if (this.dQP != 0) continue;
            bl = false;
        }
        this.ig("Done reading the body.");
    }

    private void bmX() {
        this.ig("Cleaning up.");
        this.dRi.clear();
        this.dRl.gHR();
        this.dRk.clear();
        this.dRn.clear();
        this.dRj.gHR();
        try {
            if (this.dQY != null) {
                this.dQY.close();
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        this.ig("Done cleaning up.");
    }

    private void cdW() {
        int n;
        if (this.dRl.c(this.dRg) == 0) {
            this.dRk.a(this.dRl);
        }
        while ((n = this.dRk.a(this.dRe, this.dRf)) > 0) {
            int n2 = n < this.dRc ? n : this.dRc;
            for (int i = 0; i < this.dRn.vkU; ++i) {
                int n3 = i * 2;
                for (int j = 0; j < n2; ++j) {
                    int n4 = (int)(this.dRe[0][i][this.dRf[i] + j] * 32767.0f);
                    if (n4 > Short.MAX_VALUE) {
                        n4 = Short.MAX_VALUE;
                    }
                    if (n4 < Short.MIN_VALUE) {
                        n4 = Short.MIN_VALUE;
                    }
                    if (n4 < 0) {
                        n4 |= 0x8000;
                    }
                    this.dRb[n3] = (byte)n4;
                    this.dRb[n3 + 1] = (byte)(n4 >>> 8);
                    n3 += 2 * this.dRn.vkU;
                }
            }
            this.dRd.write(this.dRb, 0, 2 * this.dRn.vkU * n2);
            this.dRk.acw(n2);
        }
    }

    private void ig(String string) {
        System.out.println("Debug: " + string);
    }
}

