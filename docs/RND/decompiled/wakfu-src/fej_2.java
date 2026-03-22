/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.sun.jna.NativeLibrary
 *  uk.co.caprica.vlcj.player.MediaPlayerEventListener
 *  uk.co.caprica.vlcj.player.MediaPlayerFactory
 *  uk.co.caprica.vlcj.player.direct.BufferFormat
 *  uk.co.caprica.vlcj.player.direct.BufferFormatCallback
 *  uk.co.caprica.vlcj.player.direct.DirectMediaPlayer
 *  uk.co.caprica.vlcj.player.direct.RenderCallback
 *  uk.co.caprica.vlcj.player.direct.format.RV32BufferFormat
 *  uk.co.caprica.vlcj.player.events.MediaPlayerEventType
 *  uk.co.caprica.vlcj.runtime.RuntimeUtil
 */
import com.sun.jna.NativeLibrary;
import java.io.File;
import java.util.Objects;
import uk.co.caprica.vlcj.player.MediaPlayerEventListener;
import uk.co.caprica.vlcj.player.MediaPlayerFactory;
import uk.co.caprica.vlcj.player.direct.BufferFormat;
import uk.co.caprica.vlcj.player.direct.BufferFormatCallback;
import uk.co.caprica.vlcj.player.direct.DirectMediaPlayer;
import uk.co.caprica.vlcj.player.direct.RenderCallback;
import uk.co.caprica.vlcj.player.direct.format.RV32BufferFormat;
import uk.co.caprica.vlcj.player.events.MediaPlayerEventType;
import uk.co.caprica.vlcj.runtime.RuntimeUtil;

/*
 * Renamed from fEj
 */
