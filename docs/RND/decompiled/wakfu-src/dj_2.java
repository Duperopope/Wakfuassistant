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
 * Renamed from dj
 */
public final class dj_2
extends GeneratedMessageV3
implements dm_2 {
    private static final long kc = 0L;
    int an;
    public static final int kd = 1;
    int ke;
    public static final int kf = 2;
    int kg;
    public static final int kh = 3;
    int ki;
    public static final int kj = 4;
    int kk;
    private byte Y = (byte)-1;
    private static final dj_2 kl = new dj_2();
    @Deprecated
    public static final Parser<dj_2> km = new dk_2();

    dj_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private dj_2() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new dj_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    dj_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block14: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block14;
                    }
                    case 8: {
                        this.an |= 1;
                        this.ke = codedInputStream.readInt32();
                        continue block14;
                    }
                    case 16: {
                        this.an |= 2;
                        this.kg = codedInputStream.readInt32();
                        continue block14;
                    }
                    case 24: {
                        this.an |= 4;
                        this.ki = codedInputStream.readInt32();
                        continue block14;
                    }
                    case 32: {
                        this.an |= 8;
                        this.kk = codedInputStream.readInt32();
                        continue block14;
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

    public static final Descriptors.Descriptor pF() {
        return df_2.jz;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return df_2.jA.ensureFieldAccessorsInitialized(dj_2.class, dl_1.class);
    }

    @Override
    public boolean pG() {
        return (this.an & 1) != 0;
    }

    @Override
    public int pH() {
        return this.ke;
    }

    @Override
    public boolean pI() {
        return (this.an & 2) != 0;
    }

    @Override
    public int pJ() {
        return this.kg;
    }

    @Override
    public boolean pK() {
        return (this.an & 4) != 0;
    }

    @Override
    public int pL() {
        return this.ki;
    }

    @Override
    public boolean pM() {
        return (this.an & 8) != 0;
    }

    @Override
    public int pN() {
        return this.kk;
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
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt32(1, this.ke);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeInt32(2, this.kg);
        }
        if ((this.an & 4) != 0) {
            codedOutputStream.writeInt32(3, this.ki);
        }
        if ((this.an & 8) != 0) {
            codedOutputStream.writeInt32(4, this.kk);
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
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.ke);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeInt32Size((int)2, (int)this.kg);
        }
        if ((this.an & 4) != 0) {
            n += CodedOutputStream.computeInt32Size((int)3, (int)this.ki);
        }
        if ((this.an & 8) != 0) {
            n += CodedOutputStream.computeInt32Size((int)4, (int)this.kk);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof dj_2)) {
            return super.equals(object);
        }
        dj_2 dj_22 = (dj_2)object;
        if (this.pG() != dj_22.pG()) {
            return false;
        }
        if (this.pG() && this.pH() != dj_22.pH()) {
            return false;
        }
        if (this.pI() != dj_22.pI()) {
            return false;
        }
        if (this.pI() && this.pJ() != dj_22.pJ()) {
            return false;
        }
        if (this.pK() != dj_22.pK()) {
            return false;
        }
        if (this.pK() && this.pL() != dj_22.pL()) {
            return false;
        }
        if (this.pM() != dj_22.pM()) {
            return false;
        }
        if (this.pM() && this.pN() != dj_22.pN()) {
            return false;
        }
        return this.unknownFields.equals((Object)dj_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + dj_2.pF().hashCode();
        if (this.pG()) {
            n = 37 * n + 1;
            n = 53 * n + this.pH();
        }
        if (this.pI()) {
            n = 37 * n + 2;
            n = 53 * n + this.pJ();
        }
        if (this.pK()) {
            n = 37 * n + 3;
            n = 53 * n + this.pL();
        }
        if (this.pM()) {
            n = 37 * n + 4;
            n = 53 * n + this.pN();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static dj_2 W(ByteBuffer byteBuffer) {
        return (dj_2)km.parseFrom(byteBuffer);
    }

    public static dj_2 W(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (dj_2)km.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static dj_2 aE(ByteString byteString) {
        return (dj_2)km.parseFrom(byteString);
    }

    public static dj_2 W(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (dj_2)km.parseFrom(byteString, extensionRegistryLite);
    }

    public static dj_2 W(byte[] byArray) {
        return (dj_2)km.parseFrom(byArray);
    }

    public static dj_2 W(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (dj_2)km.parseFrom(byArray, extensionRegistryLite);
    }

    public static dj_2 aS(InputStream inputStream) {
        return (dj_2)GeneratedMessageV3.parseWithIOException(km, (InputStream)inputStream);
    }

    public static dj_2 aS(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (dj_2)GeneratedMessageV3.parseWithIOException(km, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static dj_2 aT(InputStream inputStream) {
        return (dj_2)GeneratedMessageV3.parseDelimitedWithIOException(km, (InputStream)inputStream);
    }

    public static dj_2 aT(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (dj_2)GeneratedMessageV3.parseDelimitedWithIOException(km, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static dj_2 W(CodedInputStream codedInputStream) {
        return (dj_2)GeneratedMessageV3.parseWithIOException(km, (CodedInputStream)codedInputStream);
    }

    public static dj_2 bO(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (dj_2)GeneratedMessageV3.parseWithIOException(km, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public dl_1 pO() {
        return dj_2.pP();
    }

    public static dl_1 pP() {
        return kl.pQ();
    }

    public static dl_1 c(dj_2 dj_22) {
        return kl.pQ().e(dj_22);
    }

    public dl_1 pQ() {
        return this == kl ? new dl_1() : new dl_1().e(this);
    }

    protected dl_1 W(GeneratedMessageV3.BuilderParent builderParent) {
        dl_1 dl_12 = new dl_1(builderParent);
        return dl_12;
    }

    public static dj_2 pR() {
        return kl;
    }

    public static Parser<dj_2> z() {
        return km;
    }

    public Parser<dj_2> getParserForType() {
        return km;
    }

    public dj_2 pS() {
        return kl;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.W(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.pQ();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.pO();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.pQ();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.pO();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.pS();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.pS();
    }

    static /* synthetic */ boolean pT() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet d(dj_2 dj_22) {
        return dj_22.unknownFields;
    }
}

