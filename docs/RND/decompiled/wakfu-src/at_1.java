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

/*
 * Renamed from at
 */
public final class at_1
extends GeneratedMessageV3
implements aw_2 {
    private static final long dQ = 0L;
    public static final int dR = 1;
    int dS;
    public static final int dT = 2;
    ap_2 dU;
    private byte Y = (byte)-1;
    private static final at_1 dV = new at_1();
    static final Parser<at_1> dW = new au_1();

    at_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private at_1() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new at_1();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    at_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                        this.dS = codedInputStream.readInt32();
                        continue block12;
                    }
                    case 18: {
                        ar_2 ar_22 = null;
                        if (this.dU != null) {
                            ar_22 = this.dU.eG();
                        }
                        this.dU = (ap_2)codedInputStream.readMessage(ap_2.z(), extensionRegistryLite);
                        if (ar_22 == null) continue block12;
                        ar_22.e(this.dU);
                        this.dU = ar_22.eM();
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

    public static final Descriptors.Descriptor eQ() {
        return ak_1.dp;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ak_1.dq.ensureFieldAccessorsInitialized(at_1.class, av_1.class);
    }

    @Override
    public int eR() {
        return this.dS;
    }

    @Override
    public boolean eS() {
        return this.dU != null;
    }

    @Override
    public ap_2 eT() {
        return this.dU == null ? ap_2.eH() : this.dU;
    }

    @Override
    public as_2 eU() {
        return this.eT();
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
        if (this.dS != 0) {
            codedOutputStream.writeInt32(1, this.dS);
        }
        if (this.dU != null) {
            codedOutputStream.writeMessage(2, (MessageLite)this.eT());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if (this.dS != 0) {
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.dS);
        }
        if (this.dU != null) {
            n += CodedOutputStream.computeMessageSize((int)2, (MessageLite)this.eT());
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof at_1)) {
            return super.equals(object);
        }
        at_1 at_12 = (at_1)object;
        if (this.eR() != at_12.eR()) {
            return false;
        }
        if (this.eS() != at_12.eS()) {
            return false;
        }
        if (this.eS() && !this.eT().equals(at_12.eT())) {
            return false;
        }
        return this.unknownFields.equals((Object)at_12.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + at_1.eQ().hashCode();
        n = 37 * n + 1;
        n = 53 * n + this.eR();
        if (this.eS()) {
            n = 37 * n + 2;
            n = 53 * n + this.eT().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static at_1 o(ByteBuffer byteBuffer) {
        return (at_1)dW.parseFrom(byteBuffer);
    }

    public static at_1 o(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (at_1)dW.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static at_1 I(ByteString byteString) {
        return (at_1)dW.parseFrom(byteString);
    }

    public static at_1 o(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (at_1)dW.parseFrom(byteString, extensionRegistryLite);
    }

    public static at_1 o(byte[] byArray) {
        return (at_1)dW.parseFrom(byArray);
    }

    public static at_1 o(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (at_1)dW.parseFrom(byArray, extensionRegistryLite);
    }

    public static at_1 C(InputStream inputStream) {
        return (at_1)GeneratedMessageV3.parseWithIOException(dW, (InputStream)inputStream);
    }

    public static at_1 C(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (at_1)GeneratedMessageV3.parseWithIOException(dW, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static at_1 D(InputStream inputStream) {
        return (at_1)GeneratedMessageV3.parseDelimitedWithIOException(dW, (InputStream)inputStream);
    }

    public static at_1 D(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (at_1)GeneratedMessageV3.parseDelimitedWithIOException(dW, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static at_1 o(CodedInputStream codedInputStream) {
        return (at_1)GeneratedMessageV3.parseWithIOException(dW, (CodedInputStream)codedInputStream);
    }

    public static at_1 Q(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (at_1)GeneratedMessageV3.parseWithIOException(dW, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public av_1 eV() {
        return at_1.eW();
    }

    public static av_1 eW() {
        return dV.eX();
    }

    public static av_1 c(at_1 at_12) {
        return dV.eX().e(at_12);
    }

    public av_1 eX() {
        return this == dV ? new av_1() : new av_1().e(this);
    }

    protected av_1 o(GeneratedMessageV3.BuilderParent builderParent) {
        av_1 av_12 = new av_1(builderParent);
        return av_12;
    }

    public static at_1 eY() {
        return dV;
    }

    public static Parser<at_1> z() {
        return dW;
    }

    public Parser<at_1> getParserForType() {
        return dW;
    }

    public at_1 eZ() {
        return dV;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.o(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.eX();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.eV();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.eX();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.eV();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.eZ();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.eZ();
    }

    static /* synthetic */ boolean fa() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet d(at_1 at_12) {
        return at_12.unknownFields;
    }
}

