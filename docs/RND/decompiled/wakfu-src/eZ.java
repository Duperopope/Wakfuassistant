/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.CodedOutputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.GeneratedMessageV3$UnusedPrivateParameter
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.Parser
 *  com.google.protobuf.UninitializedMessageException
 *  com.google.protobuf.UnknownFieldSet
 *  com.google.protobuf.UnknownFieldSet$Builder
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class eZ
extends GeneratedMessageV3
implements fc_0 {
    private static final long oI = 0L;
    public static final int oJ = 1;
    List<eS> oz;
    public static final int oK = 2;
    List<eS> oD;
    private byte Y = (byte)-1;
    private static final eZ oL = new eZ();
    @Deprecated
    public static final Parser<eZ> oM = new fa_0();

    eZ(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private eZ() {
        this.oz = Collections.emptyList();
        this.oD = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new eZ();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    eZ(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        int n = 0;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block12: while (!bl) {
                int n2 = codedInputStream.readTag();
                switch (n2) {
                    case 0: {
                        bl = true;
                        continue block12;
                    }
                    case 10: {
                        if ((n & 1) == 0) {
                            this.oz = new ArrayList<eS>();
                            n |= 1;
                        }
                        this.oz.add((eS)codedInputStream.readMessage(eS.ow, extensionRegistryLite));
                        continue block12;
                    }
                    case 18: {
                        if ((n & 2) == 0) {
                            this.oD = new ArrayList<eS>();
                            n |= 2;
                        }
                        this.oD.add((eS)codedInputStream.readMessage(eS.ow, extensionRegistryLite));
                        continue block12;
                    }
                }
                if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n2)) continue;
                bl = true;
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (UninitializedMessageException uninitializedMessageException) {
            throw uninitializedMessageException.asInvalidProtocolBufferException().setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            if (n & true) {
                this.oz = Collections.unmodifiableList(this.oz);
            }
            if ((n & 2) != 0) {
                this.oD = Collections.unmodifiableList(this.oD);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor yU() {
        return eO.nQ;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return eO.nR.ensureFieldAccessorsInitialized(eZ.class, fb_0.class);
    }

    @Override
    public List<eS> yr() {
        return this.oz;
    }

    @Override
    public List<? extends eV> ys() {
        return this.oz;
    }

    @Override
    public int yt() {
        return this.oz.size();
    }

    @Override
    public eS bS(int n) {
        return this.oz.get(n);
    }

    @Override
    public eV bT(int n) {
        return this.oz.get(n);
    }

    @Override
    public List<eS> yw() {
        return this.oD;
    }

    @Override
    public List<? extends eV> yx() {
        return this.oD;
    }

    @Override
    public int yy() {
        return this.oD.size();
    }

    @Override
    public eS bU(int n) {
        return this.oD.get(n);
    }

    @Override
    public eV bV(int n) {
        return this.oD.get(n);
    }

    public final boolean isInitialized() {
        int n;
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        for (n = 0; n < this.yt(); ++n) {
            if (this.bS(n).isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        for (n = 0; n < this.yy(); ++n) {
            if (this.bU(n).isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        int n;
        for (n = 0; n < this.oz.size(); ++n) {
            codedOutputStream.writeMessage(1, (MessageLite)this.oz.get(n));
        }
        for (n = 0; n < this.oD.size(); ++n) {
            codedOutputStream.writeMessage(2, (MessageLite)this.oD.get(n));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n;
        int n2 = this.memoizedSize;
        if (n2 != -1) {
            return n2;
        }
        n2 = 0;
        for (n = 0; n < this.oz.size(); ++n) {
            n2 += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.oz.get(n)));
        }
        for (n = 0; n < this.oD.size(); ++n) {
            n2 += CodedOutputStream.computeMessageSize((int)2, (MessageLite)((MessageLite)this.oD.get(n)));
        }
        this.memoizedSize = n2 += this.unknownFields.getSerializedSize();
        return n2;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof eZ)) {
            return super.equals(object);
        }
        eZ eZ2 = (eZ)object;
        if (!this.yr().equals(eZ2.yr())) {
            return false;
        }
        if (!this.yw().equals(eZ2.yw())) {
            return false;
        }
        return this.unknownFields.equals((Object)eZ2.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + eZ.yU().hashCode();
        if (this.yt() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.yr().hashCode();
        }
        if (this.yy() > 0) {
            n = 37 * n + 2;
            n = 53 * n + this.yw().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static eZ ar(ByteBuffer byteBuffer) {
        return (eZ)oM.parseFrom(byteBuffer);
    }

    public static eZ ar(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (eZ)oM.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static eZ bj(ByteString byteString) {
        return (eZ)oM.parseFrom(byteString);
    }

    public static eZ ar(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (eZ)oM.parseFrom(byteString, extensionRegistryLite);
    }

    public static eZ ar(byte[] byArray) {
        return (eZ)oM.parseFrom(byArray);
    }

    public static eZ ar(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (eZ)oM.parseFrom(byArray, extensionRegistryLite);
    }

    public static eZ bI(InputStream inputStream) {
        return (eZ)GeneratedMessageV3.parseWithIOException(oM, (InputStream)inputStream);
    }

    public static eZ bI(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (eZ)GeneratedMessageV3.parseWithIOException(oM, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static eZ bJ(InputStream inputStream) {
        return (eZ)GeneratedMessageV3.parseDelimitedWithIOException(oM, (InputStream)inputStream);
    }

    public static eZ bJ(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (eZ)GeneratedMessageV3.parseDelimitedWithIOException(oM, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static eZ ar(CodedInputStream codedInputStream) {
        return (eZ)GeneratedMessageV3.parseWithIOException(oM, (CodedInputStream)codedInputStream);
    }

    public static eZ cZ(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (eZ)GeneratedMessageV3.parseWithIOException(oM, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public fb_0 yV() {
        return eZ.yW();
    }

    public static fb_0 yW() {
        return oL.yX();
    }

    public static fb_0 a(eZ eZ2) {
        return oL.yX().c(eZ2);
    }

    public fb_0 yX() {
        return this == oL ? new fb_0() : new fb_0().c(this);
    }

    protected fb_0 ar(GeneratedMessageV3.BuilderParent builderParent) {
        fb_0 fb_02 = new fb_0(builderParent);
        return fb_02;
    }

    public static eZ yY() {
        return oL;
    }

    public static Parser<eZ> z() {
        return oM;
    }

    public Parser<eZ> getParserForType() {
        return oM;
    }

    public eZ yZ() {
        return oL;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.ar(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.yX();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.yV();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.yX();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.yV();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.yZ();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.yZ();
    }

    static /* synthetic */ boolean el() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean cs() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean ju() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(eZ eZ2) {
        return eZ2.unknownFields;
    }
}

