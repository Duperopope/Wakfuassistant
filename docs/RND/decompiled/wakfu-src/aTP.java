/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import com.ankamagames.wakfu.client.console.command.commonIn.TakeScreenShotCommand;
import java.io.File;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;

public final class aTP
implements axo_1 {
    public File dQU;

    @Override
    @NotNull
    public File bRn() {
        return this.dQU;
    }

    @Override
    public void bRo() {
        String string;
        File file = this.dQU.getParentFile();
        try {
            string = file != null ? file.getCanonicalPath() : this.dQU.getCanonicalPath();
        }
        catch (IOException iOException) {
            string = file != null ? file.getAbsolutePath() : this.dQU.getAbsolutePath();
        }
        string = string.replaceAll("\\\\", "\\\\\\\\");
        aPd.f("screenshot.took", this.X(string, this.dQU.getName()));
    }

    @Override
    public void a(Exception exception) {
        aPd.f("screenshot.fail", new Object[0]);
        TakeScreenShotCommand.guU.error((Object)"Erreur lors de la prise de screenShot", (Throwable)exception);
    }

    private String X(@NotNull String string, String string2) {
        return "<u id=\"fileExplorer_" + string + "\">" + string2 + "</u>";
    }
}

