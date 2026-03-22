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
 * Renamed from ga
 */
public final class ga_2
extends GeneratedMessageV3
implements gd_2 {
    private static final long rB = 0L;
    int an;
    public static final int rC = 1;
    gj_1 rD;
    public static final int rE = 2;
    dz_2 rF;
    private byte Y = (byte)-1;
    private static final ga_2 rG = new ga_2();
    @Deprecated
    public static final Parser<ga_2> rH = new gb_2();

    ga_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ga_2() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new ga_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    ga_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                        GeneratedMessageV3.Builder builder2 = null;
                        if ((this.an & 1) != 0) {
                            builder2 = this.rD.DC();
                        }
                        this.rD = (gj_1)codedInputStream.readMessage(gj_1.rZ, extensionRegistryLite);
                        if (builder2 != null) {
                            builder2.e(this.rD);
                            this.rD = builder2.DI();
                        }
                        this.an |= 1;
                        continue block12;
                    }
                    case 18: {
                        GeneratedMessageV3.Builder builder2 = null;
                        if ((this.an & 2) != 0) {
                            builder2 = this.rF.ru();
                        }
                        this.rF = (dz_2)codedInputStream.readMessage(dz_2.kS, extensionRegistryLite);
                        if (builder2 != null) {
                            builder2.e(this.rF);
                            this.rF = builder2.rA();
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

    public static final Descriptors.Descriptor CP() {
        return fz_2.rz;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return fz_2.rA.ensureFieldAccessorsInitialized(ga_2.class, gc_2.class);
    }

    @Override
    public boolean CQ() {
        return (this.an & 1) != 0;
    }

    @Override
    public gj_1 CR() {
        return this.rD == null ? gj_1.DD() : this.rD;
    }

    @Override
    public gn_1 CS() {
        return this.rD == null ? gj_1.DD() : this.rD;
    }

    @Override
    public boolean CT() {
        return (this.an & 2) != 0;
    }

    @Override
    public dz_2 CU() {
        return this.rF == null ? dz_2.rv() : this.rF;
    }

    @Override
    public dh_2 CV() {
        return this.rF == null ? dz_2.rv() : this.rF;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.CQ()) {
            this.Y = 0;
            return false;
        }
        if (!this.CR().isInitialized()) {
            this.Y = 0;
            return false;
        }
        if (this.CT() && !this.CU().isInitialized()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeMessage(1, (MessageLite)this.CR());
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeMessage(2, (MessageLite)this.CU());
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
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)this.CR());
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeMessageSize((int)2, (MessageLite)this.CU());
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ga_2)) {
            return super.equals(object);
        }
        ga_2 ga_22 = (ga_2)object;
        if (this.CQ() != ga_22.CQ()) {
            return false;
        }
        if (this.CQ() && !this.CR().equals(ga_22.CR())) {
            return false;
        }
        if (this.CT() != ga_22.CT()) {
            return false;
        }
        if (this.CT() && !this.CU().equals(ga_22.CU())) {
            return false;
        }
        return this.unknownFields.equals((Object)ga_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + ga_2.CP().hashCode();
        if (this.CQ()) {
            n = 37 * n + 1;
            n = 53 * n + this.CR().hashCode();
        }
        if (this.CT()) {
            n = 37 * n + 2;
            n = 53 * n + this.CU().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static ga_2 aC(ByteBuffer byteBuffer) {
        return (ga_2)rH.parseFrom(byteBuffer);
    }

    public static ga_2 aA(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ga_2)rH.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ga_2 bt(ByteString byteString) {
        return (ga_2)rH.parseFrom(byteString);
    }

    public static ga_2 aA(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ga_2)rH.parseFrom(byteString, extensionRegistryLite);
    }

    public static ga_2 aB(byte[] byArray) {
        return (ga_2)rH.parseFrom(byArray);
    }

    public static ga_2 aA(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ga_2)rH.parseFrom(byArray, extensionRegistryLite);
    }

    public static ga_2 ca(InputStream inputStream) {
        return (ga_2)GeneratedMessageV3.parseWithIOException(rH, (InputStream)inputStream);
    }

    public static ga_2 ca(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ga_2)GeneratedMessageV3.parseWithIOException(rH, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ga_2 cb(InputStream inputStream) {
        return (ga_2)GeneratedMessageV3.parseDelimitedWithIOException(rH, (InputStream)inputStream);
    }

    public static ga_2 cb(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ga_2)GeneratedMessageV3.parseDelimitedWithIOException(rH, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ga_2 aA(CodedInputStream codedInputStream) {
        return (ga_2)GeneratedMessageV3.parseWithIOException(rH, (CodedInputStream)codedInputStream);
    }

    public static ga_2 dA(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ga_2)GeneratedMessageV3.parseWithIOException(rH, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public gc_2 CW() {
        return ga_2.CX();
    }

    public static gc_2 CX() {
        return rG.CY();
    }

    public static gc_2 a(ga_2 ga_22) {
        return rG.CY().c(ga_22);
    }

    public gc_2 CY() {
        return this == rG ? new gc_2() : new gc_2().c(this);
    }

    protected gc_2 aA(GeneratedMessageV3.BuilderParent builderParent) {
        gc_2 gc_22 = new gc_2(builderParent);
        return gc_22;
    }

    public static ga_2 CZ() {
        return rG;
    }

    public static Parser<ga_2> z() {
        return rH;
    }

    public Parser<ga_2> getParserForType() {
        return rH;
    }

    public ga_2 Da() {
        return rG;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.aA(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.CY();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.CW();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.CY();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.CW();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.Da();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.Da();
    }

    static /* synthetic */ boolean aJ() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(ga_2 ga_22) {
        return ga_22.unknownFields;
    }
}

