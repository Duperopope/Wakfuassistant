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
 * Renamed from ct
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class ct_2
extends GeneratedMessageV3
implements cw_2 {
    private static final long if = 0L;
    public static final int ig = 1;
    long fG;
    public static final int ih = 2;
    bh_1 fO;
    private byte Y = (byte)-1;
    private static final ct_2 ii = new ct_2();
    static final Parser<ct_2> ij = new cu_1();

    ct_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ct_2() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new ct_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    ct_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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

    public static final Descriptors.Descriptor mF() {
        return ae_1.fg;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ae_1.fh.ensureFieldAccessorsInitialized(ct_2.class, cv_2.class);
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
        if (!(object instanceof ct_2)) {
            return super.equals(object);
        }
        ct_2 ct_22 = (ct_2)object;
        if (this.fD() != ct_22.fD()) {
            return false;
        }
        if (this.fT() != ct_22.fT()) {
            return false;
        }
        if (this.fT() && !this.fU().equals(ct_22.fU())) {
            return false;
        }
        return this.unknownFields.equals((Object)ct_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + ct_2.mF().hashCode();
        n = 37 * n + 1;
        n = 53 * n + Internal.hashLong((long)this.fD());
        if (this.fT()) {
            n = 37 * n + 2;
            n = 53 * n + this.fU().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static ct_2 N(ByteBuffer byteBuffer) {
        return (ct_2)ij.parseFrom(byteBuffer);
    }

    public static ct_2 N(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ct_2)ij.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ct_2 at(ByteString byteString) {
        return (ct_2)ij.parseFrom(byteString);
    }

    public static ct_2 N(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ct_2)ij.parseFrom(byteString, extensionRegistryLite);
    }

    public static ct_2 N(byte[] byArray) {
        return (ct_2)ij.parseFrom(byArray);
    }

    public static ct_2 N(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ct_2)ij.parseFrom(byArray, extensionRegistryLite);
    }

    public static ct_2 aA(InputStream inputStream) {
        return (ct_2)GeneratedMessageV3.parseWithIOException(ij, (InputStream)inputStream);
    }

    public static ct_2 aA(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ct_2)GeneratedMessageV3.parseWithIOException(ij, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ct_2 aB(InputStream inputStream) {
        return (ct_2)GeneratedMessageV3.parseDelimitedWithIOException(ij, (InputStream)inputStream);
    }

    public static ct_2 aB(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ct_2)GeneratedMessageV3.parseDelimitedWithIOException(ij, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ct_2 N(CodedInputStream codedInputStream) {
        return (ct_2)GeneratedMessageV3.parseWithIOException(ij, (CodedInputStream)codedInputStream);
    }

    public static ct_2 bn(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ct_2)GeneratedMessageV3.parseWithIOException(ij, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public cv_2 mG() {
        return ct_2.mH();
    }

    public static cv_2 mH() {
        return ii.mI();
    }

    public static cv_2 a(ct_2 ct_22) {
        return ii.mI().c(ct_22);
    }

    public cv_2 mI() {
        return this == ii ? new cv_2() : new cv_2().c(this);
    }

    protected cv_2 N(GeneratedMessageV3.BuilderParent builderParent) {
        cv_2 cv_22 = new cv_2(builderParent);
        return cv_22;
    }

    public static ct_2 mJ() {
        return ii;
    }

    public static Parser<ct_2> z() {
        return ij;
    }

    public Parser<ct_2> getParserForType() {
        return ij;
    }

    public ct_2 mK() {
        return ii;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.N(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.mI();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.mG();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.mI();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.mG();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.mK();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.mK();
    }

    static /* synthetic */ boolean mL() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(ct_2 ct_22) {
        return ct_22.unknownFields;
    }
}

