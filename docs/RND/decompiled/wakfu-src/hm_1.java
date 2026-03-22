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
 * Renamed from hm
 */
public final class hm_1
extends GeneratedMessageV3
implements hp_1 {
    private static final long uk = 0L;
    int an;
    public static final int ul = 1;
    int oq;
    public static final int um = 2;
    boolean un;
    public static final int uo = 3;
    volatile Object bs;
    public static final int up = 4;
    int lM;
    public static final int uq = 5;
    long ur;
    public static final int us = 6;
    volatile Object ut;
    private byte Y = (byte)-1;
    private static final hm_1 uu = new hm_1();
    @Deprecated
    public static final Parser<hm_1> uv = new hn_1();

    hm_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private hm_1() {
        this.bs = "";
        this.ut = "";
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new hm_1();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    hm_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block16: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block16;
                    }
                    case 8: {
                        this.an |= 1;
                        this.oq = codedInputStream.readInt32();
                        continue block16;
                    }
                    case 16: {
                        this.an |= 2;
                        this.un = codedInputStream.readBool();
                        continue block16;
                    }
                    case 26: {
                        ByteString byteString = codedInputStream.readBytes();
                        this.an |= 4;
                        this.bs = byteString;
                        continue block16;
                    }
                    case 32: {
                        this.an |= 8;
                        this.lM = codedInputStream.readInt32();
                        continue block16;
                    }
                    case 40: {
                        this.an |= 0x10;
                        this.ur = codedInputStream.readInt64();
                        continue block16;
                    }
                    case 50: {
                        ByteString byteString = codedInputStream.readBytes();
                        this.an |= 0x20;
                        this.ut = byteString;
                        continue block16;
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

    public static final Descriptors.Descriptor HL() {
        return hh_1.tY;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return hh_1.tZ.ensureFieldAccessorsInitialized(hm_1.class, ho_1.class);
    }

    @Override
    public boolean xS() {
        return (this.an & 1) != 0;
    }

    @Override
    public int xT() {
        return this.oq;
    }

    @Override
    public boolean HM() {
        return (this.an & 2) != 0;
    }

    @Override
    public boolean HN() {
        return this.un;
    }

    @Override
    public boolean wq() {
        return (this.an & 4) != 0;
    }

    @Override
    public String getName() {
        Object object = this.bs;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.bs = string;
        }
        return string;
    }

    @Override
    public ByteString bW() {
        Object object = this.bs;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.bs = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean sX() {
        return (this.an & 8) != 0;
    }

    @Override
    public int sY() {
        return this.lM;
    }

    @Override
    public boolean HO() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public long HP() {
        return this.ur;
    }

    @Override
    public boolean HQ() {
        return (this.an & 0x20) != 0;
    }

    @Override
    public String HR() {
        Object object = this.ut;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.ut = string;
        }
        return string;
    }

    @Override
    public ByteString HS() {
        Object object = this.ut;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.ut = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.xS()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt32(1, this.oq);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeBool(2, this.un);
        }
        if ((this.an & 4) != 0) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)3, (Object)this.bs);
        }
        if ((this.an & 8) != 0) {
            codedOutputStream.writeInt32(4, this.lM);
        }
        if ((this.an & 0x10) != 0) {
            codedOutputStream.writeInt64(5, this.ur);
        }
        if ((this.an & 0x20) != 0) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)6, (Object)this.ut);
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
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.oq);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeBoolSize((int)2, (boolean)this.un);
        }
        if ((this.an & 4) != 0) {
            n += GeneratedMessageV3.computeStringSize((int)3, (Object)this.bs);
        }
        if ((this.an & 8) != 0) {
            n += CodedOutputStream.computeInt32Size((int)4, (int)this.lM);
        }
        if ((this.an & 0x10) != 0) {
            n += CodedOutputStream.computeInt64Size((int)5, (long)this.ur);
        }
        if ((this.an & 0x20) != 0) {
            n += GeneratedMessageV3.computeStringSize((int)6, (Object)this.ut);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof hm_1)) {
            return super.equals(object);
        }
        hm_1 hm_12 = (hm_1)object;
        if (this.xS() != hm_12.xS()) {
            return false;
        }
        if (this.xS() && this.xT() != hm_12.xT()) {
            return false;
        }
        if (this.HM() != hm_12.HM()) {
            return false;
        }
        if (this.HM() && this.HN() != hm_12.HN()) {
            return false;
        }
        if (this.wq() != hm_12.wq()) {
            return false;
        }
        if (this.wq() && !this.getName().equals(hm_12.getName())) {
            return false;
        }
        if (this.sX() != hm_12.sX()) {
            return false;
        }
        if (this.sX() && this.sY() != hm_12.sY()) {
            return false;
        }
        if (this.HO() != hm_12.HO()) {
            return false;
        }
        if (this.HO() && this.HP() != hm_12.HP()) {
            return false;
        }
        if (this.HQ() != hm_12.HQ()) {
            return false;
        }
        if (this.HQ() && !this.HR().equals(hm_12.HR())) {
            return false;
        }
        return this.unknownFields.equals((Object)hm_12.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + hm_1.HL().hashCode();
        if (this.xS()) {
            n = 37 * n + 1;
            n = 53 * n + this.xT();
        }
        if (this.HM()) {
            n = 37 * n + 2;
            n = 53 * n + Internal.hashBoolean((boolean)this.HN());
        }
        if (this.wq()) {
            n = 37 * n + 3;
            n = 53 * n + this.getName().hashCode();
        }
        if (this.sX()) {
            n = 37 * n + 4;
            n = 53 * n + this.sY();
        }
        if (this.HO()) {
            n = 37 * n + 5;
            n = 53 * n + Internal.hashLong((long)this.HP());
        }
        if (this.HQ()) {
            n = 37 * n + 6;
            n = 53 * n + this.HR().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static hm_1 aR(ByteBuffer byteBuffer) {
        return (hm_1)uv.parseFrom(byteBuffer);
    }

    public static hm_1 aN(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (hm_1)uv.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static hm_1 bG(ByteString byteString) {
        return (hm_1)uv.parseFrom(byteString);
    }

    public static hm_1 aN(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (hm_1)uv.parseFrom(byteString, extensionRegistryLite);
    }

    public static hm_1 aO(byte[] byArray) {
        return (hm_1)uv.parseFrom(byArray);
    }

    public static hm_1 aN(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (hm_1)uv.parseFrom(byArray, extensionRegistryLite);
    }

    public static hm_1 cA(InputStream inputStream) {
        return (hm_1)GeneratedMessageV3.parseWithIOException(uv, (InputStream)inputStream);
    }

    public static hm_1 cA(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (hm_1)GeneratedMessageV3.parseWithIOException(uv, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static hm_1 cB(InputStream inputStream) {
        return (hm_1)GeneratedMessageV3.parseDelimitedWithIOException(uv, (InputStream)inputStream);
    }

    public static hm_1 cB(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (hm_1)GeneratedMessageV3.parseDelimitedWithIOException(uv, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static hm_1 aN(CodedInputStream codedInputStream) {
        return (hm_1)GeneratedMessageV3.parseWithIOException(uv, (CodedInputStream)codedInputStream);
    }

    public static hm_1 en(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (hm_1)GeneratedMessageV3.parseWithIOException(uv, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public ho_1 HT() {
        return hm_1.HU();
    }

    public static ho_1 HU() {
        return uu.HV();
    }

    public static ho_1 a(hm_1 hm_12) {
        return uu.HV().c(hm_12);
    }

    public ho_1 HV() {
        return this == uu ? new ho_1() : new ho_1().c(this);
    }

    protected ho_1 aN(GeneratedMessageV3.BuilderParent builderParent) {
        ho_1 ho_12 = new ho_1(builderParent);
        return ho_12;
    }

    public static hm_1 HW() {
        return uu;
    }

    public static Parser<hm_1> z() {
        return uv;
    }

    public Parser<hm_1> getParserForType() {
        return uv;
    }

    public hm_1 HX() {
        return uu;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.aN(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.HV();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.HT();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.HV();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.HT();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.HX();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.HX();
    }

    static /* synthetic */ boolean bg() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(hm_1 hm_12) {
        return hm_12.unknownFields;
    }
}

