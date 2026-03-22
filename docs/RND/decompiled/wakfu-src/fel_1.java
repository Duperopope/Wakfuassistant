/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  uk.co.caprica.vlcj.player.MediaPlayer
 *  uk.co.caprica.vlcj.player.MediaPlayerEventAdapter
 */
import java.util.ArrayList;
import uk.co.caprica.vlcj.player.MediaPlayer;
import uk.co.caprica.vlcj.player.MediaPlayerEventAdapter;

/*
 * Renamed from fEl
 */
class fel_1
extends MediaPlayerEventAdapter {
    final ArrayList<ahz_2> ujv = new ArrayList();
    final /* synthetic */ fej_2 ujw;

    fel_1(fej_2 fej_22) {
        this.ujw = fej_22;
    }

    public void buffering(MediaPlayer mediaPlayer, float f2) {
        for (ahz_2 ahz_22 : this.ujv) {
            ahz_22.ej(f2);
        }
    }

    public void videoOutput(MediaPlayer mediaPlayer, int n) {
        for (ahz_2 ahz_22 : this.ujv) {
            ahz_22.ceR();
        }
    }

    public void finished(MediaPlayer mediaPlayer) {
        for (ahz_2 ahz_22 : this.ujv) {
            ahz_22.ceP();
        }
        if (this.ujw.uju != null) {
            this.ujw.uju.run();
        }
    }

    public void stopped(MediaPlayer mediaPlayer) {
        for (ahz_2 ahz_22 : this.ujv) {
            ahz_22.ceQ();
        }
        if (this.ujw.uju != null) {
            this.ujw.uju.run();
        }
    }

    public void error(MediaPlayer mediaPlayer) {
        fed_1.uja.error((Object)"Error occured during vlc usage");
        this.stopped(mediaPlayer);
    }

    public String toString() {
        return "EventListenerProxy{m_listeners=" + this.ujv.size() + "}";
    }
}

