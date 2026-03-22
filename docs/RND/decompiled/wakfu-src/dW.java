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

public final class dW
extends GeneratedMessageV3
implements dZ {
    private static final long mf = 0L;
    int an;
    public static final int mg = 1;
    int mh;
    public static final int mi = 2;
    int mj;
    private byte Y = (byte)-1;
    private static final dW mk = new dW();
    @Deprecated
    public static final Parser<dW> ml = new dX();

    dW(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private dW() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new dW();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    dW(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                        this.mh = codedInputStream.readInt32();
                        continue block12;
                    }
                    case 16: {
                        this.an |= 2;
                        this.mj = codedInputStream.readInt32();
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

    public static final Descriptors.Descriptor tH() {
        return dV.md;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return dV.me.ensureFieldAccessorsInitialized(dW.class, dY.class);
    }

    @Override
    public boolean tI() {
        return (this.an & 1) != 0;
    }

    @Override
    public int tJ() {
        return this.mh;
    }

    @Override
    public boolean tK() {
        return (this.an & 2) != 0;
    }

    @Override
    public int tL() {
        return this.mj;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.tI()) {
            this.Y = 0;
            return false;
        }
        if (!this.tK()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt32(1, this.mh);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeInt32(2, this.mj);
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
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.mh);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeInt32Size((int)2, (int)this.mj);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof dW)) {
            return super.equals(object);
        }
        dW dW2 = (dW)object;
        if (this.tI() != dW2.tI()) {
            return false;
        }
        if (this.tI() && this.tJ() != dW2.tJ()) {
            return false;
        }
        if (this.tK() != dW2.tK()) {
            return false;
        }
        if (this.tK() && this.tL() != dW2.tL()) {
            return false;
        }
        return this.unknownFields.equals((Object)dW2.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + dW.tH().hashCode();
        if (this.tI()) {
            n = 37 * n + 1;
            n = 53 * n + this.tJ();
        }
        if (this.tK()) {
            n = 37 * n + 2;
            n = 53 * n + this.tL();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static dW ae(ByteBuffer byteBuffer) {
        return (dW)ml.parseFrom(byteBuffer);
    }

    public static dW ae(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (dW)ml.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static dW aM(ByteString byteString) {
        return (dW)ml.parseFrom(byteString);
    }

    public static dW ae(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (dW)ml.parseFrom(byteString, extensionRegistryLite);
    }

    public static dW ae(byte[] byArray) {
        return (dW)ml.parseFrom(byArray);
    }

    public static dW ae(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (dW)ml.parseFrom(byArray, extensionRegistryLite);
    }

    public static dW bi(InputStream inputStream) {
        return (dW)GeneratedMessageV3.parseWithIOException(ml, (InputStream)inputStream);
    }

    public static dW bi(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (dW)GeneratedMessageV3.parseWithIOException(ml, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static dW bj(InputStream inputStream) {
        return (dW)GeneratedMessageV3.parseDelimitedWithIOException(ml, (InputStream)inputStream);
    }

    public static dW bj(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (dW)GeneratedMessageV3.parseDelimitedWithIOException(ml, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static dW ae(CodedInputStream codedInputStream) {
        return (dW)GeneratedMessageV3.parseWithIOException(ml, (CodedInputStream)codedInputStream);
    }

    public static dW cm(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (dW)GeneratedMessageV3.parseWithIOException(ml, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public dY tM() {
        return dW.tN();
    }

    public static dY tN() {
        return mk.tO();
    }

    public static dY a(dW dW2) {
        return mk.tO().c(dW2);
    }

    public dY tO() {
        return this == mk ? new dY() : new dY().c(this);
    }

    protected dY ae(GeneratedMessageV3.BuilderParent builderParent) {
        dY dY2 = new dY(builderParent);
        return dY2;
    }

    public static dW tP() {
        return mk;
    }

    public static Parser<dW> z() {
        return ml;
    }

    public Parser<dW> getParserForType() {
        return ml;
    }

    public dW tQ() {
        return mk;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.ae(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.tO();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.tM();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.tO();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.tM();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.tQ();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.tQ();
    }

    static /* synthetic */ boolean pT() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(dW dW2) {
        return dW2.unknownFields;
    }
}

