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
 * Renamed from cM
 */
public final class cm_2
extends GeneratedMessageV3
implements cp_1 {
    private static final long iH = 0L;
    public static final int iI = 1;
    long fG;
    public static final int iJ = 2;
    int iK;
    private byte Y = (byte)-1;
    private static final cm_2 iL = new cm_2();
    static final Parser<cm_2> iM = new cn_1();

    cm_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private cm_2() {
        this.iK = 0;
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new cm_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    cm_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                    case 16: {
                        int n2;
                        this.iK = n2 = codedInputStream.readEnum();
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

    public static final Descriptors.Descriptor nM() {
        return ae_1.eU;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ae_1.eV.ensureFieldAccessorsInitialized(cm_2.class, co_2.class);
    }

    @Override
    public long fD() {
        return this.fG;
    }

    @Override
    public int nN() {
        return this.iK;
    }

    @Override
    public ck_2 nO() {
        ck_2 ck_22 = ck_2.ab(this.iK);
        return ck_22 == null ? ck_2.iA : ck_22;
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
        if (this.iK != ck_2.iy.getNumber()) {
            codedOutputStream.writeEnum(2, this.iK);
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
        if (this.iK != ck_2.iy.getNumber()) {
            n += CodedOutputStream.computeEnumSize((int)2, (int)this.iK);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof cm_2)) {
            return super.equals(object);
        }
        cm_2 cm_22 = (cm_2)object;
        if (this.fD() != cm_22.fD()) {
            return false;
        }
        if (this.iK != cm_22.iK) {
            return false;
        }
        return this.unknownFields.equals((Object)cm_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + cm_2.nM().hashCode();
        n = 37 * n + 1;
        n = 53 * n + Internal.hashLong((long)this.fD());
        n = 37 * n + 2;
        n = 53 * n + this.iK;
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static cm_2 R(ByteBuffer byteBuffer) {
        return (cm_2)iM.parseFrom(byteBuffer);
    }

    public static cm_2 R(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (cm_2)iM.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static cm_2 az(ByteString byteString) {
        return (cm_2)iM.parseFrom(byteString);
    }

    public static cm_2 R(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (cm_2)iM.parseFrom(byteString, extensionRegistryLite);
    }

    public static cm_2 R(byte[] byArray) {
        return (cm_2)iM.parseFrom(byArray);
    }

    public static cm_2 R(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (cm_2)iM.parseFrom(byArray, extensionRegistryLite);
    }

    public static cm_2 aI(InputStream inputStream) {
        return (cm_2)GeneratedMessageV3.parseWithIOException(iM, (InputStream)inputStream);
    }

    public static cm_2 aI(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (cm_2)GeneratedMessageV3.parseWithIOException(iM, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static cm_2 aJ(InputStream inputStream) {
        return (cm_2)GeneratedMessageV3.parseDelimitedWithIOException(iM, (InputStream)inputStream);
    }

    public static cm_2 aJ(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (cm_2)GeneratedMessageV3.parseDelimitedWithIOException(iM, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static cm_2 R(CodedInputStream codedInputStream) {
        return (cm_2)GeneratedMessageV3.parseWithIOException(iM, (CodedInputStream)codedInputStream);
    }

    public static cm_2 bz(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (cm_2)GeneratedMessageV3.parseWithIOException(iM, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public co_2 nP() {
        return cm_2.nQ();
    }

    public static co_2 nQ() {
        return iL.nR();
    }

    public static co_2 a(cm_2 cm_22) {
        return iL.nR().c(cm_22);
    }

    public co_2 nR() {
        return this == iL ? new co_2() : new co_2().c(this);
    }

    protected co_2 R(GeneratedMessageV3.BuilderParent builderParent) {
        co_2 co_22 = new co_2(builderParent);
        return co_22;
    }

    public static cm_2 nS() {
        return iL;
    }

    public static Parser<cm_2> z() {
        return iM;
    }

    public Parser<cm_2> getParserForType() {
        return iM;
    }

    public cm_2 nT() {
        return iL;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.R(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.nR();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.nP();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.nR();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.nP();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.nT();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.nT();
    }

    static /* synthetic */ boolean nU() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(cm_2 cm_22) {
        return cm_22.unknownFields;
    }
}

