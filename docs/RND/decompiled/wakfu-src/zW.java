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

public final class zW
extends GeneratedMessageV3
implements zZ {
    private static final long apL = 0L;
    int an;
    public static final int apM = 1;
    long nW;
    public static final int apN = 2;
    AS apO;
    private byte Y = (byte)-1;
    private static final zW apP = new zW();
    @Deprecated
    public static final Parser<zW> apQ = new zX();

    zW(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private zW() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new zW();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    zW(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                    case 8: {
                        this.an |= 1;
                        this.nW = codedInputStream.readInt64();
                        continue block12;
                    }
                    case 18: {
                        AU aU = null;
                        if ((this.an & 2) != 0) {
                            aU = this.apO.aFm();
                        }
                        this.apO = (AS)codedInputStream.readMessage(AS.arM, extensionRegistryLite);
                        if (aU != null) {
                            aU.h(this.apO);
                            this.apO = aU.aFt();
                        }
                        this.an |= 2;
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

    public static final Descriptors.Descriptor aBj() {
        return zS.aph;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return zS.api.ensureFieldAccessorsInitialized(zW.class, zY.class);
    }

    @Override
    public boolean xk() {
        return (this.an & 1) != 0;
    }

    @Override
    public long xl() {
        return this.nW;
    }

    @Override
    public boolean aBk() {
        return (this.an & 2) != 0;
    }

    @Override
    public AS aBl() {
        return this.apO == null ? AS.aFn() : this.apO;
    }

    @Override
    public AV aBm() {
        return this.apO == null ? AS.aFn() : this.apO;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.xk()) {
            this.Y = 0;
            return false;
        }
        if (!this.aBk()) {
            this.Y = 0;
            return false;
        }
        if (!this.aBl().isInitialized()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt64(1, this.nW);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeMessage(2, (MessageLite)this.aBl());
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
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.nW);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeMessageSize((int)2, (MessageLite)this.aBl());
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof zW)) {
            return super.equals(object);
        }
        zW zW2 = (zW)object;
        if (this.xk() != zW2.xk()) {
            return false;
        }
        if (this.xk() && this.xl() != zW2.xl()) {
            return false;
        }
        if (this.aBk() != zW2.aBk()) {
            return false;
        }
        if (this.aBk() && !this.aBl().equals(zW2.aBl())) {
            return false;
        }
        return this.unknownFields.equals((Object)zW2.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + zW.aBj().hashCode();
        if (this.xk()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.xl());
        }
        if (this.aBk()) {
            n = 37 * n + 2;
            n = 53 * n + this.aBl().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static zW er(ByteBuffer byteBuffer) {
        return (zW)apQ.parseFrom(byteBuffer);
    }

    public static zW cF(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (zW)apQ.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static zW eg(ByteString byteString) {
        return (zW)apQ.parseFrom(byteString);
    }

    public static zW cF(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (zW)apQ.parseFrom(byteString, extensionRegistryLite);
    }

    public static zW cH(byte[] byArray) {
        return (zW)apQ.parseFrom(byArray);
    }

    public static zW cF(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (zW)apQ.parseFrom(byArray, extensionRegistryLite);
    }

    public static zW gk(InputStream inputStream) {
        return (zW)GeneratedMessageV3.parseWithIOException(apQ, (InputStream)inputStream);
    }

    public static zW gk(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (zW)GeneratedMessageV3.parseWithIOException(apQ, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static zW gl(InputStream inputStream) {
        return (zW)GeneratedMessageV3.parseDelimitedWithIOException(apQ, (InputStream)inputStream);
    }

    public static zW gl(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (zW)GeneratedMessageV3.parseDelimitedWithIOException(apQ, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static zW cF(CodedInputStream codedInputStream) {
        return (zW)GeneratedMessageV3.parseWithIOException(apQ, (CodedInputStream)codedInputStream);
    }

    public static zW jP(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (zW)GeneratedMessageV3.parseWithIOException(apQ, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public zY aBn() {
        return zW.aBo();
    }

    public static zY aBo() {
        return apP.aBp();
    }

    public static zY b(zW zW2) {
        return apP.aBp().d(zW2);
    }

    public zY aBp() {
        return this == apP ? new zY() : new zY().d(this);
    }

    protected zY cF(GeneratedMessageV3.BuilderParent builderParent) {
        zY zY2 = new zY(builderParent);
        return zY2;
    }

    public static zW aBq() {
        return apP;
    }

    public static Parser<zW> z() {
        return apQ;
    }

    public Parser<zW> getParserForType() {
        return apQ;
    }

    public zW aBr() {
        return apP;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.cF(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.aBp();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.aBn();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.aBp();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.aBn();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aBr();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aBr();
    }

    static /* synthetic */ boolean aJ() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet c(zW zW2) {
        return zW2.unknownFields;
    }
}

