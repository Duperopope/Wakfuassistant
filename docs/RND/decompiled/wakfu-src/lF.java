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

public final class lF
extends GeneratedMessageV3
implements li_0 {
    private static final long IS = 0L;
    int an;
    public static final int IT = 20;
    int IU;
    public static final int IV = 21;
    int Gx;
    private byte Y = (byte)-1;
    private static final lF IW = new lF();
    @Deprecated
    public static final Parser<lF> IX = new lG();

    lF(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private lF() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new lF();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    lF(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                    case 160: {
                        this.an |= 1;
                        this.IU = codedInputStream.readInt32();
                        continue block12;
                    }
                    case 168: {
                        this.an |= 2;
                        this.Gx = codedInputStream.readInt32();
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

    public static final Descriptors.Descriptor aia() {
        return kF.FY;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kF.FZ.ensureFieldAccessorsInitialized(lF.class, lh_0.class);
    }

    @Override
    public boolean aib() {
        return (this.an & 1) != 0;
    }

    @Override
    public int aic() {
        return this.IU;
    }

    @Override
    public boolean acr() {
        return (this.an & 2) != 0;
    }

    @Override
    public int acs() {
        return this.Gx;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.aib()) {
            this.Y = 0;
            return false;
        }
        if (!this.acr()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt32(20, this.IU);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeInt32(21, this.Gx);
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
            n += CodedOutputStream.computeInt32Size((int)20, (int)this.IU);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeInt32Size((int)21, (int)this.Gx);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof lF)) {
            return super.equals(object);
        }
        lF lF2 = (lF)object;
        if (this.aib() != lF2.aib()) {
            return false;
        }
        if (this.aib() && this.aic() != lF2.aic()) {
            return false;
        }
        if (this.acr() != lF2.acr()) {
            return false;
        }
        if (this.acr() && this.acs() != lF2.acs()) {
            return false;
        }
        return this.unknownFields.equals((Object)lF2.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + lF.aia().hashCode();
        if (this.aib()) {
            n = 37 * n + 20;
            n = 53 * n + this.aic();
        }
        if (this.acr()) {
            n = 37 * n + 21;
            n = 53 * n + this.acs();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static lF bS(ByteBuffer byteBuffer) {
        return (lF)IX.parseFrom(byteBuffer);
    }

    public static lF bO(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (lF)IX.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static lF cY(ByteString byteString) {
        return (lF)IX.parseFrom(byteString);
    }

    public static lF bO(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (lF)IX.parseFrom(byteString, extensionRegistryLite);
    }

    public static lF bP(byte[] byArray) {
        return (lF)IX.parseFrom(byArray);
    }

    public static lF bO(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (lF)IX.parseFrom(byArray, extensionRegistryLite);
    }

    public static lF eC(InputStream inputStream) {
        return (lF)GeneratedMessageV3.parseWithIOException(IX, (InputStream)inputStream);
    }

    public static lF eC(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (lF)GeneratedMessageV3.parseWithIOException(IX, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static lF eD(InputStream inputStream) {
        return (lF)GeneratedMessageV3.parseDelimitedWithIOException(IX, (InputStream)inputStream);
    }

    public static lF eD(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (lF)GeneratedMessageV3.parseDelimitedWithIOException(IX, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static lF bO(CodedInputStream codedInputStream) {
        return (lF)GeneratedMessageV3.parseWithIOException(IX, (CodedInputStream)codedInputStream);
    }

    public static lF hq(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (lF)GeneratedMessageV3.parseWithIOException(IX, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public lh_0 aid() {
        return lF.aie();
    }

    public static lh_0 aie() {
        return IW.aif();
    }

    public static lh_0 b(lF lF2) {
        return IW.aif().d(lF2);
    }

    public lh_0 aif() {
        return this == IW ? new lh_0() : new lh_0().d(this);
    }

    protected lh_0 bO(GeneratedMessageV3.BuilderParent builderParent) {
        lh_0 lh_02 = new lh_0(builderParent);
        return lh_02;
    }

    public static lF aig() {
        return IW;
    }

    public static Parser<lF> z() {
        return IX;
    }

    public Parser<lF> getParserForType() {
        return IX;
    }

    public lF aih() {
        return IW;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.bO(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.aif();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.aid();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.aif();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.aid();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aih();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aih();
    }

    static /* synthetic */ boolean ju() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet c(lF lF2) {
        return lF2.unknownFields;
    }
}

