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
 * Renamed from js
 */
public final class js_1
extends GeneratedMessageV3
implements jv_1 {
    private static final long Ci = 0L;
    int an;
    public static final int Cj = 1;
    long nW;
    public static final int Ck = 2;
    List<iv_2> AM;
    private byte Y = (byte)-1;
    private static final js_1 Cl = new js_1();
    @Deprecated
    public static final Parser<js_1> Cm = new jt_1();

    js_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private js_1() {
        this.AM = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new js_1();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    js_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        int n = 0;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block12: while (!bl) {
                int n2 = codedInputStream.readTag();
                switch (n2) {
                    case 0: {
                        bl = true;
                        continue block12;
                    }
                    case 8: {
                        this.an |= 1;
                        this.nW = codedInputStream.readInt64();
                        continue block12;
                    }
                    case 18: {
                        if ((n & 2) == 0) {
                            this.AM = new ArrayList<iv_2>();
                            n |= 2;
                        }
                        this.AM.add((iv_2)codedInputStream.readMessage(iv_2.AE, extensionRegistryLite));
                        continue block12;
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
            if ((n & 2) != 0) {
                this.AM = Collections.unmodifiableList(this.AM);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor Vw() {
        return iu_2.Au;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return iu_2.Av.ensureFieldAccessorsInitialized(js_1.class, ju_1.class);
    }

    @Override
    public boolean xk() {
        return (this.an & 1) != 0;
    }

    @Override
    public long xl() {
        return this.nW;
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

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.xk()) {
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
            codedOutputStream.writeInt64(1, this.nW);
        }
        for (int i = 0; i < this.AM.size(); ++i) {
            codedOutputStream.writeMessage(2, (MessageLite)this.AM.get(i));
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
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.nW);
        }
        for (int i = 0; i < this.AM.size(); ++i) {
            n += CodedOutputStream.computeMessageSize((int)2, (MessageLite)((MessageLite)this.AM.get(i)));
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof js_1)) {
            return super.equals(object);
        }
        js_1 js_12 = (js_1)object;
        if (this.xk() != js_12.xk()) {
            return false;
        }
        if (this.xk() && this.xl() != js_12.xl()) {
            return false;
        }
        if (!this.Sq().equals(js_12.Sq())) {
            return false;
        }
        return this.unknownFields.equals((Object)js_12.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + js_1.Vw().hashCode();
        if (this.xk()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.xl());
        }
        if (this.Ss() > 0) {
            n = 37 * n + 2;
            n = 53 * n + this.Sq().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static js_1 bq(ByteBuffer byteBuffer) {
        return (js_1)Cm.parseFrom(byteBuffer);
    }

    public static js_1 bm(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (js_1)Cm.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static js_1 cj(ByteString byteString) {
        return (js_1)Cm.parseFrom(byteString);
    }

    public static js_1 bm(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (js_1)Cm.parseFrom(byteString, extensionRegistryLite);
    }

    public static js_1 bn(byte[] byArray) {
        return (js_1)Cm.parseFrom(byArray);
    }

    public static js_1 bm(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (js_1)Cm.parseFrom(byArray, extensionRegistryLite);
    }

    public static js_1 dy(InputStream inputStream) {
        return (js_1)GeneratedMessageV3.parseWithIOException(Cm, (InputStream)inputStream);
    }

    public static js_1 dy(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (js_1)GeneratedMessageV3.parseWithIOException(Cm, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static js_1 dz(InputStream inputStream) {
        return (js_1)GeneratedMessageV3.parseDelimitedWithIOException(Cm, (InputStream)inputStream);
    }

    public static js_1 dz(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (js_1)GeneratedMessageV3.parseDelimitedWithIOException(Cm, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static js_1 bm(CodedInputStream codedInputStream) {
        return (js_1)GeneratedMessageV3.parseWithIOException(Cm, (CodedInputStream)codedInputStream);
    }

    public static js_1 fK(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (js_1)GeneratedMessageV3.parseWithIOException(Cm, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public ju_1 Vx() {
        return js_1.Vy();
    }

    public static ju_1 Vy() {
        return Cl.Vz();
    }

    public static ju_1 b(js_1 js_12) {
        return Cl.Vz().d(js_12);
    }

    public ju_1 Vz() {
        return this == Cl ? new ju_1() : new ju_1().d(this);
    }

    protected ju_1 bm(GeneratedMessageV3.BuilderParent builderParent) {
        ju_1 ju_12 = new ju_1(builderParent);
        return ju_12;
    }

    public static js_1 VA() {
        return Cl;
    }

    public static Parser<js_1> z() {
        return Cm;
    }

    public Parser<js_1> getParserForType() {
        return Cm;
    }

    public js_1 VB() {
        return Cl;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.bm(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.Vz();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.Vx();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.Vz();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.Vx();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.VB();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.VB();
    }

    static /* synthetic */ boolean iU() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean BA() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet c(js_1 js_12) {
        return js_12.unknownFields;
    }
}

