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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from jd
 */
public final class jd_1
extends GeneratedMessageV3
implements jg_1 {
    private static final long AU = 0L;
    int an;
    public static final int AV = 1;
    long AH;
    public static final int AW = 2;
    long nW;
    public static final int AX = 3;
    volatile Object bs;
    public static final int AY = 4;
    int oq;
    public static final int AZ = 5;
    boolean Ba;
    public static final int Bb = 6;
    boolean Bc;
    public static final int Bd = 7;
    List<iv_2> AM;
    public static final int Be = 8;
    jx_1 AO;
    public static final int Bf = 9;
    int Bg;
    public static final int Bh = 10;
    boolean Bi;
    private byte Y = (byte)-1;
    private static final jd_1 Bj = new jd_1();
    @Deprecated
    public static final Parser<jd_1> Bk = new je_1();

    jd_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private jd_1() {
        this.bs = "";
        this.AM = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new jd_1();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    jd_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        int n = 0;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block20: while (!bl) {
                int n2 = codedInputStream.readTag();
                switch (n2) {
                    case 0: {
                        bl = true;
                        continue block20;
                    }
                    case 8: {
                        this.an |= 1;
                        this.AH = codedInputStream.readInt64();
                        continue block20;
                    }
                    case 16: {
                        this.an |= 2;
                        this.nW = codedInputStream.readInt64();
                        continue block20;
                    }
                    case 26: {
                        Object object = codedInputStream.readBytes();
                        this.an |= 4;
                        this.bs = object;
                        continue block20;
                    }
                    case 32: {
                        this.an |= 8;
                        this.oq = codedInputStream.readInt32();
                        continue block20;
                    }
                    case 40: {
                        this.an |= 0x10;
                        this.Ba = codedInputStream.readBool();
                        continue block20;
                    }
                    case 48: {
                        this.an |= 0x20;
                        this.Bc = codedInputStream.readBool();
                        continue block20;
                    }
                    case 58: {
                        if ((n & 0x40) == 0) {
                            this.AM = new ArrayList<iv_2>();
                            n |= 0x40;
                        }
                        this.AM.add((iv_2)codedInputStream.readMessage(iv_2.AE, extensionRegistryLite));
                        continue block20;
                    }
                    case 66: {
                        Object object = null;
                        if ((this.an & 0x40) != 0) {
                            object = this.AO.Wa();
                        }
                        this.AO = (jx_1)codedInputStream.readMessage(jx_1.CD, extensionRegistryLite);
                        if (object != null) {
                            ((jz_1)object).g(this.AO);
                            this.AO = ((jz_1)object).Wg();
                        }
                        this.an |= 0x40;
                        continue block20;
                    }
                    case 72: {
                        this.an |= 0x80;
                        this.Bg = codedInputStream.readInt32();
                        continue block20;
                    }
                    case 80: {
                        this.an |= 0x100;
                        this.Bi = codedInputStream.readBool();
                        continue block20;
                    }
                }
                if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n2)) continue;
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
            if ((n & 0x40) != 0) {
                this.AM = Collections.unmodifiableList(this.AM);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor SS() {
        return iu_2.Ak;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return iu_2.Al.ensureFieldAccessorsInitialized(jd_1.class, jf_1.class);
    }

    @Override
    public boolean oN() {
        return (this.an & 1) != 0;
    }

    @Override
    public long Sn() {
        return this.AH;
    }

    @Override
    public boolean xk() {
        return (this.an & 2) != 0;
    }

    @Override
    public long xl() {
        return this.nW;
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
    public boolean xS() {
        return (this.an & 8) != 0;
    }

    @Override
    public int xT() {
        return this.oq;
    }

    @Override
    public boolean ST() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public boolean SU() {
        return this.Ba;
    }

    @Override
    public boolean SV() {
        return (this.an & 0x20) != 0;
    }

    @Override
    public boolean SW() {
        return this.Bc;
    }

    @Override
    public List<iv_2> Sq() {
        return this.AM;
    }

    @Override
    public List<? extends iy_2> Sr() {
        return this.AM;
    }

    @Override
    public int Ss() {
        return this.AM.size();
    }

    @Override
    public iv_2 eS(int n) {
        return this.AM.get(n);
    }

    @Override
    public iy_2 eT(int n) {
        return this.AM.get(n);
    }

    @Override
    public boolean St() {
        return (this.an & 0x40) != 0;
    }

    @Override
    public jx_1 Su() {
        return this.AO == null ? jx_1.Wb() : this.AO;
    }

    @Override
    public ja_1 Sv() {
        return this.AO == null ? jx_1.Wb() : this.AO;
    }

    @Override
    public boolean SX() {
        return (this.an & 0x80) != 0;
    }

    @Override
    public int SY() {
        return this.Bg;
    }

    @Override
    public boolean SZ() {
        return (this.an & 0x100) != 0;
    }

    @Override
    public boolean Ta() {
        return this.Bi;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.oN()) {
            this.Y = 0;
            return false;
        }
        if (!this.xk()) {
            this.Y = 0;
            return false;
        }
        if (!this.wq()) {
            this.Y = 0;
            return false;
        }
        if (!this.xS()) {
            this.Y = 0;
            return false;
        }
        if (!this.ST()) {
            this.Y = 0;
            return false;
        }
        if (!this.SV()) {
            this.Y = 0;
            return false;
        }
        for (int i = 0; i < this.Ss(); ++i) {
            if (this.eS(i).isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt64(1, this.AH);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeInt64(2, this.nW);
        }
        if ((this.an & 4) != 0) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)3, (Object)this.bs);
        }
        if ((this.an & 8) != 0) {
            codedOutputStream.writeInt32(4, this.oq);
        }
        if ((this.an & 0x10) != 0) {
            codedOutputStream.writeBool(5, this.Ba);
        }
        if ((this.an & 0x20) != 0) {
            codedOutputStream.writeBool(6, this.Bc);
        }
        for (int i = 0; i < this.AM.size(); ++i) {
            codedOutputStream.writeMessage(7, (MessageLite)this.AM.get(i));
        }
        if ((this.an & 0x40) != 0) {
            codedOutputStream.writeMessage(8, (MessageLite)this.Su());
        }
        if ((this.an & 0x80) != 0) {
            codedOutputStream.writeInt32(9, this.Bg);
        }
        if ((this.an & 0x100) != 0) {
            codedOutputStream.writeBool(10, this.Bi);
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
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.AH);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeInt64Size((int)2, (long)this.nW);
        }
        if ((this.an & 4) != 0) {
            n += GeneratedMessageV3.computeStringSize((int)3, (Object)this.bs);
        }
        if ((this.an & 8) != 0) {
            n += CodedOutputStream.computeInt32Size((int)4, (int)this.oq);
        }
        if ((this.an & 0x10) != 0) {
            n += CodedOutputStream.computeBoolSize((int)5, (boolean)this.Ba);
        }
        if ((this.an & 0x20) != 0) {
            n += CodedOutputStream.computeBoolSize((int)6, (boolean)this.Bc);
        }
        for (int i = 0; i < this.AM.size(); ++i) {
            n += CodedOutputStream.computeMessageSize((int)7, (MessageLite)((MessageLite)this.AM.get(i)));
        }
        if ((this.an & 0x40) != 0) {
            n += CodedOutputStream.computeMessageSize((int)8, (MessageLite)this.Su());
        }
        if ((this.an & 0x80) != 0) {
            n += CodedOutputStream.computeInt32Size((int)9, (int)this.Bg);
        }
        if ((this.an & 0x100) != 0) {
            n += CodedOutputStream.computeBoolSize((int)10, (boolean)this.Bi);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof jd_1)) {
            return super.equals(object);
        }
        jd_1 jd_12 = (jd_1)object;
        if (this.oN() != jd_12.oN()) {
            return false;
        }
        if (this.oN() && this.Sn() != jd_12.Sn()) {
            return false;
        }
        if (this.xk() != jd_12.xk()) {
            return false;
        }
        if (this.xk() && this.xl() != jd_12.xl()) {
            return false;
        }
        if (this.wq() != jd_12.wq()) {
            return false;
        }
        if (this.wq() && !this.getName().equals(jd_12.getName())) {
            return false;
        }
        if (this.xS() != jd_12.xS()) {
            return false;
        }
        if (this.xS() && this.xT() != jd_12.xT()) {
            return false;
        }
        if (this.ST() != jd_12.ST()) {
            return false;
        }
        if (this.ST() && this.SU() != jd_12.SU()) {
            return false;
        }
        if (this.SV() != jd_12.SV()) {
            return false;
        }
        if (this.SV() && this.SW() != jd_12.SW()) {
            return false;
        }
        if (!this.Sq().equals(jd_12.Sq())) {
            return false;
        }
        if (this.St() != jd_12.St()) {
            return false;
        }
        if (this.St() && !this.Su().equals(jd_12.Su())) {
            return false;
        }
        if (this.SX() != jd_12.SX()) {
            return false;
        }
        if (this.SX() && this.SY() != jd_12.SY()) {
            return false;
        }
        if (this.SZ() != jd_12.SZ()) {
            return false;
        }
        if (this.SZ() && this.Ta() != jd_12.Ta()) {
            return false;
        }
        return this.unknownFields.equals((Object)jd_12.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + jd_1.SS().hashCode();
        if (this.oN()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.Sn());
        }
        if (this.xk()) {
            n = 37 * n + 2;
            n = 53 * n + Internal.hashLong((long)this.xl());
        }
        if (this.wq()) {
            n = 37 * n + 3;
            n = 53 * n + this.getName().hashCode();
        }
        if (this.xS()) {
            n = 37 * n + 4;
            n = 53 * n + this.xT();
        }
        if (this.ST()) {
            n = 37 * n + 5;
            n = 53 * n + Internal.hashBoolean((boolean)this.SU());
        }
        if (this.SV()) {
            n = 37 * n + 6;
            n = 53 * n + Internal.hashBoolean((boolean)this.SW());
        }
        if (this.Ss() > 0) {
            n = 37 * n + 7;
            n = 53 * n + this.Sq().hashCode();
        }
        if (this.St()) {
            n = 37 * n + 8;
            n = 53 * n + this.Su().hashCode();
        }
        if (this.SX()) {
            n = 37 * n + 9;
            n = 53 * n + this.SY();
        }
        if (this.SZ()) {
            n = 37 * n + 10;
            n = 53 * n + Internal.hashBoolean((boolean)this.Ta());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static jd_1 bm(ByteBuffer byteBuffer) {
        return (jd_1)Bk.parseFrom(byteBuffer);
    }

    public static jd_1 bi(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (jd_1)Bk.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static jd_1 ce(ByteString byteString) {
        return (jd_1)Bk.parseFrom(byteString);
    }

    public static jd_1 bi(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (jd_1)Bk.parseFrom(byteString, extensionRegistryLite);
    }

    public static jd_1 bj(byte[] byArray) {
        return (jd_1)Bk.parseFrom(byArray);
    }

    public static jd_1 bi(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (jd_1)Bk.parseFrom(byArray, extensionRegistryLite);
    }

    public static jd_1 dq(InputStream inputStream) {
        return (jd_1)GeneratedMessageV3.parseWithIOException(Bk, (InputStream)inputStream);
    }

    public static jd_1 dq(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (jd_1)GeneratedMessageV3.parseWithIOException(Bk, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static jd_1 dr(InputStream inputStream) {
        return (jd_1)GeneratedMessageV3.parseDelimitedWithIOException(Bk, (InputStream)inputStream);
    }

    public static jd_1 dr(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (jd_1)GeneratedMessageV3.parseDelimitedWithIOException(Bk, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static jd_1 bi(CodedInputStream codedInputStream) {
        return (jd_1)GeneratedMessageV3.parseWithIOException(Bk, (CodedInputStream)codedInputStream);
    }

    public static jd_1 fy(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (jd_1)GeneratedMessageV3.parseWithIOException(Bk, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public jf_1 Tb() {
        return jd_1.Tc();
    }

    public static jf_1 Tc() {
        return Bj.Td();
    }

    public static jf_1 a(jd_1 jd_12) {
        return Bj.Td().c(jd_12);
    }

    public jf_1 Td() {
        return this == Bj ? new jf_1() : new jf_1().c(this);
    }

    protected jf_1 bi(GeneratedMessageV3.BuilderParent builderParent) {
        jf_1 jf_12 = new jf_1(builderParent);
        return jf_12;
    }

    public static jd_1 Te() {
        return Bj;
    }

    public static Parser<jd_1> z() {
        return Bk;
    }

    public Parser<jd_1> getParserForType() {
        return Bk;
    }

    public jd_1 Tf() {
        return Bj;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.bi(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.Td();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.Tb();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.Td();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.Tb();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.Tf();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.Tf();
    }

    static /* synthetic */ boolean el() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean cs() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(jd_1 jd_12) {
        return jd_12.unknownFields;
    }
}

