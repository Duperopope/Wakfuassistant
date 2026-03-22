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
 *  com.google.protobuf.Internal
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
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class kS
extends GeneratedMessageV3
implements kV {
    private static final long GT = 0L;
    int an;
    public static final int GU = 1;
    long jT;
    private byte Y = (byte)-1;
    private static final kS GV = new kS();
    @Deprecated
    public static final Parser<kS> GW = new kT();

    kS(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private kS() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new kS();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    kS(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                    case 8: {
                        this.an |= 1;
                        this.jT = codedInputStream.readInt64();
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
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor adB() {
        return kF.Ga;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kF.Gb.ensureFieldAccessorsInitialized(kS.class, kU.class);
    }

    @Override
    public boolean pe() {
        return (this.an & 1) != 0;
    }

    @Override
    public long pf() {
        return this.jT;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.pe()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt64(1, this.jT);
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
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.jT);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof kS)) {
            return super.equals(object);
        }
        kS kS2 = (kS)object;
        if (this.pe() != kS2.pe()) {
            return false;
        }
        if (this.pe() && this.pf() != kS2.pf()) {
            return false;
        }
        return this.unknownFields.equals((Object)kS2.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + kS.adB().hashCode();
        if (this.pe()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.pf());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static kS bI(ByteBuffer byteBuffer) {
        return (kS)GW.parseFrom(byteBuffer);
    }

    public static kS bE(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (kS)GW.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static kS cN(ByteString byteString) {
        return (kS)GW.parseFrom(byteString);
    }

    public static kS bE(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (kS)GW.parseFrom(byteString, extensionRegistryLite);
    }

    public static kS bF(byte[] byArray) {
        return (kS)GW.parseFrom(byArray);
    }

    public static kS bE(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (kS)GW.parseFrom(byArray, extensionRegistryLite);
    }

    public static kS ei(InputStream inputStream) {
        return (kS)GeneratedMessageV3.parseWithIOException(GW, (InputStream)inputStream);
    }

    public static kS ei(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (kS)GeneratedMessageV3.parseWithIOException(GW, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static kS ej(InputStream inputStream) {
        return (kS)GeneratedMessageV3.parseDelimitedWithIOException(GW, (InputStream)inputStream);
    }

    public static kS ej(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (kS)GeneratedMessageV3.parseDelimitedWithIOException(GW, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static kS bE(CodedInputStream codedInputStream) {
        return (kS)GeneratedMessageV3.parseWithIOException(GW, (CodedInputStream)codedInputStream);
    }

    public static kS gM(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (kS)GeneratedMessageV3.parseWithIOException(GW, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public kU adC() {
        return kS.adD();
    }

    public static kU adD() {
        return GV.adE();
    }

    public static kU a(kS kS2) {
        return GV.adE().c(kS2);
    }

    public kU adE() {
        return this == GV ? new kU() : new kU().c(this);
    }

    protected kU bE(GeneratedMessageV3.BuilderParent builderParent) {
        kU kU2 = new kU(builderParent);
        return kU2;
    }

    public static kS adF() {
        return GV;
    }

    public static Parser<kS> z() {
        return GW;
    }

    public Parser<kS> getParserForType() {
        return GW;
    }

    public kS adG() {
        return GV;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.bE(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.adE();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.adC();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.adE();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.adC();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.adG();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.adG();
    }

    static /* synthetic */ boolean gb() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(kS kS2) {
        return kS2.unknownFields;
    }
}

