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

public final class kJ
extends GeneratedMessageV3
implements kM {
    private static final long GI = 0L;
    int an;
    public static final int GJ = 1;
    kW Fc;
    public static final int GK = 2;
    int ws;
    private byte Y = (byte)-1;
    private static final kJ GL = new kJ();
    @Deprecated
    public static final Parser<kJ> GM = new kK();

    kJ(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private kJ() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new kJ();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    kJ(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block12: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block12;
                    }
                    case 10: {
                        kY kY2 = null;
                        if ((this.an & 1) != 0) {
                            kY2 = this.Fc.aem();
                        }
                        this.Fc = (kW)codedInputStream.readMessage(kW.Hs, extensionRegistryLite);
                        if (kY2 != null) {
                            kY2.h(this.Fc);
                            this.Fc = kY2.aes();
                        }
                        this.an |= 1;
                        continue block12;
                    }
                    case 16: {
                        this.an |= 2;
                        this.ws = codedInputStream.readInt32();
                        continue block12;
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
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor acU() {
        return kF.Gi;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kF.Gj.ensureFieldAccessorsInitialized(kJ.class, kL.class);
    }

    @Override
    public boolean aaz() {
        return (this.an & 1) != 0;
    }

    @Override
    public kW aaA() {
        return this.Fc == null ? kW.aen() : this.Fc;
    }

    @Override
    public lh aaB() {
        return this.Fc == null ? kW.aen() : this.Fc;
    }

    @Override
    public boolean Ly() {
        return (this.an & 2) != 0;
    }

    @Override
    public int Lz() {
        return this.ws;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.aaz()) {
            this.Y = 0;
            return false;
        }
        if (!this.Ly()) {
            this.Y = 0;
            return false;
        }
        if (!this.aaA().isInitialized()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeMessage(1, (MessageLite)this.aaA());
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeInt32(2, this.ws);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.an & 1) != 0) {
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)this.aaA());
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeInt32Size((int)2, (int)this.ws);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof kJ)) {
            return super.equals(object);
        }
        kJ kJ2 = (kJ)object;
        if (this.aaz() != kJ2.aaz()) {
            return false;
        }
        if (this.aaz() && !this.aaA().equals(kJ2.aaA())) {
            return false;
        }
        if (this.Ly() != kJ2.Ly()) {
            return false;
        }
        if (this.Ly() && this.Lz() != kJ2.Lz()) {
            return false;
        }
        return this.unknownFields.equals((Object)kJ2.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + kJ.acU().hashCode();
        if (this.aaz()) {
            n = 37 * n + 1;
            n = 53 * n + this.aaA().hashCode();
        }
        if (this.Ly()) {
            n = 37 * n + 2;
            n = 53 * n + this.Lz();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static kJ bG(ByteBuffer byteBuffer) {
        return (kJ)GM.parseFrom(byteBuffer);
    }

    public static kJ bC(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (kJ)GM.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static kJ cL(ByteString byteString) {
        return (kJ)GM.parseFrom(byteString);
    }

    public static kJ bC(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (kJ)GM.parseFrom(byteString, extensionRegistryLite);
    }

    public static kJ bD(byte[] byArray) {
        return (kJ)GM.parseFrom(byArray);
    }

    public static kJ bC(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (kJ)GM.parseFrom(byArray, extensionRegistryLite);
    }

    public static kJ ee(InputStream inputStream) {
        return (kJ)GeneratedMessageV3.parseWithIOException(GM, (InputStream)inputStream);
    }

    public static kJ ee(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (kJ)GeneratedMessageV3.parseWithIOException(GM, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static kJ ef(InputStream inputStream) {
        return (kJ)GeneratedMessageV3.parseDelimitedWithIOException(GM, (InputStream)inputStream);
    }

    public static kJ ef(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (kJ)GeneratedMessageV3.parseDelimitedWithIOException(GM, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static kJ bC(CodedInputStream codedInputStream) {
        return (kJ)GeneratedMessageV3.parseWithIOException(GM, (CodedInputStream)codedInputStream);
    }

    public static kJ gG(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (kJ)GeneratedMessageV3.parseWithIOException(GM, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public kL acV() {
        return kJ.acW();
    }

    public static kL acW() {
        return GL.acX();
    }

    public static kL c(kJ kJ2) {
        return GL.acX().e(kJ2);
    }

    public kL acX() {
        return this == GL ? new kL() : new kL().e(this);
    }

    protected kL bC(GeneratedMessageV3.BuilderParent builderParent) {
        kL kL2 = new kL(builderParent);
        return kL2;
    }

    public static kJ acY() {
        return GL;
    }

    public static Parser<kJ> z() {
        return GM;
    }

    public Parser<kJ> getParserForType() {
        return GM;
    }

    public kJ acZ() {
        return GL;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.bC(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.acX();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.acV();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.acX();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.acV();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.acZ();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.acZ();
    }

    static /* synthetic */ boolean gr() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet d(kJ kJ2) {
        return kJ2.unknownFields;
    }
}

