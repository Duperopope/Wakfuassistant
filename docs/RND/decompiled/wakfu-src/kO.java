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

public final class kO
extends GeneratedMessageV3
implements kR {
    private static final long GN = 0L;
    public static final int GO = 1;
    List<kG> GP;
    private byte Y = (byte)-1;
    private static final kO GQ = new kO();
    @Deprecated
    public static final Parser<kO> GR = new kP();

    kO(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private kO() {
        this.GP = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new kO();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    kO(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block11: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block11;
                    }
                    case 10: {
                        if (!(bl & true)) {
                            this.GP = new ArrayList<kG>();
                            bl |= true;
                        }
                        this.GP.add((kG)codedInputStream.readMessage(kG.GH, extensionRegistryLite));
                        continue block11;
                    }
                }
                if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue;
                bl2 = true;
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
            if (bl & true) {
                this.GP = Collections.unmodifiableList(this.GP);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor adh() {
        return kF.Gm;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kF.Gn.ensureFieldAccessorsInitialized(kO.class, kQ.class);
    }

    @Override
    public List<kG> adi() {
        return this.GP;
    }

    @Override
    public List<? extends kN> adj() {
        return this.GP;
    }

    @Override
    public int adk() {
        return this.GP.size();
    }

    @Override
    public kG gS(int n) {
        return this.GP.get(n);
    }

    @Override
    public kN gT(int n) {
        return this.GP.get(n);
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        for (int i = 0; i < this.adk(); ++i) {
            if (this.gS(i).isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.GP.size(); ++i) {
            codedOutputStream.writeMessage(1, (MessageLite)this.GP.get(i));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        for (int i = 0; i < this.GP.size(); ++i) {
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.GP.get(i)));
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof kO)) {
            return super.equals(object);
        }
        kO kO2 = (kO)object;
        if (!this.adi().equals(kO2.adi())) {
            return false;
        }
        return this.unknownFields.equals((Object)kO2.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + kO.adh().hashCode();
        if (this.adk() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.adi().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static kO bH(ByteBuffer byteBuffer) {
        return (kO)GR.parseFrom(byteBuffer);
    }

    public static kO bD(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (kO)GR.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static kO cM(ByteString byteString) {
        return (kO)GR.parseFrom(byteString);
    }

    public static kO bD(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (kO)GR.parseFrom(byteString, extensionRegistryLite);
    }

    public static kO bE(byte[] byArray) {
        return (kO)GR.parseFrom(byArray);
    }

    public static kO bD(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (kO)GR.parseFrom(byArray, extensionRegistryLite);
    }

    public static kO eg(InputStream inputStream) {
        return (kO)GeneratedMessageV3.parseWithIOException(GR, (InputStream)inputStream);
    }

    public static kO eg(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (kO)GeneratedMessageV3.parseWithIOException(GR, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static kO eh(InputStream inputStream) {
        return (kO)GeneratedMessageV3.parseDelimitedWithIOException(GR, (InputStream)inputStream);
    }

    public static kO eh(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (kO)GeneratedMessageV3.parseDelimitedWithIOException(GR, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static kO bD(CodedInputStream codedInputStream) {
        return (kO)GeneratedMessageV3.parseWithIOException(GR, (CodedInputStream)codedInputStream);
    }

    public static kO gJ(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (kO)GeneratedMessageV3.parseWithIOException(GR, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public kQ adl() {
        return kO.adm();
    }

    public static kQ adm() {
        return GQ.adn();
    }

    public static kQ a(kO kO2) {
        return GQ.adn().c(kO2);
    }

    public kQ adn() {
        return this == GQ ? new kQ() : new kQ().c(this);
    }

    protected kQ bD(GeneratedMessageV3.BuilderParent builderParent) {
        kQ kQ2 = new kQ(builderParent);
        return kQ2;
    }

    public static kO ado() {
        return GQ;
    }

    public static Parser<kO> z() {
        return GR;
    }

    public Parser<kO> getParserForType() {
        return GR;
    }

    public kO adp() {
        return GQ;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.bD(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.adn();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.adl();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.adn();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.adl();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.adp();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.adp();
    }

    static /* synthetic */ boolean mj() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean adq() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(kO kO2) {
        return kO2.unknownFields;
    }
}

