/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aEl
 */
class ael_2
implements Callable<aei_1> {
    private static final Logger dFj = Logger.getLogger(ael_2.class);
    public static final int dFk = 1024;
    private static final String dFl = "Wakfu/1.x";
    @NotNull
    private final aei_1 dFm;

    ael_2(@NotNull aei_1 aei_12) {
        this.dFm = aei_12;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public aei_1 bZn() {
        BufferedInputStream bufferedInputStream;
        Object object;
        OutputStream outputStream;
        if (this.dFm.bZh()) {
            this.dFm.a(aek_2.dFg);
            return this.dFm;
        }
        dFj.debug((Object)("Downloading " + String.valueOf(this.dFm)));
        this.dFm.a(aek_2.dFf);
        try {
            outputStream = this.dFm.bZj();
        }
        catch (IOException iOException) {
            dFj.error((Object)("Unable to create outputStream for download " + String.valueOf(this.dFm)), (Throwable)iOException);
            this.dFm.a(aek_2.dFh);
            return this.dFm;
        }
        try {
            URL uRL = this.dFm.bZk();
            object = this.e(uRL);
            bufferedInputStream = new BufferedInputStream(((URLConnection)object).getInputStream(), 8192);
        }
        catch (FileNotFoundException fileNotFoundException) {
            dFj.error((Object)("Unable to download " + String.valueOf(this.dFm) + " : file not found (404)"));
            this.dFm.dH(false);
            this.dFm.a(aek_2.dFh);
            return this.dFm;
        }
        catch (IOException iOException) {
            dFj.error((Object)("Unable to open url connection for " + String.valueOf(this.dFm)), (Throwable)iOException);
            this.dFm.dH(false);
            this.dFm.a(aek_2.dFh);
            return this.dFm;
        }
        try {
            int n;
            object = new byte[1024];
            while ((n = ((InputStream)bufferedInputStream).read((byte[])object, 0, 1024)) != -1) {
                outputStream.write((byte[])object, 0, n);
            }
            if (this.dFm.dH(true)) {
                this.dFm.a(aek_2.dFg);
                dFj.debug((Object)("Download finished : " + String.valueOf(this.dFm)));
            } else {
                this.dFm.a(aek_2.dFh);
                dFj.error((Object)("Error while closing stream for " + String.valueOf(this.dFm)));
            }
        }
        catch (IOException iOException) {
            dFj.error((Object)("Error while downloading " + String.valueOf(this.dFm)), (Throwable)iOException);
            this.dFm.dH(false);
            this.dFm.a(aek_2.dFh);
            object = this.dFm;
            return object;
        }
        catch (Throwable throwable) {
            dFj.error((Object)("Error while downloading " + String.valueOf(this.dFm)), throwable);
        }
        finally {
            ((InputStream)bufferedInputStream).close();
        }
        return this.dFm;
    }

    private HttpURLConnection e(URL uRL) {
        HttpURLConnection httpURLConnection = (HttpURLConnection)uRL.openConnection();
        httpURLConnection.addRequestProperty("User-Agent", dFl);
        if (ael_2.a(httpURLConnection)) {
            String string = httpURLConnection.getHeaderField("Location");
            httpURLConnection = (HttpURLConnection)new URL(string).openConnection();
            httpURLConnection.addRequestProperty("User-Agent", dFl);
        }
        return httpURLConnection;
    }

    private static boolean a(HttpURLConnection httpURLConnection) {
        boolean bl = false;
        int n = httpURLConnection.getResponseCode();
        if (n != 200 && (n == 302 || n == 301 || n == 303)) {
            bl = true;
        }
        return bl;
    }

    @Override
    public /* synthetic */ Object call() {
        return this.bZn();
    }
}

