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

/*
 * Renamed from aJ
 */
public final class aj_2
extends GeneratedMessageV3
implements am_1 {
    private static final long fL = 0L;
    public static final int fM = 1;
    long fG;
    public static final int fN = 2;
    bh_1 fO;
    private byte Y = (byte)-1;
    private static final aj_2 fP = new aj_2();
    static final Parser<aj_2> fQ = new ak_2();

    aj_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private aj_2() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new aj_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    aj_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block12: while (!bl) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl = true;
                        continue block12;
                    }
                    case 8: {
                        this.fG = codedInputStream.readInt64();
                        continue block12;
                    }
                    case 18: {
                        bj_2 bj_22 = null;
                        if (this.fO != null) {
                            bj_22 = this.fO.ia();
                        }
                        this.fO = (bh_1)codedInputStream.readMessage(bh_1.z(), extensionRegistryLite);
                        if (bj_22 == null) continue block12;
                        bj_22.g(this.fO);
                        this.fO = bj_22.ih();
                        continue block12;
                    }
                }
                if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue;
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
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor fS() {
        return ae_1.eK;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ae_1.eL.ensureFieldAccessorsInitialized(aj_2.class, al_2.class);
    }

    @Override
    public long fD() {
        return this.fG;
    }

    @Override
    public boolean fT() {
        return this.fO != null;
    }

    @Override
    public bh_1 fU() {
        return this.fO == null ? bh_1.ib() : this.fO;
    }

    @Override
    public bk_1 fV() {
        return this.fU();
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.fG != 0L) {
            codedOutputStream.writeInt64(1, this.fG);
        }
        if (this.fO != null) {
            codedOutputStream.writeMessage(2, (MessageLite)this.fU());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if (this.fG != 0L) {
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.fG);
        }
        if (this.fO != null) {
            n += CodedOutputStream.computeMessageSize((int)2, (MessageLite)this.fU());
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof aj_2)) {
            return super.equals(object);
        }
        aj_2 aj_22 = (aj_2)object;
        if (this.fD() != aj_22.fD()) {
            return false;
        }
        if (this.fT() != aj_22.fT()) {
            return false;
        }
        if (this.fT() && !this.fU().equals(aj_22.fU())) {
            return false;
        }
        return this.unknownFields.equals((Object)aj_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + aj_2.fS().hashCode();
        n = 37 * n + 1;
        n = 53 * n + Internal.hashLong((long)this.fD());
        if (this.fT()) {
            n = 37 * n + 2;
            n = 53 * n + this.fU().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static aj_2 r(ByteBuffer byteBuffer) {
        return (aj_2)fQ.parseFrom(byteBuffer);
    }

    public static aj_2 r(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (aj_2)fQ.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static aj_2 L(ByteString byteString) {
        return (aj_2)fQ.parseFrom(byteString);
    }

    public static aj_2 r(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (aj_2)fQ.parseFrom(byteString, extensionRegistryLite);
    }

    public static aj_2 r(byte[] byArray) {
        return (aj_2)fQ.parseFrom(byArray);
    }

    public static aj_2 r(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (aj_2)fQ.parseFrom(byArray, extensionRegistryLite);
    }

    public static aj_2 I(InputStream inputStream) {
        return (aj_2)GeneratedMessageV3.parseWithIOException(fQ, (InputStream)inputStream);
    }

    public static aj_2 I(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (aj_2)GeneratedMessageV3.parseWithIOException(fQ, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static aj_2 J(InputStream inputStream) {
        return (aj_2)GeneratedMessageV3.parseDelimitedWithIOException(fQ, (InputStream)inputStream);
    }

    public static aj_2 J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (aj_2)GeneratedMessageV3.parseDelimitedWithIOException(fQ, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static aj_2 r(CodedInputStream codedInputStream) {
        return (aj_2)GeneratedMessageV3.parseWithIOException(fQ, (CodedInputStream)codedInputStream);
    }

    public static aj_2 Z(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (aj_2)GeneratedMessageV3.parseWithIOException(fQ, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public al_2 fW() {
        return aj_2.fX();
    }

    public static al_2 fX() {
        return fP.fY();
    }

    public static al_2 a(aj_2 aj_22) {
        return fP.fY().c(aj_22);
    }

    public al_2 fY() {
        return this == fP ? new al_2() : new al_2().c(this);
    }

    protected al_2 r(GeneratedMessageV3.BuilderParent builderParent) {
        al_2 al_22 = new al_2(builderParent);
        return al_22;
    }

    public static aj_2 fZ() {
        return fP;
    }

    public static Parser<aj_2> z() {
        return fQ;
    }

    public Parser<aj_2> getParserForType() {
        return fQ;
    }

    public aj_2 ga() {
        return fP;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.r(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.fY();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.fW();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.fY();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.fW();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.ga();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.ga();
    }

    static /* synthetic */ boolean gb() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(aj_2 aj_22) {
        return aj_22.unknownFields;
    }
}