public class fej_2
extends fed_1
implements BufferFormatCallback {
    private static final long ujp = MediaPlayerEventType.events((MediaPlayerEventType[])new MediaPlayerEventType[]{MediaPlayerEventType.ALL});
    private DirectMediaPlayer ujq;
    private MediaPlayerFactory ujr;
    private fec_2 ujs;
    private fel_1 ujt;
    Runnable uju;

    public static void gvh() {
        try {
            uja.info((Object)("Preload " + String.valueOf(fej_2.class)));
            MediaPlayerFactory mediaPlayerFactory = new MediaPlayerFactory();
            mediaPlayerFactory.release();
        }
        catch (Throwable throwable) {
            uja.error((Object)("An error occured during preloading of " + String.valueOf(fej_2.class)), throwable);
        }
    }

    public static void lO(String string) {
        MediaPlayerFactory mediaPlayerFactory = new MediaPlayerFactory(new String[]{"--no-video-title-show"});
        DirectMediaPlayer directMediaPlayer = mediaPlayerFactory.newDirectMediaPlayer((BufferFormatCallback)new fek_2(), (RenderCallback)new fec_2());
        uja.info((Object)"Starting load of dummy video file to prepare vlcj modules");
        directMediaPlayer.playMedia(string, new String[0]);
    }

    public BufferFormat getBufferFormat(int n, int n2) {
        return new RV32BufferFormat(n, n2);
    }

    @Override
    protected awr_1 getVideoTextureProducer() {
        return this.ujs;
    }

    public void setEndedVideoRunnable(Runnable runnable) {
        this.uju = runnable;
    }

    @Override
    public boolean gve() {
        String string = this.getVideoPath();
        if (string == null) {
            uja.error((Object)("Unable to get path for video " + String.valueOf(this)));
            return false;
        }
        if (this.ujq == null) {
            if (this.ujr == null) {
                this.gvj();
                if (this.ujr == null) {
                    uja.error((Object)("Unable to play media " + this.getVideoPath()));
                    return false;
                }
            }
            this.ujq = this.ujr.newDirectMediaPlayer((BufferFormatCallback)this, (RenderCallback)this.ujs);
            this.gvi();
            if (!this.ujq.playMedia(this.getVideoPath(), new String[0])) {
                uja.error((Object)("Unable to play media " + this.getVideoPath()));
                return false;
            }
        }
        this.ujq.play();
        return true;
    }

    @Override
    public void setSpu(int n) {
        if (this.ujq == null) {
            uja.error((Object)"Unable to set SPU if no media player is started");
            return;
        }
        this.ujq.setSpu(n);
    }

    @Override
    public boolean oH(boolean bl) {
        if (this.ujq == null) {
            return false;
        }
        this.ujq.setPause(bl);
        return true;
    }

    @Override
    public boolean gvf() {
        if (this.ujq == null) {
            return false;
        }
        this.ujq.stop();
        return true;
    }

    @Override
    public long getVideoDuration() {
        return this.ujq != null ? this.ujq.getLength() : 0L;
    }

    @Override
    public void fB(float f2) {
        if (this.ujq == null) {
            return;
        }
        if (!this.ujq.isSeekable()) {
            return;
        }
        this.ujq.setPosition(f2);
    }

    @Override
    protected void fC(float f2) {
        if (this.ujq == null) {
            return;
        }
        this.ujq.setVolume(Math.round(f2 * 100.0f));
    }

    @Override
    protected long getVideoPosition() {
        if (this.ujq == null) {
            return 0L;
        }
        return this.ujq.getTime();
    }

    @Override
    public void a(ahz_2 ahz_22) {
        if (this.ujt == null) {
            this.ujt = new fel_1(this);
        }
        this.ujt.ujv.add(ahz_22);
        this.gvi();
    }

    private void gvi() {
        if (this.ujq == null || this.ujt == null) {
            return;
        }
        this.ujq.removeMediaPlayerEventListener((MediaPlayerEventListener)this.ujt);
        this.ujq.addMediaPlayerEventListener((MediaPlayerEventListener)this.ujt);
        this.ujq.enableEvents(ujp);
    }

    @Override
    public void setDebugMode(boolean bl) {
        if (this.getDebugMode() == bl) {
            return;
        }
        super.setDebugMode(bl);
        this.gvf();
        this.gvl();
        this.gvk();
        this.gvj();
    }

    @Override
    public void setVideoPath(String string) {
        String string2 = this.getVideoPath();
        if (Objects.equals(string2, string)) {
            return;
        }
        super.setVideoPath(string);
        this.gvf();
        this.gvl();
    }

    public void gvj() {
        try {
            this.ujr = new MediaPlayerFactory(new String[]{"--no-video-title-show", this.getDebugMode() ? "-vvv" : ""});
        }
        catch (RuntimeException runtimeException) {
            uja.error((Object)"Error on initialize of MediaPlayerFactory : ", (Throwable)runtimeException);
        }
    }

    @Override
    public void aVI() {
        super.aVI();
        this.ujs = new fec_2();
    }

    public void gvk() {
        if (this.ujr != null) {
            this.ujr.release();
            this.ujr = null;
        }
    }

    public void gvl() {
        if (this.ujq != null) {
            try {
                this.ujq.release();
            }
            catch (Error error) {
                uja.error((Object)"Error when releasing VLC media player", (Throwable)error);
            }
            finally {
                this.ujq = null;
            }
        }
    }

    @Override
    public void aVH() {
        super.aVH();
        this.gvf();
        this.gvl();
        this.gvk();
        if (this.ujt != null) {
            this.ujt.ujv.clear();
            this.ujt = null;
        }
    }

    @Override
    public void a(fhi_2 fhi_22) {
        super.a(fhi_22);
        fed_1 fed_12 = (fed_1)fhi_22;
        fed_12.setVideoPath(this.getVideoPath());
        fed_12.setDebugMode(this.getDebugMode());
    }

    static {
        try {
            File file = new File(System.getProperty("java.library.path") + "/vlc-" + ady_1.bYZ().getName());
            NativeLibrary.addSearchPath((String)RuntimeUtil.getLibVlcLibraryName(), (String)file.getAbsolutePath());
            System.load(file.getAbsolutePath() + "/" + RuntimeUtil.getLibVlcCoreName());
        }
        catch (Throwable throwable) {
            uja.error((Object)"Throwable pendant le chargement des natives de VLC : ", throwable);
        }
    }
}

